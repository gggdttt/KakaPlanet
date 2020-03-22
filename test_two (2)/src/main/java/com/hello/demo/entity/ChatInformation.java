package com.hello.demo.entity;

public class ChatInformation {
    private Integer id;

    private Integer sender_ID;

    private Integer receiver_ID;

    private String content;

    private Integer isRead;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSender_ID() {
        return sender_ID;
    }

    public void setSender_ID(Integer sender_ID) {
        this.sender_ID = sender_ID;
    }

    public Integer getReceiver_ID() {
        return receiver_ID;
    }

    public void setReceiver_ID(Integer receiver_ID) {
        this.receiver_ID = receiver_ID;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getIsRead() {
        return isRead;
    }

    public void setIsRead(Integer isRead) {
        this.isRead = isRead;
    }
}
