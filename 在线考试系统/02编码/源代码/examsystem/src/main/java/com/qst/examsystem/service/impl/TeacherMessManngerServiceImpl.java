package com.qst.examsystem.service.impl;

import com.qst.examsystem.dao.ITeacherDao;
import com.qst.examsystem.entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * 教师用户个人信息管理
 */
@Service("teacherMessService")
public class TeacherMessManngerServiceImpl {
    @Autowired
    @Qualifier("teacherDao")
    private ITeacherDao teacherDao;
}
