package com.qst.examsystem.dao;

import com.qst.examsystem.entity.User;

/**
 * 用户表dao层接口
 */
public interface IUserDao {
    /**
     * 用户注册，添加用户
     * @return
     */
    int register(User user);
}
