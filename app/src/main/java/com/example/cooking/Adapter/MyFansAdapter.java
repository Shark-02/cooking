package com.example.cooking.Adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.example.cooking.Data_view.My_Fans;
import com.example.cooking.R;

import java.util.List;

public class MyFansAdapter extends BaseQuickAdapter<My_Fans, BaseViewHolder> {

    public MyFansAdapter(@Nullable List<My_Fans> data) {
        super(R.layout.fans_view, data);
    }

    @Override
    protected void convert(@NonNull BaseViewHolder baseViewHolder, My_Fans myFans) {
        baseViewHolder.setImageResource(R.id.message_head, myFans.getFansHead());
        baseViewHolder.setText(R.id.message_name, myFans.getFansName());
    }
}
