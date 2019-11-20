package com.qst.examsystem.controller;

import com.qst.examsystem.entity.Course;
import com.qst.examsystem.service.ICourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * 课程控制层
 */
@Controller
@RequestMapping("course")
public class CourseController {
    @Autowired
    @Qualifier("courseService")
    private ICourseService courseService;

    /**
     * 添加课程
     * @param course
     * @return
     */
    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String addCourse(Course course) {
        int rows = courseService.addCourse(course);
        return "redirect:/course/course-addresult.jsp?rows="+rows;
    }


    /**
     * 删除课程
     */
    @RequestMapping("delete")
    public String deleteCourse(@RequestParam("cid") int cid){
        int rows = courseService.deleteCourse(cid);
        return "redirect:/course/course-deleteresult.jsp?rows="+rows;
    }

    /**
     * 查询所有信息
     * @param request
     * @param model
     * @return
     */
    @RequestMapping("query")
    public String queryCourse(HttpServletRequest request, Model model) {
        List<Course> courseList = courseService.queryCourse();
        model.addAttribute("courseList", courseList);
        return "/course/querycourse.jsp";
    }

    /**
     * 根据id加载信息
     * @param cid
     * @return
     */
    @RequestMapping(value = "load_one", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public Map<String, Object> loadCourseData(@RequestParam("cid") int cid) {
        Course course = courseService.getCourse(cid);
        Map<String, Object> dataMap = new HashMap<>();
        dataMap.put("course", course);
        return dataMap;
    }

    /**
     * 修改信息
     * @param course
     * @return
     */
    @RequestMapping("update")
    public  String updateCourse(Course course){
        int rows = courseService.updateCourse(course);
        return "redirect:/course/course-updateresult.jsp?rows="+rows;

    }

}
