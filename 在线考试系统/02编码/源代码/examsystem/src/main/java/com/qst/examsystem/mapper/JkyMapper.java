package com.qst.examsystem.mapper;

import com.qst.examsystem.entity.Jky;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * 监考员mapper接口
 */
public interface JkyMapper {

    /**
     * 增加
     * @param jky
     * @return
     */
    Integer addJky(Jky jky);

    /**
     * 修改
     * @param jky
     * @return
     */
    Integer findJkyModify(Jky jky);

    /**
     * 删除
     * @param jkid
     * @return
     */
    String deleteJky(Integer jkid);

    /**
     * 查询根据id
     * @param jkid
     * @return
     */
    Jky findJkyById(Integer jkid);

    /**
     * 查询所有
     * @param rowBounds
     * @param jky
     * @return
     */
    List<Jky> findJkyByCond(RowBounds rowBounds, Jky jky);

    /**
     * 查询count（*） 总条数
     * @param jky
     * @return
     */
    Integer findJkyCount(Jky jky);
}
