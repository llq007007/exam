package com.qst.examsystem.mapper;

import com.qst.examsystem.entity.Teacher;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * 教师mapper接口
 */
public interface TeacherMapper {
    /**
     * 增加
     * @param teacher
     * @return
     */
    Integer addTeacher(Teacher teacher);

    /**
     * 修改
     * @return
     * @param teacher
     */
    Integer findTeacherModify(Teacher teacher);

    /**
     * 删除
     * @param tid
     * @return
     */
    String deleteTeacher(Integer tid);

    /**
     * 查询根据id
     * @param tid
     * @return
     */
    Teacher findTeacherById(Integer tid);

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

    //Integer updataTeacher(Teacher teacher);

}
