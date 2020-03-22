package com.hello.demo.service.impl;

import com.hello.demo.dao.RecordComplainDao;
import com.hello.demo.entity.Record;
import com.hello.demo.service.RecordComplainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecordComplainServiceImpl  implements RecordComplainService {
    @Autowired
    private RecordComplainDao recordComplainDao;

@Override
public int insertComplain(String record_ID, String wx_user_ID)
{
    return recordComplainDao.insertComplain(record_ID,wx_user_ID);
}
@Override
    public int deleteComplain(String record_ID, String wx_user_ID){
    return recordComplainDao.deleteComplain(record_ID,wx_user_ID);
    }
}
