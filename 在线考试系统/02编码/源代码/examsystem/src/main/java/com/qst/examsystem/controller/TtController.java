package com.qst.examsystem.controller;

import com.qst.examsystem.entity.Tt;
import com.qst.examsystem.entity.User;
import com.qst.examsystem.service.ITtService;
import com.qst.examsystem.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


/**
 * 套题控制器
 */
@Controller
@RequestMapping("Tt")
public class TtController {

    @Autowired
    @Qualifier("TtService")
    private ITtService ttService;

    /**
     * 添加套题
     * @param tt
     * @return
     */
    @RequestMapping(value = "add",method = RequestMethod.POST)
    public String addTt(Tt tt){
        int rows=ttService.insertTt(tt);
        return "redirect:/Tt/add_Tt_result.jsp?rows="+rows;
    }
}
