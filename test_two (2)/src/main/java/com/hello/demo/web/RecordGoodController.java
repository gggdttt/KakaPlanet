package com.hello.demo.web;

import com.hello.demo.service.RecordGoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/superadmin")
public class RecordGoodController {
    @Autowired
    private RecordGoodService recordGoodService;

    @RequestMapping(value="/insertgood", method = RequestMethod.GET)
    private Map<String, Object> insertGood( String user_wx_id,String record_id){
        Map<String, Object> modelMap = new HashMap<String, Object>();
        int result  = recordGoodService.insertGood(user_wx_id,record_id);
        modelMap.put("result", result);
        return modelMap;
    }

    @RequestMapping(value="/deletegood", method = RequestMethod.GET)
    private Map<String, Object> deleteGood( String user_wx_id,String record_id){
        Map<String, Object> modelMap = new HashMap<String, Object>();
        int result = recordGoodService.deleteGood(user_wx_id,record_id);
        modelMap.put("result", result);
        return modelMap;
    }
}
