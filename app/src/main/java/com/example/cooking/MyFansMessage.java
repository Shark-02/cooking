package com.example.cooking;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cooking.Adapter.MyCommentAdapter;
import com.example.cooking.Adapter.MyFansMessageAdapter;
import com.example.cooking.Data_view.Comment;
import com.example.cooking.Data_view.My_Fans_Message;

import java.util.ArrayList;
import java.util.List;

public class MyFansMessage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comment);
        RecyclerView rvComment = findViewById(R.id.rv_fans);
        findViewById(R.id.iv_back).setOnClickListener(v -> finish());
        TextView tvTitle = findViewById(R.id.tv_title);
        tvTitle.setText("评论");
        List<My_Fans_Message> my_fans_messages = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            my_fans_messages.add(new My_Fans_Message("comment_name"+i,R.drawable.xs,"xxxx"));
        }
        rvComment.setAdapter(new MyFansMessageAdapter(my_fans_messages));
    }
}