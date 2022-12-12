package com.example.cooking.Adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.example.cooking.Data_view.Yongliao;
import com.example.cooking.R;

import java.util.List;

public class MyyongliaoAdapter extends BaseQuickAdapter<Yongliao, BaseViewHolder> {
    List<Yongliao> _data;
    public MyyongliaoAdapter(int layoutResId, @Nullable List<Yongliao> data) {
        super(layoutResId, data);

    }

    @Override
    protected void convert(@NonNull BaseViewHolder helper, Yongliao yl) {
        helper.setText(R.id.yongliao_name, yl.name);
        //helper.setImageResource(R.id.item_img,recipe.img_id);
        helper.setText(R.id.yongliao_yongliang,yl.count);
    }
}
