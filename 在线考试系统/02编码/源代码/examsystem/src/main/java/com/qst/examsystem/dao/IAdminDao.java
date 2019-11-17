package com.qst.examsystem.dao;

import com.qst.examsystem.entity.Admin;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * admin表dao层接口
 */
public interface IAdminDao {
    /**
     * 管理员增加
     * @param admin
     * @return
     */
    Integer addAdmin(Admin admin);

    /**
     * 修改管理员
     * @param admin
     * @return
     */
    Integer findAdminModify(Admin admin);

    /**
     * 管理员删除
     * @param adid
     * @return
     */
    String deleteAdmin(String adid);

    /**
     * 查找
     * @param adid
     * @return
     */
    Admin findAdminById(String adid);

    /**
     * 查询所有
     * @param rowBounds
     * @param admin
     * @return
     */
    List<Admin> findAdminByCond(RowBounds rowBounds, Admin admin);

    /**
     * 查询 admin count（*）
     * @param admin
     * @return
     */
    Integer findAdminCount(Admin admin);

}
