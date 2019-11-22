package com.qst.examsystem.dao;

import com.qst.examsystem.entity.Teacher;
import org.apache.ibatis.session.RowBounds;

import java.util.List;
import java.util.Map;

/**
 * 教师表Dao层接口
 */
public interface ITeacherDao {

    /**
     * 添加
     * @param teacher
     * @return
     */
    Integer addTeacher(Teacher teacher);

    /**
     * 修改
     * @param teacher
     * @return
     */
    Integer updataTeacher(Teacher teacher);

    /**
     * 删除
     * @param tid
     * @return
     */
    Integer deleteTeacher(Integer tid);

    /**
     * 根据id查询
     * @param tid
     * @return
     */
    Teacher findTeacherById(Integer tid);

    /**
     * 查询所有
     * @param rowBounds
     * @param teacher
     * @return
     */
    List<Teacher> findTeacherByCond(RowBounds rowBounds, Teacher teacher);

    /**
     * 查询count（*）
     * @param teacher
     * @return
     */
    Integer findTeacherCount(Teacher teacher);

    /**
     * 计算成绩
     * @param khid
     * @return
     */
    Map<String,Integer>countDegree(Integer khid);

    /**
     * 添加成绩
     * @param map （分数，khid）
     * @return
     */
    int insertScore(Map map);

    /**
     * 根据试卷名字
     * @param map
     * @return
     */
    List<Map<String,Object>>selectAVGDegree(Map map);
    /**
     * g根据试卷名查询所有成绩
     * @param map
     * @return
     */
    List<Map<String, Object>>selectAllDegreeBySJName(Map map);
    /**
     * 教师登陆
     * @param password
     * @return
     */
    Teacher teacherlogin(String password);

    /**
     * 修改密码
     * @param teacher
     * @return
     */
    int updateTpw(Teacher teacher);
}
