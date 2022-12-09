package com.example.cooking.Adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.example.cooking.Data_view.My_Follow;
import com.example.cooking.R;

import java.util.List;

public class MyFollowAdapter extends BaseQuickAdapter<My_Follow, BaseViewHolder> {

    public MyFollowAdapter(@Nullable List<My_Follow> data) {
        super(R.layout.follow_view, data);
    }

    @Override
    protected void convert(@NonNull BaseViewHolder baseViewHolder, My_Follow follow) {
        baseViewHolder.setImageResource(R.id.message_head, follow.getFollowerHead());
        baseViewHolder.setText(R.id.message_name,follow.getFollowerName());
    }
}
