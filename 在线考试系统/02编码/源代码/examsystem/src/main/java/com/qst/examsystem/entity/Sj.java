package com.qst.examsystem.entity;

import org.apache.ibatis.type.Alias;

import java.util.Date;

/**
 * 试卷实体类
 */
@Alias("shijuan")
public class Sj {
    //试卷号
    private Integer sjid;
    //试卷名称
    private  String sjname;
    //考试时间
    private Date kstime;
    //阅卷人编号
    private String rjrno;
    //出卷日期
    private Date cjrq;
    //是否延时
    private String delay;
    //延时口令
    private String delaypw;
    //添加时间
    private Date sjaddtime;
    //修改时间
    private Date sjupdatetime;
    //添加人
    private String sjaddperson;
    //修改人
    private String sjupdateperson;
    //题号
    private Integer stid;

    public Sj() {
    }

    public Sj(Integer sjid, String sjname, Date kstime, String rjrno, Date cjrq, String delay, String delaypw, Date sjaddtime, Date sjupdatetime, String sjaddperson, String sjupdateperson, Integer stid) {
        this.sjid = sjid;
        this.sjname = sjname;
        this.kstime = kstime;
        this.rjrno = rjrno;
        this.cjrq = cjrq;
        this.delay = delay;
        this.delaypw = delaypw;
        this.sjaddtime = sjaddtime;
        this.sjupdatetime = sjupdatetime;
        this.sjaddperson = sjaddperson;
        this.sjupdateperson = sjupdateperson;
        this.stid = stid;
    }

    public Integer getSjid() {
        return sjid;
    }

    public void setSjid(Integer sjid) {
        this.sjid = sjid;
    }

    public String getSjname() {
        return sjname;
    }

    public void setSjname(String sjname) {
        this.sjname = sjname;
    }

    public Date getKstime() {
        return kstime;
    }

    public void setKstime(Date kstime) {
        this.kstime = kstime;
    }

    public String getRjrno() {
        return rjrno;
    }

    public void setRjrno(String rjrno) {
        this.rjrno = rjrno;
    }

    public Date getCjrq() {
        return cjrq;
    }

    public void setCjrq(Date cjrq) {
        this.cjrq = cjrq;
    }

    public String getDelay() {
        return delay;
    }

    public void setDelay(String delay) {
        this.delay = delay;
    }

    public String getDelaypw() {
        return delaypw;
    }

    public void setDelaypw(String delaypw) {
        this.delaypw = delaypw;
    }

    public Date getSjaddtime() {
        return sjaddtime;
    }

    public void setSjaddtime(Date sjaddtime) {
        this.sjaddtime = sjaddtime;
    }

    public Date getSjupdatetime() {
        return sjupdatetime;
    }

    public void setSjupdatetime(Date sjupdatetime) {
        this.sjupdatetime = sjupdatetime;
    }

    public String getSjaddperson() {
        return sjaddperson;
    }

    public void setSjaddperson(String sjaddperson) {
        this.sjaddperson = sjaddperson;
    }

    public String getSjupdateperson() {
        return sjupdateperson;
    }

    public void setSjupdateperson(String sjupdateperson) {
        this.sjupdateperson = sjupdateperson;
    }

    public Integer getStid() {
        return stid;
    }

    public void setStid(Integer stid) {
        this.stid = stid;
    }

    @Override
    public String toString() {
        return "Sj{" +
                "sjid=" + sjid +
                ", sjname='" + sjname + '\'' +
                ", kstime=" + kstime +
                ", rjrno='" + rjrno + '\'' +
                ", cjrq=" + cjrq +
                ", delay='" + delay + '\'' +
                ", delaypw='" + delaypw + '\'' +
                ", sjaddtime=" + sjaddtime +
                ", sjupdatetime=" + sjupdatetime +
                ", sjaddperson='" + sjaddperson + '\'' +
                ", sjupdateperson='" + sjupdateperson + '\'' +
                ", stid=" + stid +
                '}';
    }
}
