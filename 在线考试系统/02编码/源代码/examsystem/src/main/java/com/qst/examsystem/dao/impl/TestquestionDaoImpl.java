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
        return testquestionMapper.addQuestion(testquestion);
    }

    /**
     * 查询试题
     * @return
     */
    @Override
    public List<Testquestion> queryQuestion() {
        return testquestionMapper.queryQuestion();
    }

    /**
     * 更新试题
     * @param testquestion
     * @return
     */
    @Override
    public int updateQuestion(Testquestion testquestion) {
        return testquestionMapper.updateQuestion(testquestion);
    }
    /**
     * 删除试题
     * @param stid
     * @return
     */
    @Override
    public int deleteQuestion(int stid) {
        return testquestionMapper.deleteQuestion(stid);
    }

    /**
     * 查询试题详细信息
     * @param stid
     * @return
     */
    @Override
    public Testquestion getQuestionInfo(int stid) {
        return testquestionMapper.getQuestionInfo(stid);
    }

    /**
     *按类型查询试题
     * @param type1
     * @return
     */
    @Override
    public List<Testquestion> queryQbyType(String type1) {
        return testquestionMapper.queryQbyType(type1);
    }
}
