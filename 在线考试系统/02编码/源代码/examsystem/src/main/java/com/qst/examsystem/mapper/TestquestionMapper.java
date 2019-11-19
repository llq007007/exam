package com.qst.examsystem.mapper;

import com.qst.examsystem.entity.Testquestion;

import java.util.List;

/**
 * 试题mapper接口
 */
public interface TestquestionMapper {
    /**
     * 添加试题
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
     * 按类型查询试题
     * @param type1
     * @return
     */
    List<Testquestion> queryQbyType(String type1);
}
