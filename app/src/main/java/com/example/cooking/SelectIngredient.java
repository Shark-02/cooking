package com.example.cooking;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.cooking.ui.Ingredient.Fragment_bean;
import com.example.cooking.ui.Ingredient.Fragment_fruit;
import com.example.cooking.ui.Ingredient.Fragment_hot;
import com.example.cooking.ui.Ingredient.Fragment_meatt;
import com.example.cooking.ui.Ingredient.Fragment_oil;
import com.example.cooking.ui.Ingredient.Fragment_others;
import com.example.cooking.ui.Ingredient.Fragment_rice;
import com.example.cooking.ui.Ingredient.Fragment_seafood;
import com.example.cooking.ui.Ingredient.Fragment_spice;
import com.example.cooking.ui.Ingredient.Fragment_vegetable;
import com.example.cooking.ui.Ingredient.Fragment_water;
import com.google.android.material.navigation.NavigationView;

public class SelectIngredient extends AppCompatActivity {

    ImageView sr_ic;
    NavigationView ingredient_nav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_ingredient);
        ImageView select_ingredient_back=findViewById(R.id.back_icon);
        Button select_finish=findViewById(R.id.select_finish);
        sr_ic=findViewById(R.id.search_icon);
        //这里是Back
        select_ingredient_back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                finish();
            }

        });
        //这里是选好了
        select_finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(SelectIngredient.this,MatchActivity.class);
                startActivity(intent);
            }
        });
        //这里是搜索栏
        sr_ic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(SelectIngredient.this,MatchIngredient.class);
                startActivity(intent);
            }
        });
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);

        ingredient_nav=findViewById(R.id.ingredient_navigation);
        //获取navController
        NavController Fragment_navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        //通过setupWithNavController将导航和导航控制器进行绑定
        NavigationUI.setupWithNavController(ingredient_nav,Fragment_navController);

//        manager=getSupportFragmentManager();
//        transaction=manager.beginTransaction();
//        transaction.show(Hot);
////        transaction.hide(Meat);
////        transaction.hide(Seafood);
////        transaction.hide(Vegetable);
////        transaction.hide(Fruit);
////        transaction.hide(Fungus);
////        transaction.hide(Rice);
////        transaction.hide(Bean);
////        transaction.hide(Spice);
////        transaction.hide(Oil);
////        transaction.hide(Water);
////        transaction.hide(Other);
//        transaction.commit();
//        currentFragment=Hot;
//        //时令热门
//        TextView hot=findViewById(R.id.hot_text);
//        hot.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                FragmentHideShow(Hot);
//                hot.setTextSize(23);
//                hot.setTextColor(Color.BLACK);
//                hot.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));
//
//            }
//        });
//        //肉类
//        TextView meat=findViewById(R.id.meat_text);
//        meat.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                FragmentHideShow(Meat);
//                meat.setTextSize(23);
//                meat.setTextColor(Color.BLACK);
//                meat.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));
//
//            }
//        });
//        //水产
//        TextView seafood=findViewById(R.id.seafood_text);
//        seafood.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                FragmentHideShow(Seafood);
//                seafood.setTextSize(23);
//                seafood.setTextColor(Color.BLACK);
//                seafood.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));
//            }
//        });
//        //蔬菜
//        TextView vegetable=findViewById(R.id.vegetable_text);
//        vegetable.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                FragmentHideShow(Vegetable);
//                vegetable.setTextSize(23);
//                vegetable.setTextColor(Color.BLACK);
//                vegetable.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));
//            }
//        });
//        //水果
//        TextView fruit=findViewById(R.id.fruit_text);
//        fruit.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                FragmentHideShow(Fruit);
//                fruit.setTextSize(23);
//                fruit.setTextColor(Color.BLACK);
//                fruit.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));
//            }
//        });
//
//        //米面粉
//        TextView rice=findViewById(R.id.rice_text);
//        rice.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                FragmentHideShow(Rice);
//                rice.setTextSize(23);
//                rice.setTextColor(Color.BLACK);
//                rice.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));
//            }
//        });
//        //豆乳
//        TextView bean=findViewById(R.id.bean_text);
//        bean.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                FragmentHideShow(Bean);
//                bean.setTextSize(23);
//                bean.setTextColor(Color.BLACK);
//                bean.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));
//            }
//        });
//        //调味品
//        TextView spice=findViewById(R.id.spice_text);
//        spice.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                FragmentHideShow(Spice);
//                spice.setTextSize(23);
//                spice.setTextColor(Color.BLACK);
//                spice.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));
//            }
//        });
//        //食用油
//        TextView oil=findViewById(R.id.oil_text);
//        oil.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                FragmentHideShow(Oil);
//                oil.setTextSize(23);
//                oil.setTextColor(Color.BLACK);
//                oil.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));
//            }
//        });
//        //酒水茶饮
//        TextView water=findViewById(R.id.water_text);
//        water.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                FragmentHideShow(Water);
//                water.setTextSize(23);
//                water.setTextColor(Color.BLACK);
//                water.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));
//            }
//        });
//        //其他
//        TextView other=findViewById(R.id.others_text);
//        other.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                FragmentHideShow(Other);
//                other.setTextSize(23);
//                other.setTextColor(Color.BLACK);
//                other.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));
//            }
//        });
//
//
//
//    }
//    private void FragmentHideShow(Fragment fg){
//        // show or hide fragments to improve the stablility and reduce costs
//        manager=getSupportFragmentManager();
//        transaction=manager.beginTransaction();
//        if(!fg.isAdded()){
//            transaction.hide(currentFragment);
//            transaction.add(R.id.main_layout_content,fg);
//        }else{
//            transaction.hide(currentFragment);
//            transaction.show(fg);
//        }
//        currentFragment=fg;
//        transaction.commit();
    }
}