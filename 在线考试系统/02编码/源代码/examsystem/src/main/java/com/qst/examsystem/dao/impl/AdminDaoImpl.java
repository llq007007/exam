package com.qst.examsystem.dao.impl;

import com.qst.examsystem.dao.IAdminDao;
import com.qst.examsystem.entity.Admin;
import com.qst.examsystem.mapper.AdminMapper;

import org.apache.ibatis.session.RowBounds;

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
    @Qualifier("adminMapper")
    private AdminMapper adminMapper;//创建AdminMapper对象

    /**
     * 添加
     * @param admin
     * @return
     */
    @Override
    public Integer addAdmin(Admin admin) {
        return adminMapper.addAdmin(admin);
    }

    /**
     * 修改
     * @param admin
     * @return
     */
    @Override
    public Integer findAdminModify(Admin admin) {
        return adminMapper.findAdminModify(admin);
    }

    /**
     * 删除
     * @param adid
     * @return
     */
    @Override
    public Integer deleteAdmin(Integer adid) {
        System.out.println("****"+adid);
        return adminMapper.deleteAdmin(adid);
    }

    /**
     * 根据id查找
     * @param adid
     * @return
     */
    @Override
    public Admin findAdminById(Integer adid) {
        return adminMapper.findAdminById(adid);
    }

    /**
     * 分页查找所有
     * @param rowBounds
     * @param admin
     * @return
     */
    @Override
    public List<Admin> findAdminByCond(RowBounds rowBounds, Admin admin) {
        return adminMapper.findAdminByCond( rowBounds,  admin);
    }

    /**
     * 查找 Admin count(*)
     * @param admin
     * @return
     */
    @Override
    public Integer findAdminCount(Admin admin) {
        return adminMapper.findAdminCount(admin);
    }
}
