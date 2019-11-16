package com.qst.examsystem.dao;

import com.qst.examsystem.entity.Testquestion;

public interface ITestquestionDao {
    /**
     * 添加题目
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
