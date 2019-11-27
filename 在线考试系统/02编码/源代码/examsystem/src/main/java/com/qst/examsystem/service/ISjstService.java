package com.qst.examsystem.service;

import com.qst.examsystem.entity.Sjst;
import com.qst.examsystem.entity.Testquestion;

import java.util.List;

public interface ISjstService {
    int addsjst(Sjst sjst);
    List<Testquestion> querySJST(int sjid);
}
