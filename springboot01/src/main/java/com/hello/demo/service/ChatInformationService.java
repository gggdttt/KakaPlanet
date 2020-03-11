package com.hello.demo.service;

import com.hello.demo.entity.ChatInformation;

import java.util.List;

public interface ChatInformationService {
    List<ChatInformation> getChatInformationList();
    ChatInformation getChatInformationById(int id);
    boolean addChatInformation(ChatInformation chatInformation);
    boolean modifyChatInformation(ChatInformation chatInformation);
    boolean deleteChatInformation(int id);
}
