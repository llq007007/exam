package com.qst.examsystem.entity;

import org.apache.ibatis.type.Alias;

import java.io.FileInputStream;

@Alias("User")
public class User {
    Integer userid;
    String username;
    String password;
    String image;

    public User() {
    }

    public User(Integer userid, String username, String password, String image) {
        this.userid = userid;
        this.username = username;
        this.password = password;
        this.image = image;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "User{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}
