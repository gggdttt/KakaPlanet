package com.hello.demo.web;

import com.hello.demo.entity.UserInfo;
import com.hello.demo.service.UserInfoService;
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
        modelMap.put("userInfolist", list);
        return modelMap;
    }

    @RequestMapping(value = "/getuserInfobywxid",method = RequestMethod.GET)
    private Map<String, Object> getUserInfoByWxId(String userWxId){
        Map<String, Object> modelMap = new HashMap<String, Object>();
        UserInfo userInfo = userInfoService.getUserInfoByWxId(userWxId);
        modelMap.put("userInfo", userInfo);
        return modelMap;
    }
    @RequestMapping(value = "/queryuserbywxid",method = RequestMethod.GET)
    private Map<String, Object> queryUserByWxId(String userWxId){
        Map<String, Object> modelMap = new HashMap<String, Object>();
        modelMap.put("success", userInfoService.queryUserByWxId(userWxId));
        return modelMap;
    }

    @RequestMapping(value="/adduserInfo",method = RequestMethod.POST)
    private Map<String, Object> addUserInfo(@RequestBody UserInfo userInfo){
        Map<String, Object> modelMap = new HashMap<String, Object>();
        modelMap.put("success", userInfoService.addUserInfo(userInfo));
        return modelMap;
    }
}
