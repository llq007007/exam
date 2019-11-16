package com.qst.examsystem.dao;

import com.qst.examsystem.entity.Student;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * 学生Dao层接口
 */
public interface IStudentDao {

    Integer addStudent(Student student);

    Integer updataStudent(Student student);

    String deleteStudent(String sid);

    Student findStudentById(String sid);

    List<Student> findStudentByCond(RowBounds rowBounds, Student student);

    Integer findStudentCount(Student student);

}
