package com.qst.examsystem.service;

import com.qst.examsystem.entity.Testquestion;

import java.util.List;

/**
 *试题业务层接口
 */
public interface ITestquestionService {
    /**
     *添加试题
     * @param testquestion
     * @return
     */
    int addQuestion(Testquestion testquestion);

    /**
     * 查询试题
     * @return
     */
    List<Testquestion> queryQuestion();

    /**
     * 更新试题
     * @param testquestion
     * @return
     */
    int updateQuestion(Testquestion testquestion);
}
