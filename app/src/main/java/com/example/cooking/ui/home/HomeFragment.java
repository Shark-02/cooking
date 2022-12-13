package com.example.cooking.ui.home;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.example.cooking.Adapter.MyAdapter;
import com.example.cooking.Data_view.DataGenerator;
import com.example.cooking.Data_view.recipe;
import com.example.cooking.MyDatabaseHelper;
import com.example.cooking.MyFans;
import com.example.cooking.Menu;
import com.example.cooking.MyComment;
import com.example.cooking.MyDraft;
import com.example.cooking.MyFinish;
import com.example.cooking.MyFollow;
import com.example.cooking.R;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.appcompat.widget.Toolbar;

import androidx.annotation.NonNull;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HomeFragment extends Fragment /*implements View.OnClickListener*/ {


    View root,itemView;
    Toolbar tb;
    DrawerLayout mDrawerLayout;
    NavigationView navViewStart;
    ImageView iv,itemimg;
    List<recipe> data;
    MyAdapter ma,ma2;
    RecyclerView rcv,rcv2;
    List<recipe> published_data;
    List<recipe> favorite_data;
    MyDatabaseHelper dbHelper;



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        //HomeViewModel homeViewModel =
                //new ViewModelProvider(this).get(HomeViewModel.class);

        root = inflater.inflate(R.layout.myhome_drawer, container, false);

        SetupView();
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

    void SetupView(){
        tb=root.findViewById(R.id.home_tb);
        mDrawerLayout = root.findViewById(R.id.my_drawer);
        root.findViewById(R.id.myconcern).setOnClickListener(v -> startActivity(new Intent(getActivity(), MyFollow.class)));
        root.findViewById(R.id.myfans).setOnClickListener(v ->startActivity(new Intent(getActivity(), MyFans.class)));
        iv=root.findViewById(R.id.open_drawer);
        //iv.setOnClickListener(this);
        if (iv!=null){
            Log.d("null","iv is not null");
        }
        NavigationView navigationview = root.findViewById(R.id.nav_view);
        navigationview.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                int itemId = item.getItemId();
                switch (itemId) {
                    case R.id.nav_draft:
                        Intent intent3 = new Intent(getActivity(), MyDraft.class);
                        startActivity(intent3);
                        break;
                    case R.id.nav_mycomment:
                        Intent intent = new Intent(getActivity(), MyComment.class);
                        startActivity(intent);
                        break;
                    case R.id.nav_mydone:
                        Intent intent2 = new Intent(getActivity(), MyFinish.class);
                        startActivity(intent2);
                        break;
                }
                return true;
            }
        });
        //mDrawerLayout.openDrawer(GravityCompat.START);
       /* iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("1","btn is click");
                mDrawerLayout.openDrawer(GravityCompat.START);

            }
        });*/

        //navigationview.setCheckedItem(R.id.nav_draft);
        //navigationview.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            //@Override
            //public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                //mDrawerlayout.closeDrawer(Gravity.START);
                //return true;
            //}
        //});

    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        BottomNavigationView bottomNavigationView = root.findViewById(R.id.switchable);
        NavController navController = Navigation.findNavController(getActivity(), R.id.myhome_fra);
        //AppBarConfiguration configuration = new AppBarConfiguration.Builder(navController.getGraph()).build();
        //NavigationUI.setupActionBarWithNavController(this,navController,configuration);
        NavigationUI.setupWithNavController(bottomNavigationView, navController);

        SetupAdapter();
    }

    /*@Override
    public void onClick(View arg0) {
        Log.d("1","btn is click");
        mDrawerLayout.openDrawer(GravityCompat.START);
    }*/
    /*void SetupAdapter(){
        data= DataGenerator.genRecipeData();
        int num= new Random().nextInt(20);
        for (int i=0;i<num;i++){
            recipe rs = new recipe();
            rs.img_id = R.drawable.to_po;
            rs.title = "番茄炒蛋";
            rs.content = "肚子好饿啊！ " + data.size();
            data.add(rs);
        }
        ma=new MyAdapter(R.layout.view_list_itemlayout,data);
        rcv=root.findViewById(R.id.myhome_rcv);
        StaggeredGridLayoutManager sm=new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
        rcv.setLayoutManager(sm);
        rcv.setAdapter(ma);
        item点击事件
        ma.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(@NonNull BaseQuickAdapter adapter, @NonNull View view, int position) {
                //itemView=sm.getChildAt(position);
                //itemimg=itemView.findViewById(R.id.item_img);
                //Bitmap bitmap = ((BitmapDrawable)itemimg.getDrawable()).getBitmap();
                Intent intent = new Intent(getActivity(), Menu.class);
                //intent.putExtra("itemimg",bitmap);
                startActivity(intent);
            }
        });
    }*/

    void SetupAdapter(){
        published_data= new ArrayList<>();
        favorite_data= new ArrayList<>();
        MyDatabaseHelper dbHelper = new MyDatabaseHelper(getActivity(),"Cooking.db",null,1);
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        Cursor cursor=db.rawQuery("select title,introduction from Menu where user_id=2",null);
        Cursor cursor1 = db.rawQuery("select title,pic from Menu,Picture where Picture.id=cover and user_id=2" ,null);

        //这里还要加”我的收藏“的查询语句
        /*int menuid=0;
        Cursor cursor2=db.rawQuery("select menu_id from Collection where user_id=2", null);*/

        if(cursor.moveToFirst() & cursor1.moveToFirst()){
            do{
                recipe rs = new recipe();
                rs.img=getImageBitmap(cursor1.getString(cursor1.getColumnIndexOrThrow("pic")));
                Log.d("pic",cursor1.getString(cursor1.getColumnIndexOrThrow("pic")));
                rs.title = cursor.getString(cursor.getColumnIndexOrThrow("title"));
                Log.d("title",cursor.getString(cursor.getColumnIndexOrThrow("title")));
                rs.content = cursor.getString(cursor.getColumnIndexOrThrow("introduction"));
                Log.d("introduction",cursor.getString(cursor.getColumnIndexOrThrow("introduction")));
                published_data.add(rs);
            }while (cursor.moveToNext() & cursor1.moveToNext());
        }
        /*if (cursor2.moveToFirst())
        {menuid=cursor2.getInt(cursor2.getColumnIndexOrThrow("menu_id"));}
        Cursor cursor3 = db.rawQuery("select title,introduction,pic from Menu,Menu,Picture where Picture.id=cover and menu_id= " + menuid, null);
        if (cursor3.moveToFirst()) {
            recipe rs = new recipe();
            rs.img=getImageBitmap(cursor3.getString(cursor3.getColumnIndexOrThrow("pic")));
            Log.d("pic",cursor3.getString(cursor3.getColumnIndexOrThrow("pic")));
            rs.title = cursor3.getString(cursor3.getColumnIndexOrThrow("title"));
            Log.d("title",cursor3.getString(cursor3.getColumnIndexOrThrow("title")));
            rs.content = cursor3.getString(cursor3.getColumnIndexOrThrow("introduction"));
            Log.d("introduction",cursor3.getString(cursor3.getColumnIndexOrThrow("introduction")));
            favorite_data.add(rs);
        }*/
        cursor.close();
        cursor1.close();
        //cursor2.close();
        //cursor3.close();

        ma=new MyAdapter(R.layout.view_list_itemlayout,published_data);
        rcv=root.findViewById(R.id.published_content);
        StaggeredGridLayoutManager sm=new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
        rcv.setLayoutManager(sm);
        rcv.setAdapter(ma);


        //View view = View.inflate(getContext(), R.layout.fragment_my_favorite, null);


    }

    public Bitmap getImageBitmap(String imgName){
        String DIR = "/data/data/com.example.cooking/img/";
        String img= DIR+imgName;
        BitmapFactory.Options opt = new BitmapFactory.Options();
        opt.inPreferredConfig = Bitmap.Config.RGB_565;
        Bitmap bitmap = BitmapFactory.decodeFile(img, opt);
        return bitmap;

    }

    public List<recipe> getData(){
        List<recipe> data22 = new ArrayList<>();
        //Toast.makeText(MatchIngredient.this, "没有查询到数据", Toast.LENGTH_SHORT).show();
        MyDatabaseHelper myopenHelper = new MyDatabaseHelper(getContext(),"Cooking.db",null,1);
        SQLiteDatabase db = myopenHelper.getReadableDatabase();
        Cursor cursor = db.rawQuery("select title,pic from Menu,Picture,Collection where  Picture.id=cover and Collection.menu_id=Menu.menu_id  order by Collection.id desc" , null);
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
            data22.add(rs);
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
            data22.add(rs);
        }
        return data22;

    }
}

