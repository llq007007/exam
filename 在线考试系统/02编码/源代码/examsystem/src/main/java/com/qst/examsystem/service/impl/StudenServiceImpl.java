package com.qst.examsystem.service.impl;

import com.qst.examsystem.dao.IStudentDao;
import com.qst.examsystem.entity.Student;
import com.qst.examsystem.service.IStudentService;
import com.qst.examsystem.util.Page;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("studentService")
public class StudenServiceImpl implements IStudentService {
    @Autowired
    @Qualifier("studentDao")
    private IStudentDao studentDao;

    /**
     * 增加
     * @param student
     * @return
     */
    @Override
    public Integer addStudent(Student student) {
        return studentDao.addStudent(student);
    }

    /**
     * 修改
     * @param student
     * @return
     */
    @Override
    public Integer updataStudent(Student student) {
        return studentDao.updataStudent(student);
    }

    /**
     * 删除
     * @param khid
     * @return
     */
    @Override
    public Integer deleteStudent(Integer khid) {
        return studentDao.deleteStudent(khid);
    }

    /**
     * 根据id查询
     * @param khid
     * @return
     */
    @Override
    public Student findStudentById(Integer khid) {
        return studentDao.findStudentById(khid);
    }

    /**
     * 查询所有
     * @param page
     * @param rows
     * @param student
     * @return
     */
    @Override
    public Page<Student> findStudentPage(Integer page, Integer rows, Student student) {
        RowBounds rowBounds = new RowBounds((page-1) * rows, rows);
//		// 查询管理员列表
        List<Student>students=studentDao.findStudentPage(rowBounds,student);

//		// 查询管理员列表总记录数
        Integer count =studentDao.findStudentCount(student);
//		// 创建Page返回对象
        Page<Student> result = new Page<Student>();
        result.setPage(page);
        result.setRows(students);
        result.setSize(rows);
        result.setTotal(count);
        return result;
    }

    @Override
    public Map<String,Object> getStudentByName(Map map) {
        return studentDao.getStudentByName(map);
    }

    @Override
    public Map<String,Object> queryStudentDegree(String name) {

        return studentDao.queryStudentDegree(name);
    }
    /**
     * 学生登陆
     * @param sname
     * @return
     */
    @Override
    public Student studentlogin(String sname) {
        return studentDao.studentlogin(sname);
    }
    /**
     * 修改密码
     * @param student
     * @return
     */
    @Override
    public int updateSpw(Student student) {
        return studentDao.updateSpw(student);
    }
}
