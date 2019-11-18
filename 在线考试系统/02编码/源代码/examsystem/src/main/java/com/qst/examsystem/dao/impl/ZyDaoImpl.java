package com.qst.examsystem.dao.impl;

import com.qst.examsystem.dao.IZyDao;
import com.qst.examsystem.entity.Zy;
import com.qst.examsystem.mapper.ZyMapper;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 专业 数据访问
 */

@Repository("zyDao")
public class ZyDaoImpl implements IZyDao {
        @Autowired
        @Qualifier("zyMapper")
        private ZyMapper zyMapper;//创建 ZyMapper 对象

        /**
         * 查找Zy count(*)
         * @param zy
         * @return
         */
        @Override
        public Integer findZyCount(Zy zy) {
            return zyMapper.findZyCount(zy);
        }

        /**
         * 分页查找所有
         * @param rowBounds
         * @param zy
         * @return
         */
        @Override
        public List<Zy> findZyByCond(RowBounds rowBounds, Zy zy) {
            return zyMapper.findZyByCond(rowBounds, zy);
        }

        /**
         * 根据id查找
         * @param zyid
         * @return
         */
        @Override
        public Zy findZyById(Integer zyid) {
            return zyMapper.findZyById(zyid);
        }

        /**
         * 根据id删除
         * @param zyid
         * @return
         */
        @Override
        public String deleteZy(Integer zyid) {
            return zyMapper.deleteZy(zyid);
        }

        /**
         * 添加
         * @param zy
         * @return
         */
        @Override
        public Integer addZy(Zy zy) {
            return zyMapper.addZy(zy);
        }

        /**
         * 修改
         * @param zy
         * @return
         */
        @Override
        public Integer updataZy(Zy zy) {
            return zyMapper.findZyModify(zy);
        }


}


