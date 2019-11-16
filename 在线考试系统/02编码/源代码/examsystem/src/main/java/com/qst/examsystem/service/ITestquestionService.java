package com.qst.examsystem.service;

import com.qst.examsystem.entity.Testquestion;

/**
 * 试题业务层接口
 */
public interface ITestquestionService {
    /**
     * 添加试题
     * @param testquestion
     * @return
     */
    int addQuestion(Testquestion testquestion);

    /**
     * 查询所有试题
     * @return
     */
    Testquestion queryQuestion();
}
