package com.qst.examsystem.dao.impl;

import com.qst.examsystem.dao.IUserDao;
import com.qst.examsystem.entity.User;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDaoImpl implements IUserDao {
    @Autowired
    @Qualifier("sqlSession")
    SqlSession sqlSession;
    @Override
    public int register(User user) {
        int rows=sqlSession.insert("register",user);
        return rows;
    }
}
