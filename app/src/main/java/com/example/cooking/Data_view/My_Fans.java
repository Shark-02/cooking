package com.example.cooking.Data_view;

public class My_Fans {
    public My_Fans(String fansName, int fansHead) {
        this.fansName = fansName;
        this.fansHead = fansHead;
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
   private int fansHead;
}
