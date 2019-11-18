package com.qst.examsystem.service.impl;

import com.qst.examsystem.dao.ICourseDao;
import com.qst.examsystem.entity.Course;
import com.qst.examsystem.service.ICourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("courseService")
public class CourseServiceImpl implements ICourseService {
    //自动装配
    @Autowired
    @Qualifier("courseDao")
    private ICourseDao courseDao;

    @Override
    public int addCourse(Course course) {
        return courseDao.addCourse(course);
    }
}
