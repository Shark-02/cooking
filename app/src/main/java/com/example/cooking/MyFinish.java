package com.example.cooking;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.example.cooking.Adapter.MyAdapter;
import com.example.cooking.Adapter.MySearchAdapter;
import com.example.cooking.Data_view.DataGenerator;
import com.example.cooking.Data_view.Search_recipe;
import com.example.cooking.Data_view.recipe;

import java.util.List;

public class MyFinish extends AppCompatActivity {

    MyAdapter ma;
    List<recipe> data;
    RecyclerView lv;
    ImageView back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_finish);
        Setup();
        Listen();
        data= DataGenerator.genRecipeData();
        ma=new MyAdapter(R.layout.view_list_itemlayout,data);
        LinearLayoutManager sm=new LinearLayoutManager(this);
        lv.setLayoutManager(sm);
        lv.setAdapter(ma);
        //item的点击事件
        ma.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(@NonNull BaseQuickAdapter adapter, @NonNull View view, int position) {
                Intent intent = new Intent(MyFinish.this, Menu.class);
                startActivity(intent);
            }
        });
    }
    void Setup(){
        lv=findViewById(R.id.ido_rcv);
        back=findViewById(R.id.back_Ido);
    }
    void Listen(){
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }

}