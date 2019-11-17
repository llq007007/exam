package com.qst.examsystem.dao;

import com.qst.examsystem.entity.Teacher;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * 教师表Dao层接口
 */
public interface ITeacherDao {

    /**
     * 添加
     * @param teacher
     * @return
     */
    Integer addTeacher(Teacher teacher);

    /**
     * 修改
     * @param teacher
     * @return
     */
    Integer updataTeacher(Teacher teacher);

    /**
     * 删除
     * @param tid
     * @return
     */
    String deleteTeacher(String tid);

    /**
     * 根据id查询
     * @param tid
     * @return
     */
    Teacher findTeacherById(String tid);

    /**
     * 查询所有
     * @param rowBounds
     * @param teacher
     * @return
     */
    List<Teacher> findTeacherByCond(RowBounds rowBounds, Teacher teacher);

    /**
     * 查询count（*）
     * @param teacher
     * @return
     */
    Integer findTeacherCount(Teacher teacher);
}
