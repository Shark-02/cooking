package com.example.cooking;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cooking.Adapter.MyCollectAdapter;
import com.example.cooking.Data_view.Collect;

import java.util.ArrayList;

public class MyCollect extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collect);
        RecyclerView rvFans = findViewById(R.id.rv_fans);
        findViewById(R.id.iv_back).setOnClickListener(v -> finish());
        TextView tvTitle = findViewById(R.id.tv_title);
        tvTitle.setText("我的收藏");
        ArrayList<Collect> data = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            data.add(new Collect(R.drawable.xs, "collect_title_" + i, "collect_content_" + i));
        }
        rvFans.setAdapter(new MyCollectAdapter(data));
    }
}