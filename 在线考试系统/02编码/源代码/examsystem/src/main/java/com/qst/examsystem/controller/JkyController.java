package com.qst.examsystem.controller;

import com.qst.examsystem.entity.Jky;
import com.qst.examsystem.service.IJkyService;
import com.qst.examsystem.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * 监考员控制层
 */
@Controller
@RequestMapping("jky")
public class JkyController {
    @Autowired
    private IJkyService jkyService;

    /**
     * 分页查询所有监考员信息
     * @param model
     * @param jky
     * @param page
     * @param rows
     * @return
     */
    @RequestMapping("/tojky.action")
    public String toJky(Model model, Jky jky, @RequestParam(defaultValue="1")Integer page,
                        @RequestParam(defaultValue="3")Integer rows) {
        String forword="admin/Jky";
        System.out.println(jky);
        Page<Jky> jkys=jkyService.findJkyPage(page,rows, jky);

        model.addAttribute("page",  jkys);
        model.addAttribute("username",  jky.getJkname());
        return forword;
    }

    /**
     * 添加监考员信息
     * @param model
     * @param jky
     * @param session
     * @return
     */
    @RequestMapping("addJky.action")
    public String addJky(Model model, Jky jky, HttpSession session) {
        int rows=jkyService.addJky(jky);
        model.addAttribute("rows",rows);
        return "/admin/addJKYresult.jsp";
    }

    /**
     * 根据id查询需要修改的监考员信息
     * @param jkid
     * @param model
     * @param sesson
     * @return
     */
    @RequestMapping("/toeditjky.action")
    public String editJky(Integer jkid,Model model,HttpSession sesson) {

        Jky jky =jkyService.findJkyById(jkid);
        System.out.println(jky);
        model.addAttribute("jky", jky);
        //返回客户信息展示页面
        return "admin/editjky";
    }

    /**
     * 调用updataJky方法修改监考员信息
     * @param jky
     * @param model
     * @param sesson
     * @return
     */
    @ResponseBody
    @RequestMapping("/editjky.action")
    public Integer editJky(@RequestBody Jky jky, Model model, HttpSession sesson) {
        return jkyService.updataJky(jky);
    }

    /**
     * 根据id删除监考员信息
     * @param jkid
     * @param model
     * @return
     */
    @RequestMapping("/deletejky.action")
    public String deleteJky(Integer jkid,Model model) {
        jkyService.deleteJky(jkid);
        System.out.print("删除");
        return "redirect:tojky.action";
    }


}
