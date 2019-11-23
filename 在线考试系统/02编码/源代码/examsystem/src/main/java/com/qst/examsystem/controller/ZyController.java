package com.qst.examsystem.controller;

import com.qst.examsystem.entity.Zy;
import com.qst.examsystem.service.IZyService;
import com.qst.examsystem.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * 专业 控制层
 */
@Controller
@RequestMapping("zhuanye")
public class ZyController {

    @Autowired
    @Qualifier("zyService")
    private IZyService zyService;

    /**
     * 分页查询所有专业信息
     * @param model
     * @param zy
     * @param page
     * @param rows
     * @return
     */
    @RequestMapping("/tozy.action")
    public String toZy(Model model, Zy zy, @RequestParam(defaultValue="1")Integer page,
                        @RequestParam(defaultValue="3")Integer rows) {
        String forword="admin/Zy";
        System.out.println(zy);
        Page<Zy> zys=zyService.findZyPage(page,rows, zy);

        model.addAttribute("page",  zys);
        model.addAttribute("username",  zy.getZyname());
        return forword;
    }

    /**
     * 添加监考员信息
     * @param model
     * @param zy
     * @param session
     * @return
     */
    @RequestMapping("/addZy.action")
    public String addZy(Model model, Zy zy, HttpSession session) {
        System.out.print("添加信息");
        String forword="admin/Zy";
        int zys=zyService.addZy(zy);
        if(zys>0){
            session.setAttribute("zy",zys);
        }

        return forword;
    }

    /**
     * 根据id查询需要修改的监考员信息
     * @param zyid
     * @param model
     * @param sesson
     * @return
     */
    @RequestMapping("/toeditzy.action")
    public String editZy(Integer zyid,Model model,HttpSession sesson) {

        Zy zy =zyService.findZyById(zyid);
        System.out.println(zy);
        model.addAttribute("zy", zy);
        //返回客户信息展示页面
        return "admin/editzy";
    }

    /**
     * 调用updataZy方法修改监考员信息
     * @param zy
     * @param model
     * @param sesson
     * @return
     */
    @ResponseBody
    @RequestMapping("/editzy.action")
    public Integer editZy(@RequestBody Zy zy, Model model, HttpSession sesson) {
        return zyService.updataZy(zy);
    }

    /**
     * 根据id删除专业
     * @param zyid
     * @param model
     * @return
     */
    @RequestMapping("/deletezy.action")
    public String deleteZy(Integer zyid,Model model) {
        zyService.deleteZy(zyid);
        System.out.print("删除");
        return "redirect:tozy.action";
    }
}
