package com.hello.demo.dao;

import com.hello.demo.entity.UserInfo;

import java.util.List;

public interface UserInfoDao {
    List<UserInfo> queryUserInfo();
    UserInfo queryUserInfoByWxId(String userWxId);
    int queryUserByWxId(String userWxId);
    int insertUserInfo(UserInfo userInfo);
    int updateImage(int userImageId);
}
