package com.example.cooking.Adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.example.cooking.Data_view.Chat_member;
import com.example.cooking.R;

import java.util.List;

public class FansAdapter extends BaseQuickAdapter<Chat_member, BaseViewHolder> {

    public FansAdapter(@Nullable List<Chat_member> data) {
        super(R.layout.fans_view, data);
    }

    @Override
    protected void convert(@NonNull BaseViewHolder baseViewHolder, Chat_member chat_member) {
        baseViewHolder.setImageResource(R.id.message_head, chat_member.getHeadImg_id());
        baseViewHolder.setText(R.id.message_name,chat_member.chatName);
    }
}
