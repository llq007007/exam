package com.qst.examsystem.mapper;

import com.qst.examsystem.entity.Zy;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * 监考员mapper接口
 */
public interface ZyMapper {

    /**
     * 增加
     *
     * @param zy
     * @return
     */
    Integer addZy(Zy zy);

    /**
     * 修改
     *
     * @param zy
     * @return
     */
    Integer findZyModify(Zy zy);

    /**
     * 删除
     *
     * @param zyid
     * @return
     */
    String deleteZy(Integer zyid);

    /**
     * 查询根据id
     *
     * @param zyid
     * @return
     */
    Zy findZyById(Integer zyid);

    /**
     * 查询所有
     *
     * @param rowBounds
     * @param zy
     * @return
     */
    List<Zy> findZyByCond(RowBounds rowBounds, Zy zy);

    /**
     * 查询count（*） 总条数
     *
     * @param zy
     * @return
     */
    Integer findZyCount(Zy zy);
}