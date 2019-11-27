package com.qst.examsystem.dao.impl;

import com.qst.examsystem.dao.IKcxxDao;
import com.qst.examsystem.entity.Kcxx;
import com.qst.examsystem.mapper.KcxxMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 考场信息dao层实现
 */
@Repository("kcxxDao")
public class KcxxDaoImpl implements IKcxxDao {
    @Autowired
    @Qualifier("kcxxMapper")
    private KcxxMapper kcxxMapper;

    /**
     * 添加考场信息
     * @param kcxx
     * @return
     */
    @Override
    public int insertKcxx(Kcxx kcxx) {
        return kcxxMapper.insertKcxx(kcxx);
    }

    /**
     * 模糊查询考场信息
     * @param
     * @return
     */
    @Override
    public List<Kcxx> selectKcxxInfo() {
        return kcxxMapper.selectKcxxInfo();
    }

    @Override
    public int addKCXX(Kcxx kcxx) {
        return kcxxMapper.addKCXX(kcxx);
    }
}
