package com.qst.examsystem.dao.impl;

import com.qst.examsystem.dao.IAdminDao;
import com.qst.examsystem.entity.Admin;
import com.qst.examsystem.mapper.AdminMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 管理员数据访问
 */
@Repository("adminDao")
public class AdminDaoImpl implements IAdminDao {
    @Autowired
    @Qualifier("sqlSession")
    SqlSession sqlSession;
    private AdminMapper adminMapper;

    @Override
    public Integer addAdmin(Admin admin) {
        return adminMapper.addAdmin(admin);
    }

    @Override
    public Integer findAdminModify(Admin admin) {
        return adminMapper.findAdminModify(admin);
    }

    @Override
    public String deleteAdmin(String adid) {
        return adminMapper.deleteAdmin(adid);
    }

    @Override
    public Admin findAdminById(String adid) {
        return adminMapper.findAdminById(adid);
    }

    @Override
    public List<Admin> findAdminByCond(RowBounds rowBounds, Admin admin) {
        return adminMapper.findAdminByCond( rowBounds,  admin);
    }

    @Override
    public Integer findAdminCount(Admin admin) {
        return adminMapper.findAdminCount(admin);
    }
}
