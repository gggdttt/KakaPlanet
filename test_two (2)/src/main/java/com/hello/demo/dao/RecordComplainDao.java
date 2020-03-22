package com.hello.demo.dao;

import com.hello.demo.entity.RecordComplain;

import java.util.List;

public interface RecordComplainDao {
    int insertComplain( String record_id,String user_wx_id);
    int deleteComplain(String record_id,String user_wx_id);
}
