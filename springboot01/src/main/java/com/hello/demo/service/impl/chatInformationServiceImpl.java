package com.hello.demo.service.impl;

import com.hello.demo.dao.ChatInformationDao;
import com.hello.demo.entity.ChatInformation;
import com.hello.demo.service.ChatInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class chatInformationServiceImpl implements ChatInformationService {
    @Autowired
    private ChatInformationDao chatInformationDao;

    @Override
    public List<ChatInformation> getChatInformationList() {
        return chatInformationDao.queryChatInformation();
    }

    @Override
    public ChatInformation getChatInformationById(int id) {
        return null;
    }

    @Override
    public boolean addChatInformation(ChatInformation chatInformation) {
        return false;
    }

    @Override
    public boolean modifyChatInformation(ChatInformation chatInformation) {
        return false;
    }

    @Override
    public boolean deleteChatInformation(int id) {
        return false;
    }
}
