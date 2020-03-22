package com.hello.demo.service;

import com.hello.demo.entity.PreferList;

import java.util.List;

public interface PreferListService {
    List<PreferList> getPreferList();
    List<PreferList> getPreferListById(String userId);
    int insertPreferList(String wx_user_ID,String prefer_wx_user_ID);
    int deletePreferList( String wx_user_ID,String prefer_wx_user_ID);
}
