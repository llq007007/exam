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


        @Override
        public List<Zy> queryZy() {
                return zyMapper.queryZy();
        }

        @Override
        public int insertZy(Zy zy) {

                return zyMapper.insertZy(zy);
        }

        @Override
        public Zy selectOneZy(int zyid) {
                return zyMapper.selectOneZy(zyid);
        }

        @Override
        public int deleteZy(int zyid) {
                return zyMapper.deleteZy(zyid);
        }

        @Override
        public int updateZy(Zy zy) {

                return zyMapper.updateZy(zy);
        }
}


