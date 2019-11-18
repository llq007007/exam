package com.qst.examsystem.test;

import com.qst.examsystem.entity.Kcxx;
import com.qst.examsystem.service.IKcxxService;
import org.junit.Test;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KcxxTest {
    @Test
    public void testInsert(){
        AbstractXmlApplicationContext context=new ClassPathXmlApplicationContext("db.xml");
        IKcxxService kcxxService=(IKcxxService) context.getBean("kcxxService");
        Kcxx kcxx=new Kcxx(null,"java",80,2,7,"llq","12345");
        int rows=kcxxService.insertKcxx(kcxx);
        System.out.println(rows);
    }
}
