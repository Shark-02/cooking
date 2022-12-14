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
import android.widget.Toast;

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

import java.util.ArrayList;
import java.util.List;

public class SelectIngredient extends AppCompatActivity implements View.OnClickListener {

    ImageView sr_ic;
    NavigationView ingredient_nav;
    List<String> ingre_id,IngreId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_ingredient);
        ImageView select_ingredient_back = findViewById(R.id.back_icon);
        Button select_finish = findViewById(R.id.select_finish);
        ImageView basket=findViewById(R.id.basket01);
        sr_ic = findViewById(R.id.search_icon);
        ingre_id = new ArrayList<>();
        Bundle bb=getIntent().getExtras();
        if(bb!=null) {
            IngreId = bb.getStringArrayList("Ingre_id");
            ingre_id.addAll(IngreId);
        }
        //new MyThread().start();
        ImageView jiang = findViewById(R.id.jiang_add);
        jiang.setOnClickListener(this);
        ImageView suan = findViewById(R.id.suan_add);
        suan.setOnClickListener(this);
        ImageView egg = findViewById(R.id.jidan_add);
        egg.setOnClickListener(this);
        ImageView dacong = findViewById(R.id.dacong_add);
        dacong.setOnClickListener(this);
        ImageView xiaocong = findViewById(R.id.xiaocong_add);
        xiaocong.setOnClickListener(this);
        ImageView jichi = findViewById(R.id.jichi_add);
        jichi.setOnClickListener(this);
        ImageView jitui = findViewById(R.id.jitui_add);
        jitui.setOnClickListener(this);
        ImageView xilanhua = findViewById(R.id.xilanhua_add);
        xilanhua.setOnClickListener(this);
        ImageView dianfen = findViewById(R.id.dianfen_add);
        dianfen.setOnClickListener(this);
        ImageView xiaofanqie = findViewById(R.id.xiaofanqie_add);
        xiaofanqie.setOnClickListener(this);
        ImageView suannai = findViewById(R.id.suannai_add);
        suannai.setOnClickListener(this);
        ImageView niunai = findViewById(R.id.niunai_add);
        niunai.setOnClickListener(this);
        ImageView peigen = findViewById(R.id.peigen_add);
        peigen.setOnClickListener(this);
        ImageView feiniu = findViewById(R.id.feiniu_add);
        feiniu.setOnClickListener(this);
        ImageView zhuzhou = findViewById(R.id.zhuzhou_add);
        zhuzhou.setOnClickListener(this);
        ImageView xiaomila = findViewById(R.id.xiaomila_add);
        xiaomila.setOnClickListener(this);
        ImageView meigancai = findViewById(R.id.meigancai_add);
        meigancai.setOnClickListener(this);
        ImageView caomei = findViewById(R.id.caomei_add);
        caomei.setOnClickListener(this);


        //这里是Back
        select_ingredient_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }

        });
        //这里是购物车
        basket.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(SelectIngredient.this,Ingredient_basket.class);
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("Ingre_id",(ArrayList<String>)ingre_id);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        //这里是选好了
        select_finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //System.out.println(ingre_id.size());
                //int[] ingreid=ingre_id.toArray(new int[ingre_id.size()]);
                Intent intent = new Intent(SelectIngredient.this, MatchActivity.class);
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("Ingre_id", (ArrayList<String>) ingre_id);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        //这里是搜索栏
        sr_ic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SelectIngredient.this, MatchIngredient.class);
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("Ingre_id", (ArrayList<String>) ingre_id);
                intent.putExtras(bundle);
                startActivity(intent);
                finish();
            }
        });
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);

        ingredient_nav = findViewById(R.id.ingredient_navigation);
        //获取navController
        NavController Fragment_navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        //通过setupWithNavController将导航和导航控制器进行绑定
        NavigationUI.setupWithNavController(ingredient_nav, Fragment_navController);

