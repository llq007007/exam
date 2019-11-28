package com.qst.examsystem.mapper;

import com.qst.examsystem.entity.Ksda;

public interface KsdaMapper {
    /**
     * t添加考生答案
     * @param ksda
     * @return
     */
    int insetKsda(Ksda ksda);
}
