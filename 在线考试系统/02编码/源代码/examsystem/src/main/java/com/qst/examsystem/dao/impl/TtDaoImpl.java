package com.qst.examsystem.dao.impl;

import com.qst.examsystem.dao.ITtDao;
import com.qst.examsystem.entity.Tt;
import com.qst.examsystem.mapper.TtMapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository("TtDao")
public class TtDaoImpl implements ITtDao {

    @Autowired
    @Qualifier("ttMapper")
    TtMapper ttMapper;

    @Override
    public int insertTt(Tt tt) {
        return ttMapper.insertTt(tt);
    }
}
