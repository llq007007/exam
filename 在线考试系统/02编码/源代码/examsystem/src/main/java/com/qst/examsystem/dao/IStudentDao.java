package com.qst.examsystem.dao;

import com.qst.examsystem.entity.Student;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * 学生Dao层接口
 */
public interface IStudentDao {
    /**
     * 添加学生
     * @param student
     * @return
     */
    Integer addStudent(Student student);

    /**
     * 修改学生
     * @param student
     * @return
     */
    Integer updataStudent(Student student);

    /**
     * 删除
     * @param sid
     * @return
     */
    String deleteStudent(String sid);

    /**
     * 根据id查询
     * @param sid
     * @return
     */
    Student findStudentById(String sid);

    /**
     * 查询所有
     * @param rowBounds
     * @param student
     * @return
     */
    List<Student> findStudentByCond(RowBounds rowBounds, Student student);

    /**
     * 查询count（*）
     * @param student
     * @return
     */
    Integer findStudentCount(Student student);

}
