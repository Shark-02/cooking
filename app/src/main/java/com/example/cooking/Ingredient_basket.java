package com.example.cooking;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.example.cooking.Adapter.MyAdapter;
import com.example.cooking.Adapter.MySearchAdapter;
import com.example.cooking.Data_view.DataGenerator;
import com.example.cooking.Data_view.Search_recipe;
import com.example.cooking.Data_view.recipe;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ingredient_basket extends AppCompatActivity {


    List<Search_recipe> basket_data;
    MySearchAdapter ma;
    RecyclerView rcv;
    MyDatabaseHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ingredient_basket);

        //这里是Back
        ImageView back=findViewById(R.id.basket02);
        back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        SetupAdapter();
    }

    void SetupAdapter(){
        basket_data= new ArrayList<>();
        //等一些数据进来
        MyDatabaseHelper dbHelper = new MyDatabaseHelper(this,"Cooking.db",null,1);
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        //Cursor cursor = db.rawQuery("select name,pic from Ingredient,Picture where Picture.id=pic_id" ,null);

        ma=new MySearchAdapter(R.layout.search_result_item,basket_data);
        rcv=findViewById(R.id.basket_rcy);
        LinearLayoutManager layoutManager = new LinearLayoutManager(rcv.getContext());
        rcv.setLayoutManager(layoutManager);
        rcv.setAdapter(ma);

    }


}
