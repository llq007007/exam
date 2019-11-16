package com.qst.examsystem.service.impl;

import com.qst.examsystem.dao.ITtDao;
import com.qst.examsystem.entity.Tt;
import com.qst.examsystem.service.ITtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("TtService")
public class TtServiceImpl implements ITtService {

    @Autowired
    @Qualifier("TtDao")
    private ITtDao TtDao;

    @Override
    public int insertTt(Tt tt) {
        return TtDao.insertTt(tt);
    }
}
