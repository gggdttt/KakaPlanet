package com.hello.demo.dao;

import com.hello.demo.entity.PreferList;

import java.util.List;

public interface PreferListDao {
    List<PreferList> queryPreferList();
    List<PreferList> queryPreferListById(String user_wx_id);
    int insertPreferList(String user_wx_id,String prefer_user_wx_id);
    int deletePreferList(String user_wx_id,String prefer_user_wx_id);
}
