package com.qst.examsystem.dao.impl;

import com.qst.examsystem.dao.IStudentDao;
import com.qst.examsystem.entity.Student;
import com.qst.examsystem.mapper.StudentMapper;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;
/**
 * 学生数据访问
 */
@Repository("studentDao")
public class StudentDaoImpl implements IStudentDao {
    @Autowired
    @Qualifier("studentMapper")
    private StudentMapper studentMapper;//创建mapper对象

    /**
     * 添加
     * @param student
     * @return
     */
    @Override
    public Integer addStudent(Student student) {
        return studentMapper.addStudent(student);
    }

    /**
     * 修改
     * @param student
     * @return
     */
    @Override
    public Integer updataStudent(Student student) {
        return studentMapper.findStudentModify(student);
    }

    /**
     * 删除
     * @param sid
     * @return
     */
    @Override
    public Integer deleteStudent(Integer sid) {
        return studentMapper.deleteStudent(sid);
    }

    /**
     * 根据id查找
     * @param sid
     * @return
     */
    @Override
    public Student findStudentById(Integer sid) {
        return studentMapper.findStudentById(sid);
    }

    /**
     * 分页查询所有
     * @param rowBounds
     * @param student
     * @return
     */
    @Override
    public List<Student> findStudentByCond(RowBounds rowBounds, Student student) {
        return studentMapper.findStudentByCond(rowBounds,  student);
    }

    /**
     * 查询 Student count（*）
     * @param student
     * @return
     */
    @Override
    public Integer findStudentCount(Student student) {
        return studentMapper.findStudentCount(student);
    }
}
