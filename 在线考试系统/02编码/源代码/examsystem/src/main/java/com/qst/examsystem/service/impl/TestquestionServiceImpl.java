package com.qst.examsystem.service.impl;

import com.qst.examsystem.dao.ITeacherDao;
import com.qst.examsystem.dao.ITestquestionDao;
import com.qst.examsystem.entity.Testquestion;
import com.qst.examsystem.service.ITestquestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("testquestionService")
public class TestquestionServiceImpl implements ITestquestionService {
    @Autowired
    @Qualifier("testquestionDao")
    private ITestquestionDao testquestionDao;

    /**
     * 添加试题
     * @param testquestion
     * @return
     */
    @Override
    public int addQuestion(Testquestion testquestion) {
        return testquestionDao.addQuestion(testquestion);
    }

    /**
     * 查询试题
     * @return
     */
    @Override
    public List<Testquestion> queryQuestion() {
        return testquestionDao.queryQuestion();
    }

    /**
     * 更新试题
     * @param testquestion
     * @return
     */
    @Override
    public int updateQuestion(Testquestion testquestion) {
        return testquestionDao.updateQuestion(testquestion);
    }
    /**
     * 删除试题
     * @param stid
     * @return
     */
    @Override
    public int deleteQuestion(int stid) {
        return testquestionDao.deleteQuestion(stid);
    }

    /**
     * 查询试题详细信息
     * @param stid
     * @return
     */
    @Override
    public Testquestion getQuestionInfo(int stid) {
        return testquestionDao.getQuestionInfo(stid);
    }

    /**
     * 按类型查找试题
     * @param type1
     * @return
     */
    @Override
    public List<Testquestion> queryQbyType(String type1) {
        return testquestionDao.queryQbyType(type1);
    }
}
