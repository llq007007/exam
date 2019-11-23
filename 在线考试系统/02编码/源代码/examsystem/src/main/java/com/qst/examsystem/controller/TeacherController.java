package com.qst.examsystem.controller;

import com.qst.examsystem.entity.Teacher;
import com.qst.examsystem.service.ITeacherService;
import com.qst.examsystem.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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
    @Qualifier("teacherService")
    private ITeacherService teacherService;

    /**
     * 分页查询所有教师信息
     * @param model
     * @param teacher
     * @param page
     * @param rows
     * @return
     */
    @RequestMapping("toteacher.action")
    public String toTeacher(Model model, Teacher teacher, @RequestParam(defaultValue="1")Integer page,
                            @RequestParam(defaultValue="3")Integer rows) {
        System.out.println(teacher);
        Page<Teacher> teachers=teacherService.findTeacherPage(page,rows, teacher);

        model.addAttribute("page",  teachers);
        model.addAttribute("username",  teacher.getTname());
        return "/admin/teacherquery.jsp";
    }

    /**
     * 添加教师信息
     * @param teacher
     * @return
     */
    @RequestMapping("add")
    public String addTeacher( Teacher teacher) {
      int rows=teacherService.addTeacher(teacher);
        return "redirect:/admin/teacher-addresult.jsp?rows="+rows;
    }

    /**
     * 根据id查找需要修改的教师信息
     * @param tid
     * @return
     */
    @RequestMapping("toeditteacher")
    @ResponseBody
    public Teacher editTeacher(@RequestParam("tid")Integer tid) {

        Teacher teacher =teacherService.findTeacherById(tid);
        System.out.println(teacher);
        //返回客户信息展示页面
        return teacher;
    }

    /**
     * 调用updataTeacher方法修改教师信息
     * @param teacher
     * @return
     */

    @RequestMapping("editteacher")
    public String editTeacher( Teacher teacher) {
        int rows=teacherService.updataTeacher(teacher);
        return "redirect:/admin/teacher-updateresult.jsp?rows="+rows;
    }

    /**
     * 删除教师信息
     * @param tid
     * @param model
     * @return
     */
    @RequestMapping("deleteteacher")
    public String deleteTeacher(Integer tid,Model model) {
       int rows= teacherService.deleteTeacher(tid);
       // System.out.print("删除");
        return "redirect:/admin/teacher-deleteresult.jsp?rows="+rows;
    }

    /**
     * 教师登录
     * @param session
     * @param model
     * @param request
     * @return
     */
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

    /**
     * 根据试卷名查询所有成绩
     * @param request
     * @param model
     * @return
     */
    @RequestMapping("query_all_score")
    public String queryAllScore(String sjname,HttpServletRequest request, Model model) {
        Map<String,Object> map=new HashMap<>();
        map.put("sjname",sjname);
        List<Map<String,Object>> scoreList=teacherService.selectAllDegreeBySJName(map);
        model.addAttribute("scoreList", scoreList);
        return "/teacher/select_all_score.jsp";
    }

}


