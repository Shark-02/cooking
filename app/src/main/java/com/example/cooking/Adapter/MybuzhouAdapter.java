package com.example.cooking.Adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.example.cooking.Data_view.Buzhou;
import com.example.cooking.R;

import java.util.List;

public class MybuzhouAdapter extends BaseQuickAdapter<Buzhou, BaseViewHolder> {
    List<Buzhou> _data;
    public MybuzhouAdapter(int layoutResId, @Nullable List<Buzhou> data) {
        super(layoutResId, data);

    }

    @Override
    protected void convert(@NonNull BaseViewHolder helper, Buzhou bz) {
        helper.setText(R.id.steps,bz.bcont);
        //helper.setImageResource(R.id.item_img,recipe.img_id);
        helper.setImageBitmap(R.id.step_img,bz.img);
    }
}
