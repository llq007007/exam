package com.qst.examsystem.service.impl;

import com.qst.examsystem.dao.IJkyDao;
import com.qst.examsystem.service.IJkyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("jkyService")
public class JkyServiceImpl implements IJkyService {
    @Autowired
    @Qualifier("jkyDao")
    private IJkyDao jkyDao;
}
