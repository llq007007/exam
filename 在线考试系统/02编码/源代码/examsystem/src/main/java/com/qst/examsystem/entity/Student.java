package com.qst.examsystem.entity;

import org.apache.ibatis.type.Alias;

import java.util.Date;

/**
 * 考生类
 * （考号（khid），专业 zyid（外）， 姓名 sname，性别 ssex，密码 spw，
 * 添加时间 saddtime，修改时间 supdatetime，添加人 saddperson，修改人 supdateperson，备注 scomments）
 */
@Alias("student")
public class Student {
    Integer khid;
    Integer zyid;
    String sname;
    String ssex;
    String spw;
    Date saddtime;
    Date supdatetime;
    String saddperson;
    String supdateperson;
    String scomments;

    public Student() {
    }

    public Student(Integer khid, Integer zyid, String sname, String ssex, String spw, Date saddtime, Date supdatetime, String saddperson, String supdateperson, String scomments) {
        this.khid = khid;
        this.zyid = zyid;
        this.sname = sname;
        this.ssex = ssex;
        this.spw = spw;
        this.saddtime = saddtime;
        this.supdatetime = supdatetime;
        this.saddperson = saddperson;
        this.supdateperson = supdateperson;
        this.scomments = scomments;
    }

    public Integer getKhid() {
        return khid;
    }

    public void setKhid(Integer khid) {
        this.khid = khid;
    }

    public Integer getZyid() {
        return zyid;
    }

    public void setZyid(Integer zyid) {
        this.zyid = zyid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSsex() {
        return ssex;
    }

    public void setSsex(String ssex) {
        this.ssex = ssex;
    }

    public String getSpw() {
        return spw;
    }

    public void setSpw(String spw) {
        this.spw = spw;
    }

    public Date getSaddtime() {
        return saddtime;
    }

    public void setSaddtime(Date saddtime) {
        this.saddtime = saddtime;
    }

    public Date getSupdatetime() {
        return supdatetime;
    }

    public void setSupdatetime(Date supdatetime) {
        this.supdatetime = supdatetime;
    }

    public String getSaddperson() {
        return saddperson;
    }

    public void setSaddperson(String saddperson) {
        this.saddperson = saddperson;
    }

    public String getSupdateperson() {
        return supdateperson;
    }

    public void setSupdateperson(String supdateperson) {
        this.supdateperson = supdateperson;
    }

    public String getScomments() {
        return scomments;
    }

    public void setScomments(String scomments) {
        this.scomments = scomments;
    }

    @Override
    public String toString() {
        return "Student{" +
                "khid=" + khid +
                ", zyid=" + zyid +
                ", sname='" + sname + '\'' +
                ", ssex='" + ssex + '\'' +
                ", spw='" + spw + '\'' +
                ", saddtime=" + saddtime +
                ", supdatetime=" + supdatetime +
                ", saddperson='" + saddperson + '\'' +
                ", supdateperson='" + supdateperson + '\'' +
                ", scomments='" + scomments + '\'' +
                '}';
    }
}
