package com.qst.examsystem.mapper;

import com.qst.examsystem.entity.Tt;

import java.util.List;

/**
 * 套题Mapper接口
 */
public interface TtMapper {

    /**
     * 添加套题
     * @param tt
     * @return
     */
    int insertTt(Tt tt);

    /**
     * 查询套题
     * @return
     */
    List<Tt> queryTt();
}
