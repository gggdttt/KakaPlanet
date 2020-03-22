package com.hello.demo.web;

import com.hello.demo.entity.RecordTerm;
import com.hello.demo.service.RecordTermService;
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
public class RecordTermController {
    @Autowired
    private RecordTermService recordTermService;

    @RequestMapping(value = "/listrecordTerm", method = RequestMethod.GET)
    private Map<String, Object> listRecordTerm() {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        List<RecordTerm> list = recordTermService.getRecordTermList();
        modelMap.put("record_term_list", list);
        return modelMap;
    }

    @RequestMapping(value = "/getrecordTermbyid", method = RequestMethod.GET)
    private Map<String, Object> getRecordTermById(String user_wx_id){
        Map<String, Object> modelMap = new HashMap<String, Object>();
        List<RecordTerm> list = recordTermService.getRecordTermById(user_wx_id);
        modelMap.put("record_term", list);
        return modelMap;
    }

    @RequestMapping(value = "/addrecordTerm", method = RequestMethod.POST)
    private Map<String, Object> addRecordTerm(@RequestBody RecordTerm record_term){
        Map<String, Object> modelMap = new HashMap<String, Object>();
        modelMap.put("success", recordTermService.addRecordTerm(record_term));
        return modelMap;
    }

    @RequestMapping(value = "/modifyrecordTerm", method = RequestMethod.PATCH)
    private Map<String, Object> modifyRecordTerm(@RequestBody RecordTerm record_term){
        Map<String, Object> modelMap = new HashMap<String, Object>();
        modelMap.put("success", recordTermService.modifyRecordTerm(record_term));
        return modelMap;
    }
}
