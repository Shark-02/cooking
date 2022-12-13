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
    ArrayList<String> ingreId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ingredient_basket);
        Bundle bb=getIntent().getExtras();
        if(bb!=null) {
            ingreId = bb.getStringArrayList("Ingre_id");
        }


        SetupAdapter();
    }

    void SetupAdapter(){
        basket_data= new ArrayList<>();
        //等一些数据进来
        MyDatabaseHelper dbHelper = new MyDatabaseHelper(this,"Cooking.db",null,1);
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        for(int i=0;i<ingreId.size();i++) {
            Cursor cursor = db.rawQuery("select pic from Ingredient,Picture where Picture.id=pic_id and Ingredient.name like '" + ingreId.get(i) + "'", null);
            if(cursor.moveToFirst()){
                Search_recipe rs = new Search_recipe();
                rs.img=getImageBitmap(cursor.getString(cursor.getColumnIndexOrThrow("pic")));
                rs.ingre_title = ingreId.get(i);
                basket_data.add(rs);
            }
        }

        ma=new MySearchAdapter(R.layout.search_result_item,basket_data);
        rcv=findViewById(R.id.basket_rcy);
        LinearLayoutManager layoutManager = new LinearLayoutManager(rcv.getContext());
        rcv.setLayoutManager(layoutManager);
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
