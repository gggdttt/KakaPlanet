package com.hello.demo.service;

import com.hello.demo.entity.Record;

import java.util.List;

public interface RecordService {
    List<Record> getRecordList();
    Record getRecordById(int userId);
    boolean addRecord(Record record);
    boolean modifyRecord(Record record);
    boolean deleteRecord(int userId);
}
