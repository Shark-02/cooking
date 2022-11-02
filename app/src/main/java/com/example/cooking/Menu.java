package com.example.cooking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Menu extends AppCompatActivity {
    ImageView menu_img,backiv;
    Bitmap mi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        //Intent intent = new Intent();
        //mi = (Bitmap) intent.getParcelableExtra("itemimg");
        Setup();

    }
    void Setup(){
        //menu_img=findViewById(R.id.imageView3);
        //menu_img.setImageBitmap(mi);
        backiv=findViewById(R.id.back_icon);
        backiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}