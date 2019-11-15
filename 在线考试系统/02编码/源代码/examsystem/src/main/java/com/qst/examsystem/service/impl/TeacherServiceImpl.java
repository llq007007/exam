package com.qst.examsystem.service.impl;

import com.qst.examsystem.dao.ITeacherDao;
import com.qst.examsystem.entity.Teacher;
import com.qst.examsystem.service.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("teacherService")
public class TeacherServiceImpl implements ITeacherService {
    @Autowired
    @Qualifier("teacherDao")
    private ITeacherDao teacherDao;

    @Override
    public int insertTeacher(Teacher teacher) {
        return 0;
    }

    @Override
    public int updatePassword(String password) {
        return 0;
    }
}
