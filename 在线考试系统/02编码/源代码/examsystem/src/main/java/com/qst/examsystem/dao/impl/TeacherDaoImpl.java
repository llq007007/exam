package com.qst.examsystem.dao.impl;

import com.qst.examsystem.dao.ITeacherDao;
import com.qst.examsystem.entity.Teacher;
import com.qst.examsystem.mapper.TeacherMapper;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 教师数据访问
 */
@Repository("teacherDao")
public class TeacherDaoImpl implements ITeacherDao {
    @Autowired
    @Qualifier("sqlSession")
    SqlSession sqlSession;
    private TeacherMapper teacherMapper;//创建mapper对象

    /**
     * 添加
     * @param teacher
     * @return
     */
    @Override
    public Integer addTeacher(Teacher teacher) {
        return teacherMapper.addTeacher(teacher);
    }

    /**
     * 修改
     * @param teacher
     * @return
     */
    @Override
    public Integer updataTeacher(Teacher teacher) {
        return teacherMapper.updataTeacher(teacher);
    }

    /**
     * 删除
     * @param tid
     * @return
     */
    @Override
    public String deleteTeacher(String tid) {
        return teacherMapper.deleteTeacher(tid);
    }

    /**
     * 根据id查询
     * @param tid
     * @return
     */
    @Override
    public Teacher findTeacherById(String tid) {
        return teacherMapper.findTeacherById(tid);
    }

    /**
     * 分页查询所有
     * @param rowBounds
     * @param teacher
     * @return
     */
    @Override
    public List<Teacher> findTeacherByCond(RowBounds rowBounds, Teacher teacher) {
        return teacherMapper.findTeacherByCond(rowBounds,teacher);
    }

    /**
     *  查询 teacher count（*）
     * @param teacher
     * @return
     */
    @Override
    public Integer findTeacherCount(Teacher teacher) {
        return teacherMapper.findTeacherCount(teacher);
    }
}
