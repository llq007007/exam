package com.qst.examsystem.dao;

import com.qst.examsystem.entity.Student;

/**
 * 学生Dao层接口
 */
public interface IStudentDao {
    /**
     * 添加学生
     * @param student
     * @return
     */
    int insertStudent(Student student);
}
