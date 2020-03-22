package com.hello.demo.service;

import com.hello.demo.entity.Record;

import java.util.List;

public interface RecordService {
    List<Record> getRecordList();
    List<Record> getRecordById1(String userId);
    List<Record> getRecordById2(String userId);
    List<Record> getRecordById(String userId);
    boolean addRecord(Record record);
    boolean modifyRecord(Record record);
    boolean deleteRecord(int userId);
}
