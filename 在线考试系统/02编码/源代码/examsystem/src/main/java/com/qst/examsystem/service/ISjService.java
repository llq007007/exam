package com.qst.examsystem.service;

import java.util.List;
import java.util.Map;

public interface ISjService {
    /**
     * 组织试卷
     * @param map
     * @return
     */
    public List<Map<String,Object>> chouSj(Map map);
}
