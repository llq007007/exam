package com.qst.examsystem.test;

import com.qst.examsystem.entity.Testquestion;
import com.qst.examsystem.service.ITestquestionService;
import com.qst.examsystem.service.impl.TestquestionServiceImpl;
import org.junit.Test;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * 试题测试类
 */
public class questionTest {
    @Test
    public void testAdd(){
        AbstractXmlApplicationContext context=new ClassPathXmlApplicationContext("db.xml");
        ITestquestionService testquestionService=(ITestquestionService)context.getBean("testquestionService");
        Testquestion testquestion=new Testquestion(null,1,"选择",null,null,null,1,null,null,null,null);
        int r=testquestionService.addQuestion(testquestion);
        System.out.println(r);
    }
    @Test
    public void testquery(){
        AbstractXmlApplicationContext context=new ClassPathXmlApplicationContext("db.xml");
        ITestquestionService testquestionService=(ITestquestionService)context.getBean("testquestionService");
        List<Testquestion> list=testquestionService.queryQuestion();
        System.out.println(list);
    }
    @Test
    public void testupdate(){
        AbstractXmlApplicationContext context=new ClassPathXmlApplicationContext("db.xml");
        ITestquestionService testquestionService=(ITestquestionService)context.getBean("testquestionService");
        Testquestion testquestion=new Testquestion(5,1,"选择",null,null,null,1,null,null,null,null);
        int r=testquestionService.updateQuestion(testquestion);
        System.out.println(r);
    }
}