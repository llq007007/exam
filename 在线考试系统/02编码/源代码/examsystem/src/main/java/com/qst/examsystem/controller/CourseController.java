package com.qst.examsystem.controller;

import com.qst.examsystem.entity.Course;
import com.qst.examsystem.service.ICourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


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
        return "redirect:/course/addCourse-result.jsp?rows="+rows;
    }

}
