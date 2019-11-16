package com.qst.examsystem.service.impl;

import com.qst.examsystem.dao.ITeacherDao;
import com.qst.examsystem.entity.Teacher;
import com.qst.examsystem.service.ITeacherService;
import com.qst.examsystem.util.Page;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("teacherService")
public class TeacherServiceImpl implements ITeacherService {
    @Autowired
    @Qualifier("teacherDao")
    private ITeacherDao teacherDao;

    @Override
    public Integer addTeacher(Teacher teacher) {
        return teacherDao.addTeacher(teacher);
    }

    @Override
    public Integer updataTeacher(Teacher teacher) {
        return teacherDao.updataTeacher(teacher);
    }

    @Override
    public String deleteTeacher(String tid) {
        return teacherDao.deleteTeacher(tid);
    }

    @Override
    public Teacher findTeacherById(String tid) {
        return teacherDao.findTeacherById(tid);
    }

    @Override
    public Page<Teacher> findTeacherPage(Integer page, Integer rows, Teacher teacher) {
        RowBounds rowBounds = new RowBounds((page-1) * rows, rows);
//		// 查询管理员列表
        List<Teacher> teachers=teacherDao.findTeacherByCond(rowBounds,teacher);

//		// 查询管理员列表总记录数
        Integer count =teacherDao.findTeacherCount(teacher);
//		// 创建Page返回对象
        Page<Teacher> result = new Page<Teacher>();
        result.setPage(page);
        result.setRows(teachers);
        result.setSize(rows);
        result.setTotal(count);
        return result;
    }
}
