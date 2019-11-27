package com.qst.examsystem.dao;

import com.qst.examsystem.entity.Sjst;
import com.qst.examsystem.entity.Testquestion;

import java.util.List;

public interface ISjstDao {
    int addsjst(Sjst sjst);
    List<Testquestion> querySJST(int sjid);
}
