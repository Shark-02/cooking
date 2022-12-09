package com.example.cooking.Data_view;

public class My_Follow {
    public My_Follow(int followerHead, String followerName) {
        this.followerHead = followerHead;
        this.followerName = followerName;
    }

    public int getFollowerHead() {
        return followerHead;
    }

    public void setFollowerHead(int followerHead) {
        this.followerHead = followerHead;
    }

    public String getFollowerName() {
        return followerName;
    }

    public void setFollowerName(String followerName) {
        this.followerName = followerName;
    }

    private int followerHead;
    private String followerName;
}
