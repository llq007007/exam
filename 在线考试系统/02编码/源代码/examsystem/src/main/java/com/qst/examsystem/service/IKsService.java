package com.qst.examsystem.service;

import com.qst.examsystem.entity.Ks;

public interface IKsService {
    int addks(Ks ks);
    Ks selectKS();
    Ks selectKSsjid(int sjid);
}
