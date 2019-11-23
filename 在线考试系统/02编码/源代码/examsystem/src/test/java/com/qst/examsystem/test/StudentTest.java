package com.qst.examsystem.test;

import com.qst.examsystem.entity.Student;
import com.qst.examsystem.service.IStudentService;
import com.qst.examsystem.util.Page;
import org.junit.Test;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

/**
 * 学生测试类
 */
public class StudentTest {
    

    /**
     * 删除学生测试
     */
    @Test
    public void testdeleteStudent(){
        // int rows=0;
        AbstractXmlApplicationContext context=new ClassPathXmlApplicationContext("db.xml");
        IStudentService studentService=(IStudentService)context.getBean("studentService");
        Integer students=studentService.deleteStudent(3);

        if(students==0){
            System.out.println("删除失败");
        }
        else{
            System.out.println("删除成功");
        }
    }
    /**
     * 增加学生信息
     */
//    @Test
//    public void testaddStudent(){
//        Date addtime=null;
//        Date  updatetime = null;
//        AbstractXmlApplicationContext context=new ClassPathXmlApplicationContext("db.xml");
//        IStudentService studentService=(IStudentService)context.getBean("studentService");
//        //时间格式处理使用sql时间，实体类构造器也强转为sql了
//        try {
//            addtime=(new java.sql.Date(new SimpleDateFormat("yyyy-MM-dd").parse("2019-11-15").getTime()));
//              updatetime=(new Date(new SimpleDateFormat("yyyy-MM-dd").parse("2019-11-16").getTime()));
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//        Student student=new Student(null,1,"a","1","123456",addtime,updatetime,"1a","2b","cc");
//        Integer students=studentService.addStudent(student);
//        if(students==0){
//            System.out.println("增加失败");
//        }
//        else{
//            System.out.println("增加成功");
//        }
//
//    }

    /**
     * 修改学生
     */
//    @Test
//    public void testupdataStudent(){
//        //时间格式处理使用sql时间，实体类构造器也强转为sql了
//        Date addtime=null;
//        Date  updatetime = null;
//        AbstractXmlApplicationContext context=new ClassPathXmlApplicationContext("db.xml");
//        IStudentService studentService=(IStudentService)context.getBean("studentService");
//        try {
//            addtime=(new java.sql.Date(new SimpleDateFormat("yyyy-MM-dd").parse("2018-11-15").getTime()));
//            updatetime=(new Date(new SimpleDateFormat("yyyy-MM-dd").parse("2018-11-16").getTime()));
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//        Student student=new Student(4,3,"a","1","123456",addtime,updatetime,"1a","2b","cc");
//        Integer students=studentService.updataStudent(student);
//        if(students==0){
//            System.out.println("修改失败");
//        }
//        else{
//            System.out.println("修改成功");
//        }
//
//    }

    /**
     * 根据学生ID查询学生
     */
    @Test
    public void testfindStudentbyid(){
        AbstractXmlApplicationContext context=new ClassPathXmlApplicationContext("db.xml");
        IStudentService studentService=(IStudentService)context.getBean("studentService");
        Student students=studentService.findStudentById(1);
        if("".equals(students)){
            System.out.println("查询失败");
        }
        else{
            System.out.println("查询成功");
              System.out.println(students);
        }

    }
    /**
     * 查询所有学生
     */
    @Test
    public void testfindAllStudent(){
        AbstractXmlApplicationContext context=new ClassPathXmlApplicationContext("db.xml");
        IStudentService studentService=(IStudentService)context.getBean("studentService");
        Student student=new Student();
        Page<Student> students=studentService.findStudentPage(3,3,student);
        if(students.equals(null)){
            System.out.println("查询失败");
        }
        else{
            System.out.println("查询成功");
            //  System.out.println(students);
        }

    }

    /**
     * 查询学生个人成绩
     */
    @Test
    public void testQueryDegree(){
        AbstractXmlApplicationContext context=new ClassPathXmlApplicationContext("db.xml");
        IStudentService studentService=(IStudentService)context.getBean("studentService");
        System.out.println(studentService.queryStudentDegree("lisi"));
    }


    @Test
    public void testGetStudent(){
        AbstractXmlApplicationContext context=new ClassPathXmlApplicationContext("db.xml");
        IStudentService studentService=(IStudentService)context.getBean("studentService");
        Map<String,Object> map=new HashMap<>();
        map.put("name","lisi");
        System.out.println(studentService.getStudentByName(map));
    }
}
