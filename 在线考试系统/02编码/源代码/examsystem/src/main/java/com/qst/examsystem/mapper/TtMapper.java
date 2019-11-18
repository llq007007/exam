package com.qst.examsystem.mapper;

import com.qst.examsystem.entity.Tt;
import org.apache.ibatis.annotations.Param;

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

    /**
     * 根据套题ID删除套题
     * @param ttid
     * @return
     */
    int deleteTt(int ttid);

    /**
     * 根据套题ID查询题目及答案
     * @param ttid
     * @return
     */
    Tt getTt(@Param("ttid") int ttid);
}
