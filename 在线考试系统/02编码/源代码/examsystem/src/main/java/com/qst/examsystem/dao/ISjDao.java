package com.qst.examsystem.dao;

import com.qst.examsystem.entity.Sj;

import java.util.List;
import java.util.Map;

/**
 * 试卷Dao
 */
public interface ISjDao {
    /**
     *
     * @param map
     * @return
     */
    List<Map<String,Object>>chouSj(Map map);
    /**
     * 查询所有试卷
     * @return
     */
    List<Sj> selectAllShiJuan();
}
