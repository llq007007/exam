package com.qst.examsystem.service;

import com.qst.examsystem.entity.Course;

import java.util.List;

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

    /**
     * 删除信息
     * @param cid
     * @return
     */
    int deleteCourse(int cid);

    /**
     * 查询所有信息
     * @return
     */
    List<Course> queryCourse();

    /**
     * 根据cid查询
     * @param cid
     * @return
     */
    Course getCourse(int cid);
    /**
     * 修改课程信息
     * @param course
     * @return
     */
    int updateCourse(Course course);
}
