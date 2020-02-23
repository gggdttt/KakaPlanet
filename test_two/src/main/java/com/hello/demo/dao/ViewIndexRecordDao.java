package com.hello.demo.dao;

import com.hello.demo.entity.ViewIndexRecord;

import java.util.List;

public interface ViewIndexRecordDao {
    List<ViewIndexRecordDao> queryViewIndexRecord();
    ViewIndexRecordDao queryViewIndexRecordById(int viewIndexRecordId);
    int insertViewIndexRecord(ViewIndexRecord viewIndexRecord);
    int updateViewIndexRecord(ViewIndexRecord viewIndexRecord);
    int deleteViewIndexRecord(int viewIndexRecordId);

}