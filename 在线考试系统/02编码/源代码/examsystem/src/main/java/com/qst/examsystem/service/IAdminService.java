package com.qst.examsystem.service;

import com.qst.examsystem.entity.Admin;
import com.qst.examsystem.util.Page;
import org.apache.ibatis.annotations.Param;

/**
 * 管理员表业务层接口
 */
public interface IAdminService {
    /**
     * 增加管理员
     * @param admin
     * @return 1成功，0失败
     */
    public Integer addAdmin(Admin admin);
    /**
     * 修改管理员
     * @param admin
     * @return 1成功，0失败
     */
    public Integer updataAdmin(Admin admin);
    /**
     * 删除管理员
     * @param adid
     * @return  1成功，0失败
     */
    public Integer deleteAdmin(@Param("adid") Integer adid);
    /**
     * 根据id查找管理员
     * @param adid
     * @return
     */
    public Admin findAdminById(Integer adid);
    /**
     * 查询所有管理员
     * @param page
     * @param rows
     * @param admin
     * @return
     */
    public Page<Admin> findAdminPage(Integer page, Integer rows, Admin admin);
}
