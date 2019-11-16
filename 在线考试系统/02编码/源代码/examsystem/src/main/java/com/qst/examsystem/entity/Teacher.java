package com.qst.examsystem.entity;

import org.apache.ibatis.type.Alias;

import java.util.Date;

/**
 * teacher实体类
 * （tid，姓名 tname，工号 tno，密码 tpw，添加时间 taddtime，修改时间 tupdatetime，添加人 taddperson，修改人 tupdateperson）
 */
@Alias("teacher")
public class Teacher {
    Integer tid;
    String tname;
    String tno;
    String tpw;
    Date taddtime;
    Date tupdatetime;
    String taddperson;
    String tupdateperson;

    public Teacher() {
    }

    public Teacher(Integer tid, String tname, String tno, String tpw, Date taddtime, Date tupdatetime, String taddperson, String tupdateperson) {
        this.tid = tid;
        this.tname = tname;
        this.tno = tno;
        this.tpw = tpw;
        this.taddtime = taddtime;
        this.tupdatetime = tupdatetime;
        this.taddperson = taddperson;
        this.tupdateperson = tupdateperson;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public String getTno() {
        return tno;
    }

    public void setTno(String tno) {
        this.tno = tno;
    }

    public String getTpw() {
        return tpw;
    }

    public void setTpw(String tpw) {
        this.tpw = tpw;
    }

    public Date getTaddtime() {
        return taddtime;
    }

    public void setTaddtime(Date taddtime) {
        this.taddtime = taddtime;
    }

    public Date getTupdatetime() {
        return tupdatetime;
    }

    public void setTupdatetime(Date tupdatetime) {
        this.tupdatetime = tupdatetime;
    }

    public String getTaddperson() {
        return taddperson;
    }

    public void setTaddperson(String taddperson) {
        this.taddperson = taddperson;
    }

    public String getTupdateperson() {
        return tupdateperson;
    }

    public void setTupdateperson(String tupdateperson) {
        this.tupdateperson = tupdateperson;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "tid=" + tid +
                ", tname='" + tname + '\'' +
                ", tno='" + tno + '\'' +
                ", tpw='" + tpw + '\'' +
                ", taddtime=" + taddtime +
                ", tupdatetime=" + tupdatetime +
                ", taddperson='" + taddperson + '\'' +
                ", tupdateperson='" + tupdateperson + '\'' +
                '}';
    }
}
