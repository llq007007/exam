package com.qst.examsystem.dao;

import com.qst.examsystem.entity.Jky;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * 监考员dao层接口
 */
public interface IJkyDao {
    Integer findJkyCount(Jky jky);

    List<Jky> findJkyByCond(RowBounds rowBounds, Jky jky);

    Jky findJkyById(String jkid);

    String deleteJky(String jkid);

    Integer addJky(Jky jky);

    Integer updataJky(Jky jky);

}
