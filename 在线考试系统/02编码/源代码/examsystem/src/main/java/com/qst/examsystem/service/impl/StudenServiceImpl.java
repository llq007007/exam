package com.qst.examsystem.service.impl;

import com.qst.examsystem.dao.IStudentDao;
import com.qst.examsystem.entity.Student;
import com.qst.examsystem.service.IStudentService;
import com.qst.examsystem.util.Page;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("studentService")
public class StudenServiceImpl implements IStudentService {
    @Autowired
    @Qualifier("studentDao")
    private IStudentDao studentDao;

    @Override
    public Integer addStudent(Student student) {
        return studentDao.addStudent(student);
    }

    @Override
    public Integer updataStudent(Student student) {
        return studentDao.updataStudent(student);
    }

    @Override
    public String deleteStudent(String sid) {
        return studentDao.deleteStudent(sid);
    }

    @Override
    public Student findStudentById(String sid) {
        return studentDao.findStudentById(sid);
    }

    @Override
    public Page<Student> findStudentPage(Integer page, Integer rows, Student student) {
        RowBounds rowBounds = new RowBounds((page-1) * rows, rows);
//		// 查询管理员列表
        List<Student>students=studentDao.findStudentByCond(rowBounds,student);

//		// 查询管理员列表总记录数
        Integer count =studentDao.findStudentCount(student);
//		// 创建Page返回对象
        Page<Student> result = new Page<Student>();
        result.setPage(page);
        result.setRows(students);
        result.setSize(rows);
        result.setTotal(count);
        return result;
    }
}
