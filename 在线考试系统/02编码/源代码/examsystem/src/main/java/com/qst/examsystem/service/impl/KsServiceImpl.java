package com.qst.examsystem.service.impl;

import com.qst.examsystem.dao.IKsDao;
import com.qst.examsystem.entity.Ks;
import com.qst.examsystem.service.IKsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("ksService")
public class KsServiceImpl implements IKsService {
    @Autowired
    @Qualifier("ksDao")
    IKsDao ksDao;

    @Override
    public int addks(Ks ks) {
        return ksDao.addks(ks);
    }
}
