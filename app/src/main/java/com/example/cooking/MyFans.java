package com.example.cooking;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import com.example.cooking.Adapter.MyFansAdapter;
import com.example.cooking.Data_view.My_Fans;

import java.util.ArrayList;

public class MyFans extends AppCompatActivity {
    ArrayList<My_Fans> data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fans);
        RecyclerView rvFans = findViewById(R.id.rv_fans);
        findViewById(R.id.iv_back).setOnClickListener(v -> finish());
        TextView tvTitle = findViewById(R.id.tv_title);
        rvFans.setAdapter(new MyFansAdapter(data));
        initFansData();
    }


    private void initFansData() {
        for (int i = 0; i < 20; i++) {
            data.add(new My_Fans("Fans_" + i, R.drawable.xs));
        }
    }
}