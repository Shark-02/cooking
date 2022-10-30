package com.example.cooking.Data_view;

public class Chat_member {
    public int headImg_id;
    public String chatName;

    public int getHeadImg_id() {
        return headImg_id;
    }

    public void setHeadImg_id(int headImg_id) {
        this.headImg_id = headImg_id;
    }

    public String getChatName() {
        return chatName;
    }

    public void setChatName(String chatName) {
        this.chatName = chatName;
    }

    public String getChatContent() {
        return chatContent;
    }

    public void setChatContent(String chatContent) {
        this.chatContent = chatContent;
    }

    public String chatContent;
}
