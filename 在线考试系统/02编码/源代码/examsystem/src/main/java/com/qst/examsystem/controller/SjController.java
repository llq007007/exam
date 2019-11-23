package com.qst.examsystem.controller;

import com.qst.examsystem.dao.ISjDao;
import com.qst.examsystem.entity.Course;
import com.qst.examsystem.entity.Sj;
import com.qst.examsystem.service.ISjService;
import com.qst.examsystem.service.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
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

    /**
     * 生成试卷
     * @param cid 课程id
     * @param model
     * @return
     */
    @RequestMapping("zuzhi_shijuan")
    public String zuZhiSJ(Integer cid, Model model) {
        Map<String,Object> map=new HashMap<>();
        map.put("cid",cid);
        List<Map<String,Object>> shiTiList=sjService.chouSj(map);
        model.addAttribute("shiTiList", shiTiList);
        System.out.println(map);
        return "/teacher/Zuzhishijuan.jsp";
    }
    /**
     * 查询所有信息
     * @return
     */
    @RequestMapping(value="load_data",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public List<Sj> loadCourseData() {
        List<Sj> sjList = sjService.selectAllShiJuan();
        return sjList;
    }
}
