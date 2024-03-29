package com.qst.examsystem.dao;

import com.qst.examsystem.entity.Admin;
import com.qst.examsystem.entity.Student;
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
    Integer deleteAdmin(Integer adid);

    /**
     * 查找
     * @param adid
     * @return
     */
    Admin findAdminById(Integer adid);

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
    /**
     * 管理员登陆
     * @param adname
     * @return
     */
    Admin adminlogin(String adname);
    /**
     * 修改密码
     * @param admin
     * @return
     */
    int updateAdpw(Admin admin);
}
