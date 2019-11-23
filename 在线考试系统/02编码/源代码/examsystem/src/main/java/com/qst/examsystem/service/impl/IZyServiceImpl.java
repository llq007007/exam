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


    @Override
    public List<Zy> queryZy() {
        return zyDao.queryZy();
    }

    @Override
    public int insertZy(Zy zy) {
        return zyDao.insertZy(zy);
    }

    @Override
    public Zy selectOneZy(int zyid) {
        return zyDao.selectOneZy(zyid);
    }

    @Override
    public int deleteZy(int zyid) {
        return zyDao.deleteZy(zyid);
    }

    @Override
    public int updateZy(Zy zy) {
        return zyDao.updateZy(zy);
    }
}
