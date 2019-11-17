package com.qst.examsystem.entity;

import org.apache.ibatis.type.Alias;

import java.util.Date;

/**
 * 课程表实体类
 */
@Alias("course")
public class Course {
    /**
     * 课程号
     */
    private int cid;
    /**
     * 课程名称
     */
    private String cname;
    /**
     * 专业名称
     */
    private String zyname;
    /**
     * 任课老师
     */
    private String tname;
    /**
     * 添加时间
     */
    private Date caddtime;
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

    public Course() {
    }

    public Course(int cid, String cname, String zyname, String tname, Date caddtime, Date cupdatetime, String caddperson, String cupdateperson) {
        this.cid = cid;
        this.cname = cname;
        this.zyname = zyname;
        this.tname = tname;
        this.caddtime = caddtime;
        this.cupdatetime = cupdatetime;
        this.caddperson = caddperson;
        this.cupdateperson = cupdateperson;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getZyname() {
        return zyname;
    }

    public void setZyname(String zyname) {
        this.zyname = zyname;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public Date getCaddtime() {
        return caddtime;
    }

    public void setCaddtime(Date caddtime) {
        this.caddtime = caddtime;
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
        return "Course{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                ", zyname='" + zyname + '\'' +
                ", tname='" + tname + '\'' +
                ", caddtime=" + caddtime +
                ", cupdatetime=" + cupdatetime +
                ", caddperson='" + caddperson + '\'' +
                ", cupdateperson='" + cupdateperson + '\'' +
                '}';
    }
}
