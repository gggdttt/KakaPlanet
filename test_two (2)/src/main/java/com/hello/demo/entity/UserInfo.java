package com.hello.demo.entity;

public class UserInfo {
    private String user_wx_id;

    private String user_image_url;

    private String user_name;

    public String getUser_wx_id() {
        return user_wx_id;
    }

    public void setUser_wx_id(String user_wx_id) {
        this.user_wx_id = user_wx_id;
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

    public int getEstate() {
        return estate;
    }

    public void setEstate(int estate) {
        this.estate = estate;
    }

    private int estate;

}
