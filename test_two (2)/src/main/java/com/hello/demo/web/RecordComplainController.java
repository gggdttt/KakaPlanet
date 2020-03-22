package com.hello.demo.web;


import com.hello.demo.service.RecordComplainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/superadmin")
public class RecordComplainController {
    @Autowired
    RecordComplainService recordComplainService;

    @RequestMapping(value="/insertcomplain", method = RequestMethod.GET)
    private Map<String, Object> insertComplain(String record_id,String user_wx_id){
        Map<String, Object> modelMap = new HashMap<String, Object>();
        int result = recordComplainService.insertComplain(record_id,user_wx_id);
        modelMap.put("result", result);
        return modelMap;
    }

    @RequestMapping(value="/deletecomplain", method = RequestMethod.GET)
    private Map<String, Object> deleteComplain(String record_id,String user_wx_id){
        Map<String, Object> modelMap = new HashMap<String, Object>();
        int result = recordComplainService.deleteComplain(record_id,user_wx_id);
        modelMap.put("result", result);
        return modelMap;
    }
}
