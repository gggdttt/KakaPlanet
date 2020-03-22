package com.hello.demo.web;

import com.hello.demo.entity.PreferList;
import com.hello.demo.service.PreferListService;

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
public class PreferListController {
    @Autowired
    private PreferListService preferListService;

    @RequestMapping(value = "/listpreferlist", method = RequestMethod.GET)
    private Map<String, Object> listPreferList(){
        Map<String, Object> modelMap = new HashMap<String, Object>();
        List<PreferList> list = preferListService.getPreferList();
        modelMap.put("preferlist", list);
        return modelMap;
    }

    @RequestMapping(value = "/getpreferlistbyid", method = RequestMethod.GET)
    private Map<String, Object> getPreferListById(String user_wx_id){
        Map<String, Object> modelMap = new HashMap<String, Object>();
        List<PreferList> list = preferListService.getPreferListById(user_wx_id);
        modelMap.put("preferlist", list);
        return modelMap;
    }
    @RequestMapping(value = "/insertpreferlist", method = RequestMethod.GET)
    private Map<String, Object> getPreferListById(String user_wx_id,String prefer_user_wx_id){
        Map<String, Object> modelMap = new HashMap<String, Object>();
        Integer result = preferListService.insertPreferList(user_wx_id,prefer_user_wx_id);
        modelMap.put("result", result);
        return modelMap;
    }
    @RequestMapping(value = "/deletepreferlist", method = RequestMethod.GET)
    private Map<String, Object> deletePreferList(String user_wx_id,String prefer_user_wx_id){
        Map<String, Object> modelMap = new HashMap<String, Object>();
        int result = preferListService.deletePreferList(user_wx_id,prefer_user_wx_id);
        modelMap.put("result", result);
        return modelMap;
    }

}
