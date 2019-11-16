package com.qst.examsystem.dao.impl;

import com.qst.examsystem.dao.IStudentDao;
import com.qst.examsystem.entity.Student;
import com.qst.examsystem.mapper.StudentMapper;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;
/**
 * 学生数据访问
 */
@Repository("studentDao")
public class StudentDaoImpl implements IStudentDao {
    @Autowired
    @Qualifier("sqlSession")
    SqlSession sqlSession;
    private StudentMapper studentMapper;

    @Override
    public Integer addStudent(Student student) {
        return studentMapper.addStudent(student);
    }

    @Override
    public Integer updataStudent(Student student) {
        return studentMapper.findStudentModify(student);
    }

    @Override
    public String deleteStudent(String sid) {
        return studentMapper.deleteStudent(sid);
    }

    @Override
    public Student findStudentById(String sid) {
        return studentMapper.findStudentById(sid);
    }

    @Override
    public List<Student> findStudentByCond(RowBounds rowBounds, Student student) {
        return studentMapper.findStudentByCond(rowBounds,  student);
    }

    @Override
    public Integer findStudentCount(Student student) {
        return studentMapper.findStudentCount(student);
    }
}
