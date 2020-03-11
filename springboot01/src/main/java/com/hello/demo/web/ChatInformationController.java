package com.hello.demo.web;

import com.hello.demo.entity.ChatInformation;
import com.hello.demo.service.ChatInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/superadmin")
public class ChatInformationController {
    @Autowired
    private ChatInformationService chatInformationService;

    @RequestMapping(value = "/listchatInformation", method = RequestMethod.GET)
    private Map<String, Object> listChatInformation() {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        List<ChatInformation> list = chatInformationService.getChatInformationList();
        modelMap.put("chatInformationlist", list);
        return modelMap;
    }
}
