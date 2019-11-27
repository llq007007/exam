package com.qst.examsystem.dao;

import com.qst.examsystem.entity.Sj;
import com.qst.examsystem.entity.Testquestion;

import java.util.List;
import java.util.Map;

/**
 * 试卷Dao
 */
public interface ISjDao {
    /**
     *
     * @param
     * @return
     */
    List<Testquestion>chouSj(int cid);
    /**
     * 查询所有试卷
     * @return
     */
    List<Sj> selectAllShiJuan();
    /**
     * 添加试卷
     * @param sj
     * @return
     */
    int addSJ(Sj sj);
    /**
     * 查找试卷id
     * @param sjname
     * @return
     */
    Sj selectShiJuan(String sjname);
}
