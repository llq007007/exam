package com.qst.examsystem.controller;

import com.qst.examsystem.entity.Student;
import com.qst.examsystem.service.IStudentService;
import com.qst.examsystem.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * 学生控制层
 */
@Controller
@RequestMapping("student")
public class StudentController {
    @Autowired
    @Qualifier("studentService")
    private IStudentService studentService;

    /**
     * 分页查询所有学生信息
     * @param model
     * @param student
     * @param page
     * @param rows
     * @return
     */
    @RequestMapping("/tostudent.action")
    public String toStudent(Model model, Student student, @RequestParam(defaultValue="1")Integer page,
                            @RequestParam(defaultValue="3")Integer rows) {
        String forword="/admin/student_query.jsp";
        System.out.println(student);
        Page<Student> students=studentService.findStudentPage(page,rows, student);
        model.addAttribute("page",  students);
        model.addAttribute("sname",  student.getSname());
        return "/admin/student_query.jsp";
    }

    /**
     * 添加学生信息
     * @param model
     * @param student
     * @param session
     * @return
     */
    @RequestMapping("addStudent")
    public String addStudent( Student student) {
        //System.out.print("添加信息");
        int rows=studentService.addStudent(student);
        return "redirect:/admin/student_addresult.jsp?rows="+rows;
    }

    /**
     * 根据id查询需要修改的学生信息
     * @param khid
     * @return
     */
    @RequestMapping(value = "toeditstudent",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public Student editStudent(@RequestParam("khid") Integer khid) {
        Student student =studentService.findStudentById(khid);
        System.out.println(student);
       model.addAttribute("student", student);
        //返回客户信息展示页面
        return student;
    }

    /**
     * 查看学生个人信息
     * @param model
     * @param sesson
     * @return
     */
    @RequestMapping("getstudentInfo")
    public String getStudent(Model model,HttpSession sesson) {
       Student student=(Student) sesson.getAttribute("student");
       int sid=student.getKhid();
        Student student1 =studentService.findStudentById(sid);
        System.out.println(student);
        model.addAttribute("student", student1);
        //返回客户信息展示页面
        return "/student/SeestudentInfo.jsp";
    }
    /**
     * 修改学生信息
     * @param student
     * @param model
     * @param sesson
     * @return
     */

    @RequestMapping( "editstudent")
    public String editStudent(Student student) {
        int rows=studentService.updataStudent(student);
        return "redirect:/admin/student_updateresult.jsp?rows="+rows;
    }

    /**
     * 删除学生信息
     * @param khid
     * @return
     */
    @RequestMapping("deletestudent")
    public String deleteStudent(Integer khid) {
        int rows=studentService.deleteStudent(khid);
        System.out.print("删除");
        return "redirect:/admin/student_deteleresult.jsp?rows="+rows;
    }

    /**
     * 根据学生姓名模糊查询考试成绩
     * @param name
     * @return
     */
    @RequestMapping(value = "query_degree", method= RequestMethod.POST)
    @ResponseBody
    public ModelAndView studentQueryDegree(String name) {
        Map<String,Object> stringMap=studentService.queryStudentDegree(name);
        ModelAndView mv=new ModelAndView();
        mv.addObject("degreeMap",stringMap);
        mv.setViewName("/student/query-degree-result.jsp");
        return mv;
    }
    @RequestMapping("studentlogin")
    public String studentlogin(HttpSession session, Model model, HttpServletRequest request){
        String sname=request.getParameter("sname");
        String spw=request.getParameter("spw");
        Student student=studentService.studentlogin(sname);
        if (student!=null){
            if (student.getSpw().equals(spw)){
                session.setAttribute("student",student);
                return "/student/studentmain.jsp";
            }else {
                model.addAttribute("exp","exp");
                return "/student/loginresult.jsp";
            }
        }else {
            model.addAttribute("exp","exp");
            return "/student/loginresult.jsp";
        }
    }
   @RequestMapping("updateSpw")
    public String updateSpw(Student student,Model model, HttpServletRequest request){
        int rows=studentService.updateSpw(student);
        if (rows==1){
            model.addAttribute("rows",rows);
            return "/student/updateSpwreslut.jsp";
        }else {
            model.addAttribute("exp","exp");
            return "/student/updateSpwreslut.jsp";
        }
    }
}
