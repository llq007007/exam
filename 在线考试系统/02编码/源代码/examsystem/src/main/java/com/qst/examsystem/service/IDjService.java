package com.qst.examsystem.service;

import com.qst.examsystem.entity.Dj;

/**
 * 答卷业务层接口
 */
public interface IDjService {

    /**
     * 添加答卷
     * @param dj
     * @return
     */
    public int  insertDj(Dj dj);
}
