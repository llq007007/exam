package com.qst.examsystem.mapper;

import com.qst.examsystem.entity.Dj;

/**
 * 答卷mapper接口
 */
public interface DjMapper {
    /**
     * 添加答卷
     * @param dj
     * @return
     */
    public int insertDj(Dj dj);
}
