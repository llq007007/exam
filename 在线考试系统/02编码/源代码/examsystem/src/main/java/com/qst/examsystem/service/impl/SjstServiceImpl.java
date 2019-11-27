package com.qst.examsystem.service.impl;

import com.qst.examsystem.dao.ISjstDao;
import com.qst.examsystem.entity.Sjst;
import com.qst.examsystem.entity.Testquestion;
import com.qst.examsystem.service.ISjstService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("sjstService")
public class SjstServiceImpl implements ISjstService {
    @Autowired
    @Qualifier("sjstDao")
    ISjstDao sjstDao;

    @Override
    public int addsjst(Sjst sjst) {
        return sjstDao.addsjst(sjst);
    }

    @Override
    public List<Testquestion> querySJST(int sjid) {
        return sjstDao.querySJST(sjid);
    }
}
