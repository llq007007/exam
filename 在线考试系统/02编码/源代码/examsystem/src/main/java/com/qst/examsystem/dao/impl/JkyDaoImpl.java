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
    @Qualifier("jkyMapper")
    private JkyMapper jkyMapper;//创建 JkyMapper 对象

    /**
     * 查找Jky count(*)
     * @param jky
     * @return
     */
    @Override
    public Integer findJkyCount(Jky jky) {
        return jkyMapper.findJkyCount(jky);
    }

    /**
     * 分页查找所有
     * @param rowBounds
     * @param jky
     * @return
     */
    @Override
    public List<Jky> findJkyByCond(RowBounds rowBounds, Jky jky) {
        return jkyMapper.findJkyByCond(rowBounds, jky);
    }

    /**
     * 根据id查找
     * @param jkid
     * @return
     */
    @Override
    public Jky findJkyById(Integer jkid) {
        return jkyMapper.findJkyById(jkid);
    }

    /**
     * 根据id删除
     * @param jkid
     * @return
     */
    @Override
    public Integer deleteJky(Integer jkid) {
        return jkyMapper.deleteJky(jkid);
    }

    /**
     * 添加
     * @param jky
     * @return
     */
    @Override
    public Integer addJky(Jky jky) {
        return jkyMapper.addJky(jky);
    }

    /**
     * 修改
     * @param jky
     * @return
     */
    @Override
    public Integer updataJky(Jky jky) {
        return jkyMapper.findJkyModify(jky);
    }


}
