package com.hello.demo.dao;

import com.hello.demo.entity.IndexShowRecord;

import java.util.List;

public interface IndexShowRecordDao {
    List<IndexShowRecord> queryIndexShowRecord();
    List<IndexShowRecord> queryIndexShowRecordByWxId(String browser);
    IndexShowRecord queryIndexShowRecordById(int indexShowRecordId);
    int insertIndexShowRecord(IndexShowRecord indexShowRecord);
    int updateIndexShowRecord(IndexShowRecord indexShowRecord);
    int deleteIndexShowRecord(int indexShowRecordId);
}
