package com.qst.examsystem.mapper;

import com.qst.examsystem.entity.Testquestion;

import java.util.List;

/**
 * 试题mapper接口
 */
public interface TestquestionMapper {
    int addQuestion();
    List<Testquestion> queryQuestion();
}
