package com.qst.examsystem.service.impl;

import com.qst.examsystem.dao.IStudentDao;
import com.qst.examsystem.entity.Student;
import com.qst.examsystem.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("studentService")
public class StudenServiceImpl implements IStudentService {
    @Autowired
    @Qualifier("studentDao")
    private IStudentDao studentDao;

    @Override
    public int insertStudent(Student student) {
        return 0;
    }

    @Override
    public int updatePassword(String password) {
        return 0;
    }
}
