package com.qst.examsystem.entity;

import org.apache.ibatis.type.Alias;

/**
 * 试卷试题关联表实体类
 */
@Alias("sjst")
public class Sjst {
    private Integer stid;
    private Integer sjid;

    public Sjst() {
    }

    public Sjst(Integer stid, Integer sjid) {
        this.stid = stid;
        this.sjid = sjid;
    }

    public Integer getStid() {
        return stid;
    }

    public void setStid(Integer stid) {
        this.stid = stid;
    }

    public Integer getSjid() {
        return sjid;
    }

    public void setSjid(Integer sjid) {
        this.sjid = sjid;
    }

    @Override
    public String toString() {
        return "Sjst{" +
                "stid=" + stid +
                ", sjid=" + sjid +
                '}';
    }
}
