package com.qst.examsystem.dao;

import com.qst.examsystem.entity.Tt;


import java.util.List;

/**
 * 套题Dao接口
 */
public interface ITtDao {
    /**
     * 添加套题
     * @param tt
     * @return
     */
    int insertTt(Tt tt);

    /**
     * 查询所有套题
     * @return
     */
    List<Tt> queryTt();

    /**
     * 根据套题ID删除套题
     * @param ttid
     * @return
     */
    int deleteTt(int  ttid);

    /**
     * 根据套题ID查询题目及答案
     * @param ttid
     * @return
     */
    Tt getTt(int ttid);

}