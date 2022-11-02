package com.example.cooking.Adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
//import com.chad.library.adapter.base.*;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;

import com.example.cooking.Data_view.Chat_member;
import com.example.cooking.Data_view.recipe;
import com.example.cooking.R;

import java.util.List;

public class MyMessageAdapter extends BaseQuickAdapter<Chat_member, BaseViewHolder> {
    List<Chat_member> _data;
    public MyMessageAdapter(int layoutResId, @Nullable List<Chat_member> data) {
        super(layoutResId, data);

    }

    @Override
    protected void convert(@NonNull BaseViewHolder helper, Chat_member cm) {
        helper.setText(R.id.message_content, cm.chatContent);
        helper.setText(R.id.message_name,cm.chatName);
        helper.setText(R.id.chat_time,cm.chatTime);
        helper.setImageResource(R.id.message_head,cm.headImg_id);
    }
}
