package com.qst.examsystem.mapper;

import com.qst.examsystem.entity.Jky;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * 监考员mapper接口
 */
public interface JkyMapper {


    Integer addJky(Jky jky);

    Integer findJkyModify(Jky jky);

    String deleteJky(String jkid);

    Jky findJkyById(String jkid);

    List<Jky> findJkyByCond(RowBounds rowBounds, Jky jky);

    Integer findJkyCount(Jky jky);
}
