package com.qst.examsystem.service;

import com.qst.examsystem.entity.Tt;

/**
 * 套题业务层接口
 */
public interface ITtService {
    /**
     * 添加套题
     * @param tt
     * @return
     */
     int insertTt(Tt tt);
}
