package com.qst.examsystem.mapper;

import com.qst.examsystem.entity.Teacher;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * 教师mapper接口
 */
public interface TeacherMapper {

    Integer addTeacher(Teacher teacher);

    Integer findTeacherModify();

    String deleteTeacher(String tid);

    Teacher findTeacherById(String tid);

    List<Teacher> findTeacherByCond(RowBounds rowBounds, Teacher teacher);

    Integer findTeacherCount(Teacher teacher);

    Integer updataTeacher(Teacher teacher);

}
