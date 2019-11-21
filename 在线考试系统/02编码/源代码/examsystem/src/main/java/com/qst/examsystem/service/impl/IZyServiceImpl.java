package com.qst.examsystem.service.impl;

import com.qst.examsystem.dao.IZyDao;
import com.qst.examsystem.entity.Zy;
import com.qst.examsystem.service.IZyService;
import com.qst.examsystem.util.Page;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * 专业
 */
@Service("zyService")
public class IZyServiceImpl implements IZyService {
    @Autowired
    @Qualifier("zyDao")
    private IZyDao zyDao;

    /**
     * 增加
     * @param zy
     * @return
     */
    @Override
    public Integer addZy(Zy zy) {
        return zyDao.addZy(zy);
    }

    /**
     * 修改
     * @param zy
     * @return
     */
    @Override
    public Integer updataZy(Zy zy) {
        return zyDao.updataZy(zy);
    }

    /**
     * 删除
     * @param zyid
     * @return
     */
    @Override
    public String deleteZy(Integer zyid) {
        return zyDao.deleteZy(zyid);
    }

    /**
     * 根据id查询
     * @param zyid
     * @return
     */
    @Override
    public Zy findZyById(Integer zyid) {
        return zyDao.findZyById(zyid);
    }

    /**
     * 查询所有
     * @param page
     * @param rows
     * @param zy
     * @return
     */
    @Override
    public Page<Zy> findZyPage(Integer page, Integer rows, Zy zy) {
        RowBounds rowBounds = new RowBounds((page-1) * rows, rows);
//		// 查询专业列表
        List<Zy> zys=zyDao.findZyByCond(rowBounds,zy);

//		// 查询专业列表总记录数
        Integer count =zyDao.findZyCount(zy);
//		// 创建Page返回对象
        Page<Zy> result = new Page<Zy>();
        result.setPage(page);
        result.setRows(zys);
        result.setSize(rows);
        result.setTotal(count);
        return result;
    }
}
