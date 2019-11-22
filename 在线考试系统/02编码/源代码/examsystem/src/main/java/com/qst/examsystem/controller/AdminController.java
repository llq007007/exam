package com.qst.examsystem.controller;

import com.qst.examsystem.entity.Admin;
import com.qst.examsystem.entity.Teacher;
import com.qst.examsystem.service.IAdminService;
import com.qst.examsystem.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * 管理员控制层
 */
@Controller
@RequestMapping("Admin")
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
    @RequestMapping("addAdmin.action")
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
     * 管理员注册
     * @param model
     * @param admin
     * @return
     */
    @RequestMapping("register")
    public String Register(Model model,Admin admin){
        int rows=adminService.addAdmin(admin);
            model.addAttribute("rows",rows);
        return "/admin/register-result.jsp";
    }
    /**
     *删除管理员
     * @param adid
     * @param model
     * @return
     */
    @RequestMapping("/deleteAdmin.action")
    public String deleteAdmin(Integer adid, Model model) {
        Integer admins=adminService.deleteAdmin(adid);
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

    /**
     * 分页查询管理员信息
     * @param model
     * @param admin
     * @param page
     * @param rows
     * @return
     */
    @RequestMapping("/toadmin.action")
    public String toAdmin(Model model, Admin admin, @RequestParam(defaultValue="1")Integer page,
                            @RequestParam(defaultValue="3")Integer rows) {
        String forword="admin/Admin";
        System.out.println(admin);
        Page<Admin> admins=adminService.findAdminPage(page,rows, admin);

        model.addAttribute("page",  admins);
        model.addAttribute("username",  admin.getAdname());
        return forword;
    }

    /**
     * 根据adid查找要修改的管理员信息并返回
     * @param adid
     * @param model
     * @param sesson
     * @return
     */
    @RequestMapping("/toeditadmin.action")
    public String editAdmin(Integer adid, Model model, HttpSession sesson) {

        Admin admin =adminService.findAdminById(adid);
        System.out.println(admin);
        model.addAttribute("admin", admin);
        //返回客户信息展示页面
        return "admin/editadmin";
    }

    /**
     * 调用修改管理员方法并返回
     * @param admin
     * @param model
     * @param sesson
     * @return
     */
    @ResponseBody
    @RequestMapping("/editadmin.action")
    public Integer editAdmin(@RequestBody Admin admin, Model model, HttpSession sesson) {
        return adminService.updataAdmin(admin);
    }

    //正常访问login页面
    @RequestMapping("adminlogin")
   public String adminlogin(HttpSession session,Model model,HttpServletRequest request){
        String adname=request.getParameter("adname");
        String adpw=request.getParameter("adpw");
        Admin admin=adminService.adminlogin(adname);
        if (admin!=null){
            if (admin.getAdpw().equals(adpw)){
                session.setAttribute("admin",admin);
                return "/admin/adminmain.jsp";
            }else {
                model.addAttribute("exp","exp");
                return "/admin/loginresult.jsp";
            }
        }else {
            model.addAttribute("exp","exp");
            return "/admin/loginresult.jsp";
        }
    }

    /**
     * 修改密码
     * @param admin
     * @param model
     * @param request
     * @return
     */
    @RequestMapping("updateAdpw")
    public String updateAdpw(Admin admin, Model model, HttpServletRequest request){
        int rows=adminService.updateAdpw(admin);
        if (rows==1){
            model.addAttribute("rows",rows);
        }else {
            model.addAttribute("exp","exp");
        }
        return "/admin/updateAdpwreslut.jsp";
    }
}
