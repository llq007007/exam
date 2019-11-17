package com.qst.examsystem.dao;

import com.qst.examsystem.entity.Jky;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * 监考员dao层接口
 */
public interface IJkyDao {
    /**
     * 查询 count（*）
     * @param jky
     * @return
     */
    Integer findJkyCount(Jky jky);

    /**
     * 查询所有
     * @param rowBounds
     * @param jky
     * @return
     */
    List<Jky> findJkyByCond(RowBounds rowBounds, Jky jky);

    /**
     * 根据id查询
     * @param jkid
     * @return
     */
    Jky findJkyById(Integer jkid);

    /**
     * 删除
     * @param jkid
     * @return
     */
    Integer deleteJky(Integer jkid);

    /**
     * 添加
     * @param jky
     * @return
     */
    Integer addJky(Jky jky);

    /**
     * 修改
     * @param jky
     * @return
     */
    Integer updataJky(Jky jky);

}
