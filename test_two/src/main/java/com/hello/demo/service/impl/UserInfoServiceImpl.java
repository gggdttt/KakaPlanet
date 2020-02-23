package com.hello.demo.service.impl;

import com.hello.demo.dao.UserInfoDao;
import com.hello.demo.entity.UserInfo;
import com.hello.demo.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    private UserInfoDao userInfoDao;
    @Override
    public List<UserInfo> getUserInfoList() {
        return userInfoDao.queryUserInfo();
    }

    @Override
    public UserInfo getUserInfoByWxId(String userWxId) {
        return userInfoDao.queryUserInfoByWxId(userWxId);
    }

    @Override
    public boolean queryUserByWxId(String userWxId) {
        int effectedNum = userInfoDao.queryUserByWxId(userWxId);
        if(effectedNum > 0){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean addUserInfo(UserInfo userInfo) {
        int effectedNum = userInfoDao.insertUserInfo(userInfo);
        if( effectedNum > 0){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean modifyUserInfo(UserInfo userInfo) {
        return false;
    }

    @Override
    public boolean deleteUserInfo(int userId) {
        return false;
    }
}
