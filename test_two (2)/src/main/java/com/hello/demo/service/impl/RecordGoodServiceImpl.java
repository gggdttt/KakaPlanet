package com.hello.demo.service.impl;


import com.hello.demo.dao.RecordGoodDao;
import com.hello.demo.service.RecordGoodService;
import com.hello.demo.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecordGoodServiceImpl  implements RecordGoodService {
    @Autowired
    RecordGoodDao recordGoodDao;

    @Override
    public int insertGood(String wx_user_open_ID, String record_ID) {
        return recordGoodDao.insertGood(wx_user_open_ID,record_ID);
    }

    @Override
    public int deleteGood(String wx_user_open_ID, String record_ID) {
        return recordGoodDao.deleteGood(wx_user_open_ID,record_ID);
    }
}
