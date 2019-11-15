package com.qst.examsystem.dao.impl;

import com.qst.examsystem.dao.IJkyDao;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository("jkyDao")
public class JkyDaoImpl implements IJkyDao {
    @Autowired
    @Qualifier("sqlSession")
    SqlSession sqlSession;
}
