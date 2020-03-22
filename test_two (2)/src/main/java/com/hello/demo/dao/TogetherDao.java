package com.hello.demo.dao;

import com.hello.demo.entity.Together;

import java.util.List;

public interface TogetherDao {
    List<Together> queryTogether();
    List<Together> queryTogetherById(String user_wx_id);
    int insertTogether(Together together);
    List<Together>queryTogetherByTarget(String user_wx_id,String target_user_wx_id);
}
