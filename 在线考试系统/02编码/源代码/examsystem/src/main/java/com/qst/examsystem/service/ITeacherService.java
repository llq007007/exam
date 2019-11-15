package com.qst.examsystem.service;

import com.qst.examsystem.entity.Teacher;

/**
 * 教师表业务层接口
 */
public interface ITeacherService {
    /**
     * 添加教师
     * @param teacher
     * @return
     */
    int insertTeacher(Teacher teacher);

    /**
     * 修改密码
     * @param password
     * @return
     */
    int updatePassword(String password);
}
