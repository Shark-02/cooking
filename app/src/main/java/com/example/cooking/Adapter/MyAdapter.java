package com.example.cooking.Adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.example.cooking.Data_view.recipe;
import com.example.cooking.R;

import java.util.List;

public class MyAdapter extends BaseQuickAdapter<recipe, BaseViewHolder> {
    List<recipe> _data;
    public MyAdapter(int layoutResId, @Nullable List<recipe> data) {
        super(layoutResId, data);

    }

    @Override
    protected void convert(@NonNull BaseViewHolder helper, recipe recipe) {
        helper.setText(R.id.item_title,recipe.title);
        helper.setText(R.id.item_content,recipe.content);
        helper.setImageResource(R.id.item_img,recipe.img_id);
    }
}
