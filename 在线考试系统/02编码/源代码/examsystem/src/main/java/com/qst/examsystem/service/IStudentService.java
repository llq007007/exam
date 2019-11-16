package com.qst.examsystem.service;


import com.qst.examsystem.entity.Student;
import com.qst.examsystem.util.Page;
import org.apache.ibatis.annotations.Param;

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
    public String deleteStudent(@Param("jkid") String sid);
    /**
     * 根据id查找考生
     * @param sid
     * @return
     */
    public Student findStudentById(String sid);
    /**
     * 查询所有考生
     * @param page
     * @param rows
     * @param student
     * @return
     */
    public Page<Student> findStudentPage(Integer page, Integer rows, Student student);
}
