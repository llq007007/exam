package com.qst.examsystem.service.impl;

import com.qst.examsystem.dao.IJkyDao;
import com.qst.examsystem.dao.ISjDao;
import com.qst.examsystem.service.IJkyService;
import com.qst.examsystem.service.ISjService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("iSjService")
public class SjServiceImpl implements ISjService {
    @Autowired
    @Qualifier("sjDao")
    private ISjDao sjDao;

    @Override
    public List<Map<String, Object>> chouSj(Map map) {
        return sjDao.chouSj(map);
    }
}
