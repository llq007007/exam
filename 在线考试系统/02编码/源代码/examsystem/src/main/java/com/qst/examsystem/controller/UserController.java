package com.qst.examsystem.controller;

import com.qst.examsystem.entity.User;
import com.qst.examsystem.service.IUserService;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * 处理用户请求控制器
 */
//
@Controller
@RequestMapping("user")
public class UserController {
    @RequestMapping(value = "register", method= RequestMethod.POST)
    @ResponseBody
    public ModelAndView userRegister(User user) {
        AbstractXmlApplicationContext context=new ClassPathXmlApplicationContext("db.xml");
        IUserService userService=(IUserService) context.getBean("userService");
        int rows=userService.register(user);
        ModelAndView mv=new ModelAndView();
        mv.addObject("rows",rows);
        mv.setViewName("/users/register-result.jsp");
        context.close();
        return mv;
    }
}
