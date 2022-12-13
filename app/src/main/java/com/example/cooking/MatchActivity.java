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
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.example.cooking.Adapter.MatchResAdapter;
import com.example.cooking.Adapter.MyAdapter;
import com.example.cooking.Data_view.Ingredient_match;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class MatchActivity extends AppCompatActivity {
    List<Ingredient_match> data;
    MatchResAdapter mra;
    RecyclerView rcv;
    ArrayList<String> IngreId;
    //String[] strings;
    Cursor cursor;
    ImageView back;
    boolean onclick;
    ArrayList<Integer> MenuID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_match);
        data=new ArrayList<>();
        onclick=false;
        Bundle bb=getIntent().getExtras();
        IngreId=bb.getStringArrayList("Ingre_id");
        //System.out.println(IngreId.size());
//        Intent intent=getIntent();
//        Match_menu =intent.getStringExtra("Match_menu");
        SetupAdapter();
        back=findViewById(R.id.match_back);
        back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    void SetupAdapter(){
        for(int i=0;i<IngreId.size();i++){
            List<Ingredient_match> data1=getData(IngreId.get(i));
            data.addAll(data1);
        }
        Button match_sort=findViewById(R.id.matchbutton);
        match_sort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //System.out.println(111);
                data.clear();
                MenuID = (ArrayList<Integer>) getMenu_sorted(IngreId);
                for (int i = 0; i < MenuID.size(); i++) {
                    List<Ingredient_match> data0 = getData_sorted(MenuID.get(i));
                    data.addAll(data0);
                }
                mra.notifyDataSetChanged();
            }
        });
        Button compre=findViewById(R.id.comprebutton);
        compre.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //System.out.println(222);
                data.clear();
                for(int i=0;i<IngreId.size();i++){
                    List<Ingredient_match> data1=getData(IngreId.get(i));
                    data.addAll(data1);
                }
                mra.notifyDataSetChanged();
            }
        });




        //List<Ingredient_match> data1=getData(IngreId);
