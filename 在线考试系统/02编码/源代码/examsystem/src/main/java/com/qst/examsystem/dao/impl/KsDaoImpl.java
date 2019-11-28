package com.qst.examsystem.dao.impl;

import com.qst.examsystem.dao.IKsDao;
import com.qst.examsystem.entity.Ks;
import com.qst.examsystem.mapper.KsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository("ksDao")
public class KsDaoImpl implements IKsDao {
    @Autowired
    @Qualifier("ksMapper")
    KsMapper ksMapper;
    @Override
    public int addks(Ks ks) {
        return ksMapper.addks(ks);
    }

    @Override
    public Ks selectKS() {
        return ksMapper.selectKS();
    }

    @Override
    public Ks selectKSsjid(int sjid) {
        return ksMapper.selectKSsjid(sjid);
    }
}
