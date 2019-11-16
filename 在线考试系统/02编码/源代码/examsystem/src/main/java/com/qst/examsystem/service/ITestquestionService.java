package com.qst.examsystem.service;

import com.qst.examsystem.entity.Testquestion;

import java.util.List;

/**
 *试题业务层接口
 */
public interface ITestquestionService {
    int addQuestion(Testquestion testquestion);
    List<Testquestion> queryQuestion();
}
