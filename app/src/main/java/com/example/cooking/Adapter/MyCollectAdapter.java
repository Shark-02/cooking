package com.example.cooking.Adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.example.cooking.Data_view.Collect;
import com.example.cooking.R;

import java.util.List;

public class MyCollectAdapter extends BaseQuickAdapter<Collect, BaseViewHolder> {

    public MyCollectAdapter(@Nullable List<Collect> data) {
        super(R.layout.collect_view, data);
    }

    @Override
    protected void convert(@NonNull BaseViewHolder baseViewHolder, Collect collect) {
        baseViewHolder.setImageResource(R.id.message_head, collect.getImage());
        baseViewHolder.setText(R.id.message_name,collect.getTitle());
    }
}
