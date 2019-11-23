package com.qst.examsystem.service;

import com.qst.examsystem.entity.Zy;
import com.qst.examsystem.util.Page;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 专业业务层接口
 */
public interface IZyService {

        /**
         * 查询专业
         * @return
         */
        List<Zy> queryZy();

        /**
         * 插入专业
         * @param zy
         * @return
         */
        int insertZy(Zy zy);

        /**
         * 查询一个专业
         * @param zyid
         * @return
         */
        Zy selectOneZy(int zyid);

        /**
         * 删除专业
         * @param zyid
         * @return
         */
        int deleteZy(int zyid);

        /**
         * 更新 专业
         * @param zy
         * @return
         */
        int updateZy(Zy zy);
}
