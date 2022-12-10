package com.example.cooking;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.SearchView;
import android.widget.Toast;

import com.example.cooking.Adapter.MySearchAdapter;
import com.example.cooking.Data_view.Search_recipe;

import java.util.ArrayList;

public class SearchActivity extends AppCompatActivity {

    ImageView back_sa;
    SearchView sv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        Setup();
        Search();
        //这里是返回
        back_sa.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                finish();
            }

        });
    }
    void Setup(){
        back_sa=findViewById(R.id.imageView2);
        sv=findViewById(R.id.search_box_ma);
    }
    void Search(){
        sv.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            // 当点击搜索按钮时触发该方法
            @Override
            public boolean onQueryTextSubmit(String query) {
                //获取数据库对象
                Log.d("1","2");
                Intent intent = new Intent(SearchActivity.this, HomeSearchRes.class);
                intent.putExtra("search_ct", query);
                startActivity(intent);
                //清除焦点，收软键盘
                //mSearchView.clearFocus();
                return false;
            }

            // 当搜索内容改变时触发该方法
            @Override
            public boolean onQueryTextChange(String newText) {
                //do something
                //ma.notifyDataSetChanged();
                //当没有输入任何内容的时候清除结果，看实际需求
                if (TextUtils.isEmpty(newText)) {
                    //mSearchResult.setVisibility(View.INVISIBLE);
                }
                return false;
            }


        });
    }
}