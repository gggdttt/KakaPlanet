package com.hello.demo.service;

import com.hello.demo.entity.IndexShowRecord;

import java.util.List;

public interface IndexShowRecordService {
    List<IndexShowRecord> getIndexShowRecord();
    List<IndexShowRecord> getIndexShowRecordByWxId(String browser);
    IndexShowRecord getIndexShowRecordById(int indexShowRecordId);
    int addIndexShowRecord(IndexShowRecord indexShowRecord);
    int modifyIndexShowRecord(IndexShowRecord indexShowRecord);
    int deleteIndexShowRecord(int indexShowRecordId);
}
