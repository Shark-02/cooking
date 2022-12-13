package com.example.cooking;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.database.Cursor;
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

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.example.cooking.Adapter.MySearchAdapter;
import com.example.cooking.Data_view.DataGenerator;
import com.example.cooking.Data_view.Search_recipe;
import com.example.cooking.Data_view.recipe;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MatchIngredient extends AppCompatActivity {

    MySearchAdapter ma;
    List<Search_recipe> data;
    RecyclerView lv;
    ImageView iv;
    SearchView sv;
    Cursor cursor;
    ArrayList<String> beclick;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_match_ingredient);
        Setup();
        Listen();
        showListview();
        /*data= DataGenerator.genSearchIngreData();
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
        lv.setAdapter(ma);*/
    }
    void Setup(){
        lv=findViewById(R.id.search_rcv);
        iv=findViewById(R.id.imageView2);
        sv=findViewById(R.id.search_box);
        sv.setQueryHint("请输入食材");
        beclick=new ArrayList<>();
    }

    void Listen(){
        //这里是Back
        iv.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Log.d("size",String.valueOf(beclick.size()));
                Intent intent=new Intent(MatchIngredient.this,SelectIngredient.class);
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("Ingre_id", beclick);
                intent.putExtras(bundle);
                startActivity(intent);
                finish();
            }

        });
    }

    private void showListview() {
        //lv.setvisibility(View.VISIBLE);
        //获得输入的内容
        sv.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            // 当点击搜索按钮时触发该方法
            @Override
            public boolean onQueryTextSubmit(String query) {
                //获取数据库对象
                data = new ArrayList<>();
                //Toast.makeText(MatchIngredient.this, "没有查询到数据", Toast.LENGTH_SHORT).show();
                MyDatabaseHelper myopenHelper = new MyDatabaseHelper(MatchIngredient.this,"Cooking.db",null,1);
                SQLiteDatabase db = myopenHelper.getReadableDatabase();
                //得到cursor
                cursor = db.rawQuery("select name,pic from Ingredient,Picture where name like '%" + query + "%' and Picture.id=pic_id" , null);
                /*if(cursor!=null){
                    Log.d("1","notnull");
                }
                else{
                    Log.d("1","null");
                }*/
                //int count=0;
                if (!cursor.moveToFirst())
                {
                    Toast.makeText(MatchIngredient.this, "没有查询到数据", Toast.LENGTH_SHORT).show();
                }else{
                    Search_recipe rs = new Search_recipe();
                    //rs.img_id = cursor.getInt(cursor.getColumnIndexOrThrow("pic_id"));
                    rs.img=getImageBitmap(cursor.getString(cursor.getColumnIndexOrThrow("pic")));
                    Log.d("pic",cursor.getString(cursor.getColumnIndexOrThrow("pic")));
                    int inx=cursor.getColumnIndex("name");
                    rs.ingre_title= cursor.getString(inx);
                    rs.add_id = R.drawable.add;
                    Log.d("amount",rs.ingre_title);
                    data.add(rs);
                }
                while(cursor.moveToNext()){
                    //moveToNext()移动光标到下一行
                    //count+=1;
                    Search_recipe rs = new Search_recipe();
                    rs.img=getImageBitmap(cursor.getString(cursor.getColumnIndexOrThrow("pic")));
                    int inx=cursor.getColumnIndex("name");
                    rs.ingre_title= cursor.getString(inx);
                    rs.add_id = R.drawable.add;
                    //Log.d("amount",rs.ingre_title);
                    data.add(rs);
                }

                /*if(data.size()>0){
                    Log.d("1",String.valueOf(data.size()));
                }
                else{
                    Log.d("1","null");
                }*/
                ma=new MySearchAdapter(R.layout.search_result_item,data);
                LinearLayoutManager layoutManager = new LinearLayoutManager(lv.getContext());
                lv.setLayoutManager(layoutManager);
                lv.setAdapter(ma);

                ma.setOnItemClickListener(new OnItemClickListener() {
                    @Override
                    public void onItemClick(@NonNull BaseQuickAdapter adapter, @NonNull View view, int position) {
                        beclick.add(data.get(position).ingre_title);
                        Toast.makeText(MatchIngredient.this, "您选择了"+data.get(position).ingre_title, Toast.LENGTH_SHORT).show();
                        Log.d("title",data.get(position).ingre_title);
                        //Log.d("size",String.valueOf(beclick.size()));
                    }
                });
                //Log.d("size",String.valueOf(beclick.size()));


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

            public Bitmap getImageBitmap(String imgName){
                String DIR = "/data/data/com.example.cooking/img/";
                String img= DIR+imgName;
                BitmapFactory.Options opt = new BitmapFactory.Options();
                opt.inPreferredConfig = Bitmap.Config.RGB_565;
                Bitmap bitmap = BitmapFactory.decodeFile(img, opt);
                return bitmap;

            }



        });


    }

}