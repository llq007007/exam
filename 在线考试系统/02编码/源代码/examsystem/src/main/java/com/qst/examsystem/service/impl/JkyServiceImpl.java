package com.qst.examsystem.service.impl;

import com.qst.examsystem.dao.IJkyDao;
import com.qst.examsystem.entity.Jky;
import com.qst.examsystem.service.IJkyService;
import com.qst.examsystem.util.Page;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 监考员
 */
@Service("jkyService")
public class JkyServiceImpl implements IJkyService {
    @Autowired
    @Qualifier("jkyDao")
    private IJkyDao jkyDao;

    @Override
    public Integer addJky(Jky jky) {
        return jkyDao.addJky(jky);
    }

    @Override
    public Integer updataJky(Jky jky) {
        return jkyDao.updataJky(jky);
    }

    @Override
    public String deleteJky(String jkid) {
        return jkyDao.deleteJky(jkid);
    }

    @Override
    public Jky findJkyById(String jkid) {
        return jkyDao.findJkyById(jkid);
    }

    @Override
    public Page<Jky> findJkyPage(Integer page, Integer rows, Jky jky) {
        RowBounds rowBounds = new RowBounds((page-1) * rows, rows);
//		// 查询监考员列表
        List<Jky> jkys=jkyDao.findJkyByCond(rowBounds,jky);

//		// 查询监考员列表总记录数
        Integer count =jkyDao.findJkyCount(jky);
//		// 创建Page返回对象
        Page<Jky> result = new Page<Jky>();
        result.setPage(page);
        result.setRows(jkys);
        result.setSize(rows);
        result.setTotal(count);
        return result;
    }
}
