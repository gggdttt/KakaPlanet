package com.hello.demo.dao;

import com.hello.demo.entity.RecordComplain;
import com.hello.demo.entity.RecordGood;

import java.util.List;

public interface RecordGoodDao {

    int insertGood(String user_wx_id,String record_id);
    int deleteGood(String user_wx_id,String record_id);
}
