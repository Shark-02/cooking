package com.example.cooking;

import androidx.appcompat.app.AppCompatActivity;
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
import com.example.cooking.Data_view.DataGenerator;
import com.example.cooking.Data_view.recipe;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class jiachang_enter extends AppCompatActivity {

    List<recipe> jiachang_data;
    MyAdapter ma;
    RecyclerView rcv;
    MyDatabaseHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jiachang_enter);

        //这里是Back
        ImageView home_cooking_back=findViewById(R.id.home_cooking_back);
        home_cooking_back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        SetupAdapter();
    }

    void SetupAdapter(){
        jiachang_data= new ArrayList<>();
        MyDatabaseHelper dbHelper = new MyDatabaseHelper(this,"Cooking.db",null,1);
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        Cursor cursor=db.query("Menu",null,null,null,"menu_id","menu_id<6",null);
        Cursor cursor1 = db.rawQuery("select id,pic from Menu,Picture where Picture.id=cover" , null);
        if(cursor.moveToFirst() & cursor1.moveToFirst()){
            do{
                recipe rs = new recipe();
                rs.img=getImageBitmap(cursor1.getString(cursor1.getColumnIndexOrThrow("pic")));
                Log.d("pic",cursor1.getString(cursor1.getColumnIndexOrThrow("pic")));
                rs.title = cursor.getString(cursor.getColumnIndexOrThrow("title"));
                Log.d("title",cursor.getString(cursor.getColumnIndexOrThrow("title")));
                rs.content = cursor.getString(cursor.getColumnIndexOrThrow("introduction"));
                Log.d("introduction",cursor.getString(cursor.getColumnIndexOrThrow("introduction")));
                jiachang_data.add(rs);
            }while (cursor.moveToNext() & cursor1.moveToNext());
        }
        cursor.close();
        cursor1.close();
        ma=new MyAdapter(R.layout.view_list_itemlayout,jiachang_data);
        rcv=findViewById(R.id.home_cooking_content);
        StaggeredGridLayoutManager sm=new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
        rcv.setLayoutManager(sm);
        rcv.setAdapter(ma);

    }

    public Bitmap getImageBitmap(String imgName){
        String DIR = "/data/data/com.example.cooking/img/";
        String img= DIR+imgName;
        BitmapFactory.Options opt = new BitmapFactory.Options();
        opt.inPreferredConfig = Bitmap.Config.RGB_565;
        Bitmap bitmap = BitmapFactory.decodeFile(img, opt);
        return bitmap;

    }
}