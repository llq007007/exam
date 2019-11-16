package com.qst.examsystem.entity;

import org.apache.ibatis.type.Alias;

import java.util.Date;

/**
 * 套题实体类
 */
@Alias("taoti")
public class Tt {
    //套题卷ID
    private Integer ttid;
    //试卷号
    private Integer sjid;
    //题号
    private Integer stid;
    //添加时间
    private Date ttaddtime;
    //修改时间
    private Date ttupdatetime;
    //添加人
    private String ttaddperson;
    //修改人
    private  String ttupdateperson;

    public Tt() {
    }

    public Tt(Integer ttid, Integer sjid, Integer stid, Date ttaddtime, Date ttupdatetime, String ttaddperson, String ttupdateperson) {
        this.ttid = ttid;
        this.sjid = sjid;
        this.stid = stid;
        this.ttaddtime = ttaddtime;
        this.ttupdatetime = ttupdatetime;
        this.ttaddperson = ttaddperson;
        this.ttupdateperson = ttupdateperson;
    }

    public Integer getTtid() {
        return ttid;
    }

    public void setTtid(Integer ttid) {
        this.ttid = ttid;
    }

    public Integer getSjid() {
        return sjid;
    }

    public void setSjid(Integer sjid) {
        this.sjid = sjid;
    }

    public Integer getStid() {
        return stid;
    }

    public void setStid(Integer stid) {
        this.stid = stid;
    }

    public Date getTtaddtime() {
        return ttaddtime;
    }

    public void setTtaddtime(Date ttaddtime) {
        this.ttaddtime = ttaddtime;
    }

    public Date getTtupdatetime() {
        return ttupdatetime;
    }

    public void setTtupdatetime(Date ttupdatetime) {
        this.ttupdatetime = ttupdatetime;
    }

    public String getTtaddperson() {
        return ttaddperson;
    }

    public void setTtaddperson(String ttaddperson) {
        this.ttaddperson = ttaddperson;
    }

    public String getTtupdateperson() {
        return ttupdateperson;
    }

    public void setTtupdateperson(String ttupdateperson) {
        this.ttupdateperson = ttupdateperson;
    }

    @Override
    public String toString() {
        return "Tt{" +
                "ttid=" + ttid +
                ", sjid=" + sjid +
                ", stid=" + stid +
                ", ttaddtime=" + ttaddtime +
                ", ttupdatetime=" + ttupdatetime +
                ", ttaddperson='" + ttaddperson + '\'' +
                ", ttupdateperson='" + ttupdateperson + '\'' +
                '}';
    }
}
