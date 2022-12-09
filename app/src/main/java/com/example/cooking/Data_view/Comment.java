package com.example.cooking.Data_view;

public class Comment {
    private int headImage;
    private String name;
    private String content;
    public Comment(int headImage, String name, String content) {
        this.headImage = headImage;
        this.name = name;
        this.content = content;
    }
    public int getHeadImage() {
        return headImage;
    }

    public void setHeadImage(int headImage) {
        this.headImage = headImage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }





}
