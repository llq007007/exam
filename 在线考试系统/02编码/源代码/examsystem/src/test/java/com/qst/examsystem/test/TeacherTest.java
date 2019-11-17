package com.qst.examsystem.test;

import com.qst.examsystem.entity.Teacher;
import com.qst.examsystem.service.ITeacherService;
import com.qst.examsystem.util.Page;
import org.junit.Test;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * 教师测试类
 */
public class TeacherTest {

    /**
     * 删除测试
     */
    @Test
    public void testdeleteTeacher(){
        // int rows=0;
        AbstractXmlApplicationContext context=new ClassPathXmlApplicationContext("db.xml");
        ITeacherService teacherService=(ITeacherService)context.getBean("teacherService");
        Integer teachers=teacherService.deleteTeacher(1);

        if(teachers==0){
            System.out.println("删除失败");
        }
        else{
            System.out.println("删除成功");
        }
    }
    /**
     * 增加教师
     */
    @Test
    public void testaddTeacher(){
        Date addtime=null;
        Date  updatetime = null;
        AbstractXmlApplicationContext context=new ClassPathXmlApplicationContext("db.xml");
        ITeacherService teacherService=(ITeacherService)context.getBean("teacherService");
        //时间格式处理使用sql时间，实体类构造器也强转为sql了
        try {
            addtime=(new java.sql.Date(new SimpleDateFormat("yyyy-MM-dd").parse("2019-11-15").getTime()));
            updatetime=(new Date(new SimpleDateFormat("yyyy-MM-dd").parse("2019-11-16").getTime()));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Teacher teacher=new Teacher(null,"1","123456","1a",addtime,updatetime,"2b","cc");

        Integer teachers=teacherService.addTeacher(teacher);
        if(teachers==0){
            System.out.println("增加失败");
        }
        else{
            System.out.println("增加成功");
        }

    }

    /**
     * 修改教师
     */
    @Test
    public void testupdataTeacher(){
        //时间格式处理使用sql时间，实体类构造器也强转为sql了
        Date addtime=null;
        Date  updatetime = null;
        AbstractXmlApplicationContext context=new ClassPathXmlApplicationContext("db.xml");
        ITeacherService teacherService=(ITeacherService)context.getBean("teacherService");
        try {
            addtime=(new java.sql.Date(new SimpleDateFormat("yyyy-MM-dd").parse("2018-11-15").getTime()));
            updatetime=(new Date(new SimpleDateFormat("yyyy-MM-dd").parse("2018-11-16").getTime()));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Teacher teacher=new Teacher(2,"1","1234567","1a",addtime,updatetime,"2b","cc");
        Integer teachers=teacherService.updataTeacher(teacher);
        if(teachers==0){
            System.out.println("修改失败");
        }
        else{
            System.out.println("修改成功");
        }

    }

    /**
     * 根据查询教师
     */
    @Test
    public void testfindTeacherbyid(){
        AbstractXmlApplicationContext context=new ClassPathXmlApplicationContext("db.xml");
        ITeacherService teacherService=(ITeacherService)context.getBean("teacherService");
        Teacher teachers=teacherService.findTeacherById(2);
        if(teachers.equals(null)){
            System.out.println("查询失败");
        }
        else{
            System.out.println("查询成功");
            //  System.out.println(teachers);
        }

    }
    /**
     * 查询所有教师
     */
    @Test
    public void testfindAllTeacher(){
        AbstractXmlApplicationContext context=new ClassPathXmlApplicationContext("db.xml");
        ITeacherService teacherService=(ITeacherService)context.getBean("teacherService");
        Teacher teacher=new Teacher();
        Page<Teacher> teachers=teacherService.findTeacherPage(3,3,teacher);
        if(teachers.equals(null)){
            System.out.println("查询失败");
        }
        else{
            System.out.println("查询成功");
            //  System.out.println(teachers);
        }

    }
}
