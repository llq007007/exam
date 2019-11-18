package com.qst.examsystem.test;

import com.qst.examsystem.entity.Tt;
import com.qst.examsystem.service.ITtService;
import org.junit.Test;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;


public class TtTest {
    /**
     * 添加套题测试类
     */
    @Test
    public void testaddTt(){
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

    /**
     * 查询所有套题
     */
    @Test
    public  void  testqueryTt(){
        AbstractXmlApplicationContext context=new ClassPathXmlApplicationContext("db.xml");
        ITtService ttService=(ITtService)context.getBean("TtService");
        List<Tt> ttList=ttService.queryTt();
        if (ttList != null){
            for(Tt tt:ttList){
                System.out.println(tt);
            }
        }
        context.close();
    }

    /**
     * 根据套题ID删除套题
     */
    @Test
    public void testdeleteTt(){
        AbstractXmlApplicationContext context=new ClassPathXmlApplicationContext("db.xml");
        ITtService ttService=(ITtService) context.getBean("TtService");
        int rows=ttService.deleteTt(4);
        System.out.println("rows="+rows);
    }
    @Test
    public void testgetTt(){
        AbstractXmlApplicationContext context=new ClassPathXmlApplicationContext("db.xml");
        ITtService ttService=(ITtService) context.getBean("TtService");
        Tt tt=ttService.getTt(1);
        System.out.println(tt);
        context.close();
    }

}
