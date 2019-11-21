package com.qst.examsystem.dao;

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
}
