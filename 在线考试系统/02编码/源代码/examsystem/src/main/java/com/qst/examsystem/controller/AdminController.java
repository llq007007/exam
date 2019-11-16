package com.qst.examsystem.controller;

import com.qst.examsystem.entity.Admin;
import com.qst.examsystem.service.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * 管理员控制层
 */
@Controller
public class AdminController {
    @Autowired
    private IAdminService adminService;

    /**
     * 增加管理员
     * @param model
     * @param admin
     * @param session
     * @return
     */
    @RequestMapping("/addAdmin.action")
    public String addAdmin(Model model, Admin admin, HttpSession session) {
        String forword="";
        System.out.print(admin.toString());
        int admins=adminService.addAdmin(admin);
        System.out.print("bbbb");
        if(admins>0){
            forword="index"; //添加成功返回的页面
            model.addAttribute("admin", "添加成功");
        }
        else{
            forword="index"; //添加失败返回的页面
            model.addAttribute("admin", "添加失败");
        }
        return forword;
    }

    /**
     *
     * @param adid
     * @param model
     * @return
     */
    @RequestMapping("/deleteAdmin.action")
    public String deleteAdmin(String adid,Model model) {
        String admins=adminService.deleteAdmin(adid);
        System.out.print("删除管理员"+adid);
        if(admins.equals(null)){
            model.addAttribute("mess", "添加成功");
        }
        else{
            model.addAttribute("mess", "添加失败");
        }
        return "redirect:toCourse.action";
    }

    /***
     * 查询所有管理员
     * @return
     */
    @RequestMapping("findadmin.action")
    public String findadmin(HttpServletRequest request, Model model) {
       // List<Admin> adminList = adminService.findAdminPage();

       // model.addAttribute("empList", adminList);
        return "/emp/query_emp.jsp";
    }




}
