package com.qst.examsystem.dao.impl;

import com.qst.examsystem.dao.ITtDao;
import com.qst.examsystem.entity.Tt;
import com.qst.examsystem.mapper.TtMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 套题Dao接口实现类
 */
@Repository("TtDao")
public class TtDaoImpl implements ITtDao {

    @Autowired
    @Qualifier("ttMapper")
    TtMapper ttMapper;

    /**
     * 添加套题
     * @param tt
     * @return
     */
    @Override
    public int insertTt(Tt tt) {
        return ttMapper.insertTt(tt);
    }

    /**
     * 查询套题
     * @return
     */
    @Override
    public List<Tt> queryTt() {
        return ttMapper.queryTt();
    }

    /**
     * 根据套题ID删除套题
     * @param ttid
     * @return
     */
    @Override
    public int deleteTt(int ttid) {
        return ttMapper.deleteTt(ttid);
    }

    /**
     * 根据套题ID查询题目及答案
     * @param ttid
     * @return
     */
    @Override
    public Tt getTt(int ttid) {
        return ttMapper.getTt(ttid);
    }

}
