package com.hello.demo.web;

import com.hello.demo.entity.Record;
import com.hello.demo.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
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
        modelMap.put("recordlist", list);
        return modelMap;
    }
}
