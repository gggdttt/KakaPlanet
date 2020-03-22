package com.hello.demo.web;

import com.hello.demo.entity.Together;
import com.hello.demo.service.TogetherService;

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
public class TogetherController {
    @Autowired
    private TogetherService togetherService;

    @RequestMapping(value = "/listtogether", method = RequestMethod.GET)
    private Map<String, Object> listTogether(){
        Map<String, Object> modelMap = new HashMap<String, Object>();
        List<Together> list = togetherService.getTogetherList();
        modelMap.put("together_list", list);
        return modelMap;
    }

    @RequestMapping(value = "/gettogetherbyid", method = RequestMethod.GET)
    private Map<String, Object> getTogetherById(String user_wx_id){
        Map<String, Object> modelMap = new HashMap<String, Object>();
        List<Together> list = togetherService.getTogetherById(user_wx_id);
        modelMap.put("together", list);
        return modelMap;
    }
    @RequestMapping(value = "/gettogetherbytarget", method = RequestMethod.GET)
    private Map<String, Object> getTogetherByTarget(String user_wx_id,String target_user_wx_id){
        Map<String, Object> modelMap = new HashMap<String, Object>();
        List<Together> list = togetherService.getTogetherByTarget(user_wx_id,target_user_wx_id);
        modelMap.put("together", list);
        return modelMap;
    }

    @RequestMapping(value = "addtogether", method = RequestMethod.POST)
    private Map<String, Object> addTogether(@RequestBody Together together){
        Map<String, Object> modelMap = new HashMap<String, Object>();
        modelMap.put("success", togetherService.addTogether(together));
        return modelMap;
    }
}
