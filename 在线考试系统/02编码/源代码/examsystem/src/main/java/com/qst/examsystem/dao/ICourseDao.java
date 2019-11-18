package com.qst.examsystem.dao;

import com.qst.examsystem.entity.Course;

/**
 * 课程表Dao层接口
 */
public interface ICourseDao {
    /**
     * 添加课程
     * @param course
     * @return
     */
    int addCourse(Course course);
}
