package com.qst.examsystem.mapper;

import com.qst.examsystem.entity.Sjst;
import com.qst.examsystem.entity.Testquestion;

import java.util.List;

public interface SjstMapper {
   int addsjst(Sjst sjst);
   List<Testquestion> querySJST(int sjid);
}
