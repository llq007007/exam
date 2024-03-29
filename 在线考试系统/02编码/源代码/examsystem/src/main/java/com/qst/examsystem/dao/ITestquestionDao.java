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
    /**
     * 删除试题
     */
    int deleteQuestion(int stid);

    /**
     * 查询试题详细信息
     * @param stid
     * @return
     */
    Testquestion getQuestionInfo(int stid);

    /**
     * 按类型查找试题
     * @param type1
     * @return
     */
    List<Testquestion> queryQbyType(String type1);
}
