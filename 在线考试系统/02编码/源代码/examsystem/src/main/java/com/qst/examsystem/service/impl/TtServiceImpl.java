package com.qst.examsystem.service.impl;

import com.qst.examsystem.dao.ITtDao;
import com.qst.examsystem.entity.Tt;
import com.qst.examsystem.service.ITtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 套题业务层实现
 */
@Service("TtService")
public class TtServiceImpl implements ITtService {

    @Autowired
    @Qualifier("TtDao")
    private ITtDao TtDao;

    /**
     * 添加套题
     * @param tt
     * @return
     */
    @Override
    public int insertTt(Tt tt) {
        return TtDao.insertTt(tt);
    }

    /**
     * 查询套题
     * @return
     */
    @Override
    public List<Tt> queryTt() {
        return TtDao.queryTt();
    }

    /**
     * 根据套题ID删除套题
     * @param ttid
     * @return
     */
    @Override
    public int deleteTt(int ttid) {
        return TtDao.deleteTt(ttid);
    }

    /**
     * 根据套题ID查询题目及答案
     * @param ttid
     * @return
     */
    @Override
    public Tt getTt(int ttid) {
        return TtDao.getTt(ttid);
    }
}
