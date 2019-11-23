package com.qst.examsystem.mapper;

import com.qst.examsystem.entity.Student;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.type.Alias;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

/**
 * 学生接口
 */
public interface StudentMapper {
    /**
     * 增加
     * @param student
     * @return
     */
    Integer addStudent(Student student);

    /**
     * 修改
     * @param student
     * @return
     */
    Integer findStudentModify(Student student);

    /**
     * 删除
     * @param
     * @return
     */
    Integer deleteStudent(Integer khid);

    /**
     * 查询根据id
     * @param khid
     * @return
     */
    Student findStudentById(@RequestParam("khid") Integer khid);

    /**
     * 查询所有
     * @param rowBounds
     * @param student
     * @return
     */
    List<Student> findStudentPage(RowBounds rowBounds, Student student);

    /**
     * 查询student count（*）
     * @param student
     * @return
     */
    Integer findStudentCount(Student student);


    /**
     * lilinsheng
     * 查询学生成绩
     * @param sname 学生名
     * @return
     */
    Map<String,Object> queryStudentDegree(@Param("name") String sname);

    /**
     * 查询学生个人信息
     * @param map 学生姓名 key value
     * @return
     */
    Map<String,Object>getStudentByName(Map map);

    /**
     * 根据考号id修改学生信息
     * @param khid
     * @return
     */
    int updateStudent(Integer khid);

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
