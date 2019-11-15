package com.qst.examsystem.service.impl;


import com.qst.examsystem.dao.IAdminDao;
import com.qst.examsystem.service.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("adminService")
public class AdminServiceImpl implements IAdminService {
    @Autowired
    @Qualifier("adminDao")
    private IAdminDao adminDao;
}
