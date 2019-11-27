package com.qst.examsystem.service.impl;

import com.qst.examsystem.dao.IJkyDao;
import com.qst.examsystem.dao.ISjDao;
import com.qst.examsystem.entity.Sj;
import com.qst.examsystem.entity.Testquestion;
import com.qst.examsystem.service.IJkyService;
import com.qst.examsystem.service.ISjService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("iSjService")
public class SjServiceImpl implements ISjService {
    @Autowired
    @Qualifier("sjDao")
    private ISjDao sjDao;

    @Override
    public List<Testquestion> chouSj(int cid) {
        return sjDao.chouSj(cid);
    }

    @Override
    public List<Sj> selectAllShiJuan() {
        return sjDao.selectAllShiJuan();
    }

    @Override
    public int addSJ(Sj sj) {
        return sjDao.addSJ(sj);
    }

    @Override
    public Sj selectShiJuan(String sjname) {
        return sjDao.selectShiJuan(sjname);
    }
}
