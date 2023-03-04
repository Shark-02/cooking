package com.example.cooking;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.cooking.Adapter.MyAdapter;
import com.example.cooking.Adapter.MybuzhouAdapter;
import com.example.cooking.Adapter.MyyongliaoAdapter;
import com.example.cooking.Data_view.Buzhou;
import com.example.cooking.Data_view.Yongliao;
import com.example.cooking.Data_view.recipe;

import java.util.ArrayList;
import java.util.List;

public class Menu extends AppCompatActivity {
    ImageView menu_img,backiv;
    String title;
    Cursor cursor1;
    Cursor cursor2,cursor3;
    List<Buzhou> data;
    List<Yongliao> data2;
    MybuzhouAdapter ma;
    MyyongliaoAdapter ma2;
    RecyclerView rcv,rcv2;
    TextView menu_t;
    ImageView bigimg;
    NestedScrollView sv;
    Button mycol,mydo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Intent intent = getIntent();
        title = intent.getStringExtra("title");
        Setup();
        SetupAdapter();
        AddCollect();
        AddDone();

    }
    void Setup(){
        //menu_img=findViewById(R.id.imageView3);
        //menu_img.setImageBitmap(mi);
        backiv=findViewById(R.id.back_icon);
        menu_t=findViewById(R.id.textView3);
        bigimg=findViewById(R.id.imageView3);
        sv=findViewById(R.id.mynsv);
        mycol=findViewById(R.id.mycollect);
        mydo=findViewById(R.id.mydone);
        menu_t.setText(title);
        backiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        MyDatabaseHelper myopenHelper = new MyDatabaseHelper(Menu.this,"Cooking.db",null,1);
        SQLiteDatabase db = myopenHelper.getReadableDatabase();
        //得到cursor
        cursor1 = db.rawQuery("select pic from Menu,Picture where  Picture.id=cover and  Menu.title like '%" + title + "%'", null);
        if (cursor1.moveToFirst())
        {
            if(getImageBitmap(cursor1.getString(cursor1.getColumnIndexOrThrow("pic")))==null){
                bigimg.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.lose, null));
            }
            else{
                bigimg.setImageBitmap(getImageBitmap(cursor1.getString(cursor1.getColumnIndexOrThrow("pic"))));
            }

        }

    }

    void SetupAdapter(){
        data=getData();
        Log.d("title",String.valueOf(data.size()));
        ma=new MybuzhouAdapter(R.layout.buzhou_item,data);
        rcv=findViewById(R.id.buzhou_rcv);
        rcv.setNestedScrollingEnabled(false);
        LinearLayoutManager layoutManager = new LinearLayoutManager(rcv.getContext());
        layoutManager.setOrientation(RecyclerView.HORIZONTAL);
        rcv.setLayoutManager(layoutManager);
        rcv.setAdapter(ma);
        ma.notifyDataSetChanged();

        data2=getData2();
        Log.d("title",String.valueOf(data2.size()));
        ma2=new MyyongliaoAdapter(R.layout.yongliao_item,data2);
        rcv2=findViewById(R.id.yongliao_rcv);
        rcv2.setNestedScrollingEnabled(false);
        LinearLayoutManager layoutManager2 = new LinearLayoutManager(rcv2.getContext());
        layoutManager2.setOrientation(RecyclerView.HORIZONTAL);
        rcv2.setLayoutManager(layoutManager2);
        rcv2.setAdapter(ma2);
        ma2.notifyDataSetChanged();
    }

    public List<Buzhou> getData(){

        List<Buzhou> data22= new ArrayList<>();
        MyDatabaseHelper myopenHelper = new MyDatabaseHelper(Menu.this,"Cooking.db",null,1);
        SQLiteDatabase db = myopenHelper.getReadableDatabase();
        //得到cursor
        cursor1 = db.rawQuery("select pic,steps from Menu,Picture,Step where  Picture.id=pic_id and Menu.menu_id=Step.menu_id and Menu.title like '%" + title + "%'", null);
        if (!cursor1.moveToFirst())
        {}
        else{
            Log.d("indx1","1");
            Buzhou bz = new Buzhou();
            //rs.img_id = cursor.getInt(cursor.getColumnIndexOrThrow("pic_id"));
            if(getImageBitmap(cursor1.getString(cursor1.getColumnIndexOrThrow("pic")))==null){
                bz.img=  BitmapFactory.decodeResource(getResources(), R.drawable.lose, null);
            }
            else{
                bz.img=getImageBitmap(cursor1.getString(cursor1.getColumnIndexOrThrow("pic")));
            }
            //Log.d("pic",cursor.getString(cursor.getColumnIndexOrThrow("pic")));

            int inx=cursor1.getColumnIndex("steps");
            bz.bcont= cursor1.getString(inx);


            //Log.d("amount",rs.ingre_title);
            data22.add(bz);
        }
        while(cursor1.moveToNext()){
            Log.d("indx1","1");
            //moveToNext()移动光标到下一行
            //count+=1;
            Buzhou bz = new Buzhou();
            //rs.img_id = cursor.getInt(cursor.getColumnIndexOrThrow("pic_id"));
            if(getImageBitmap(cursor1.getString(cursor1.getColumnIndexOrThrow("pic")))==null){
                bz.img=  BitmapFactory.decodeResource(getResources(), R.drawable.lose, null);
            }
            else{
                bz.img=getImageBitmap(cursor1.getString(cursor1.getColumnIndexOrThrow("pic")));
            }
            //Log.d("pic",cursor.getString(cursor.getColumnIndexOrThrow("pic")));


            int inx=cursor1.getColumnIndex("steps");
            bz.bcont= cursor1.getString(inx);

            //Log.d("amount",rs.ingre_title);
            data22.add(bz);
        }
        return data22;
    }


    public List<Yongliao> getData2(){
        List<Yongliao> data22= new ArrayList<>();
        MyDatabaseHelper myopenHelper = new MyDatabaseHelper(Menu.this,"Cooking.db",null,1);
        SQLiteDatabase db = myopenHelper.getReadableDatabase();
        Log.d("title",title);
        //得到cursor
        cursor2 = db.rawQuery("select name,dosage from Menu,IngredientInMenu,Ingredient,Picture where ingredient_id=Picture.id and Picture.id=pic_id and Menu.menu_id=IngredientInMenu.menu_id and Menu.title like '%" + title + "%'", null);
        if (!cursor2.moveToFirst())
        {Log.d("indx1","null");}
        else{
            Yongliao yl = new Yongliao();
            //rs.img_id = cursor.getInt(cursor.getColumnIndexOrThrow("pic_id"));
            yl.name=cursor2.getString(cursor2.getColumnIndexOrThrow("name"));
            //Log.d("pic",cursor.getString(cursor.getColumnIndexOrThrow("pic")));

            int inx=cursor2.getColumnIndex("dosage");
            yl.count= cursor2.getString(inx);


            //Log.d("amount",rs.ingre_title);
            data22.add(yl);
        }
        while(cursor2.moveToNext()){
            //moveToNext()移动光标到下一行
            //count+=1;
            Yongliao yl = new Yongliao();
            //rs.img_id = cursor.getInt(cursor.getColumnIndexOrThrow("pic_id"));
            yl.name=cursor2.getString(cursor2.getColumnIndexOrThrow("name"));
            //Log.d("pic",cursor.getString(cursor.getColumnIndexOrThrow("pic")));


            int inx=cursor2.getColumnIndex("dosage");
            yl.count= cursor2.getString(inx);

            //Log.d("amount",rs.ingre_title);
            data22.add(yl);
        }
        return data22;
    }

    public Bitmap getImageBitmap(String imgName){
        String DIR = "/data/data/com.example.cooking/img/";
        String img= DIR+imgName;
        BitmapFactory.Options opt = new BitmapFactory.Options();
        opt.inPreferredConfig = Bitmap.Config.RGB_565;
        Bitmap bitmap = BitmapFactory.decodeFile(img, opt);
        return bitmap;
    }

    public void AddCollect(){
        mycol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer menuid=0;
                MyDatabaseHelper myopenHelper = new MyDatabaseHelper(Menu.this,"Cooking.db",null,1);
                SQLiteDatabase db = myopenHelper.getReadableDatabase();
                cursor3 = db.rawQuery("select menu_id from Menu where  Menu.title like '%" + title + "%'", null);
                if (cursor3.moveToFirst())
                {menuid=cursor3.getInt(cursor3.getColumnIndexOrThrow("menu_id"));}
                Cursor cursor6 = db.rawQuery("select menu_id from Collection  where menu_id="+ menuid, null);
                if(!cursor6.moveToFirst()) {
                    ContentValues cv = new ContentValues();
                    cv.put("user_id", 0221);
                    cv.put("menu_id", menuid);
                    //插入ContentValues中的数据
                    db.insert("Collection", null, cv);
                    Toast.makeText(Menu.this, "收藏成功！", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(Menu.this, "您已收藏该菜谱！", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void AddDone(){
        mydo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer menuid=0;
                MyDatabaseHelper myopenHelper = new MyDatabaseHelper(Menu.this,"Cooking.db",null,1);
                SQLiteDatabase db = myopenHelper.getReadableDatabase();
                Cursor cursor4,cursor5;
                cursor4 = db.rawQuery("select menu_id from Menu where  Menu.title like '%" + title + "%'", null);
                if (cursor4.moveToFirst())
                {menuid=cursor4.getInt(cursor4.getColumnIndexOrThrow("menu_id"));}
                cursor5 = db.rawQuery("select menu_id from Finish  where menu_id="+ menuid, null);
                if(!cursor5.moveToFirst()) {
                    ContentValues cv = new ContentValues();
                    cv.put("user_id", 0221);
                    cv.put("menu_id", menuid);
                    //插入ContentValues中的数据
                    db.insert("Finish", null, cv);
                    Toast.makeText(Menu.this, "已加入已做过列表！", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(Menu.this, "您已做过该菜谱！", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}