package com.qst.examsystem.entity;

import org.apache.ibatis.type.Alias;

/**
 * 考场信息实体类
 */
@Alias("kcxx")
public class Kcxx {
    /**
     * 考场信息id
     */
    Integer kcid;
    /**
     * 考试名称
     */
    String kcname;
    /**
     * 考场总人数
     */
    Integer kcnum;
    /**
     * 作弊人数
     */
    Integer badnum;
    /**
     * 缺考人数
     */
    Integer nullnum;
    /**
     * 监考人姓名
     */
    String jkname;
    /**
     * 考场编号
     */
    String kcno;

    public Kcxx() {
    }

    public Kcxx(Integer kcid, String kcname, Integer kcnum, Integer badnum, Integer nullnum, String jkname, String kcno) {
        this.kcid = kcid;
        this.kcname = kcname;
        this.kcnum = kcnum;
        this.badnum = badnum;
        this.nullnum = nullnum;
        this.jkname = jkname;
        this.kcno = kcno;
    }

    public Integer getKcid() {
        return kcid;
    }

    public void setKcid(Integer kcid) {
        this.kcid = kcid;
    }

    public String getKcname() {
        return kcname;
    }

    public void setKcname(String kcname) {
        this.kcname = kcname;
    }

    public Integer getKcnum() {
        return kcnum;
    }

    public void setKcnum(Integer kcnum) {
        this.kcnum = kcnum;
    }

    public Integer getBadnum() {
        return badnum;
    }

    public void setBadnum(Integer badnum) {
        this.badnum = badnum;
    }

    public Integer getNullnum() {
        return nullnum;
    }

    public void setNullnum(Integer nullnum) {
        this.nullnum = nullnum;
    }

    public String getJkname() {
        return jkname;
    }

    public void setJkname(String jkname) {
        this.jkname = jkname;
    }

    public String getKcno() {
        return kcno;
    }

    public void setKcno(String kcno) {
        this.kcno = kcno;
    }

    @Override
    public String toString() {
        return "Kcxx{" +
                "kcid=" + kcid +
                ", kcname='" + kcname + '\'' +
                ", kcnum=" + kcnum +
                ", badnum=" + badnum +
                ", nullnum=" + nullnum +
                ", jkname='" + jkname + '\'' +
                ", kcno='" + kcno + '\'' +
                '}';
    }
}
