package com.qst.examsystem.mapper;

import com.qst.examsystem.entity.Student;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * 学生接口
 */
public interface StudentMapper {
    Integer addStudent(Student student);

    Integer findStudentModify(Student student);

    String deleteStudent(String sid);

    Student findStudentById(String sid);

    List<Student> findStudentByCond(RowBounds rowBounds, Student student);

    Integer findStudentCount(Student student);
}
