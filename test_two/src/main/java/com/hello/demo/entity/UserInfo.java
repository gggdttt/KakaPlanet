package com.hello.demo.entity;

public class UserInfo {
private Integer user_ID;
private String user_wx_ID;
private String user_image_url;
private String user_name;
private Integer estate;

    public Integer getUser_ID() {
        return user_ID;
    }

    public void setUser_ID(Integer user_ID) {
        this.user_ID = user_ID;
    }

    public String getUser_wx_ID() {
        return user_wx_ID;
    }

    public void setUser_wx_ID(String user_wx_ID) {
        this.user_wx_ID = user_wx_ID;
    }

    public String getUser_image_url() {
        return user_image_url;
    }

    public void setUser_image_url(String user_image_url) {
        this.user_image_url = user_image_url;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public Integer getEstate() {
        return estate;
    }

    public void setEstate(Integer estate) {
        this.estate = estate;
    }
}
