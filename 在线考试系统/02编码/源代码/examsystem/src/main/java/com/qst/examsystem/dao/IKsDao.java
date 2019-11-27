package com.qst.examsystem.dao;

import com.qst.examsystem.entity.Ks;

public interface IKsDao {
    int addks(Ks ks);
    Ks selectKS();
    Ks selectKSsjid(int sjid);
}
