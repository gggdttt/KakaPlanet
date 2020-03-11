package com.hello.demo.dao;

import com.hello.demo.entity.ChatInformation;

import java.util.List;

public interface ChatInformationDao {
    List<ChatInformation> queryChatInformation();
    ChatInformation queryChatInformationById(int id);
    int insertChatInformation(ChatInformation chatInformation);
    int updateChatInformation(ChatInformation chatInformation);
    int deleteChatInformation(int id);
}
