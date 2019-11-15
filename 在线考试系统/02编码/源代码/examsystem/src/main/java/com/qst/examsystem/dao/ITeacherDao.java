package com.qst.examsystem.dao;

import com.qst.examsystem.entity.Teacher;

/**
 * 教师表Dao层接口
 */
public interface ITeacherDao {
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
