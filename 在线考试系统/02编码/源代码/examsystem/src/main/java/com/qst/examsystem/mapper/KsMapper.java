package com.qst.examsystem.mapper;

import com.qst.examsystem.entity.Ks;

public interface KsMapper {
   int addks(Ks ks);
   Ks selectKS();
   Ks selectKSsjid(int sjid);
}
