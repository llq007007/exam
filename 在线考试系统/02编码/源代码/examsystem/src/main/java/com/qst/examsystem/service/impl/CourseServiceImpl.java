package com.qst.examsystem.service.impl;

import com.qst.examsystem.dao.ICourseDao;
import com.qst.examsystem.entity.Course;
import com.qst.examsystem.service.ICourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("courseService")
public class CourseServiceImpl implements ICourseService {
    //自动装配
    @Autowired
    @Qualifier("courseDao")
    private ICourseDao courseDao;

    /**
     * 添加
     * @param course
     * @return
     */
    @Override
    public int addCourse(Course course) {
        return courseDao.addCourse(course);
    }

    /**
     * 删除
     * @param cid
     * @return
     */
    @Override
    public int deleteCourse(int cid) {
        return courseDao.deleteCourse(cid);
    }

    /**
     * 查询
     * @return
     */
    @Override
    public List<Course> queryCourse() {
        return courseDao.queryCourse();
    }

    /**
     * 根据cid查询
     * @param cid
     * @return
     */
    @Override
    public Course getCourse(int cid) {
        return courseDao.getCourse(cid);
    }

    /**
     * 修改
     * @param course
     * @return
     */
    @Override
    public int updateCourse(Course course) {
        return courseDao.updateCourse(course);
    }
}
