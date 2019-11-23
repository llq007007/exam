package com.qst.examsystem.service.impl;

import com.qst.examsystem.dao.ITeacherDao;
import com.qst.examsystem.entity.Teacher;
import com.qst.examsystem.service.ITeacherService;
import com.qst.examsystem.util.Page;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("teacherService")
public class TeacherServiceImpl implements ITeacherService {
    @Autowired
    @Qualifier("teacherDao")
    private ITeacherDao teacherDao;

    /**
     * 增加
     * @param teacher
     * @return
     */
    @Override
    public Integer addTeacher(Teacher teacher) {
        return teacherDao.addTeacher(teacher);
    }

    /**
     * 修改
     * @param teacher
     * @return
     */
    @Override
    public Integer updataTeacher(Teacher teacher) {
        return teacherDao.updataTeacher(teacher);
    }

    /**
     * 删除
     * @param tid
     * @return
     */
    @Override
    public Integer deleteTeacher(Integer tid) {
        return teacherDao.deleteTeacher(tid);
    }

    /**
     * 根据id查询
     * @param tid
     * @return
     */
    @Override
    public Teacher findTeacherById(Integer tid) {
        return teacherDao.findTeacherById(tid);
    }

    /**
     * 查询所有
     * @param page
     * @param rows
     * @param teacher
     * @return
     */
    @Override
    public Page<Teacher> findTeacherPage(Integer page, Integer rows, Teacher teacher) {
        RowBounds rowBounds = new RowBounds((page-1) * rows, rows);
//		// 查询管理员列表
        List<Teacher> teachers=teacherDao.findTeacherByCond(rowBounds,teacher);

//		// 查询管理员列表总记录数
        Integer count =teacherDao.findTeacherCount(teacher);
//		// 创建Page返回对象
        Page<Teacher> result = new Page<Teacher>();
        result.setPage(page);
        result.setRows(teachers);
        result.setSize(rows);
        result.setTotal(count);
        return result;
    }

    @Override
    public Map<String, Integer> countDegree(Integer khid) {
        return teacherDao.countDegree(khid);
    }

    @Override
    public int insertScore(Map map) {
        return teacherDao.insertScore(map);
    }

    @Override
    public List<Map<String, Object>> selectAVGDegree(Map map) {
        return teacherDao.selectAVGDegree(map);
    }

    /**
     * 根据试卷名查询所有成绩
     * @param map
     * @return
     */
    @Override
    public List<Map<String, Object>> selectAllDegreeBySJName(Map map) {
        return teacherDao.selectAllDegreeBySJName(map);
    }

    @Override
    public Teacher teacherlogin(String password) {
        return teacherDao.teacherlogin(password);
    }
    /**
     * 修改密码
     * @param teacher
     * @return
     */
    @Override
    public int updateTpw(Teacher teacher) {
        return teacherDao.updateTpw(teacher);
    }
    /**
     * 加载教师
     * @return
     */
    @Override
    public List<Teacher> loadTeacher() {
        return teacherDao.loadTeacher();
    }
}
