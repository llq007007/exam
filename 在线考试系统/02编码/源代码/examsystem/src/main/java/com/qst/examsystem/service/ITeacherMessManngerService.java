package com.qst.examsystem.service;

import com.qst.examsystem.entity.Teacher;

/**
 * 教师用户个人信息管理接口
 */
public interface ITeacherMessManngerService {
    /**
     * 根据本人id查找信息
     * @param tid
     * @return
     */
    public Teacher findTeacherById(Integer tid);

    /**
     * 修改本人信息
     * @param teacher
     * @return 1成功，0失败
     */
    public Integer updataTeacher(Teacher teacher);
}
