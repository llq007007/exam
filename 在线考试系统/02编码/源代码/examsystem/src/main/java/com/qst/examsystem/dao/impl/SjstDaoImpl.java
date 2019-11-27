package com.qst.examsystem.dao.impl;

import com.qst.examsystem.dao.ISjstDao;
import com.qst.examsystem.entity.Sjst;
import com.qst.examsystem.entity.Testquestion;
import com.qst.examsystem.mapper.SjstMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Repository("sjstDao")
public class SjstDaoImpl implements ISjstDao {
    @Autowired
    @Qualifier("sjstMapper")
    SjstMapper sjstMapper;
    @Override
    public int addsjst(Sjst sjst) {
        return sjstMapper.addsjst(sjst);
    }

    @Override
    public List<Testquestion> querySJST(int sjid) {
        return sjstMapper.querySJST(sjid);
    }
}
