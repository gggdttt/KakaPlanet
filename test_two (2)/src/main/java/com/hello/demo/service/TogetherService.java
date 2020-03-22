package com.hello.demo.service;

import com.hello.demo.entity.Together;

import java.util.List;

public interface TogetherService {
    List<Together> getTogetherList();
    List<Together> getTogetherById(String userWxId);
    boolean addTogether(Together together);
    List<Together> getTogetherByTarget(String user_wx_ID,String target_user_wx_ID);
}
