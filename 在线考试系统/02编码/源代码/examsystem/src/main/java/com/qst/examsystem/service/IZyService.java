package com.qst.examsystem.service;

import com.qst.examsystem.entity.Zy;
import com.qst.examsystem.util.Page;
import org.apache.ibatis.annotations.Param;
/**
 * 专业业务层接口
 */
public interface IZyService {


        /**
         * 增加专业
         * @param zy
         * @return
         */
        public Integer addZy(Zy zy);
        /**
         * 修改专业
         * @param zy
         * @return
         */
        public Integer updataZy(Zy zy);
        /**
         * 删除专业
         * @param zyid
         * @return
         */
        public String deleteZy(@Param("zyid") Integer zyid);
        /**
         * 根据id查找专业
         * @param zyid
         * @return
         */
        public Zy findZyById(Integer zyid);
        /**
         * 查询所有专业
         * @param page
         * @param rows
         * @param zy
         * @return
         */
        public Page<Zy> findZyPage(Integer page, Integer rows, Zy zy);
}
