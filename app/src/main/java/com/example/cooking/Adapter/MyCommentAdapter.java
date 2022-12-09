package com.example.cooking.Adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.example.cooking.Data_view.Comment;
import com.example.cooking.R;

import java.util.List;

public class MyCommentAdapter extends BaseQuickAdapter<Comment, BaseViewHolder> {

    public MyCommentAdapter(@Nullable List<Comment> data) {
        super(R.layout.comment_view, data);
    }

    @Override
    protected void convert(@NonNull BaseViewHolder baseViewHolder, Comment comment) {
        baseViewHolder.setImageResource(R.id.message_head, comment.getHeadImage());
        baseViewHolder.setText(R.id.message_name,comment.getName());
    }
}
