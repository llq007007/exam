package com.qst.examsystem.controller;

import com.qst.examsystem.entity.Testquestion;
import com.qst.examsystem.service.ITestquestionService;
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
 * 试题控制层
 */
@Controller
@RequestMapping("testquestion")
public class TestquestionContronller {
    @Autowired
    @Qualifier("testquestionService")
    private ITestquestionService testquestionService;

    /**
     * 添加试题
     * @param testquestion
     * @return
     */
    @RequestMapping(value = "add",method= RequestMethod.POST)
    @ResponseBody
    public String addQuestion(Testquestion testquestion){
        int rows=testquestionService.addQuestion(testquestion);
        return "redirect:/testquestion/add_testquestion_result.jsp?rows=" + rows;
    }
    @RequestMapping("query")
    public String queryQuestion(HttpServletRequest request, Model model){
        List<Testquestion> testquestionList=testquestionService.queryQuestion();
        model.addAttribute("testquestionList",testquestionList);
        return "/testquestion/query_question.jsp";
    }
    @RequestMapping("update")
    public String updateQuestion(Testquestion testquestion){
        int rows=testquestionService.updateQuestion(testquestion);
        return "redirect:/testquestion/update_question_result.jsp?rows="+rows;
    }
}
