package com.qst.examsystem.entity;

import org.apache.ibatis.type.Alias;

import java.util.Date;

/**
 * 考生答案实体类
 */
@Alias("ksda")
public class Ksda {
//    答案id
    private Integer daid;
//    试题id
    private Integer stid;
//    答案内容
    private String dacontain;
//    添加时间
    private Date daaddtime;
//    修改时间
    private Date updatetime;
//    添加人
    private String daaddperson;
//    修改人
    private String daupdateperson;
//    考号id
    private Integer khid;

    public Ksda() {
    }

    public Ksda(Integer daid, Integer stid, String dacontain, Date daaddtime, Date updatetime, String daaddperson, String daupdateperson, Integer khid) {
        this.daid = daid;
        this.stid = stid;
        this.dacontain = dacontain;
        this.daaddtime = daaddtime;
        this.updatetime = updatetime;
        this.daaddperson = daaddperson;
        this.daupdateperson = daupdateperson;
        this.khid = khid;
    }

    public Integer getDaid() {
        return daid;
    }

    public void setDaid(Integer daid) {
        this.daid = daid;
    }

    public Integer getStid() {
        return stid;
    }

    public void setStid(Integer stid) {
        this.stid = stid;
    }

    public String getDacontain() {
        return dacontain;
    }

    public void setDacontain(String dacontain) {
        this.dacontain = dacontain;
    }

    public Date getDaaddtime() {
        return daaddtime;
    }

    public void setDaaddtime(Date daaddtime) {
        this.daaddtime = daaddtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getDaaddperson() {
        return daaddperson;
    }

    public void setDaaddperson(String daaddperson) {
        this.daaddperson = daaddperson;
    }

    public String getDaupdateperson() {
        return daupdateperson;
    }

    public void setDaupdateperson(String daupdateperson) {
        this.daupdateperson = daupdateperson;
    }

    public Integer getKhid() {
        return khid;
    }

    public void setKhid(Integer khid) {
        this.khid = khid;
    }

    @Override
    public String toString() {
        return "Ksda{" +
                "daid=" + daid +
                ", stid=" + stid +
                ", dacontain='" + dacontain + '\'' +
                ", daaddtime=" + daaddtime +
                ", updatetime=" + updatetime +
                ", daaddperson='" + daaddperson + '\'' +
                ", daupdateperson='" + daupdateperson + '\'' +
                ", khid=" + khid +
                '}';
    }
}