//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                ImageView egg = findViewById(R.id.jidan_add);
//                egg.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        ingre_id.add(337);
//                        //System.out.println((ingre_id));
//                    }
//                });
//                //姜
//                ImageView jiang = findViewById(R.id.jiang_add);
//                jiang.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        ingre_id.add(375);
//                        //System.out.println((ingre_id));
//                    }
//                });
//                //蒜
//                ImageView suan = findViewById(R.id.suan_add);
//                suan.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        ingre_id.add(449);
//                    }
//                });
//                //大葱
//                ImageView dacong = findViewById(R.id.dacong_add);
//                dacong.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        ingre_id.add(324);
//                    }
//                });
//                //小葱
//                ImageView xiaocong = findViewById(R.id.xiaocong_add);
//                xiaocong.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        ingre_id.add(464);
//                    }
//                });
//                //鸡翅
//                ImageView jichi = findViewById(R.id.jichi_add);
//                jichi.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        ingre_id.add(379);
//                    }
//                });
//                //鸡腿
//                ImageView jitui = findViewById(R.id.jitui_add);
//                jitui.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        ingre_id.add(382);
//                    }
//                });
//                //鸡胸肉
//                ImageView jixiongrou = findViewById(R.id.jixiongrou_add);
//                jixiongrou.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        ingre_id.add(384);
//                    }
//                });
//                //淀粉
//                ImageView dianfen = findViewById(R.id.dianfen_add);
//                dianfen.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        ingre_id.add(330);
//                    }
//                });
//                //白酒
//                ImageView baijiu = findViewById(R.id.baijiu_add);
//                baijiu.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        ingre_id.add(305);
//                    }
//                });
//                //白萝卜
//                ImageView bailuobo = findViewById(R.id.bailuobo_add);
//                bailuobo.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        ingre_id.add(307);
//                    }
//                });
//                //白葡萄酒
//                ImageView baiputaojiu = findViewById(R.id.baiputaojiu_add);
//                baiputaojiu.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        ingre_id.add(309);
//                    }
//                });
//                //白糖
//                ImageView baitang = findViewById(R.id.baitang_add);
//                baitang.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        ingre_id.add(310);
//                    }
//                });
//                //醋
//                ImageView cu = findViewById(R.id.cu_add);
//                cu.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        ingre_id.add(323);
//                    }
//                });
//                //淡奶油
//                ImageView dannaiyou = findViewById(R.id.dannaiyou_add);
//                dannaiyou.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        ingre_id.add(327);
//                    }
//                });
//                //大闸蟹
//                ImageView dazaxie = findViewById(R.id.dazhaxie_add);
//                dazaxie.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        ingre_id.add(329);
//                    }
//                });
//
//                //培根
//                ImageView peigen = findViewById(R.id.peigen_add);
//                peigen.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        ingre_id.add(437);
//                    }
//                });
//                //肥牛
//                ImageView feiniu = findViewById(R.id.feiniu_add);
//                feiniu.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        ingre_id.add(340);
//                    }
//                });
//                //海盐
//                ImageView haiyan = findViewById(R.id.haiyan_add);
//                haiyan.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        ingre_id.add(349);
//                    }
//                });
//                //耗油
//                ImageView haoyou = findViewById(R.id.haoyou_add);
//                haoyou.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        ingre_id.add(350);
//                    }
//                });
//                //胡萝卜
//                ImageView huluobo = findViewById(R.id.huluobo_add);
//                huluobo.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        ingre_id.add(374);
//                    }
//                });
//                //酱油
//                ImageView jiangyou = findViewById(R.id.jiangyou_add);
//                jiangyou.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        ingre_id.add(376);
//                    }
//                });
//                //可乐
//                ImageView kele = findViewById(R.id.kele_add);
//                kele.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        ingre_id.add(388);
//                    }
//                });
//                //老抽
//                ImageView laochou = findViewById(R.id.laochou_add);
//                laochou.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        ingre_id.add(395);
//                    }
//                });
//                //料酒
//                ImageView liaojiu = findViewById(R.id.liaojiu_add);
//                liaojiu.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        ingre_id.add(396);
//                    }
//                });
//                //猪肉
//                ImageView zhurou = findViewById(R.id.zhurou_add);
//                zhurou.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        ingre_id.add(491);
//                    }
//                });
//                //猪肘
//                ImageView zhuzhou = findViewById(R.id.zhuzhou_add);
//                zhuzhou.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        ingre_id.add(493);
//                    }
//                });
//                //里脊
//                ImageView liji = findViewById(R.id.liji_add);
//                liji.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        ingre_id.add(397);
//                    }
//                });
//                //五花肉
//                ImageView wuhuarou = findViewById(R.id.wuhua_add);
//                wuhuarou.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        ingre_id.add(456);
//                    }
//                });
//                //牛排
//                ImageView niupai = findViewById(R.id.niupai_add);
//                niupai.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        ingre_id.add(429);
//                    }
//                });
//                //牛腩
//                ImageView niunan = findViewById(R.id.niunan_add);
//                niunan.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        ingre_id.add(428);
//                    }
//                });
//                //内酯豆腐
//                ImageView neizhidoufu = findViewById(R.id.neizhidoufu_add);
//                neizhidoufu.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        ingre_id.add(423);
//                    }
//                });
//                //面条
//                ImageView miantiao = findViewById(R.id.miantiao_add);
//                miantiao.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        ingre_id.add(415);
//                    }
//                });
//                //土豆
//                ImageView tudou = findViewById(R.id.tudou_add);
//                tudou.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        ingre_id.add(454);
//                    }
//                });
//                //生抽
//                ImageView shengchou = findViewById(R.id.shengchou_add);
//                shengchou.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        ingre_id.add(446);
//                    }
//                });
//                //三文鱼
//                ImageView sanwenyu = findViewById(R.id.sanwenyu_add);
//                sanwenyu.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        ingre_id.add(444);
//                    }
//                });
//                //虾
//                ImageView xia = findViewById(R.id.xia_add);
//                xia.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        ingre_id.add(457);
//                    }
//                });
//                //西红柿
//                ImageView xihongshi = findViewById(R.id.xihongshi_add);
//                xihongshi.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        ingre_id.add(472);
//                    }
//                });
//            }
//        }).start();

    }
