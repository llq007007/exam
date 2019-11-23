package com.qst.examsystem.entity;

import java.util.Date;

public class Zy {
    //专业ID
    private Integer zyid;
    //专业号
    private String zyno;
    //专业名称
    private String zyname;
    //添加时间
    private Date zyaddtime;
    //修改时间
    private Date zyupdatetime;
    //添加人
    private String zyaddperson;
    //修改人
    private  String zyupdateperson;


    public Zy() {
    }


    public Zy(Integer zyid, String zyno, String zyname, Date zyaddtime, Date zyupdatetime, String zyaddperson, String zyupdateperson) {
        this.zyid = zyid;
        this.zyno = zyno;
        this.zyname = zyname;
        this.zyaddtime = zyaddtime;
        this.zyupdatetime = zyupdatetime;
        this.zyaddperson = zyaddperson;
        this.zyupdateperson = zyupdateperson;
    }

    @Override
    public String toString() {
        return "Zy{" +
                "zyid=" + zyid +
                ", zyno=" + zyno +
                ", zyname=" + zyname +
                ", zyaddtime=" + zyaddtime +
                ", zyupdatetime=" + zyupdatetime +
                ", zyaddperson='" + zyaddperson + '\'' +
                ", zyupdateperson='" + zyupdateperson + '\'' +
                '}';
    }

    public Integer getZyid() {
        return zyid;
    }

    public void setZyid(Integer zyid) {
        this.zyid = zyid;
    }

    public String getZyno() {
        return zyno;
    }

    public void setZyno(String zyno) {
        this.zyno = zyno;
    }

    public String getZyname() {
        return zyname;
    }

    public void setZyname(String zyname) {
        this.zyname = zyname;
    }

    public Date getZyaddtime() {
        return zyaddtime;
    }

    public void setZyaddtime(Date zyaddtime) {
        this.zyaddtime = zyaddtime;
    }

    public Date getZyupdatetime() {
        return zyupdatetime;
    }

    public void setZyupdatetime(Date zyupdatetime) {
        this.zyupdatetime = zyupdatetime;
    }

    public String getZyaddperson() {
        return zyaddperson;
    }

    public void setZyaddperson(String zyaddperson) {
        this.zyaddperson = zyaddperson;
    }

    public String getZyupdateperson() {
        return zyupdateperson;
    }

    public void setZyupdateperson(String zyupdateperson) {
        this.zyupdateperson = zyupdateperson;
    }
}
