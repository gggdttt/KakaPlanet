package com.hello.demo.service.impl;

import com.hello.demo.dao.RecordTermDao;
import com.hello.demo.entity.RecordTerm;
import com.hello.demo.service.RecordTermService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class recordTermServiceImpl implements RecordTermService {
    @Autowired
    private RecordTermDao recordTermDao;
    @Override
    public List<RecordTerm> getRecordTermList() {
        return recordTermDao.queryRecordTerm();
    }

    @Override
    public RecordTerm getRecordTermById(int userId) {
        return null;
    }

    @Override
    public boolean addRecordTerm(RecordTerm recordTerm) {
        return false;
    }

    @Override
    public boolean modifyRecordTerm(RecordTerm recordTerm) {
        return false;
    }

    @Override
    public boolean deleteRecordTerm(int userId) {
        return false;
    }
}
