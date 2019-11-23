package com.qst.examsystem.service;


import com.qst.examsystem.entity.Student;
import com.qst.examsystem.util.Page;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

/**
 * student表业务层
 */
public interface IStudentService {
    /**
     * 增加考生
     * @param student
     * @return 1成功，0失败
     */
    public Integer addStudent(Student student);
    /**
     * 修改考生
     * @param student
     * @return 1成功，0失败
     */
    public Integer updataStudent(Student student);
    /**
     * 删除考生
     * @param khid
     * @return  1成功，0失败
     */
    public Integer deleteStudent(@Param("khid") Integer khid);
    /**
     * 根据id查找考生
     * @param khid
     * @return
     */
    public Student findStudentById(Integer khid);
    /**
     * 查询所有考生
     * @param page
     * @param rows
     * @param student
     * @return
     */
    public Page<Student> findStudentPage(Integer page, Integer rows, Student student);

    /**
     * lilinsheng
     * 查询学生成绩 （计算）
     * @param name
     * @return
     */
    public Map<String,Object> queryStudentDegree(String name);

    /**
     * 根据姓名查询学生信息
     * @param map
     * @return
     */
    public Map<String,Object>getStudentByName(Map map);

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
