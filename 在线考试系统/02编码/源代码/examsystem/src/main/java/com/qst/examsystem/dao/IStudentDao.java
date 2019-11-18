package com.qst.examsystem.dao;

import com.qst.examsystem.entity.Student;
import org.apache.ibatis.session.RowBounds;

import java.util.List;
import java.util.Map;

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
    Integer deleteStudent(Integer sid);

    /**
     * 根据id查询
     * @param sid
     * @return
     */
    Student findStudentById(Integer sid);

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

    /**
     *lilinsheng
     * @param name 模糊查询（学生名字）
     * @return
     */
    Map<String,Object> queryStudentDegree(String name);

    /**
     * 查询学生个人信息
     * @param map
     * @return
     */
    Map<String,Object>getStudentByName(Map map);
}
