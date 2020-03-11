package com.hello.demo.entity;

import java.util.Date;

public class TogetherRecord {
    private String userWxId;
    private String content;
    private Date time;
    private String targetUserWxId;
    private Integer id;

    public String getUserWxId() {
        return userWxId;
    }

    public void setUserWxId(String userWxId) {
        this.userWxId = userWxId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getTargetUserWxId() {
        return targetUserWxId;
    }

    public void setTargetUserWxId(String targetUserWxId) {
        this.targetUserWxId = targetUserWxId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
