package com.qst.examsystem.controller;

import com.qst.examsystem.entity.Kcxx;
import com.qst.examsystem.service.IKcxxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 考场信息控制层
 */
@Controller
@RequestMapping("kcxx")
public class KcxxController {
    @Autowired
    @Qualifier("kcxxService")
    private IKcxxService kcxxService;

    /**
     * 添加考场信息
     * @param kcxx
     * @return
     */
    @RequestMapping(value = "addKcxx",method= RequestMethod.POST)
    public String insertKcxx(Kcxx kcxx){
        int rows=kcxxService.insertKcxx(kcxx);
        return "redirect:/teacher/addKcxx_result.jsp?rows="+rows;
    }

    /**
     * 查询考场信息
     * @param key
     * @param request
     * @param model
     * @return
     */
    @RequestMapping("queryKcxx")
    public String selectKcxxInfo(String key,HttpServletRequest request, Model model){
        List<Kcxx> kcxxList=kcxxService.selectKcxxInfo(key);
        model.addAttribute("kcxxList",kcxxList);
        return "/teacher/query_kcxx.jsp";
    }
}
