package com.hello.demo.entity;

import java.sql.Date;

public class Record {
    private String user_wx_id;
    private String record_time;
    private Integer record_id;
    private String content;
    private Integer good_num_count;
    private Integer complain_num_count;
    private Integer type1;
    private Integer type2;

    public String getUser_wx_id() {
        return user_wx_id;
    }

    public void setUser_wx_id(String user_wx_id) {
        this.user_wx_id = user_wx_id;
    }

    public String getRecord_time() {
        return record_time;
    }

    public void setRecord_time(String record_time) {
        this.record_time = record_time;
    }

    public Integer getRecord_id() {
        return record_id;
    }

    public void setRecord_id(Integer record_id) {
        this.record_id = record_id;
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
}