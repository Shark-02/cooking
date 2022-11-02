package com.example.cooking;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.cooking.Adapter.MyAdapter;
import com.example.cooking.Adapter.MySearchAdapter;
import com.example.cooking.Data_view.Search_recipe;
import com.example.cooking.Data_view.recipe;

import java.util.List;

public class SelectIngredient extends AppCompatActivity {

    ImageView sr_ic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_ingredient);
        ImageView select_ingredient_back=findViewById(R.id.back_icon);
        Button select_finish=findViewById(R.id.select_finish);
        sr_ic=findViewById(R.id.search_icon);
        //这里是Back
        select_ingredient_back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                finish();
            }

        });
        //这里是选好了
        select_finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(SelectIngredient.this,MatchActivity.class);
                startActivity(intent);
            }
        });
        //这里是搜索栏
        sr_ic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(SelectIngredient.this,MatchIngredient.class);
                startActivity(intent);
            }
        });


    }
}