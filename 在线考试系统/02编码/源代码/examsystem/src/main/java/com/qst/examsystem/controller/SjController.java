package com.qst.examsystem.controller;

import com.qst.examsystem.dao.ISjDao;
import com.qst.examsystem.entity.Course;
import com.qst.examsystem.entity.Sj;
import com.qst.examsystem.entity.Sjst;
import com.qst.examsystem.entity.Testquestion;
import com.qst.examsystem.service.ISjService;
import com.qst.examsystem.service.ISjstService;
import com.qst.examsystem.service.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 试卷控制层
 */
@Controller
@RequestMapping("shijuan")
public class SjController {
    @Autowired
    private ISjService sjService;
    @Autowired
     ISjstService sjstService;
    /**
     * 生成试卷
     * @param cid 课程id
     * @param model
     * @return
     */
    @RequestMapping("zuzhi_shijuan")
    public String zuZhiSJ(Integer cid, Model model,Integer sjid) {
        List<Testquestion> shiTiList=sjService.chouSj(cid);
         for (Testquestion testquestion:shiTiList){
             Sjst sjst=new Sjst(testquestion.getStid(),sjid);
            int rows=sjstService.addsjst(sjst);
            model.addAttribute("rows",rows);
         }
        return "/teacher/zuzhishijuanResult.jsp";
    }
    /**
     * 查询所有信息
     * @return
     */
    @RequestMapping(value="load_data",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public List<Sj> loadSJData() {
        List<Sj> sjList = sjService.selectAllShiJuan();
        return sjList;
    }
    @RequestMapping("addSJ")
    public String addSJ(Sj sj, Model model){
        int rows=sjService.addSJ(sj);
        return "redirect:/teacher/sjnameresult.jsp?rows="+rows;
    }
    @RequestMapping(value="query")
    public String querySJData(Model model) {
        List<Sj> sjList = sjService.selectAllShiJuan();
        model.addAttribute("sjlist",sjList);
        return "/teacher/select_shijuan.jsp";
    }
    @RequestMapping(value="getSTInfo")
    public String querySJSTData(Model model,HttpServletRequest request) {
        int sjid=Integer.parseInt(request.getParameter("sjid"));
        List<Testquestion> sjstList = sjstService.querySJST(sjid);
        model.addAttribute("sjstList",sjstList);
        return "/teacher/ShiJuanInfo.jsp";
    }

    @RequestMapping(value="getSTdaInfo")
    public String querySJSTdaData(Model model,HttpServletRequest request) {
        int sjid=Integer.parseInt(request.getParameter("sjid"));
        List<Testquestion> sjstList = sjstService.querySJST(sjid);
        model.addAttribute("sjstList",sjstList);
        return "/admin/taoti_info.jsp";
    }

}
