package com.hello.demo.web;

import com.hello.demo.entity.UserInfo;
import com.hello.demo.service.UserInfoService;
import org.hibernate.validator.constraints.pl.REGON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/superadmin")
public class UserInfoController {
    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping(value = "/listuserInfo", method = RequestMethod.GET)
    private Map<String, Object> listUserInfo() {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        List<UserInfo> list = userInfoService.getUserInfoList();
        modelMap.put("user_info_list", list);
        return modelMap;
    }

    @RequestMapping(value = "/getuserInfobywxid",method = RequestMethod.GET)
    private Map<String, Object> getUserInfoByWxId(String user_wx_id){
        Map<String, Object> modelMap = new HashMap<String, Object>();
        UserInfo userInfo = userInfoService.getUserInfoByWxId(user_wx_id);
        modelMap.put("user_info", userInfo);
        return modelMap;
    }
    @RequestMapping(value = "/queryuserbywxid",method = RequestMethod.GET)
    private Map<String, Object> queryUserByWxId(String user_wx_id){
        Map<String, Object> modelMap = new HashMap<String, Object>();
        modelMap.put("success", userInfoService.queryUserByWxId(user_wx_id));
        return modelMap;
    }

    @RequestMapping(value="/addUserInfo",method = RequestMethod.POST)
    private Map<String, Object> addUserInfo(@RequestBody UserInfo user_info){
        Map<String, Object> modelMap = new HashMap<String, Object>();
        modelMap.put("success", userInfoService.addUserInfo(user_info));
        return modelMap;
    }
}
  