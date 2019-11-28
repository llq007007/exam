package com.qst.examsystem.controller;

import com.qst.examsystem.dao.ISjDao;
import com.qst.examsystem.entity.*;
import com.qst.examsystem.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
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
    @Autowired
    IKsService ksService;
    @Autowired
    IKsdaService ksdaService;
    @Autowired
    ITestquestionService testquestionService;
    @Autowired
    IDjService djService;
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
    @RequestMapping(value="getSTInfo2")
    public String querySJSTData2(Model model,HttpServletRequest request) {
        int sjid=Integer.parseInt(request.getParameter("sjid"));
        List<Testquestion> sjstList = sjstService.querySJST(sjid);
        model.addAttribute("sjstList",sjstList);
        return "/admin/TTInfo.jsp";
    }
    @RequestMapping(value="jiazaishijuan")
    public String jiazaishijuan(int sjid,Model model,HttpSession session) {
        Student student=(Student) session.getAttribute("student");
        model.addAttribute("sjid",sjid);
        int zyid=student.getZyid();
        int zyid1=ksService.selectKSsjid(sjid).getZyid();
        if (zyid==zyid1){
            List<Testquestion> sjstList = sjstService.querySJST(sjid);
            List list=new ArrayList<>();
            for(int i=0;i<sjstList.size();i++){
                int stid=sjstList.get(i).getStid();
                list.add(stid);
            }
            session.setAttribute("stidList",list);
            model.addAttribute("sjstList",sjstList);
            return "/student/ShiJuan.jsp";
        }else {
            return "/student/jiazaishijuanresult.jsp";
        }
    }
    @RequestMapping(value="chengji")
    public String jisuanchengji(HttpServletRequest request,int sjid,Model model,HttpSession session) {
        List<Testquestion> sjstList = sjstService.querySJST(sjid);
        model.addAttribute("sjstList",sjstList);
        Ksda ksda =new Ksda();
//        计算分数
        int sum=0;
        List<Integer> list=new ArrayList<>();
        list=(List<Integer>)session.getAttribute("stidList");
        for(int i=0;i<list.size();i++){
            String anwser=request.getParameter(""+list.get(i));
            ksda.setDacontain(anwser);
            ksda.setStid(list.get(i));
            int khid=((Student)session.getAttribute("student")).getKhid();
            ksda.setKhid(khid);
            ksdaService.insetKsda(ksda);
            String answer2=testquestionService.getQuestionInfo(list.get(i)).getAnswer();
            if (answer2.equals(anwser)){
                sum+=5;
            }
        }
        int khid=((Student)session.getAttribute("student")).getKhid();
        Dj dj=new Dj();
        dj.setKhid(khid);
        dj.setSjid(sjid);
        dj.setScore(sum);
        System.out.println(dj);
        djService.insertDj(dj);
        return "/student/kaoshi_result.jsp?sum="+sum;
    }

}
