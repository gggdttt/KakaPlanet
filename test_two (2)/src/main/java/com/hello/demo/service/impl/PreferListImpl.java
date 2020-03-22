package com.hello.demo.service.impl;

import com.hello.demo.dao.PreferListDao;
import com.hello.demo.entity.PreferList;
import com.hello.demo.service.PreferListService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PreferListImpl implements PreferListService {

    @Autowired
    private PreferListDao preferListDao;


    @Override
    public List<PreferList> getPreferList() {
        return preferListDao.queryPreferList();
    }

    @Override
    public List<PreferList> getPreferListById(String userId) {
        return preferListDao.queryPreferListById(userId);
    }

    @Override
    public int insertPreferList(String wx_user_ID,String prefer_wx_user_ID) {
        return preferListDao.insertPreferList(wx_user_ID,prefer_wx_user_ID);
    }

    @Override
    public int deletePreferList(String wx_user_ID,String prefer_wx_user_ID) {
        return preferListDao.deletePreferList(wx_user_ID,prefer_wx_user_ID);
    }
}
