package com.qst.examsystem.test;

import com.qst.examsystem.entity.Admin;
import com.qst.examsystem.service.IAdminService;
import com.qst.examsystem.util.Page;
import org.junit.Test;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AdminTest {

    /**
     * 删除测试
     */
    @Test
    public void testdeleteAdmin(){
       // int rows=0;
        AbstractXmlApplicationContext context=new ClassPathXmlApplicationContext("db.xml");
        IAdminService adminService=(IAdminService)context.getBean("adminService");
        Integer admins=adminService.deleteAdmin(1);

        if(admins==0){
            System.out.println("删除失败");
        }
        else{
            System.out.println("删除成功");
        }
    }
    /**
     * 增加管理员
     */
    @Test
    public void testaddAdmin(){
        AbstractXmlApplicationContext context=new ClassPathXmlApplicationContext("db.xml");
        IAdminService adminService=(IAdminService)context.getBean("adminService");
        Admin admin=new Admin(null,"b","123456","1");
        Integer admins=adminService.addAdmin(admin);
        if(admins==0){
            System.out.println("增加失败");
        }
        else{
            System.out.println("增加成功");
        }

    }

    /**
     * 修改管理员
     */
    @Test
    public void testupdataAdmin(){
        AbstractXmlApplicationContext context=new ClassPathXmlApplicationContext("db.xml");
        IAdminService adminService=(IAdminService)context.getBean("adminService");
        Admin admin=new Admin(102,"bb","123456","1");
        Integer admins=adminService.updataAdmin(admin);
        if(admins==0){
            System.out.println("修改失败");
        }
        else{
            System.out.println("修改成功");
        }

    }

    /**
     * 根据查询管理员
     */
    @Test
    public void testfindAdminbyid(){
        AbstractXmlApplicationContext context=new ClassPathXmlApplicationContext("db.xml");
        IAdminService adminService=(IAdminService)context.getBean("adminService");
        Admin admins=adminService.findAdminById(102);
        if(admins.equals(null)){
            System.out.println("查询失败");
        }
        else{
            System.out.println("查询成功");
          //  System.out.println(admins);
        }

    }
    /**
     * 查询所有管理员
     */
    @Test
    public void testfindAllAdmin(){
        AbstractXmlApplicationContext context=new ClassPathXmlApplicationContext("db.xml");
        IAdminService adminService=(IAdminService)context.getBean("adminService");
        Admin admin=new Admin(102,"bb","123456","1");
        Page<Admin> admins=adminService.findAdminPage(3,3,admin);
        if(admins.equals(null)){
            System.out.println("查询失败");
        }
        else{
            System.out.println("查询成功");
            //  System.out.println(admins);
        }

    }

}

