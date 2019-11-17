package com.qst.examsystem.controller;

import com.qst.examsystem.entity.Tt;
import com.qst.examsystem.service.ITtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


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

    /**
     * 查询套题
     * @return
     */
    @RequestMapping("query")
    public String queryTt(HttpServletRequest request, Model model){
        List<Tt> queryTt=ttService.queryTt();
        model.addAttribute("queryTt",queryTt);
        return "/Tt/query_Tt.jsp";
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
        return "redirect:/Tt/delete_Tt_result.jsp?rows="+rows;
    }

}
