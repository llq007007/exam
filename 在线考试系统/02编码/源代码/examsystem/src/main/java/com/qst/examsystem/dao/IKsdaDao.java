package com.qst.examsystem.dao;

import com.qst.examsystem.entity.Ksda;

/**
 * 考生答案dao
 */
public interface IKsdaDao {
    /**
     * t添加考生答案
     * @param ksda
     * @return
     */
    int insetKsda(Ksda ksda);
}
