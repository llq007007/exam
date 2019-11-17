package com.qst.examsystem.controller;

import com.qst.examsystem.entity.Student;
import com.qst.examsystem.service.IStudentService;
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
 * 学生控制层
 */
@Controller
public class StudentController {
    @Autowired
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
        String forword="admin/Student";
        System.out.println(student);
        Page<Student> students=studentService.findStudentPage(page,rows, student);

        model.addAttribute("page",  students);
        model.addAttribute("username",  student.getSname());
        return forword;
    }

    /**
     * 添加学生信息
     * @param model
     * @param student
     * @param session
     * @return
     */
    @RequestMapping("/addStudent.action")
    public String addStudent(Model model, Student student, HttpSession session) {
        System.out.print("添加信息");
        String forword="admin/Student";
        int students=studentService.addStudent(student);
        if(students>0){

            session.setAttribute("students",students);
        }

        return forword;
    }

    /**
     * 根据id查询需要修改的学生信息
     * @param sid
     * @param model
     * @param sesson
     * @return
     */
    @RequestMapping("/toeditstudent.action")
    public String editStudent(Integer sid,Model model,HttpSession sesson) {

        Student student =studentService.findStudentById(sid);
        System.out.println(student);
        model.addAttribute("student", student);
        //返回客户信息展示页面
        return "admin/editstudent";
    }

    /**
     * 修改学生信息
     * @param student
     * @param model
     * @param sesson
     * @return
     */
    @ResponseBody
    @RequestMapping("/editstudent.action")
    public Integer editStudent(@RequestBody Student student, Model model, HttpSession sesson) {

        return studentService.updataStudent(student);
    }

    /**
     * 删除学生信息
     * @param sid
     * @param model
     * @return
     */
    @RequestMapping("/deletestudent.action")
    public String deleteStudent(Integer sid,Model model) {
        studentService.deleteStudent(sid);
        System.out.print("删除");
        return "redirect:tostudent.action";
    }


}
