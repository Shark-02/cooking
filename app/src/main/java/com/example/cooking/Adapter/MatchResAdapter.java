package com.example.cooking.Adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.example.cooking.Data_view.Ingredient_match;
import com.example.cooking.R;

import java.util.List;

public class MatchResAdapter extends BaseQuickAdapter<Ingredient_match, BaseViewHolder> {
    List<Ingredient_match> _data;
    public MatchResAdapter(int layoutResId,@Nullable List<Ingredient_match> data) {
        super(layoutResId, data);
    }
    @Override
    protected void convert(@NonNull BaseViewHolder helper, Ingredient_match sr) {
        //helper.setImageResource(R.id.picture01, sr.img_id);
        helper.setImageBitmap(R.id.picture01,sr.img);
        //helper.setImageDrawable();
        helper.setText(R.id.title01,sr.menu_title);
    }
}