//}

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.jidan_add:
                ingre_id.add("鸡蛋");
                Toast.makeText(SelectIngredient.this, "您选择了鸡蛋", Toast.LENGTH_SHORT).show();
                break;
            case R.id.xilanhua_add:
                ingre_id.add("西兰花");
                Toast.makeText(SelectIngredient.this, "您选择了西兰花", Toast.LENGTH_SHORT).show();
                break;
            case R.id.xiaofanqie_add:
                ingre_id.add("小番茄");
                Toast.makeText(SelectIngredient.this, "您选择了小番茄", Toast.LENGTH_SHORT).show();
                break;
            case R.id.jiang_add:
                ingre_id.add("姜");
                Toast.makeText(SelectIngredient.this, "您选择了姜", Toast.LENGTH_SHORT).show();
                break;
            case R.id.suan_add:
                ingre_id.add("蒜");
                Toast.makeText(SelectIngredient.this, "您选择了蒜", Toast.LENGTH_SHORT).show();
                break;
            case R.id.dacong_add:
                ingre_id.add("大葱");
                Toast.makeText(SelectIngredient.this, "您选择了大葱", Toast.LENGTH_SHORT).show();
                break;
            case R.id.xiaocong_add:
                ingre_id.add("小葱");
                Toast.makeText(SelectIngredient.this, "您选择了小葱", Toast.LENGTH_SHORT).show();
                break;
            case R.id.jichi_add:
                ingre_id.add("鸡翅");
                Toast.makeText(SelectIngredient.this, "您选择了鸡翅", Toast.LENGTH_SHORT).show();
                break;
            case R.id.jitui_add:
                ingre_id.add("鸡腿");
                Toast.makeText(SelectIngredient.this, "您选择了鸡腿", Toast.LENGTH_SHORT).show();
                break;
            case R.id.suannai_add:
                ingre_id.add("酸奶");
                Toast.makeText(SelectIngredient.this, "您选择了酸奶", Toast.LENGTH_SHORT).show();
                break;
            case R.id.niunai_add:
                ingre_id.add("牛奶");
                Toast.makeText(SelectIngredient.this, "您选择了牛奶", Toast.LENGTH_SHORT).show();
                break;
            case R.id.peigen_add:
                ingre_id.add("培根");
                Toast.makeText(SelectIngredient.this, "您选择了培根", Toast.LENGTH_SHORT).show();
                break;
            case R.id.feiniu_add:
                ingre_id.add("肥牛");
                Toast.makeText(SelectIngredient.this, "您选择了肥牛", Toast.LENGTH_SHORT).show();
                break;
            case R.id.zhuzhou_add:
                ingre_id.add("猪肘");
                Toast.makeText(SelectIngredient.this, "您选择了猪肘", Toast.LENGTH_SHORT).show();
                break;
            case R.id.meigancai_add:
                ingre_id.add("梅干菜");
                Toast.makeText(SelectIngredient.this, "您选择了梅干菜", Toast.LENGTH_SHORT).show();
                break;
            case R.id.xiaomila_add:
                ingre_id.add("小米辣");
                Toast.makeText(SelectIngredient.this, "您选择了小米辣", Toast.LENGTH_SHORT).show();
                break;
            case R.id.caomei_add:
                ingre_id.add("草莓");
                Toast.makeText(SelectIngredient.this, "您选择了草莓", Toast.LENGTH_SHORT).show();
                break;
            case R.id.dianfen_add:
                ingre_id.add("淀粉");
                Toast.makeText(SelectIngredient.this, "您选择了淀粉", Toast.LENGTH_SHORT).show();
                break;
