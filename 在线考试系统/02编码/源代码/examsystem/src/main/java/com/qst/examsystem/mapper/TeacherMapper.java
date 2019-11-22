package com.qst.examsystem.mapper;

        import com.qst.examsystem.entity.Teacher;
        import org.apache.ibatis.session.RowBounds;

        import java.util.List;
        import java.util.Map;

/**
 * 教师mapper接口
 */
public interface TeacherMapper {
    /**
     * 增加
     * @param teacher
     * @return
     */
    Integer addTeacher(Teacher teacher);

    /**
     * 修改
     * @return
     * @param teacher
     */
    Integer findTeacherModify(Teacher teacher);

    /**
     * 删除
     * @param tid
     * @return
     */
    Integer deleteTeacher(Integer tid);

    /**
     * 查询根据id
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

    //Integer updataTeacher(Teacher teacher);

    /**
     * 计算成绩
     * @param
     * @return
     */
    Map<String,Integer>countDegree(Integer khid);

    /**
     * 添加成绩
     * @param map
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
