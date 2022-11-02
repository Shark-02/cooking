package com.example.cooking;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MyComment extends AppCompatActivity {


    ImageView back_mc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_comment);
        Setup();
        Listen();
    }

    void Setup(){
        back_mc=findViewById(R.id.comment_back);
    }
    void Listen(){
        //这里是Back
        back_mc.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                finish();
            }

        });
    }
}