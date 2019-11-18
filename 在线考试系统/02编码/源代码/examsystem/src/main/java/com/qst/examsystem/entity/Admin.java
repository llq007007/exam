package com.qst.examsystem.entity;

import org.apache.ibatis.type.Alias;

/**
 * 管理员实体类
 * 编号 adid ，用户名 adname ，密码 adpw ，权限 qx(1,2)
 */
@Alias("admin")
public class Admin {
    Integer adid;
    String adname;
    String adpw;
    String qx;

    public Admin() {
    }

    public Admin(Integer adid, String adname, String adpw, String qx) {
        this.adid = adid;
        this.adname = adname;
        this.adpw = adpw;
        this.qx = qx;
    }

    public Integer getAdid() {
        return adid;
    }

    public void setAdid(Integer adid) {
        this.adid = adid;
    }

    public String getAdname() {
        return adname;
    }

    public void setAdname(String adname) {
        this.adname = adname;
    }

    public String getAdpw() {
        return adpw;
    }

    public void setAdpw(String adpw) {
        this.adpw = adpw;
    }

    public String getQx() {
        return qx;
    }

    public void setQx(String qx) {
        this.qx = qx;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "adid=" + adid +
                ", adname='" + adname + '\'' +
                ", adpw='" + adpw + '\'' +
                ", qx='" + qx + '\'' +
                '}';
    }
}
