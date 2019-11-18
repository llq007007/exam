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
}
