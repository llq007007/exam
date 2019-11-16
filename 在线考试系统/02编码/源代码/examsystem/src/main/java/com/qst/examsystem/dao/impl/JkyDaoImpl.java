package com.qst.examsystem.dao.impl;

import com.qst.examsystem.dao.IJkyDao;
import com.qst.examsystem.entity.Jky;
import com.qst.examsystem.mapper.JkyMapper;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;
/**
 * 监考员数据访问
 */
@Repository("jkyDao")
public class JkyDaoImpl implements IJkyDao {
    @Autowired
    @Qualifier("sqlSession")
    SqlSession sqlSession;
    private JkyMapper jkyMapper;

    @Override
    public Integer findJkyCount(Jky jky) {
        return jkyMapper.findJkyCount(jky);
    }

    @Override
    public List<Jky> findJkyByCond(RowBounds rowBounds, Jky jky) {
        return jkyMapper.findJkyByCond(rowBounds, jky);
    }

    @Override
    public Jky findJkyById(String jkid) {
        return jkyMapper.findJkyById(jkid);
    }

    @Override
    public String deleteJky(String jkid) {
        return jkyMapper.deleteJky(jkid);
    }

    @Override
    public Integer addJky(Jky jky) {
        return jkyMapper.addJky(jky);
    }

    @Override
    public Integer updataJky(Jky jky) {
        return jkyMapper.findJkyModify(jky);
    }


}
