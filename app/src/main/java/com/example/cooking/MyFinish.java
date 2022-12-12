package com.example.cooking;

import androidx.annotation.NonNull;
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
import android.widget.Toast;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.example.cooking.Adapter.MyAdapter;
import com.example.cooking.Adapter.MySearchAdapter;
import com.example.cooking.Data_view.DataGenerator;
import com.example.cooking.Data_view.Search_recipe;
import com.example.cooking.Data_view.recipe;

import java.util.ArrayList;
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
        data= getData();
        ma=new MyAdapter(R.layout.myfinish_item,data);
        LinearLayoutManager sm=new LinearLayoutManager(this);
        lv.setLayoutManager(sm);
        lv.setAdapter(ma);
        //item的点击事件
        ma.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(@NonNull BaseQuickAdapter adapter, @NonNull View view, int position) {
                Intent intent = new Intent(MyFinish.this, Menu.class);
                intent.putExtra("title",data.get(position).title);
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
    public List<recipe> getData(){
        data = new ArrayList<>();
        //Toast.makeText(MatchIngredient.this, "没有查询到数据", Toast.LENGTH_SHORT).show();
        MyDatabaseHelper myopenHelper = new MyDatabaseHelper(MyFinish.this,"Cooking.db",null,1);
        SQLiteDatabase db = myopenHelper.getReadableDatabase();
        Cursor cursor = db.rawQuery("select title,pic from Menu,Picture,Finish where  Picture.id=cover and Finish.menu_id=Menu.menu_id  order by Finish.id desc" , null);
        if (cursor.moveToFirst()){
            recipe rs = new recipe();
            //rs.img_id = cursor.getInt(cursor.getColumnIndexOrThrow("pic_id"));
            rs.img=getImageBitmap(cursor.getString(cursor.getColumnIndexOrThrow("pic")));
            //Log.d("pic",cursor.getString(cursor.getColumnIndexOrThrow("pic")));

            int inx=cursor.getColumnIndex("title");
            rs.title= cursor.getString(inx);

            /*int inx2=cursor.getColumnIndex("introduction");
            rs.content= cursor.getString(inx2);

            //Log.d("amount",rs.ingre_title);*/
            data.add(rs);
        }
        while(cursor.moveToNext()) {
            //moveToNext()移动光标到下一行
            //count+=1;
            recipe rs = new recipe();
            //rs.img_id = cursor.getInt(cursor.getColumnIndexOrThrow("pic_id"));
            rs.img = getImageBitmap(cursor.getString(cursor.getColumnIndexOrThrow("pic")));
            //Log.d("pic",cursor.getString(cursor.getColumnIndexOrThrow("pic")));

            int inx = cursor.getColumnIndex("title");
            rs.title = cursor.getString(inx);

            /*int inx2 = cursor.getColumnIndex("introduction");
            rs.content = cursor.getString(inx2);

            //Log.d("amount",rs.ingre_title);*/
            data.add(rs);
        }
        return data;

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