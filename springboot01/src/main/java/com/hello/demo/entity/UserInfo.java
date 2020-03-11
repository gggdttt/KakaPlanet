package com.hello.demo.entity;

import javax.swing.*;

public class UserInfo {
    private String userWxId;
    private String userImageUrl;
    private String userName;
    private Integer estate;

    public String getUserWxId() {
        return userWxId;
    }

    public void setUserWxId(String userWxId) {
        this.userWxId = userWxId;
    }

    public String getUserImageUrl() {
        return userImageUrl;
    }

    public void setUserImageUrl(String userImageUrl) {
        this.userImageUrl = userImageUrl;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getEstate() {
        return estate;
    }

    public void setEstate(Integer estate) {
        this.estate = estate;
    }
}
