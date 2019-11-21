package com.qst.examsystem.entity;

import org.apache.ibatis.type.Alias;

import java.util.Date;

/**
 * 答卷实体类
 */
@Alias("dj")
public class Dj {

    /**
     * 答卷
     */
    private int djid;

    /**
     * 考号
     */
    private int khid;

    /**
     * 试卷号
     */
    private int sjid;

    /**
     * 考生答案
     */
    private String ksda;

    /**
     * 得分
     */
    private  int score;

    /**
     * 是否已批卷
     */
    private String isreade;

    /**
     * 添加时间
     */
    private Date djaddtime;

    /**
     * 修改时间
     */
    private Date cupdatetime;

    /**
     * 添加人
     */
    private String caddperson;

    /**
     * 修改人
     */
    private String cupdateperson;

    public Dj() {
    }

    public Dj(int djid, int khid, int sjid, String ksda, int score, String isreade, Date djaddtime, Date cupdatetime, String caddperson, String cupdateperson) {
        this.djid = djid;
        this.khid = khid;
        this.sjid = sjid;
        this.ksda = ksda;
        this.score = score;
        this.isreade = isreade;
        this.djaddtime = djaddtime;
        this.cupdatetime = cupdatetime;
        this.caddperson = caddperson;
        this.cupdateperson = cupdateperson;
    }

    public int getDjid() {
        return djid;
    }

    public void setDjid(int djid) {
        this.djid = djid;
    }

    public int getKhid() {
        return khid;
    }

    public void setKhid(int khid) {
        this.khid = khid;
    }

    public int getSjid() {
        return sjid;
    }

    public void setSjid(int sjid) {
        this.sjid = sjid;
    }

    public String getKsda() {
        return ksda;
    }

    public void setKsda(String ksda) {
        this.ksda = ksda;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getIsreade() {
        return isreade;
    }

    public void setIsreade(String isreade) {
        this.isreade = isreade;
    }

    public Date getDjaddtime() {
        return djaddtime;
    }

    public void setDjaddtime(Date djaddtime) {
        this.djaddtime = djaddtime;
    }

    public Date getCupdatetime() {
        return cupdatetime;
    }

    public void setCupdatetime(Date cupdatetime) {
        this.cupdatetime = cupdatetime;
    }

    public String getCaddperson() {
        return caddperson;
    }

    public void setCaddperson(String caddperson) {
        this.caddperson = caddperson;
    }

    public String getCupdateperson() {
        return cupdateperson;
    }

    public void setCupdateperson(String cupdateperson) {
        this.cupdateperson = cupdateperson;
    }

    @Override
    public String toString() {
        return "Dj{" +
                "djid=" + djid +
                ", khid=" + khid +
                ", sjid=" + sjid +
                ", ksda='" + ksda + '\'' +
                ", score=" + score +
                ", isreade='" + isreade + '\'' +
                ", djaddtime=" + djaddtime +
                ", cupdatetime=" + cupdatetime +
                ", caddperson='" + caddperson + '\'' +
                ", cupdateperson='" + cupdateperson + '\'' +
                '}';
    }
//   答卷id
    private Integer djid;
//    考号id
    private Integer khid;
//    试卷id
    private Integer sjid;
//    考生答案
    private String ksda;
//    得分
    private Integer score;
//    是否已批阅
    private String isreade;
//    添加时间
    private Date djaddtime;
//    修改时间
    private Date djupdatetime;
//    添加人
    private String djaddperson;
//    修改人
    private String djupdateperson;

    public Dj() {
    }

    public Dj(Integer djid, Integer khid, Integer sjid, String ksda, Integer score, String isreade, Date djaddtime, Date djupdatetime, String djaddperson, String djupdateperson) {
        this.djid = djid;
        this.khid = khid;
        this.sjid = sjid;
        this.ksda = ksda;
        this.score = score;
        this.isreade = isreade;
        this.djaddtime = djaddtime;
        this.djupdatetime = djupdatetime;
        this.djaddperson = djaddperson;
        this.djupdateperson = djupdateperson;
    }

    public Integer getDjid() {
        return djid;
    }

    public void setDjid(Integer djid) {
        this.djid = djid;
    }

    public Integer getKhid() {
        return khid;
    }

    public void setKhid(Integer khid) {
        this.khid = khid;
    }

    public Integer getSjid() {
        return sjid;
    }

    public void setSjid(Integer sjid) {
        this.sjid = sjid;
    }

    public String getKsda() {
        return ksda;
    }

    public void setKsda(String ksda) {
        this.ksda = ksda;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getIsreade() {
        return isreade;
    }

    public void setIsreade(String isreade) {
        this.isreade = isreade;
    }

    public Date getDjaddtime() {
        return djaddtime;
    }

    public void setDjaddtime(Date djaddtime) {
        this.djaddtime = djaddtime;
    }

    public Date getDjupdatetime() {
        return djupdatetime;
    }

    public void setDjupdatetime(Date djupdatetime) {
        this.djupdatetime = djupdatetime;
    }

    public String getDjaddperson() {
        return djaddperson;
    }

    public void setDjaddperson(String djaddperson) {
        this.djaddperson = djaddperson;
    }

    public String getDjupdateperson() {
        return djupdateperson;
    }

    public void setDjupdateperson(String djupdateperson) {
        this.djupdateperson = djupdateperson;
    }

    @Override
    public String toString() {
        return "Dj{" +
                "djid=" + djid +
                ", khid=" + khid +
                ", sjid=" + sjid +
                ", ksda='" + ksda + '\'' +
                ", score=" + score +
                ", isreade='" + isreade + '\'' +
                ", djaddtime=" + djaddtime +
                ", djupdatetime=" + djupdatetime +
                ", djaddperson='" + djaddperson + '\'' +
                ", djupdateperson='" + djupdateperson + '\'' +
                '}';
    }
}
