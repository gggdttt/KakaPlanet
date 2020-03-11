package com.hello.demo.entity;

import java.sql.Date;
//用户的打卡记录
public class Record {
    private Integer userWxId;
    private Date recordTime;
    private Integer recordId;
    private String content;
    private Integer goodNumCount;
    private Integer complainNumCount;
    private Integer type1;//大种类（晚安咔/健康咔）
    private Integer type2;//更细的分类（笑对咔/彩虹咔/boring咔）

    public Integer getComplainNumCount() {
        return complainNumCount;
    }

    public void setComplainNumCount(Integer complainNumCount) {
        this.complainNumCount = complainNumCount;
    }

    public Integer getType1() {
        return type1;
    }

    public void setType1(Integer type1) {
        this.type1 = type1;
    }

    public Integer getType2() {
        return type2;
    }

    public void setType2(Integer type2) {
        this.type2 = type2;
    }

    public Integer getUserWxId() {
        return userWxId;
    }

    public void setUserWxId(Integer userWxId) {
        this.userWxId = userWxId;
    }

    public Date getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(Date recordTime) {
        this.recordTime = recordTime;
    }

    public Integer getRecordId() {
        return recordId;
    }

    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


    public Integer getGoodNumCount() {
        return goodNumCount;
    }

    public void setGoodNumCount(Integer goodNumCount) {
        this.goodNumCount = goodNumCount;
    }


}
