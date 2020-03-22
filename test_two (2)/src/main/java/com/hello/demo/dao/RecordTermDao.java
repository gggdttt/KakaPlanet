package com.hello.demo.dao;

import com.hello.demo.entity.RecordTerm;

import java.util.List;

public interface RecordTermDao {
    List<RecordTerm> queryRecordTerm();
    List<RecordTerm> queryRecordTermById(String user_wx_id);
    int insertRecordTerm(RecordTerm record_term);
    int updateRecordTerm(RecordTerm record_term);
}
