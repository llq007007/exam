package com.qst.examsystem.controller;

import com.qst.examsystem.entity.Kcxx;
import com.qst.examsystem.entity.Ks;
import com.qst.examsystem.entity.Sj;
import com.qst.examsystem.service.IKcxxService;
import com.qst.examsystem.service.IKsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("ks")
public class KsController {
    @Autowired
    @Qualifier("ksService")
  IKsService ksService;
    @Autowired
    @Qualifier("kcxxService")
    IKcxxService kcxxService;
    @RequestMapping(value = "addks",method= RequestMethod.POST)
    public String addKcxx(Ks ks){
        int rows=ksService.addks(ks);
        Kcxx kcxx=new Kcxx();
        kcxx.setKcname(ks.getKcname());
        kcxxService.insertKcxx(kcxx);
        return "redirect:/teacher/addKcxx_result.jsp?rows="+rows;
    }

}
