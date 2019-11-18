package com.qst.examsystem.dao;

import com.qst.examsystem.entity.Zy;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * 专业表dao层接口
 */
public interface IZyDao {
    /**
     * 查询 count（*）
     * @param zy
     * @return
     */
    Integer findZyCount(Zy zy);

    /**
     * 查询所有
     * @param rowBounds
     * @param zy
     * @return
     */
    List<Zy> findZyByCond(RowBounds rowBounds, Zy zy);

    /**
     * 根据id查询
     * @param zyid
     * @return
     */
    Zy findZyById(Integer zyid);

    /**
     * 删除
     * @param zyid
     * @return
     */
    String deleteZy(Integer zyid);

    /**
     * 添加
     * @param zy
     * @return
     */
    Integer addZy(Zy zy);

    /**
     * 修改
     * @param zy
     * @return
     */
    Integer updataZy(Zy zy);
}
