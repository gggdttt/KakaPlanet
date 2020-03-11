package com.hello.demo.entity;


import java.util.Date;

public class RecordTerm {
    private Integer termId;//
    private String userWxId;//
    private Integer recordTerm;//第几期打卡
    private Date recordTime;//
    private Integer recordDay;//连续打卡的天数

    public Integer getTermId() {
        return termId;
    }

    public void setTermId(Integer termId) {
        this.termId = termId;
    }

    public String getUserWxId() {
        return userWxId;
    }

    public void setUserWxId(String userWxId) {
        this.userWxId = userWxId;
    }

    public Integer getRecordTerm() {
        return recordTerm;
    }

    public void setRecordTerm(Integer recordTerm) {
        this.recordTerm = recordTerm;
    }

    public Date getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(Date recordTime) {
        this.recordTime = recordTime;
    }

    public Integer getRecordDay() {
        return recordDay;
    }

    public void setRecordDay(Integer recordDay) {
        this.recordDay = recordDay;
    }
}
