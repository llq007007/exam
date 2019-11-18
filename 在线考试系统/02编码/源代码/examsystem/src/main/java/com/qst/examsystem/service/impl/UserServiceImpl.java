package com.qst.examsystem.service.impl;


import com.qst.examsystem.dao.IUserDao;
import com.qst.examsystem.entity.User;
import com.qst.examsystem.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements IUserService {
    @Autowired
    @Qualifier("userDao")
    private IUserDao userDao;
    @Override
    public int register(User user) {
        return userDao.register(user);
    }
}
