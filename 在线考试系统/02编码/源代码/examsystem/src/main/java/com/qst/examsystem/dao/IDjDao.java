package com.qst.examsystem.dao;

import com.qst.examsystem.entity.Dj;

/**
 * 答卷dao层接口
 */
public interface IDjDao {
    /**
     * 添加答卷
     * @param dj
     * @return
     */
    public int insertDj(Dj dj);
}
