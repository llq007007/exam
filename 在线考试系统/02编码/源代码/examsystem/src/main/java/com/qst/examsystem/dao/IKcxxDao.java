package com.qst.examsystem.dao;

import com.qst.examsystem.entity.Kcxx;

import java.util.List;

/**
 * 考场信息dao层接口
 */
public interface IKcxxDao {
    /**
     * 添加考场信息
     * @param kcxx
     * @return
     */
    int insertKcxx(Kcxx kcxx);

    /**
     * 模糊查询考场信息
     * @param key
     * @return
     */
    List<Kcxx> selectKcxxInfo(String key);
}
