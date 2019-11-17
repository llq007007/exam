package com.qst.examsystem.service.impl;


import com.qst.examsystem.dao.IAdminDao;
import com.qst.examsystem.entity.Admin;
import com.qst.examsystem.service.IAdminService;
import com.qst.examsystem.util.Page;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("adminService")
public class AdminServiceImpl implements IAdminService {
    @Autowired
    @Qualifier("adminDao")
    private IAdminDao adminDao;

    @Override
    public Integer addAdmin(Admin admin) {
        return adminDao.addAdmin(admin);
    }

    @Override
    public Integer updataAdmin(Admin admin) {
        return adminDao.findAdminModify(admin);
    }

    @Override
    public String deleteAdmin(String adid) {
        return adminDao.deleteAdmin(adid);
    }

    @Override
    public Admin findAdminById(String adid) {
        return adminDao.findAdminById( adid);
    }

    @Override
    public Page<Admin> findAdminPage(Integer page, Integer rows, Admin admin) {
        RowBounds rowBounds = new RowBounds((page-1) * rows, rows);
//		// 查询管理员列表
        List<Admin> admins=adminDao.findAdminByCond(rowBounds,admin);

//		// 查询管理员列表总记录数
        Integer count =adminDao.findAdminCount(admin);
//		// 创建Page返回对象
        Page<Admin> result = new Page<Admin>();
        result.setPage(page);
        result.setRows(admins);
        result.setSize(rows);
        result.setTotal(count);
        return result;
    }
}
