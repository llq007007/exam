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
import java.util.Map;

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
     * @param khid
     * @return
     */
    @Override
    public Integer deleteStudent(Integer khid) {
        return studentMapper.deleteStudent(khid);
    }

    /**
     * 根据id查找
     * @param khid
     * @return
     */
    @Override
    public Student findStudentById(Integer khid) {
        return studentMapper.findStudentById(khid);
    }

    /**
     * 分页查询所有
     * @param rowBounds
     * @param student
     * @return
     */
    @Override
    public List<Student> findStudentPage(RowBounds rowBounds, Student student) {
        return studentMapper.findStudentPage(rowBounds,  student);
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

    /**
     * 查询学生个人信息
     * @param map 姓名
     * @return
     */
    @Override
    public Map<String, Object> getStudentByName(Map map) {
        return studentMapper.getStudentByName(map);
    }

    /**
     * 计算成绩（查询个人成绩）
     * @param name 模糊查询（学生名字）
     * @return
     */
    @Override
    public Map<String, Object> queryStudentDegree(String name) {
        return studentMapper.queryStudentDegree(name);
    }
    /**
     * 学生登陆
     * @param sname
     * @return
     */
    @Override
    public Student studentlogin(String sname) {
        return studentMapper.studentlogin(sname);
    }
    /**
     * 修改密码
     * @param student
     * @return
     */
    @Override
    public int updateSpw(Student student) {
        return studentMapper.updateSpw(student);
    }
}
