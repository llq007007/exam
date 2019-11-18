package com.qst.examsystem.dao;

import com.qst.examsystem.entity.Testquestion;

import java.util.List;

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
    List<Testquestion> queryQuestion();

    /**
     * 更新试题
     * @param testquestion
     * @return
     */
    int updateQuestion(Testquestion testquestion);
    /**
     * 删除试题
     */
}
