package com.hello.demo.service.impl;

import com.hello.demo.dao.IndexShowRecordDao;
import com.hello.demo.entity.IndexShowRecord;
import com.hello.demo.service.IndexShowRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IndexShowRecordServiceImpl implements IndexShowRecordService {

    @Autowired
    private IndexShowRecordDao indexShowRecordDao;
    @Override
    public List<IndexShowRecord> getIndexShowRecord() {
        return indexShowRecordDao.queryIndexShowRecord();
    }
    @Override
    public  List<IndexShowRecord> getIndexShowRecordByWxId(String browser)
    {
        return  indexShowRecordDao.queryIndexShowRecordByWxId(browser);
    }
    @Override
    public IndexShowRecord getIndexShowRecordById(int indexShowRecordId) {
        return null;
    }

    @Override
    public int addIndexShowRecord(IndexShowRecord indexShowRecord) {
        return 0;
    }

    @Override
    public int modifyIndexShowRecord(IndexShowRecord indexShowRecord) {
        return 0;
    }

    @Override
    public int deleteIndexShowRecord(int indexShowRecordId) {
        return 0;
    }
}
