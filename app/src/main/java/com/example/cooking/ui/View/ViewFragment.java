package com.example.cooking.ui.View;

import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.example.cooking.Adapter.MyAdapter;
import com.example.cooking.Data_view.Chat_member;
import com.example.cooking.Data_view.DataGenerator;
import com.example.cooking.Data_view.recipe;
import com.example.cooking.HomeSearchRes;
import com.example.cooking.Menu;
import com.example.cooking.MyDatabaseHelper;
import com.example.cooking.MyFinish;
import com.example.cooking.R;
import com.example.cooking.SearchActivity;
import com.example.cooking.SelectIngredient;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ViewFragment extends Fragment {

    private ViewViewModel mViewModel;
    MyAdapter ma;
    List<recipe> data;
    RecyclerView lv;
    View view;
    ImageView search_box2;
    Cursor cursor;
    public static ViewFragment newInstance() {
        return new ViewFragment();
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_view, container, false);
        //setupView();
        search_box2=view.findViewById(R.id.search_box2_view);
        search_box2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SearchActivity.class);
                startActivity(intent);
            }

        });
        refreshrcv(10);
        setupfresh();
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(ViewViewModel.class);

        // TODO: Use the ViewModel
    }

    void setupView(){
        data= DataGenerator.genRecipeData();
        //Log.d("size",String.valueOf(data.size()));
        int num= new Random().nextInt(20);
        for (int i=0;i<num;i++){
            recipe rs = new recipe();
            rs.img_id = R.drawable.to_po;
            rs.title = "番茄炒蛋";
            rs.content = "也太好吃了吧！ " + data.size();
            data.add(rs);
        }
        //ma.notifyDataSetChanged();
        //data=DataGenerator.addRecipe(data,num);
        ma=new MyAdapter(R.layout.view_list_itemlayout,data);
        lv=view.findViewById(R.id.view_lv);

        //LinearLayoutManager layoutManager = new LinearLayoutManager(lv.getContext());
        StaggeredGridLayoutManager sm=new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
        //lv.setLayoutManager(layoutManager);
        lv.setLayoutManager(sm);
        lv.setAdapter(ma);

        //item的点击事件
        ma.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(@NonNull BaseQuickAdapter adapter, @NonNull View view, int position) {
                Intent intent = new Intent(getActivity(), Menu.class);
                startActivity(intent);
            }
        });

    }

    void setupfresh(){
        SwipeRefreshLayout swipeRefreshLayout=view.findViewById(R.id.myfresh);
        swipeRefreshLayout.setColorSchemeColors(getResources().getColor(android.R.color.holo_orange_light));
        // 等待圈的大小，两个数值：LARGE（大的）和 DEFAULT（默认大小）
        //swipeRefreshLayout.setSize(SwipeRefreshLayout.LARGE);
        // 设置等待效果的背景颜色
        //swipeRefreshLayout.setProgressBackgroundColorSchemeResource(android.R.color.holo_red_dark);
        // 手指在屏幕下拉多少触发。默认值是64
        //swipeRefreshLayout.setDistanceToTriggerSync(50);
        // 下拉刷新完成后触发事件
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                swipeRefreshLayout.setRefreshing(true);
                refreshrcv(34);
                swipeRefreshLayout.post(new Runnable() {
                    @Override
                    public void run() {
                        if (swipeRefreshLayout.isRefreshing()){
                            swipeRefreshLayout.setRefreshing(false);
                        }
                    }
                });

                Toast.makeText(getContext(), "刷新成功", Toast.LENGTH_SHORT).show();
            }
        });
    }

    void refreshrcv(int num){
        List<recipe> data=getData(num);
        ma=new MyAdapter(R.layout.view_list_itemlayout,data);
        lv=view.findViewById(R.id.view_lv);
        StaggeredGridLayoutManager sm=new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
        lv.setLayoutManager(sm);
        lv.setAdapter(ma);
        //item点击事件
        ma.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(@NonNull BaseQuickAdapter adapter, @NonNull View view, int position) {
                //itemView=sm.getChildAt(position);
                //itemimg=itemView.findViewById(R.id.item_img);
                //Bitmap bitmap = ((BitmapDrawable)itemimg.getDrawable()).getBitmap();
                //Log.d("po",String.valueOf(position));
                Intent intent = new Intent(getContext(), Menu.class);
                intent.putExtra("title",data.get(position).title);
                startActivity(intent);
            }
        });
    }

    public List<recipe> getData(int num){
        List<recipe> data22= new ArrayList<>();
        MyDatabaseHelper myopenHelper = new MyDatabaseHelper(getContext(),"Cooking.db",null,1);
        SQLiteDatabase db = myopenHelper.getReadableDatabase();
        //得到cursor
        cursor = db.rawQuery("select title,pic,introduction from Menu,Picture where  Picture.id=cover order by random() limit "+String.valueOf(num) , null);
        if (!cursor.moveToFirst())
        {}
        else{
            recipe rs = new recipe();
            //rs.img_id = cursor.getInt(cursor.getColumnIndexOrThrow("pic_id"));
            if(getImageBitmap(cursor.getString(cursor.getColumnIndexOrThrow("pic")))==null){
                rs.img=  BitmapFactory.decodeResource(getResources(), R.drawable.lose, null);
            }
            else{
                rs.img=getImageBitmap(cursor.getString(cursor.getColumnIndexOrThrow("pic")));
            }
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
            if(getImageBitmap(cursor.getString(cursor.getColumnIndexOrThrow("pic")))==null){
                rs.img=  BitmapFactory.decodeResource(getResources(), R.drawable.lose, null);
            }
            else{
                rs.img=getImageBitmap(cursor.getString(cursor.getColumnIndexOrThrow("pic")));
            }
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

    public Bitmap getImageBitmap(String imgName){
        String DIR = "/data/data/com.example.cooking/img/";
        String img= DIR+imgName;
        BitmapFactory.Options opt = new BitmapFactory.Options();
        opt.inPreferredConfig = Bitmap.Config.RGB_565;
        Bitmap bitmap = BitmapFactory.decodeFile(img, opt);
        return bitmap;
    }




}