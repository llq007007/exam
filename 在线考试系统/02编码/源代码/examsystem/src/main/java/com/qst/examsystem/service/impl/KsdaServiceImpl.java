package com.qst.examsystem.service.impl;


import com.qst.examsystem.dao.IKsdaDao;
import com.qst.examsystem.entity.Ksda;
import com.qst.examsystem.service.IKsdaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 考试答案服务层
 */
@Service("ksdaService")
public class KsdaServiceImpl implements IKsdaService {
    @Autowired
    IKsdaDao ksdaDao;

    /**
     * 添加考生答案
     * @param ksda
     * @return
     */
    @Override
    public int insetKsda(Ksda ksda) {
        return ksdaDao.insetKsda(ksda);
    }
}
