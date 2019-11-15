package com.qst.examsystem.dao;

import com.qst.examsystem.entity.Admin;

/**
 * admin表dao层接口
 */
public interface IAdminDao {
    /**
     * 管理员注册
     * @param admin
     * @return
     */
    int adminregister(Admin admin);

}
