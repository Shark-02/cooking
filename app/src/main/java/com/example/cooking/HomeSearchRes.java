package com.example.cooking;

import androidx.annotation.NonNull;
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
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.example.cooking.Adapter.MyAdapter;
import com.example.cooking.Data_view.DataGenerator;
import com.example.cooking.Data_view.Search_recipe;
import com.example.cooking.Data_view.recipe;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class HomeSearchRes extends AppCompatActivity {


    List<recipe> data;
    MyAdapter ma;
    RecyclerView rcv;
    Cursor cursor;
    String Search_ct;
    String[] strings;
    ImageView back;
    SearchView sv2;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_search_res);
        data=new ArrayList<>();
        Intent intent=getIntent();
        Search_ct=intent.getStringExtra("search_ct");
        init();
        SetupAdapter();
        search_res();
        tv.setText(Search_ct);
        back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                finish();
            }

        });
    }

    void init(){
        back=findViewById(R.id.match_back_2);
        sv2=findViewById(R.id.search_box3);
        tv=findViewById(R.id.query_hint);
    }

    void SetupAdapter(){
        List<recipe> data1=getData(Search_ct);
        strings=Search_ct.split("");
        for(int i=1;i<strings.length;i++){
            List<recipe> data_t=getData(strings[i]);
            data.addAll(data_t);
            Log.d(String.valueOf(i),strings[i]);
        }
        data.addAll(data1);
        if(data.size()>0){
            data=removeDuplicate(data);
        }
        else{
            Toast makeText=Toast.makeText(HomeSearchRes.this, "没有查询到菜谱", Toast.LENGTH_SHORT);
            makeText.setGravity(Gravity.CENTER, 0, 0);
            makeText.show();
        }
        //去除相同的结果

        ma=new MyAdapter(R.layout.view_list_itemlayout,data);
        rcv=findViewById(R.id.search_res_home);
        StaggeredGridLayoutManager sm=new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
        rcv.setLayoutManager(sm);
        rcv.setAdapter(ma);
        //item点击事件
        ma.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(@NonNull BaseQuickAdapter adapter, @NonNull View view, int position) {
                //itemView=sm.getChildAt(position);
                //itemimg=itemView.findViewById(R.id.item_img);
                //Bitmap bitmap = ((BitmapDrawable)itemimg.getDrawable()).getBitmap();
                Intent intent = new Intent(HomeSearchRes.this, Menu.class);
                intent.putExtra("title",data.get(position).title);
                //intent.putExtra("itemimg",bitmap);
                startActivity(intent);
            }
        });


    }
    public Bitmap getImageBitmap(String imgName){
        String DIR = "/data/data/com.example.cooking/img/";
        String img= DIR+imgName;
        BitmapFactory.Options opt = new BitmapFactory.Options();
        opt.inPreferredConfig = Bitmap.Config.RGB_565;
        Bitmap bitmap = BitmapFactory.decodeFile(img, opt);
        return bitmap;
    }

    public List<recipe> getData(String search){
        List<recipe> data22= new ArrayList<>();
        MyDatabaseHelper myopenHelper = new MyDatabaseHelper(HomeSearchRes.this,"Cooking.db",null,1);
        SQLiteDatabase db = myopenHelper.getReadableDatabase();
        //得到cursor
        cursor = db.rawQuery("select title,pic,introduction from Menu,Picture where title like '%" + search + "%' and Picture.id=cover" , null);
        if (!cursor.moveToFirst())
        {}
        else{
            recipe rs = new recipe();
            //rs.img_id = cursor.getInt(cursor.getColumnIndexOrThrow("pic_id"));
            rs.img=getImageBitmap(cursor.getString(cursor.getColumnIndexOrThrow("pic")));
            //Log.d("pic",cursor.getString(cursor.getColumnIndexOrThrow("pic")));

            int inx=cursor.getColumnIndex("title");
            rs.title= cursor.getString(inx);

            int inx2=cursor.getColumnIndex("introduction");
            rs.content= cursor.getString(inx2);

            //Log.d("amount",rs.ingre_title);
            data22.add(rs);
        }
        while(cursor.moveToNext()){
            //moveToNext()移动光标到下一行
            //count+=1;
            recipe rs = new recipe();
            //rs.img_id = cursor.getInt(cursor.getColumnIndexOrThrow("pic_id"));
            rs.img=getImageBitmap(cursor.getString(cursor.getColumnIndexOrThrow("pic")));
            //Log.d("pic",cursor.getString(cursor.getColumnIndexOrThrow("pic")));

            int inx=cursor.getColumnIndex("title");
            rs.title= cursor.getString(inx);

            int inx2=cursor.getColumnIndex("introduction");
            rs.content= cursor.getString(inx2);

            //Log.d("amount",rs.ingre_title);
            data22.add(rs);
        }
        return data22;
    }
    public List<recipe> removeDuplicate(List<recipe> list){
        List<recipe> listTemp = new ArrayList();
        listTemp.add(list.get(0));
        a:for(int i=1;i<list.size();i++){
            int count=0;
            for (int j=0;j<listTemp.size();j++){
                if(listTemp.get(j).title.equals(list.get(i).title)){
                            count+=1;
                            //Log.d("de2",listTemp.get(j).title);
                }
            }
            if(count==0){listTemp.add(list.get(i));}

        }
        return listTemp;
    }

    void search_res(){
        sv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setVisibility(View.INVISIBLE);
            }
        });
        sv2.setOnSearchClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setVisibility(View.INVISIBLE);
            }
        });
        sv2.setOnQueryTextListener(new SearchView.OnQueryTextListener() {

            @Override
            public boolean onQueryTextSubmit(String query) {
                data=getData(query);
                ma=new MyAdapter(R.layout.view_list_itemlayout,data);
                rcv=findViewById(R.id.search_res_home);
                StaggeredGridLayoutManager sm=new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
                rcv.setLayoutManager(sm);
                rcv.setAdapter(ma);
                //item点击事件
                ma.setOnItemClickListener(new OnItemClickListener() {
                    @Override
                    public void onItemClick(@NonNull BaseQuickAdapter adapter, @NonNull View view, int position) {
                        //itemView=sm.getChildAt(position);
                        //itemimg=itemView.findViewById(R.id.item_img);
                        //Bitmap bitmap = ((BitmapDrawable)itemimg.getDrawable()).getBitmap();
                        Intent intent = new Intent(HomeSearchRes.this, Menu.class);
                        intent.putExtra("title",data.get(position).title);
                        startActivity(intent);
                    }
                });
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });
    }
}