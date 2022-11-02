package com.example.cooking.Data_view;

import com.example.cooking.R;

import java.util.ArrayList;
import java.util.List;

public class DataGenerator {
    public static String titles []={"秘制小汉堡","西红柿炒蛋","糖醋里脊","鱼香肉丝","酸菜鱼","巴斯克蛋糕"};
    public static int[] imgs ={R.drawable.hamburger,R.drawable.to_po,R.drawable.sw_pk,R.drawable.shredded_meat,R.drawable.sour_fish
    ,R.drawable.cheese_cake};

    public static String names []={"柳老师","小孙","小郑","小苏","小颜"};

    public static String ingre_names []={"鸡翅","鸡腿","鸡肉","鸡胸","鸡蛋"};

    public static int[] ingre_imgs ={R.drawable.chickenwings,R.drawable.drumsticks,R.drawable.chicken_spt,R.drawable.chickenbreast
            ,R.drawable.eggs};

    public static int[] heads={R.drawable.lll,R.drawable.xs,R.drawable.xz,R.drawable.xsu,R.drawable.xy};
    public static List<recipe> genRecipeData() {
        List<recipe> ret = new ArrayList<>();
        for (int i = 0; i < titles.length; ++i) {
            recipe recipes = new recipe();
            recipes.img_id = imgs[i];
            recipes.title = titles[i];
            recipes.content="这是一道美味的菜"+i;
            ret.add(recipes);
        }
        return ret;
    }

    public static List<Chat_member> genMessageData() {
        List<Chat_member> ret = new ArrayList<>();
        Chat_member cms1 = new Chat_member();
        cms1.headImg_id = heads[0];
        cms1.chatName = names[0];
        cms1.chatContent = "谢谢老师!" ;
        cms1.chatTime="11:11";
        ret.add(cms1);
        for (int i = 1; i < names.length; ++i) {
            Chat_member cms = new Chat_member();
            cms.headImg_id = heads[i];
            cms.chatName = names[i];
            //cms.chatContent = "Content of " + i;
            cms.chatContent = "我今天好忙"+ i ;
            cms.chatTime="11:11";
            ret.add(cms);
        }
        return ret;
    }

    public static List<Search_recipe> genSearchIngreData() {
        List<Search_recipe> ret = new ArrayList<>();
        for (int i = 0; i < ingre_names.length; ++i) {
            Search_recipe cms = new Search_recipe();
            cms.img_id = ingre_imgs[i];
            cms.ingre_title = ingre_names[i];
            cms.add_id =R.drawable.add;
            ret.add(cms);
        }
        return ret;
    }

    public static List<recipe> addRecipe(List<recipe> r,int num){
        List<recipe> ret = r;
        for (int i=0;i<num;i++){
            recipe rs = new recipe();
            rs.img_id = imgs[0];
            rs.title = titles[0];
            //rs.content = "Content of " + r.size()+i;
            rs.content="这是一道美味的菜"+ i;
            ret.add(rs);
        }
        return ret;
    }

    public static List<Chat_member> addChatmember(List<Chat_member> cm,int num){
        List<Chat_member> ret = cm;
        for (int i=0;i<num;i++){
            Chat_member cms = new Chat_member();
            cms.headImg_id = heads[0];
            cms.chatName = names[0];

            ret.add(cms);
        }
        return ret;
    }
}
