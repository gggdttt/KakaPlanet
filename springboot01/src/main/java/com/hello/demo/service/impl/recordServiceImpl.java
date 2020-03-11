package com.hello.demo.service.impl;

import com.hello.demo.dao.RecordDao;
import com.hello.demo.entity.Record;
import com.hello.demo.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class recordServiceImpl implements RecordService {
    @Autowired
    private RecordDao recordDao;
    @Override
    public List<Record> getRecordList() {
        return recordDao.queryRecord();
    }

    @Override
    public Record getRecordById(int userId) {
        return null;
    }

    @Override
    public boolean addRecord(Record record) {
        return false;
    }

    @Override
    public boolean modifyRecord(Record record) {
        return false;
    }

    @Override
    public boolean deleteRecord(int userId) {
        return false;
    }
}
