package com.qst.examsystem.mapper;

import com.qst.examsystem.entity.Student;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

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
     * @param sid
     * @return
     */
    Integer deleteStudent(Integer sid);

    /**
     * 查询根据id
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
     * 查询student count（*）
     * @param student
     * @return
     */
    Integer findStudentCount(Student student);
}
