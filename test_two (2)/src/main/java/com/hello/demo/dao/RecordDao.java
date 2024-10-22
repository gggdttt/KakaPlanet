package com.hello.demo.dao;

import com.hello.demo.entity.Record;

import java.util.List;

public interface RecordDao {
    List<Record> queryRecord();
    List<Record> queryRecordById(String user_id);
    List<Record> queryRecordById1(String user_id);
    List<Record> queryRecordById2(String user_id);
    int insertRecord(Record record);
    int updateRecord(Record record);
    int deleteRecord(int record_id);
}
