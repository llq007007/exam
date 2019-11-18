package com.qst.examsystem.entity;

import org.apache.ibatis.type.Alias;

import java.util.Date;

/**
 * 监考员实体类
 * （jkid，姓名 jkname ，监考课程 jkcourse ，密码 jkpw ，添加时间 jkaddtime ，修改时间 jkupdatetime ，添加人 jkaddperson ，修改人 jkupdateperson ）
 */
@Alias("jky")
public class Jky {
    Integer jkid;
    String jkname;
    String jkcourse;
    String jkpw;
    Date jkaddtime;
    Date jkupdatetime;
    String jkaddperson;
    String jkupdateperson;

    public Jky() {
    }

    public Jky(Integer jkid, String jkname, String jkcourse, String jkpw, Date jkaddtime, Date jkupdatetime, String jkaddperson, String jkupdateperson) {
        this.jkid = jkid;
        this.jkname = jkname;
        this.jkcourse = jkcourse;
        this.jkpw = jkpw;
        this.jkaddtime = jkaddtime;
        this.jkupdatetime = jkupdatetime;
        this.jkaddperson = jkaddperson;
        this.jkupdateperson = jkupdateperson;
    }

    public Integer getJkid() {
        return jkid;
    }

    public void setJkid(Integer jkid) {
        this.jkid = jkid;
    }

    public String getJkname() {
        return jkname;
    }

    public void setJkname(String jkname) {
        this.jkname = jkname;
    }

    public String getJkcourse() {
        return jkcourse;
    }

    public void setJkcourse(String jkcourse) {
        this.jkcourse = jkcourse;
    }

    public String getJkpw() {
        return jkpw;
    }

    public void setJkpw(String jkpw) {
        this.jkpw = jkpw;
    }

    public Date getJkaddtime() {
        return jkaddtime;
    }

    public void setJkaddtime(Date jkaddtime) {
        this.jkaddtime = jkaddtime;
    }

    public Date getJkupdatetime() {
        return jkupdatetime;
    }

    public void setJkupdatetime(Date jkupdatetime) {
        this.jkupdatetime = jkupdatetime;
    }

    public String getJkaddperson() {
        return jkaddperson;
    }

    public void setJkaddperson(String jkaddperson) {
        this.jkaddperson = jkaddperson;
    }

    public String getJkupdateperson() {
        return jkupdateperson;
    }

    public void setJkupdateperson(String jkupdateperson) {
        this.jkupdateperson = jkupdateperson;
    }

    @Override
    public String toString() {
        return "Jky{" +
                "jkid=" + jkid +
                ", jkname='" + jkname + '\'' +
                ", jkcourse='" + jkcourse + '\'' +
                ", jkpw='" + jkpw + '\'' +
                ", jkaddtime='" + jkaddtime + '\'' +
                ", jkupdatetime='" + jkupdatetime + '\'' +
                ", jkaddperson='" + jkaddperson + '\'' +
                ", jkupdateperson='" + jkupdateperson + '\'' +
                '}';
    }
}
