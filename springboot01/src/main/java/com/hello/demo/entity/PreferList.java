package com.hello.demo.entity;
//本用户所关注的用户信息
public class PreferList {
    private String wxUserId;
    private String preferWxUserId;

    public String getWxUserId() {
        return wxUserId;
    }

    public void setWxUserId(String wxUserId) {
        this.wxUserId = wxUserId;
    }

    public String getPreferWxUserId() {
        return preferWxUserId;
    }

    public void setPreferWxUserId(String preferWxUserId) {
        this.preferWxUserId = preferWxUserId;
    }
}
