package com.hello.demo.web;

import com.hello.demo.entity.IndexShowRecord;
import com.hello.demo.service.IndexShowRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/superadmin")
public class IndexShowRecordController {
    @Autowired
    private IndexShowRecordService indexShowRecordService;

    @RequestMapping(value="/getIndexShowRecord", method = RequestMethod.GET)
    private Map<String, Object> getIndexShwoRecord(String user_wx_id){
        Map<String, Object> modelMap = new HashMap<String, Object>();
        List<IndexShowRecord> list = indexShowRecordService.getIndexShowRecordByWxId(user_wx_id);
        modelMap.put("indexShowRecordService", list);
        return modelMap;
    }
}
