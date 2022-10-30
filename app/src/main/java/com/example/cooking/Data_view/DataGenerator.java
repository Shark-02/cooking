package com.example.cooking.Data_view;

import com.example.cooking.R;

import java.util.ArrayList;
import java.util.List;

public class DataGenerator {
    public static String titles []={"西红柿炒蛋","糖醋里脊","鱼香肉丝","酸菜鱼","巴斯克蛋糕"};
    public static int[] imgs ={R.drawable.to_po,R.drawable.sw_pk,R.drawable.shredded_meat,R.drawable.sour_fish
    ,R.drawable.cheese_cake};

    public static String names []={"柳老师","小孙","小郑","小苏","小颜"};
    public static int[] heads={R.drawable.lll,R.drawable.xs,R.drawable.xz,R.drawable.xsu,R.drawable.xy};
    public static List<recipe> genRecipeData() {
        List<recipe> ret = new ArrayList<>();
        for (int i = 0; i < titles.length; ++i) {
            recipe recipes = new recipe();
            recipes.img_id = imgs[i];
            recipes.title = titles[i];
            recipes.content = "Content of " + i;
            ret.add(recipes);
        }
        return ret;
    }

    public static List<Chat_member> genMessageData() {
        List<Chat_member> ret = new ArrayList<>();
        for (int i = 0; i < names.length; ++i) {
            Chat_member cms = new Chat_member();
            cms.headImg_id = heads[i];
            cms.chatName = names[i];
            cms.chatContent = "Content of " + i;
            ret.add(cms);
        }
        return ret;
    }
}
