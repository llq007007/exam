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

    /*
     * 添加试题
     * @param testquestion
     * @return
     */
    @RequestMapping(value = "add")
    public String addQuestion(Testquestion testquestion,Model model){
        int rows=testquestionService.addQuestion(testquestion);
        model.addAttribute("rows",rows);
        return "/teacher/add_testquestion_result.jsp";
    }

    /**
     * 查询试题
     * @param request
     * @param model
     * @return
     */
    @RequestMapping("query")
    public String queryQuestion(HttpServletRequest request, Model model){
        List<Testquestion> testquestionList=testquestionService.queryQuestion();
        model.addAttribute("testquestionList",testquestionList);
        return "/teacher/query_question.jsp";
    }

    /**
     * 更新试题
     * @param testquestion
     * @return
     */
    @RequestMapping("update")
    public String updateQuestion(Model model, Testquestion testquestion){
        int rows=testquestionService.updateQuestion(testquestion);
        model.addAttribute("rows",rows);
        return "/teacher/update_question_result.jsp";
    }

    /**
     * 更新试题前加载信息
     * @param model
     * @return
     */
    @RequestMapping("getQuestion")
    public String getQuestion(HttpServletRequest request,Model model){
        int stid=Integer.parseInt(request.getParameter("stid"));
        Testquestion testquestion=testquestionService.getQuestionInfo(stid);
        if (testquestion!=null){
            model.addAttribute("testquestion",testquestion);
        }else {
            model.addAttribute("testquestion","exp");//设置查询发生异常的标志
        }
        return "/teacher/updateQuestion.jsp";
    }
    /**
     * 删除试题
     * @param stid
     * @return
     */
    @RequestMapping("delete")
    public String deleteQuestion(int stid,Model model){
        int rows=testquestionService.deleteQuestion(stid);
        model.addAttribute("rows",rows);
        return "/teacher/delete_question_result.jsp";
    }

    /**
     * 查询试题详细信息
     * @param request
     * @param model
     * @return
     */
    @RequestMapping("getInfo")
    public String getQuestionInfo(HttpServletRequest request, Model model){
        int stid=Integer.parseInt(request.getParameter("stid"));
        Testquestion testquestion=testquestionService.getQuestionInfo(stid);
        model.addAttribute("testquestion",testquestion);
        return "/teacher/query_questionInfo.jsp";
    }

    /**
     * 根据类型查询试题
     * @param type1
     * @param request
     * @param model
     * @return
     */
    @RequestMapping("queryByType")
    public String queryQbyType(String type1,HttpServletRequest request, Model model){
        List<Testquestion> testquestionList=testquestionService.queryQbyType(type1);
        if (testquestionList!=null){
            model.addAttribute("list",testquestionList);
        }else {
            model.addAttribute("list","exp");//设置查询发生异常的标志
        }
        return "/teacher/queryQuestion.jsp";
    }

}
