package com.example.cooking.ui.home;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.example.cooking.Adapter.MyAdapter;
import com.example.cooking.Data_view.DataGenerator;
import com.example.cooking.Data_view.recipe;
import com.example.cooking.MainActivity_bottom;
import com.example.cooking.MatchActivity;
import com.example.cooking.Menu;
import com.example.cooking.MyChat;
import com.example.cooking.MyComment;
import com.example.cooking.MyDraft;
import com.example.cooking.MyFinish;
import com.example.cooking.R;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.example.cooking.Upload;

import com.google.android.material.navigation.NavigationView;

import java.util.List;
import java.util.Random;

public class  HomeFragment extends Fragment /*implements View.OnClickListener*/ {


    View root,itemView;
    Toolbar tb;
    DrawerLayout mDrawerLayout;
    NavigationView navViewStart;
    ImageView iv,itemimg;
    List<recipe> data;
    MyAdapter ma;
    RecyclerView rcv;



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        //HomeViewModel homeViewModel =
                //new ViewModelProvider(this).get(HomeViewModel.class);

        root = inflater.inflate(R.layout.myhome_drawer, container, false);

        SetupView();
        SetupAdapter();
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

    void SetupView(){
        tb=root.findViewById(R.id.home_tb);
        mDrawerLayout = root.findViewById(R.id.my_drawer);
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

    /*@Override
    public void onClick(View arg0) {
        Log.d("1","btn is click");
        mDrawerLayout.openDrawer(GravityCompat.START);
    }*/
    void SetupAdapter(){
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
        //item点击事件
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
    }

}