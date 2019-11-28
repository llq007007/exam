package com.qst.examsystem.service.impl;

import com.qst.examsystem.dao.IDjDao;
import com.qst.examsystem.entity.Dj;
import com.qst.examsystem.service.IDjService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("djService")
public class DjServiceImpl implements IDjService {
    @Autowired
    @Qualifier("djDao")
    private IDjDao djDao;

    @Override
    public int insertDj(Dj dj) {
        return djDao.insertDj(dj);
    }
}
