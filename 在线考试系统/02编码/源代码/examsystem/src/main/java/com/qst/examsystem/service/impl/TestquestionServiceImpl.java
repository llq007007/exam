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
     * 查询所有试题
     * @return
     */
    @Override
    public List<Testquestion> queryQuestion() {
        return testquestionDao.queryQuestion();
    }
}
