package com.qst.examsystem.dao;

import com.qst.examsystem.entity.Teacher;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * 教师表Dao层接口
 */
public interface ITeacherDao {


    Integer addTeacher(Teacher teacher);

    Integer updataTeacher(Teacher teacher);

    String deleteTeacher(String tid);

    Teacher findTeacherById(String tid);

    List<Teacher> findTeacherByCond(RowBounds rowBounds, Teacher teacher);

    Integer findTeacherCount(Teacher teacher);
}
