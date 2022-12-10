package com.example.cooking.Data_view;

import android.graphics.Bitmap;

public class recipe {
    public int img_id;
    public Bitmap img;
    public String title;
    public String content;

    //public int getImg_id() {
        //return img_id;
    //}

    //public void setImg_id(int img_id) {
        //this.img_id = img_id;
    //}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
