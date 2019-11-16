package com.qst.examsystem.test;

import com.qst.examsystem.entity.Tt;

import com.qst.examsystem.service.ITtService;
import org.junit.Test;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class TtTest {

    @Test
    public void testRegister(){
        AbstractXmlApplicationContext context=new ClassPathXmlApplicationContext("db.xml");
        ITtService ttService=(ITtService)context.getBean("TtService");
        Tt tt=new Tt();
        tt.setSjid(1234567891);
        tt.setStid(1234567897);
        try {
            tt.setTtaddtime(new Date(new SimpleDateFormat("yyyy-MM-dd").parse("2019-11-15").getTime()));
            tt.setTtupdatetime(new Date(new SimpleDateFormat("yyyy-MM-dd").parse("2019-11-16").getTime()));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        tt.setTtaddperson("潘琦");
        tt.setTtupdateperson("潘琦");
        int rows=ttService.insertTt(tt);
        System.out.println(rows);
    }

}
