package com.qst.examsystem.dao.impl;

import com.qst.examsystem.dao.ICourseDao;
import com.qst.examsystem.entity.Course;
import com.qst.examsystem.mapper.CourseMapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

/**
 * 调用课程Dao层方法
 */
@Repository("courseDao")
public class CourseDaoImpl implements ICourseDao {
    @Autowired
    @Qualifier("courseMapper")
    private CourseMapper courseMapper;

    @Override
    public int addCourse(Course course) {
        return courseMapper.addCourse(course);
}
}
