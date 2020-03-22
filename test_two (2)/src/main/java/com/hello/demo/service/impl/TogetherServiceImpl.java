package com.hello.demo.service.impl;

import com.hello.demo.dao.TogetherDao;
import com.hello.demo.entity.Together;
import com.hello.demo.service.TogetherService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class TogetherServiceImpl implements TogetherService {
    
    @Autowired
    private TogetherDao togetherDao;
    
    @Override
    public List<Together> getTogetherList() {
        return togetherDao.queryTogether();
    }

    @Override
    public List<Together> getTogetherById(String userWxId) {
        return togetherDao.queryTogetherById(userWxId);
    }


    @Transactional
    @Override
    public boolean addTogether(Together together) {

                int effectedNum = togetherDao.insertTogether(together);
                if(effectedNum>0){
                    return true;
                }else {
                    return false;
                }


    }

    @Override
    public List<Together> getTogetherByTarget(String user_wx_ID, String target_user_wx_ID) {
        return togetherDao.queryTogetherByTarget(user_wx_ID,target_user_wx_ID);
    }
}
