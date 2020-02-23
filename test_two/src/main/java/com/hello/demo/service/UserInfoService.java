package com.hello.demo.service;

import com.hello.demo.entity.UserInfo;

import java.util.List;

public interface UserInfoService {
    List<UserInfo> getUserInfoList();
    UserInfo getUserInfoByWxId(String userWxId);
    boolean queryUserByWxId(String userWxId);
    boolean addUserInfo(UserInfo userInfo);
    boolean modifyUserInfo(UserInfo userInfo);
    boolean deleteUserInfo(int userId);
}
