package com.qst.examsystem.service;

import com.qst.examsystem.entity.Student;

/**
 * student表业务层
 */
public interface IStudentService {
    /**
     * 添加学生
     * @param student
     * @return
     */
    int insertStudent(Student student);

    /**
     * 修改密码
     * @param password
     * @return
     */
    int updatePassword(String password);
}
