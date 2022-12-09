package com.example.cooking;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cooking.Adapter.MyCommentAdapter;
import com.example.cooking.Data_view.Comment;

import java.util.ArrayList;
import java.util.List;

public class CommentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comment);
        RecyclerView rvComment = findViewById(R.id.rv_fans);
        findViewById(R.id.iv_back).setOnClickListener(v -> finish());
        TextView tvTitle = findViewById(R.id.tv_title);
        tvTitle.setText("评论");
        List<Comment> comments = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            comments.add(new Comment(R.drawable.xs,"comment_name"+i,"xxxx"));
        }
        rvComment.setAdapter(new MyCommentAdapter(comments));
    }
}