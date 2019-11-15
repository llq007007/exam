package com.qst.examsystem.dao.impl;

import com.qst.examsystem.dao.IAdminDao;
import com.qst.examsystem.entity.Admin;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;


@Repository("adminDao")
public class AdminDaoImpl implements IAdminDao {
    @Autowired
    @Qualifier("sqlSession")
    SqlSession sqlSession;
    @Override
    public int adminregister(Admin admin) {
        return 0;
    }
}
