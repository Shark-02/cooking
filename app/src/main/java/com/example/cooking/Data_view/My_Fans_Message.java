package com.example.cooking.Data_view;

public class My_Fans_Message {
    public My_Fans_Message(String fansName, int fansHead,String message) {
        this.fansName = fansName;
        this.fansHead = fansHead;
        this.message = message;
    }

    public String getFansName() {
        return fansName;
    }

    public void setFansName(String fansName) {
        this.fansName = fansName;
    }

    public int getFansHead() {
        return fansHead;
    }

    public void setFansHead(int fansHead) {
        this.fansHead = fansHead;
    }

    private String fansName;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private String message;
   private int fansHead;
}
