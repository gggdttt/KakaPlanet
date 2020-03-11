package com.hello.demo.dao;

import com.hello.demo.entity.RecordTerm;

import java.util.List;

public interface RecordTermDao {
    List<RecordTerm> queryRecordTerm();
    RecordTerm queryRecordTermById(int userId);
    int insertRecordTerm(RecordTerm recordTerm);
    int updateRecordTerm(RecordTerm recordTerm);
    int deleteRecordTerm(int userId);
}
