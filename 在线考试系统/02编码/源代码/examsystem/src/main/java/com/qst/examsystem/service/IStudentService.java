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
     * @param sid
     * @return  1成功，0失败
     */
    public Integer deleteStudent(@Param("jkid") Integer sid);
    /**
     * 根据id查找考生
     * @param sid
     * @return
     */
    public Student findStudentById(Integer sid);
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
    public Map<String,String> queryStudentDegree(String name);
}
