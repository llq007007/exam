package com.qst.examsystem.dao.impl;

import com.qst.examsystem.dao.ICourseDao;
import com.qst.examsystem.entity.Course;
import com.qst.examsystem.mapper.CourseMapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 调用课程Dao层方法
 */
@Repository("courseDao")
public class CourseDaoImpl implements ICourseDao {
    @Autowired
    @Qualifier("courseMapper")
    private CourseMapper courseMapper;

    /**
     * 添加
     * @param course
     * @return
     */
    @Override
    public int addCourse(Course course) {
        return courseMapper.addCourse(course);
}

    /**
     * 删除
     * @param cid
     * @return
     */
    @Override
    public int deleteCourse(int cid) {
        return courseMapper.deleteCourse(cid);
    }

    /**
     * 查询
     * @return
     */
    @Override
    public List<Course> queryCourse() {
        return courseMapper.queryCourse();
    }

    /**
     * 根据cid查询
     * @param cid
     * @return
     */
    @Override
    public Course getCourse(int cid) {
        return courseMapper.getCourse(cid);
    }

    /**
     * 修改
     * @param course
     * @return
     */
    @Override
    public int updateCourse(Course course) {
        return courseMapper.updateCourse(course);
    }
}
