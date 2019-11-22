package com.qst.examsystem.controller;

import com.qst.examsystem.entity.Teacher;
import com.qst.examsystem.service.ITeacherService;
import com.qst.examsystem.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 教师表控制层
 */
@Controller
@RequestMapping("Teacher")
public class TeacherController {
    @Autowired
    private ITeacherService teacherService;

    /**
     * 分页查询所有教师信息
     * @param model
     * @param teacher
     * @param page
     * @param rows
     * @return
     */
    @RequestMapping("/toteacher.action")
    public String toTeacher(Model model, Teacher teacher, @RequestParam(defaultValue="1")Integer page,
                            @RequestParam(defaultValue="3")Integer rows) {
        String forword="admin/Teacher";
        System.out.println(teacher);
        Page<Teacher> teachers=teacherService.findTeacherPage(page,rows, teacher);

        model.addAttribute("page",  teachers);
        model.addAttribute("username",  teacher.getTname());
        return forword;
    }

    /**
     * 添加教师信息
     * @param model
     * @param teacher
     * @param session
     * @return
     */
    @RequestMapping("/addTeacher.action")
    public String addTeacher(Model model, Teacher teacher, HttpSession session) {
        System.out.print("添加信息");
        String forword="admin/Teacher";
        int teachers=teacherService.addTeacher(teacher);
        if(teachers>0){
            session.setAttribute("teachers",teachers);
        }

        return forword;
    }

    /**
     * 根据id查找需要修改的教师信息
     * @param tid
     * @param model
     * @param sesson
     * @return
     */
    @RequestMapping("/toeditteacher.action")
    public String editTeacher(Integer tid,Model model,HttpSession sesson) {

        Teacher teacher =teacherService.findTeacherById(tid);
        System.out.println(teacher);
        model.addAttribute("teacher", teacher);
        //返回客户信息展示页面
        return "admin/editteacher";
    }

    /**
     * 调用updataTeacher方法修改教师信息
     * @param teacher
     * @param model
     * @param sesson
     * @return
     */
    @ResponseBody
    @RequestMapping("/editteacher.action")
    public Integer editTeacher(@RequestBody Teacher teacher, Model model, HttpSession sesson) {

        return teacherService.updataTeacher(teacher);
    }

    /**
     * 删除教师信息
     * @param tid
     * @param model
     * @return
     */
    @RequestMapping("/deleteteacher.action")
    public String deleteTeacher(Integer tid,Model model) {
        teacherService.deleteTeacher(tid);
        System.out.print("删除");
        return "redirect:toteacher.action";
    }

    @RequestMapping("teacherlogin")
    public String adminlogin(HttpSession session,Model model,HttpServletRequest request){
        String tname=request.getParameter("tname");
        String tpw=request.getParameter("tpw");
        Teacher teacher=teacherService.teacherlogin(tname);
        if (teacher!=null){
            if (teacher.getTpw().equals(tpw)){
                session.setAttribute("teacher",teacher);
                return "/teacher/teachermain.jsp";
            }else {
                model.addAttribute("exp","exp");
                return "/teacher/loginresult.jsp";
            }
        }else {
            model.addAttribute("exp","exp");
            return "/teacher/loginresult.jsp";
        }
    }

    /**
     * 修改密码
     * @param teacher
     * @param model
     * @param request
     * @return
     */
    @RequestMapping("updateTpw")
    public String updateSpw(Teacher teacher,Model model, HttpServletRequest request){
        int rows=teacherService.updateTpw(teacher);
        if (rows==1){
            model.addAttribute("rows",rows);
            return "/teacher/updateTpwreslut.jsp";
        }else {
            model.addAttribute("exp","exp");
            return "/student/updateTpwreslut.jsp";
        }
    }

}


