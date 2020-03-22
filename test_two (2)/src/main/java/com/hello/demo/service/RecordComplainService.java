package com.hello.demo.service;

public interface RecordComplainService {

    int insertComplain( String record_ID,String wx_user_ID);
    int deleteComplain(String record_ID,String wx_user_ID);
}
