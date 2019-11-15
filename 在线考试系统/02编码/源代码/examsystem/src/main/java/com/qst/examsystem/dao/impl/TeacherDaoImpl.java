package com.qst.examsystem.dao.impl;

import com.qst.examsystem.dao.ITeacherDao;
import com.qst.examsystem.entity.Teacher;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository("teacherDao")
public class TeacherDaoImpl implements ITeacherDao {
    @Autowired
    @Qualifier("sqlSession")
    SqlSession sqlSession;

    @Override
    public int insertTeacher(Teacher teacher) {
        return 0;
    }

    @Override
    public int updatePassword(String password) {
        return 0;
    }
}
