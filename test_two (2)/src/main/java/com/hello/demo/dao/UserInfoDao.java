package com.hello.demo.dao;

import com.hello.demo.entity.UserInfo;

import java.util.List;

public interface UserInfoDao {
    List<UserInfo> queryUserInfo();
    UserInfo queryUserInfoByWxId(String user_wx_id);
    int queryUserByWxId(String user_wx_id);
    int insertUserInfo(UserInfo user_info);
}
