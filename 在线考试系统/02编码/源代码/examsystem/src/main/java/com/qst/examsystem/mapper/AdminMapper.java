package com.qst.examsystem.mapper;

import com.qst.examsystem.entity.Admin;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * 管理员mapper接口
 */
public interface AdminMapper {


    Integer addAdmin(Admin admin);

    Integer findAdminModify(Admin admin);

    String deleteAdmin(String adid);

    Admin findAdminById(String adid);

    List<Admin> findAdminByCond(RowBounds rowBounds, Admin admin);

    Integer findAdminCount(Admin admin);

}
