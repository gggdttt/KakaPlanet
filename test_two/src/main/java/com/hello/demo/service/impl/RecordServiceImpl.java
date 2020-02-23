package com.hello.demo.service.impl;

import com.hello.demo.dao.RecordDao;
import com.hello.demo.entity.Record;
import com.hello.demo.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RecordServiceImpl implements RecordService {
    @Autowired
    private RecordDao recordDao;
    @Override
    public List<Record> getRecordList() {
        return recordDao.queryRecord();
    }

    @Override
    public Record getRecordById(int userId) {
        return recordDao.queryRecordById(userId);
    }

    @Override
    public boolean addRecord(Record record) {
        return recordDao.insertRecord(record);
    }

    @Override
    public int modifyRecord(Record record) {
        return recordDao.updateRecord(record);
    }

    @Override
    public int deleteRecord(int userId) {
        return recordDao.deleteRecord(userId);
    }
}
