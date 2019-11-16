package com.qst.examsystem.dao.impl;

import com.qst.examsystem.dao.ITestquestionDao;
import com.qst.examsystem.entity.Testquestion;
import com.qst.examsystem.mapper.TestquestionMapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 试题接口实现类
 */
@Repository("testquestionDao")
public class TestquestionDaoImpl implements ITestquestionDao {
    @Autowired
    @Qualifier("testquestionMapper")
    private TestquestionMapper testquestionMapper;

    /**
     * 添加试题
     * @param testquestion
     * @return
     */
    @Override
    public int addQuestion(Testquestion testquestion) {
        return testquestionMapper.addQuestion();
    }

    /**
     * 查询所有试题
     * @return
     */
    @Override
    public List<Testquestion> queryQuestion() {
        return testquestionMapper.queryQuestion();
    }
}
