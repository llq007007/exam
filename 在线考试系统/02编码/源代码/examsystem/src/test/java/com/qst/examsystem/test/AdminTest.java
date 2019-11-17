package com.qst.examsystem.test;

import com.qst.examsystem.entity.Admin;
import com.qst.examsystem.service.IAdminService;
import org.junit.Test;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AdminTest {
    @Test
    public void testdeleteAdmin(){
        int rows=0;
        AbstractXmlApplicationContext context=new ClassPathXmlApplicationContext("db.xml");
        IAdminService adminService=(IAdminService)context.getBean("adminService");
        Integer admins=adminService.deleteAdmin(1);

        if(admins.equals(null)){
            System.out.println("删除失败");
        }
        else{
            System.out.println("删除成功");
        }

    }
    }

