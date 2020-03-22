package com.hello.demo.entity;

public class RecordTerm {
    private String user_wx_id;

    private String record_time;

    private Integer term_id;

    private Integer record_term;

    private Integer record_day;

    private Integer help_count;

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

    public Integer getTerm_id() {
        return term_id;
    }

    public void setTerm_id(Integer term_id) {
        this.term_id = term_id;
    }

    public Integer getRecord_term() {
        return record_term;
    }

    public void setRecord_term(Integer record_term) {
        this.record_term = record_term;
    }

    public Integer getRecord_day() {
        return record_day;
    }

    public void setRecord_day(Integer record_day) {
        this.record_day = record_day;
    }

    public Integer getHelp_count() {
        return help_count;
    }

    public void setHelp_count(Integer help_count) {
        this.help_count = help_count;
    }
}
