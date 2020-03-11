package com.hello.demo.web;

import com.hello.demo.entity.RecordTerm;
import com.hello.demo.service.RecordTermService;
import org.springframework.beans.factory.annotation.Autowired;
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
        modelMap.put("recordTermlist", list);
        return modelMap;
    }
}
