package com.qst.examsystem.dao.impl;

import com.qst.examsystem.dao.IStudentDao;
import com.qst.examsystem.entity.Student;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository("studentDao")
public class StudentDaoImpl implements IStudentDao {
    @Autowired
    @Qualifier("sqlSession")
    SqlSession sqlSession;

    @Override
    public int insertStudent(Student student) {
        return 0;
    }

    @Override
    public int updatePassword(String password) {
        return 0;
    }
}
