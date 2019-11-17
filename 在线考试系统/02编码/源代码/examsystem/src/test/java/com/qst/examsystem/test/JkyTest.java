package com.qst.examsystem.test;

import com.qst.examsystem.entity.Jky;
import com.qst.examsystem.service.IJkyService;
import com.qst.examsystem.util.Page;
import org.junit.Test;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * 监考员测试类
 */
public class JkyTest {

    /**
     * 删除测试
     */
    @Test
    public void testdeleteJky(){
        // int rows=0;
        AbstractXmlApplicationContext context=new ClassPathXmlApplicationContext("db.xml");
        IJkyService jkyService=(IJkyService)context.getBean("jkyService");
        Integer jkys=jkyService.deleteJky(1);

        if(jkys==0){
            System.out.println("删除失败");
        }
        else{
            System.out.println("删除成功");
        }
    }
    /**
     * 增加监考员
     */
    @Test
    public void testaddJky(){
        Date addtime=null;
        Date  updatetime = null;
        AbstractXmlApplicationContext context=new ClassPathXmlApplicationContext("db.xml");
        IJkyService jkyService=(IJkyService)context.getBean("jkyService");
        //时间格式处理使用sql时间，实体类构造器也强转为sql了
        try {
            addtime=(new java.sql.Date(new SimpleDateFormat("yyyy-MM-dd").parse("2019-11-15").getTime()));
            updatetime=(new Date(new SimpleDateFormat("yyyy-MM-dd").parse("2019-11-16").getTime()));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Jky jky=new Jky(null,"1","123456","1a",addtime,updatetime,"2b","cc");

        Integer jkys=jkyService.addJky(jky);
        if(jkys==0){
            System.out.println("增加失败");
        }
        else{
            System.out.println("增加成功");
        }

    }

    /**
     * 修改监考员
     */
    @Test
    public void testupdataJky(){
        //时间格式处理使用sql时间，实体类构造器也强转为sql了
        Date addtime=null;
        Date  updatetime = null;
        AbstractXmlApplicationContext context=new ClassPathXmlApplicationContext("db.xml");
        IJkyService jkyService=(IJkyService)context.getBean("jkyService");
        try {
            addtime=(new java.sql.Date(new SimpleDateFormat("yyyy-MM-dd").parse("2018-11-15").getTime()));
            updatetime=(new Date(new SimpleDateFormat("yyyy-MM-dd").parse("2018-11-16").getTime()));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Jky jky=new Jky(2,"1","1234567","1a",addtime,updatetime,"2b","cc");
        Integer jkys=jkyService.updataJky(jky);
        if(jkys==0){
            System.out.println("修改失败");
        }
        else{
            System.out.println("修改成功");
        }

    }

    /**
     * 根据查询监考员
     */
    @Test
    public void testfindJkybyid(){
        AbstractXmlApplicationContext context=new ClassPathXmlApplicationContext("db.xml");
        IJkyService jkyService=(IJkyService)context.getBean("jkyService");
        Jky jkys=jkyService.findJkyById(2);
        if(jkys.equals(null)){
            System.out.println("查询失败");
        }
        else{
            System.out.println("查询成功");
            //  System.out.println(jkys);
        }

    }
    /**
     * 查询所有监考员
     */
    @Test
    public void testfindAllJky(){
        AbstractXmlApplicationContext context=new ClassPathXmlApplicationContext("db.xml");
        IJkyService jkyService=(IJkyService)context.getBean("jkyService");
        Jky jky=new Jky();
        Page<Jky> jkys=jkyService.findJkyPage(3,3,jky);
        if(jkys.equals(null)){
            System.out.println("查询失败");
        }
        else{
            System.out.println("查询成功");
            //  System.out.println(jkys);
        }

    }
}
