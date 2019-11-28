package com.qst.examsystem.dao.impl;

import com.qst.examsystem.dao.IDjDao;
import com.qst.examsystem.entity.Dj;
import com.qst.examsystem.mapper.DjMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository("djDao")
public class DjDaoImpl implements IDjDao {
    @Autowired
    @Qualifier("djMapper")
    DjMapper djMapper;

    /**
     * 添加答卷
     * @param dj
     * @return
     */
    @Override
    public int insertDj(Dj dj) {
        return djMapper.insertDj(dj);
    }
}