//        strings=Match_menu.split("");
//        for(int i=1;i<strings.length;i++){
//            List<Ingredient_match> data_t=getData(strings[i]);
//            data.addAll(data_t);
//            Log.d(String.valueOf(i),strings[i]);
//        }
        //data.addAll(data1);
        if(data.size()>0){
            data=removeDuplicate(data);
        }
        else{
            Toast makeText=Toast.makeText(MatchActivity.this, "没有匹配菜谱", Toast.LENGTH_SHORT);
            makeText.setGravity(Gravity.CENTER, 0, 0);
            makeText.show();
        }
        //去除相同的结果

        mra=new MatchResAdapter(R.layout.match_ingredient_item,data);
        rcv=findViewById(R.id.menu_match_res);
        StaggeredGridLayoutManager sm=new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
        rcv.setLayoutManager(sm);
        rcv.setAdapter(mra);
        //item点击事件
        mra.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(@NonNull BaseQuickAdapter adapter, @NonNull View view, int position) {
                Intent intent = new Intent(MatchActivity.this, Menu.class);
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

    public List<Ingredient_match> getData(String mat){
        List<Ingredient_match> data22= new ArrayList<>();
        MyDatabaseHelper mymatchHelper = new MyDatabaseHelper(MatchActivity.this,"Cooking.db",null,1);
        SQLiteDatabase db = mymatchHelper.getReadableDatabase();
        //得到cursor
        cursor = db.rawQuery("select title,pic from Menu,Picture,IngredientInMenu,Ingredient where Ingredient.name like '" + mat + "' and Ingredient.pic_id=IngredientInMenu.ingredient_id and IngredientInMenu.menu_id=menu.menu_id and Picture.id=cover" , null);
        if (cursor.moveToFirst()) {
            Ingredient_match rs = new Ingredient_match();
            //rs.img_id = cursor.getInt(cursor.getColumnIndexOrThrow("pic_id"));
            rs.img=getImageBitmap(cursor.getString(cursor.getColumnIndexOrThrow("pic")));
            //Log.d("pic",cursor.getString(cursor.getColumnIndexOrThrow("pic")));

            int inx=cursor.getColumnIndex("title");
            rs.menu_title= cursor.getString(inx);

//            int inx2=cursor.getColumnIndex("introduction");
//            rs.content= cursor.getString(inx2);

            //Log.d("amount",rs.ingre_title);
            data22.add(rs);
        }
        while(cursor.moveToNext()){
            //moveToNext()移动光标到下一行
            //count+=1;
            Ingredient_match rs = new Ingredient_match();
            //rs.img_id = cursor.getInt(cursor.getColumnIndexOrThrow("pic_id"));
            rs.img=getImageBitmap(cursor.getString(cursor.getColumnIndexOrThrow("pic")));
            //Log.d("pic",cursor.getString(cursor.getColumnIndexOrThrow("pic")));
            System.out.println(111);

            int inx=cursor.getColumnIndex("title");
            rs.menu_title= cursor.getString(inx);

//            int inx2=cursor.getColumnIndex("introduction");
//            rs.content= cursor.getString(inx2);

            //Log.d("amount",rs.ingre_title);
            data22.add(rs);
        }
        return data22;
    }
    public List<Ingredient_match> removeDuplicate(List<Ingredient_match> list){
        List<Ingredient_match> listTemp = new ArrayList();
        listTemp.add(list.get(0));
        a:for(int i=1;i<list.size();i++){
            int count=0;
            for (int j=0;j<listTemp.size();j++){
                if(listTemp.get(j).menu_title.equals(list.get(i).menu_title)){
                    count+=1;
                    //Log.d("de2",listTemp.get(j).title);
                }
            }
            if(count==0){listTemp.add(list.get(i));}

        }
        return listTemp;
    }
    public List<Integer> getMenu_sorted(ArrayList s){
        List<Integer> Menu_sorted= new ArrayList<>();

        for(int i=0;i<s.size();i++){ //s为所选食材数组
            //System.out.println(s.get(i));
            //得到cursor
            MyDatabaseHelper mymatchHelper = new MyDatabaseHelper(MatchActivity.this,"Cooking.db",null,1);
            SQLiteDatabase db = mymatchHelper.getReadableDatabase();
            cursor = db.rawQuery("select menu_id from IngredientInMenu,Ingredient where Ingredient.name like '" + s.get(i) + "'and Ingredient.pic_id=IngredientInMenu.ingredient_id ", null);
            if (cursor.moveToFirst()){
                int index = cursor.getColumnIndex("menu_id");
                int menu=cursor.getInt(index);
                System.out.println(menu);
                Menu_sorted.add(menu);
            }
            while(cursor.moveToNext()){
                int index = cursor.getColumnIndex("menu_id");
                int menu=cursor.getInt(index);
                System.out.println(menu);
                //System.out.println(menu);
                Menu_sorted.add(menu);
            }


        }
        System.out.println(Menu_sorted);
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < Menu_sorted.size(); i++) {
            if(map.get(Menu_sorted.get(i))==null){
                map.put(Menu_sorted.get(i),1);
            }else{
                Integer tmp=map.get(Menu_sorted.get(i));
                map.put(Menu_sorted.get(i),tmp+1);
            }
        }
        Set<Integer> set = map.keySet();
        ArrayList<Integer> list = new ArrayList<>();
        Iterator<Integer> iterator = set.iterator();
        while(iterator.hasNext()){
            list.add(iterator.next());
        }
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(map.get(o1)<map.get(o2))
                    return 1;
                else if(map.get(o1)==map.get(o2))
                    return o1-o2;
                else return -1;
            }
        });


        return list;
    }
    public List<Ingredient_match> getData_sorted(Integer mat){
        List<Ingredient_match> data122= new ArrayList<>();
        MyDatabaseHelper mymatchHelper = new MyDatabaseHelper(MatchActivity.this,"Cooking.db",null,1);
        SQLiteDatabase db = mymatchHelper.getReadableDatabase();
        //得到cursor
        cursor = db.rawQuery("select title,pic from Menu,Picture where menu_id=" + mat + " and Picture.id=cover" , null);
        if (cursor.moveToFirst()) {
            Ingredient_match rs = new Ingredient_match();
            //rs.img_id = cursor.getInt(cursor.getColumnIndexOrThrow("pic_id"));
            rs.img=getImageBitmap(cursor.getString(cursor.getColumnIndexOrThrow("pic")));
            //Log.d("pic",cursor.getString(cursor.getColumnIndexOrThrow("pic")));

            int inx=cursor.getColumnIndex("title");
            rs.menu_title= cursor.getString(inx);

//            int inx2=cursor.getColumnIndex("introduction");
//            rs.content= cursor.getString(inx2);

            //Log.d("amount",rs.ingre_title);
            data122.add(rs);
        }
        while(cursor.moveToNext()){
            //moveToNext()移动光标到下一行
            //count+=1;
            Ingredient_match rs = new Ingredient_match();
            //rs.img_id = cursor.getInt(cursor.getColumnIndexOrThrow("pic_id"));
            rs.img=getImageBitmap(cursor.getString(cursor.getColumnIndexOrThrow("pic")));
            //Log.d("pic",cursor.getString(cursor.getColumnIndexOrThrow("pic")));
            System.out.println(111);

            int inx=cursor.getColumnIndex("title");
            rs.menu_title= cursor.getString(inx);

//            int inx2=cursor.getColumnIndex("introduction");
//            rs.content= cursor.getString(inx2);

            //Log.d("amount",rs.ingre_title);
            data122.add(rs);
        }
        return data122;
    }



}