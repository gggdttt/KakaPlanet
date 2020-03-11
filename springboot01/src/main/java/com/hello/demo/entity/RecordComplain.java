package com.hello.demo.entity;
//举报该条打卡
public class RecordComplain {
    private Integer recordId;
    private String userWxId;

    public Integer getRecordId() {
        return recordId;
    }

    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

    public String getUserWxId() {
        return userWxId;
    }

    public void setUserWxId(String userWxId) {
        this.userWxId = userWxId;
    }
}
