package com.qst.examsystem.entity;

import org.apache.ibatis.type.Alias;

@Alias("ks")
public class Ks {
    private Integer ksid;
    private Integer sjid;
    private String kcname;
    private Integer zyid;

    public Ks() {
    }

    public Ks(Integer ksid, Integer sjid, String kcname, Integer zyid) {
        this.ksid = ksid;
        this.sjid = sjid;
        this.kcname = kcname;
        this.zyid = zyid;
    }

    public Integer getKsid() {
        return ksid;
    }

    public void setKsid(Integer ksid) {
        this.ksid = ksid;
    }

    public Integer getSjid() {
        return sjid;
    }

    public void setSjid(Integer sjid) {
        this.sjid = sjid;
    }

    public String getKcname() {
        return kcname;
    }

    public void setKcname(String kcname) {
        this.kcname = kcname;
    }

    public Integer getZyid() {
        return zyid;
    }

    public void setZyid(Integer zyid) {
        this.zyid = zyid;
    }

    @Override
    public String toString() {
        return "Ks{" +
                "ksid=" + ksid +
                ", sjid=" + sjid +
                ", kcname='" + kcname + '\'' +
                ", zyid=" + zyid +
                '}';
    }
}
