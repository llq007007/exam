package com.qst.examsystem.dao.impl;

import com.qst.examsystem.dao.IKsdaDao;
import com.qst.examsystem.entity.Ksda;
import com.qst.examsystem.mapper.KsdaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

@Repository("ksdaDao")
public class KsdaDaoImpl implements IKsdaDao {
    @Autowired
    KsdaMapper ksdaMapper;

    /**
     * 添加考生答案
     * @param ksda
     * @return
     */
    @Override
    public int insetKsda(Ksda ksda) {
        return ksdaMapper.insetKsda(ksda);
    }
}
