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
     * @param khid
     * @return
     */
    Integer deleteStudent(Integer khid);

    /**
     * 根据id查询
     * @param khid
     * @return
     */
    Student findStudentById(Integer khid);

    /**
     * 查询所有
     * @param rowBounds
     * @param student
     * @return
     */
    List<Student> findStudentPage(RowBounds rowBounds, Student student);

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
    /**
     * 学生登陆
     * @param sname
     * @return
     */
    Student studentlogin(String sname);
    /**
     * 修改密码
     * @param student
     * @return
     */
    int updateSpw(Student student);
}
