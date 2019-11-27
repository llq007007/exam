package com.qst.examsystem.dao.impl;

import com.qst.examsystem.dao.ISjDao;
import com.qst.examsystem.entity.Sj;
import com.qst.examsystem.entity.Testquestion;
import com.qst.examsystem.mapper.SjMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository("sjDao")
public class SjDaoImpl implements ISjDao {
    @Autowired
    @Qualifier("sjMapper")
    private SjMapper sjMapper;//创建 SjMapper 对象
    @Override
    public List<Testquestion> chouSj(int cid) {
        return sjMapper.chouSj(cid);
    }

    @Override
    public List<Sj> selectAllShiJuan() {
        return sjMapper.selectAllShiJuan();
    }

    @Override
    public int addSJ(Sj sj) {
        return sjMapper.addSJ(sj);
    }

    @Override
    public Sj selectShiJuan(String sjname) {
        return sjMapper.selectShiJuan(sjname);
    }
}
