package com.qst.examsystem.dao.impl;

import com.qst.examsystem.dao.ITeacherDao;
import com.qst.examsystem.entity.Teacher;
import com.qst.examsystem.mapper.TeacherMapper;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * 教师数据访问
 */
@Repository("teacherDao")
public class TeacherDaoImpl implements ITeacherDao {
    @Autowired
    @Qualifier("teacherMapper")
    private TeacherMapper teacherMapper;//创建mapper对象

    /**
     * 添加
     * @param teacher
     * @return
     */
    @Override
    public Integer addTeacher(Teacher teacher) {
        return teacherMapper.addTeacher(teacher);
    }

    /**
     * 修改
     * @param teacher
     * @return
     */
    @Override
    public Integer updataTeacher(Teacher teacher) {
        return teacherMapper.findTeacherModify(teacher);
    }

    /**
     * 删除
     * @param tid
     * @return
     */
    @Override
    public Integer deleteTeacher(Integer tid) {
        return teacherMapper.deleteTeacher(tid);
    }

    /**
     * 根据id查询
     * @param tid
     * @return
     */
    @Override
    public Teacher findTeacherById(Integer tid) {
        return teacherMapper.findTeacherById(tid);
    }

    /**
     * 分页查询所有
     * @param rowBounds
     * @param teacher
     * @return
     */
    @Override
    public List<Teacher> findTeacherByCond(RowBounds rowBounds, Teacher teacher) {
        return teacherMapper.findTeacherByCond(rowBounds,teacher);
    }

    /**
     *  查询 teacher count（*）
     * @param teacher
     * @return
     */
    @Override
    public Integer findTeacherCount(Teacher teacher) {
        return teacherMapper.findTeacherCount(teacher);
    }

    /**
     * 计算成绩
     * @param khid
     * @return
     */
    @Override
    public Map<String, Integer> countDegree(Integer khid) {
        return teacherMapper.countDegree(khid);
    }

    /**
     * 添加成绩
     * @param map （分数，khid）
     * @return
     */
    @Override
    public int insertScore(Map map) {
        return teacherMapper.insertScore(map);
    }
    /**
     * 根据试卷名字
     * @param map
     * @return
     */

    @Override
    public List<Map<String,Object>> selectAVGDegree(Map map) {
        return teacherMapper.selectAVGDegree(map);
    }

    @Override
    public List<Map<String, Object>> selectAllDegreeBySJName(Map map) {
        return teacherMapper.selectAllDegreeBySJName(map);
    }
    /**
     * 教师登陆
     * @param password
     * @return
     */
    @Override
    public Teacher teacherlogin(String password) {
        return teacherMapper.teacherlogin(password);
    }
}
