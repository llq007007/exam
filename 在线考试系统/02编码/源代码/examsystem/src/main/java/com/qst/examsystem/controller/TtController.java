package com.qst.examsystem.controller;

import com.qst.examsystem.entity.Testquestion;
import com.qst.examsystem.entity.Tt;
import com.qst.examsystem.service.ITestquestionService;
import com.qst.examsystem.service.ITtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * 套题控制器
 */
@Controller
@RequestMapping("Tt")
public class TtController {

    @Autowired
    @Qualifier("TtService")
    private ITtService ttService;

    @Autowired
    @Qualifier("testquestionService")
    private ITestquestionService testquestionService;



    /**
     * 添加套题
     * @param tt
     * @return
     */
    @RequestMapping(value ="add",method = RequestMethod.POST)
    public String addTt(Tt tt){
        int rows=ttService.insertTt(tt);
        return "redirect:/admin/taoti_addresult.jsp?rows="+rows;
    }

    /**
     * 查询套题
     * @return
     */
    @RequestMapping("query")
    public String queryTt(HttpServletRequest request, Model model){
        List<Tt> queryTt=ttService.queryTt();
        model.addAttribute("queryTt",queryTt);
        return "/admin/taoti_query.jsp";
    }

    /**
     * 根据套题ID删除套题
     * @param ttid
     * @return
     */
    @RequestMapping("delete")
    public String deleteTt(@RequestParam("ttid") int ttid){
        int rows=ttService.deleteTt(ttid);
        //重定向到删除结果的页面
        return "redirect:/admin/taoti_deleteresult.jsp?rows="+rows;
    }

    /**
     * 根据套题ID查询题目及答案
     * @param ttid
     * @return
     */
    @RequestMapping(value = "queryTt",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public Map<String,Object> loadTtDate(@RequestParam("ttid") int ttid){
        Tt tt=ttService.getTt(ttid);
        List<Testquestion> testquestionList=testquestionService.queryQuestion();
        Map<String,Object> dateTt=new HashMap<>();
        dateTt.put("Tt",tt);
        dateTt.put("testquestionList",testquestionList);
        return dateTt;
    }
}
