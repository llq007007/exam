package com.qst.examsystem.service;

import com.qst.examsystem.entity.Jky;
import com.qst.examsystem.util.Page;
import org.apache.ibatis.annotations.Param;

/**
 * 监考员业务层接口
 */
public interface IJkyService {

    /**
     * 增加监考员
     * @param iky
     * @return 1成功，0失败
     */
    public Integer addJky(Jky iky);
    /**
     * 修改监考员
     * @param iky
     * @return 1成功，0失败
     */
    public Integer updataJky(Jky iky);
    /**
     * 删除监考员
     * @param jkid
     * @return  1成功，0失败
     */
    public String deleteJky(@Param("jkid") String jkid);
    /**
     * 根据id查找监考员
     * @param jkid
     * @return
     */
    public Jky findJkyById(String jkid);
    /**
     * 查询所有监考员
     * @param page
     * @param rows
     * @param jky
     * @return
     */
    public Page<Jky> findJkyPage(Integer page, Integer rows, Jky jky);
}
