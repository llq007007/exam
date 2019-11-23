package com.qst.examsystem.test;

import com.qst.examsystem.service.ISjService;
import com.qst.examsystem.service.ITeacherService;
import org.junit.Test;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;
import java.util.Map;

public class SjTest {
    @Test
    public void testChouSj(){
        AbstractXmlApplicationContext context = new ClassPathXmlApplicationContext("db.xml");
        ISjService iSjService = (ISjService) context.getBean("iSjService");
        Map<String,Object> map=new HashMap<>();
        map.put("cid","1");
        System.out.println(iSjService.chouSj(map));
    }
    @Test
    public void testSelectAllSj(){
        AbstractXmlApplicationContext context = new ClassPathXmlApplicationContext("db.xml");
        ISjService iSjService = (ISjService) context.getBean("iSjService");
        System.out.println(iSjService.selectAllShiJuan());
    }
}
