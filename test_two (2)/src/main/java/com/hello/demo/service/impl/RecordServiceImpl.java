package com.hello.demo.service.impl;

import com.hello.demo.dao.RecordDao;
import com.hello.demo.entity.Record;
import com.hello.demo.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
    public List<Record> getRecordById1(String userId) {
        return recordDao.queryRecordById1(userId);
    }

    @Override
    public List<Record> getRecordById2(String userId) {
        return recordDao.queryRecordById2(userId);
    }

    @Override
    public List<Record> getRecordById(String userId) {
        return recordDao.queryRecordById(userId);
    }

    @Transactional
    @Override
    public boolean addRecord(Record record) {

                int effectedNum = recordDao.insertRecord(record);
                if(effectedNum>0){
                    return true;
                } else {
                    return false;
                }



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
