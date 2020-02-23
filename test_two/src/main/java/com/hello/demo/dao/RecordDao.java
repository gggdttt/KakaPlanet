package com.hello.demo.dao;

import com.hello.demo.entity.Record;

import java.util.List;

public interface RecordDao {
    List<Record> queryRecord();
    Record queryRecordById(int recordId);
    boolean insertRecord(Record record);
    int updateRecord(Record record);
    int deleteRecord(int recordId);
}
