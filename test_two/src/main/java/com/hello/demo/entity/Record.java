package com.hello.demo.entity;

import java.util.Date;

public class Record {
private String user_wx_ID;
private Date record_time;
private Integer record_ID;
private String content;
private Integer good_num_count;
private Integer complain_num_count;
private Integer type;

    public String getUser_wx_ID() {
        return user_wx_ID;
    }

    public void setUser_wx_ID(String user_wx_ID) {
        this.user_wx_ID = user_wx_ID;
    }

    public Date getRecord_time() {
        return record_time;
    }

    public void setRecord_time(Date record_time) {
        this.record_time = record_time;
    }

    public Integer getRecord_ID() {
        return record_ID;
    }

    public void setRecord_ID(Integer record_ID) {
        this.record_ID = record_ID;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getGood_num_count() {
        return good_num_count;
    }

    public void setGood_num_count(Integer good_num_count) {
        this.good_num_count = good_num_count;
    }

    public Integer getComplain_num_count() {
        return complain_num_count;
    }

    public void setComplain_num_count(Integer complain_num_count) {
        this.complain_num_count = complain_num_count;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}
