package com.qst.examsystem.mapper;

import com.qst.examsystem.entity.Admin;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * 管理员mapper接口
 */
public interface AdminMapper {

    /**
     * 增加
     * @param admin
     * @return
     */
    Integer addAdmin(Admin admin);

    /**
     * 修改
     * @param admin
     * @return
     */
    Integer findAdminModify(Admin admin);

    /**
     * 删除
     * @param adid
     * @return
     */
    Integer deleteAdmin(@Param("adid") Integer adid);

    /**
     * 查询
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
     * 查询count（*） admin
     * @param admin
     * @return
     */
    Integer findAdminCount(Admin admin);

}
