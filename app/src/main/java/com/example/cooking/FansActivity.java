package com.example.cooking;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.cooking.Adapter.FansAdapter;
import com.example.cooking.Data_view.Chat_member;

import java.util.ArrayList;

public class FansActivity extends AppCompatActivity {
    ArrayList<Chat_member> data = new ArrayList<>();

    public static void toMe(Context context, int type) {
        Intent intent = new Intent(context, FansActivity.class);
        intent.putExtra("type", type);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fans);
        RecyclerView rvFans = findViewById(R.id.rv_fans);
        findViewById(R.id.iv_back).setOnClickListener(v -> finish());
        TextView tvTitle = findViewById(R.id.tv_title);
        int type = getIntent().getIntExtra("type", 0);
        if (type == 0) {
            tvTitle.setText("我的粉丝");
            initFansData();
        } else {
            tvTitle.setText("我的关注");
            initFollowDta();
        }
        rvFans.setAdapter(new FansAdapter(data));
    }

    private void initFollowDta() {
        Chat_member chatMember = new Chat_member();
        chatMember.setHeadImg_id(R.drawable.xs);
        chatMember.setChatName("Follow-xx-L");
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
    }

    private void initFansData() {
        Chat_member chatMember = new Chat_member();
        chatMember.setHeadImg_id(R.drawable.xs);
        chatMember.setChatName("Fans-xx-L");
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
    }
}