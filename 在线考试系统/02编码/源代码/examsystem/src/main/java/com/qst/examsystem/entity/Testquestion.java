package com.qst.examsystem.entity;

import org.apache.ibatis.type.Alias;

import java.sql.Date;

/**
 * 试题实体类
 */
@Alias("testquestion")
public class Testquestion {
    /**
     * 试题id
     */
    private Integer stid;
    /**
     * 课程id
     */
    private Integer cid;
    /**
     *题型
     */
    private String type1;
    /**
     * 题目内容
     */
    private String contain;
    /**
     * 答案
     */
    private String answer;
    /**
     * 分值
     */
    private Integer degree;
    /**
     * 出题老师id
     */
    private Integer tid;
    /**
     * 添加时间
     */
    private Date staddtime;
    /**
     * 修改时间
     */
    private Date stupdatetime;
    /**
     * 添加人
     */
    private String staddperson;
    /**
     *修改人
     */
    private String stupdateperson;

    /**
     * 无参构造
     */
    public Testquestion() {
    }

    public Testquestion(Integer stid, Integer cid, String type1, String contain, String answer, Integer degree, Integer tid, Date staddtime, Date stupdatetime, String staddperson, String stupdateperson) {
        this.stid = stid;
        this.cid = cid;
        this.type1 = type1;
        this.contain = contain;
        this.answer = answer;
        this.degree = degree;
        this.tid = tid;
        this.staddtime = staddtime;
        this.stupdatetime = stupdatetime;
        this.staddperson = staddperson;
        this.stupdateperson = stupdateperson;
    }

    public Integer getStid() {
        return stid;
    }

    public void setStid(Integer stid) {
        this.stid = stid;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getType1() {
        return type1;
    }

    public void setType1(String type1) {
        this.type1 = type1;
    }

    public String getContain() {
        return contain;
    }

    public void setContain(String contain) {
        this.contain = contain;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Integer getDegree() {
        return degree;
    }

    public void setDegree(Integer degree) {
        this.degree = degree;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public Date getStaddtime() {
        return staddtime;
    }

    public void setStaddtime(Date staddtime) {
        this.staddtime = staddtime;
    }

    public Date getStupdatetime() {
        return stupdatetime;
    }

    public void setStupdatetime(Date stupdatetime) {
        this.stupdatetime = stupdatetime;
    }

    public String getStaddperson() {
        return staddperson;
    }

    public void setStaddperson(String staddperson) {
        this.staddperson = staddperson;
    }

    public String getStupdateperson() {
        return stupdateperson;
    }

    public void setStupdateperson(String stupdateperson) {
        this.stupdateperson = stupdateperson;
    }
}
