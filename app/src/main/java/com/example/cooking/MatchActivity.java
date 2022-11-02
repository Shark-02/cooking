package com.example.cooking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MatchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_match);
        ImageView match_back=findViewById(R.id.match_back);
        //这里是返回
        match_back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                finish();

            }

        });
        ImageView hamburger=findViewById(R.id.hamburger);
        //这里是进入匹配好的菜单页
        hamburger.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MatchActivity.this, Menu.class);
                startActivity(intent);

            }

        });
    }
}