package com.hello.demo.service;

import com.hello.demo.entity.Record;

import java.util.List;

public interface RecordService {
    List<Record> getRecordList();
    Record getRecordById(int userId);
    boolean addRecord(Record record);
    int modifyRecord(Record record);
    int deleteRecord(int userId);
}
