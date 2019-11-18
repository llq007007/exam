package com.qst.examsystem.dao.impl;

import com.qst.examsystem.dao.IDjDao;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository("djDao")
public class DjDaoImpl implements IDjDao {
    @Autowired
    @Qualifier("sqlSession")
    SqlSession sqlSession;
}
