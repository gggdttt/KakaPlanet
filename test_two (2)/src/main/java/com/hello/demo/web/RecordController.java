package com.hello.demo.web;

import com.hello.demo.entity.Record;
import com.hello.demo.service.RecordService;
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
public class RecordController {
    @Autowired
    private RecordService recordService;

    @RequestMapping(value = "/listrecord", method = RequestMethod.GET)
    private Map<String, Object> listRecord() {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        List<Record> list = recordService.getRecordList();
        modelMap.put("record_list", list);
        return modelMap;
    }

    @RequestMapping(value = "/getrecordbyid1", method = RequestMethod.GET)
    private Map<String, Object> getRecordById1(String user_wx_id){
        Map<String, Object> modelMap = new HashMap<String, Object>();
        List<Record> list = recordService.getRecordById1(user_wx_id);
        modelMap.put("record_list1", list);
        modelMap.put("user_wx_id",user_wx_id);
        return modelMap;
    }

    @RequestMapping(value = "/getrecordbyid", method = RequestMethod.GET)
    private Map<String, Object> getRecordById(String user_wx_id){
        Map<String, Object> modelMap = new HashMap<String, Object>();
        List<Record> list = recordService.getRecordById(user_wx_id);
        modelMap.put("record_list", list);
        modelMap.put("user_wx_id",user_wx_id);
        return modelMap;
    }

    @RequestMapping(value = "/getrecordbyid2", method = RequestMethod.GET)
    private Map<String, Object> getRecordById2(String user_wx_id){
        Map<String, Object> modelMap = new HashMap<String, Object>();
        List<Record> list = recordService.getRecordById2(user_wx_id);
        modelMap.put("record_list2", list);
        modelMap.put("user_wx_id",user_wx_id);
        return modelMap;
    }

    @RequestMapping(value = "addrecord", method = RequestMethod.POST)
    private Map<String, Object> addRecord(@RequestBody Record record){
        Map<String, Object> modelMap = new HashMap<String, Object>();
        modelMap.put("success", recordService.addRecord(record));
        return modelMap;
    }
}
