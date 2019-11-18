package com.qst.examsystem.test;

import com.qst.examsystem.entity.User;
import com.qst.examsystem.service.IUserService;
import org.junit.Test;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {
    @Test
    public void testRegister(){
        AbstractXmlApplicationContext context=new ClassPathXmlApplicationContext("db.xml");
        IUserService userService=(IUserService)context.getBean("userService");
        User user=new User(null,"李临琪","123456","12");
        int rows=userService.register(user);
        System.out.println(rows);
    }
}
