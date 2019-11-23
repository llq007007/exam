package com.qst.examsystem.service;

import com.qst.examsystem.entity.Sj;

import java.util.List;
import java.util.Map;

public interface ISjService {
    /**
     * 组织试卷
     * @param map
     * @return
     */
    public List<Map<String,Object>> chouSj(Map map);

    /**
     * 查询所有试卷
     * @return
     */
    List<Sj> selectAllShiJuan();
}
