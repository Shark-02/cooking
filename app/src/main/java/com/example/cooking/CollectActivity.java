package com.example.cooking;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cooking.Adapter.FansAdapter;
import com.example.cooking.Data_view.Chat_member;

import java.util.ArrayList;

public class CollectActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fans);
        RecyclerView rvFans = findViewById(R.id.rv_fans);
        findViewById(R.id.iv_back).setOnClickListener(v -> finish());
        TextView tvTitle = findViewById(R.id.tv_title);
        tvTitle.setText("收藏");
        ArrayList<Chat_member> data = new ArrayList<>();
        Chat_member chatMember = new Chat_member();
        chatMember.setHeadImg_id(R.drawable.xs);
        chatMember.setChatName("xx-L");
        data.add(chatMember);
        data.add(chatMember);
        data.add(chatMember);
        data.add(chatMember);
        data.add(chatMember);
        data.add(chatMember);
        data.add(chatMember);
        data.add(chatMember);
        data.add(chatMember);
        data.add(chatMember);
        data.add(chatMember);
        data.add(chatMember);
        data.add(chatMember);
        data.add(chatMember);
        data.add(chatMember);
        data.add(chatMember);
        rvFans.setAdapter(new FansAdapter(data));
    }
}