package com.qst.examsystem.service;

import com.qst.examsystem.entity.Ksda;

public interface IKsdaService {
    /**
     * t添加考生答案
     * @param ksda
     * @return
     */
    int insetKsda(Ksda ksda);
}
