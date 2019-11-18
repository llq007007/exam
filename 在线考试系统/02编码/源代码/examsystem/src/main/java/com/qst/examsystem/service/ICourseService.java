package com.qst.examsystem.service;

import com.qst.examsystem.entity.Course;

/**
 * 课程Service层接口
 */
public interface ICourseService {

    /**
     * 添加课程
     * @param course
     * @return
     */
    int addCourse(Course course);
}