//            case R.id.baijiu_add:
//                ingre_id.add(305);
//                break;
//            case R.id.bailuobo_add:
//                ingre_id.add(307);
//                break;
//            case R.id.baiputaojiu_add:
//                ingre_id.add(309);
//                break;
//            case R.id.baitang_add:
//                ingre_id.add(310);
//                break;
//            case R.id.cu_add:
//                ingre_id.add(323);
//                break;
//            case R.id.dannaiyou_add:
//                ingre_id.add(327);
//                break;
//            case R.id.dazhaxie_add:
//                ingre_id.add(329);
//                break;
//            case R.id.peigen_add:
//                ingre_id.add(437);
//                break;
//            case R.id.feiniu_add:
//                ingre_id.add(340);
//                break;
//            case R.id.haiyan_add:
//                ingre_id.add(349);
//                break;
//            case R.id.haoyou_add:
//                ingre_id.add(350);
//                break;
//            case R.id.huluobo_add:
//                ingre_id.add(374);
//                break;
//            case R.id.jiangyou_add:
//                ingre_id.add(376);
//                break;
//            case R.id.kele_add:
//                ingre_id.add(388);
//                break;
//            case R.id.laochou_add:
//                ingre_id.add(395);
//                break;
//            case R.id.liaojiu_add:
//                ingre_id.add(396);
//                break;
//            case R.id.zhurou_add:
//                ingre_id.add(491);
//                break;
//            case R.id.zhuzhou_add:
//                ingre_id.add(493);
//                break;
//            case R.id.liji_add:
//                ingre_id.add(397);
//                break;
//            case R.id.wuhua_add:
//                ingre_id.add(456);
//                break;
//            case R.id.niupai_add:
//                ingre_id.add(429);
//                break;
//            case R.id.niunan_add:
//                ingre_id.add(428);
//                break;
//            case R.id.neizhidoufu_add:
//                ingre_id.add(423);
//                break;
//            case R.id.miantiao_add:
//                ingre_id.add(415);
//                break;
//            case R.id.tudou_add:
//                ingre_id.add(454);
//                break;
//            case R.id.shengchou_add:
//                ingre_id.add(446);
//                break;
//            case R.id.sanwenyu_add:
//                ingre_id.add(444);
//                break;
//            case R.id.xia_add:
//                ingre_id.add(457);
//                break;
//            case R.id.xihongshi_add:
//                ingre_id.add(472);
//                break;
            default:
                break;
//        }
//        currentFragment=fg;
//        transaction.commit();
        }
    }
}