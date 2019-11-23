package com.qst.examsystem.service;

import com.qst.examsystem.entity.Teacher;
import com.qst.examsystem.util.Page;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 教师表业务层接口
 */
public interface ITeacherService {
    /**
     * 增加
     * @param teacher
     * @return 1成功，0失败
     */
    public Integer addTeacher(Teacher teacher);
    /**
     * 修改
     * @param teacher
     * @return 1成功，0失败
     */
    public Integer updataTeacher(Teacher teacher);
    /**
     * 删除
     * @param tid
     * @return  1成功，0失败
     */
    public Integer deleteTeacher(@Param("jkid") Integer tid);
    /**
     * 根据id查找
     * @param tid
     * @return
     */
    public Teacher findTeacherById(Integer tid);
    /**
     * 查询所有
     * @param page
     * @param rows
     * @param teacher
     * @return
     */
    public Page<Teacher> findTeacherPage(Integer page, Integer rows, Teacher teacher);

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
