package com.qst.examsystem.controller;


import com.qst.examsystem.entity.Zy;
import com.qst.examsystem.service.IZyService;
import com.qst.examsystem.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * 专业 控制层
 */
@Controller
@RequestMapping("zy")
public class ZyController {
    @Autowired
    @Qualifier("zyService")
    private IZyService zyService;

    /**
     * 添加课程
     * @param zy
     * @return
     */
    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String addZy(Zy zy) {
        int rows = zyService.insertZy(zy);
        return "redirect:/zy/zy-addresult.jsp?rows="+rows;
    }


    /**
     * 删除课程
     */
    @RequestMapping("delete")
    public String deleteZy( int zyid){
        int rows = zyService.deleteZy(zyid);
        return "redirect:/zy/zy-deleteresult.jsp?rows="+rows;
    }

    /**
     * 查询所有信息
     *
     * @param model
     * @return
     */
    @RequestMapping("query")
    public String queryZy( Model model) {
        List<Zy> zyList = zyService.queryZy();
        model.addAttribute("zyList", zyList);
        return "/zy/zy-list.jsp";
    }
    /**
     * 查询所有信息
     * @return
     */
    @RequestMapping(value="load_data",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public List<Zy> loadzyData() {
        List<Zy> zyList = zyService.queryZy();
        return zyList;
    }


    /**
     * 加载信息
     * @param zyid
     * @return
     */
    @RequestMapping(value = "load_one", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public Zy loadZyData( int zyid) {
        Zy zy = zyService.selectOneZy(zyid);
        return zy;
    }

    /**
     * 修改信息
     * @param zy
     * @return
     */
    @RequestMapping("update")
    public  String updateCourse(Zy zy){
        int rows = zyService.updateZy(zy);
        return "redirect:/zy/zy-updateresult.jsp?rows="+rows;

    }
}
