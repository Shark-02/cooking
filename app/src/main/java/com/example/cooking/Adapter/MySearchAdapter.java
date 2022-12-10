package com.example.cooking.Adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.example.cooking.Data_view.Search_recipe;
import com.example.cooking.Data_view.recipe;
import com.example.cooking.R;

import java.util.List;

public class MySearchAdapter extends BaseQuickAdapter<Search_recipe, BaseViewHolder> {
    List<Search_recipe> _data;
    public MySearchAdapter(int layoutResId, @Nullable List<Search_recipe> data) {
        super(layoutResId, data);

    }

    @Override
    protected void convert(@NonNull BaseViewHolder helper, Search_recipe sr) {
        //helper.setImageResource(R.id.picture01, sr.img_id);
        helper.setImageBitmap(R.id.picture01,sr.img);
        //helper.setImageDrawable();
        helper.setText(R.id.igName01,sr.ingre_title);
        helper.setImageResource(R.id.add_ingre,sr.add_id);
    }
}
