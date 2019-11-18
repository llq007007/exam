package com.qst.examsystem.service.impl;

import com.qst.examsystem.dao.IKcxxDao;
import com.qst.examsystem.entity.Kcxx;
import com.qst.examsystem.service.IKcxxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 考场信息业务层实现
 */
@Service("kcxxService")
public class KcxxServiceImpl implements IKcxxService {
    @Autowired
    @Qualifier("kcxxDao")
    private IKcxxDao kcxxDao;

    /**
     * 添加考场信息
     * @param kcxx
     * @return
     */
    @Override
    public int insertKcxx(Kcxx kcxx) {
        return kcxxDao.insertKcxx(kcxx);
    }

    /**
     * 模糊查询考场信息
     * @param key
     * @return
     */
    @Override
    public List<Kcxx> selectKcxxInfo(String key) {
        return kcxxDao.selectKcxxInfo(key);
    }
}
