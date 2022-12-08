package com.example.cooking;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cooking.Adapter.MyFollowAdapter;
import com.example.cooking.Data_view.My_Follow;

import java.util.ArrayList;

public class MyFollow extends AppCompatActivity {
    ArrayList<My_Follow> data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_follow);
        RecyclerView rvFans = findViewById(R.id.rv_fans);
        findViewById(R.id.iv_back).setOnClickListener(v -> finish());
        TextView tvTitle = findViewById(R.id.tv_title);
        initFansData();
        rvFans.setAdapter(new MyFollowAdapter(data));

    }


    private void initFansData() {
        for (int i = 0; i < 20; i++) {
            data.add(new My_Follow( R.drawable.xs,"Follow_" + i));
        }
    }
}