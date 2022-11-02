package com.example.cooking;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.cooking.Adapter.MySearchAdapter;
import com.example.cooking.Data_view.DataGenerator;
import com.example.cooking.Data_view.Search_recipe;
import com.example.cooking.Data_view.recipe;

import java.util.List;
import java.util.Random;

public class MatchIngredient extends AppCompatActivity {

    MySearchAdapter ma;
    List<Search_recipe> data;
    RecyclerView lv;
    ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_match_ingredient);
        Setup();
        Listen();
        data= DataGenerator.genSearchIngreData();
        int num= new Random().nextInt(20);
        for (int i=0;i<num;i++){
            Search_recipe rs = new Search_recipe();
            rs.img_id = R.drawable.eggs;
            rs.ingre_title= "鸡蛋";
            rs.add_id = R.drawable.add;
            data.add(rs);
        }
        ma=new MySearchAdapter(R.layout.search_result_item,data);

        LinearLayoutManager layoutManager = new LinearLayoutManager(lv.getContext());
        lv.setLayoutManager(layoutManager);
        lv.setAdapter(ma);


    }
    void Setup(){
        lv=findViewById(R.id.search_rcv);
        iv=findViewById(R.id.imageView2);
    }
    void Listen(){
        //这里是Back
        iv.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                finish();
            }

        });
    }

}