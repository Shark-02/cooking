package com.example.cooking;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class MyDatabaseHelper extends SQLiteOpenHelper {

    public static final String CREATE_User = "create table User(" +
            "id integer primary key autoincrement," +
            "user_name String," +
            "user_id integer," +
            "password String," +
            "pic_id integer," +
            "user_id_follow integer," +
            "user_id_fans integer)";
    public static final String CREATE_Step = "create table Step(" +
            "id integer primary key autoincrement," +
            "pic_id integer," +
            "steps String," +
            "menu_id integer)";
    public static final String CREATE_Collection = "create table Collection(" +
            "id integer primary key autoincrement," +
            "user_id integer," +
            "menu_id integer)";
    public static final String DELETE_User ="DROP TABLE IF EXISTS User";
    public static final String DELETE_Step ="DROP TABLE IF EXISTS Step";
    public static final String DELETE_Collection ="DROP TABLE IF EXISTS Collection";

    private Context mContext;

   public MyDatabaseHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db){
        db.execSQL(CREATE_User);
        db.execSQL(CREATE_Step);
        db.execSQL(CREATE_Collection);
        ContentValues values22=new ContentValues();
        //db.beginTransaction();

        values22.put("pic_id",36);
        values22.put("steps","1.准备食材，调味料只需要用到珍选白灼汁就可以啦~");
        values22.put("menu_id",1);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",37);
        values22.put("steps","2.香菜洗净切小段，蒜头切末，小米辣切小圈圈备用");
        values22.put("menu_id",1);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",38);
        values22.put("steps","3.碗中放入蒜末、熟白芝麻、辣椒面、红椒圈，倒入珍选白灼汁，这款白灼汁堪称万能酱汁，豉香浓郁，鲜美回甘，而且轻盐0脂，好吃没负担哦~");
        values22.put("menu_id",1);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",39);
        values22.put("steps","4.淋入烧得滚烫的热油，能更好的激发食材的香气");
        values22.put("menu_id",1);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",40);
        values22.put("steps","5.拌匀后就是这道菜的灵魂酱汁啦");
        values22.put("menu_id",1);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",41);
        values22.put("steps","6.肥牛片放入开水锅中快速烫熟后捞出控干水份");
        values22.put("menu_id",1);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",42);
        values22.put("steps","7.放入一个大碗中，再放上香菜段");
        values22.put("menu_id",1);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",43);
        values22.put("steps","8.把刚才调好的酱汁倒入");
        values22.put("menu_id",1);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",44);
        values22.put("steps","9.拌匀即可");
        values22.put("menu_id",1);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",45);
        values22.put("steps","10.一道超级快手的下饭菜就可以上桌啦");
        values22.put("menu_id",1);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",46);
        values22.put("steps","1、茄子洗净后滚刀切成细长条，倒入淀粉后翻动下让每个茄子都均匀裹上粉~");
        values22.put("menu_id",2);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",47);
        values22.put("steps","2、锅里油烧热后分批下入茄子，炸制略微焦黄后捞出");
        values22.put("menu_id",2);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",48);
        values22.put("steps","3、准备香料");
        values22.put("menu_id",2);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",49);
        values22.put("steps","4、准备料汁：2勺生抽、2勺蚝油、2勺醋、1勺白糖");
        values22.put("menu_id",2);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",50);
        values22.put("steps","5、锅里少油爆香所有香料，然后倒入酱汁煮到有大泡泡");
        values22.put("menu_id",2);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",51);
        values22.put("steps","6、然后倒入茄子，快速翻炒均匀~");
        values22.put("menu_id",2);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",52);
        values22.put("steps","7、然后丢香菜末、白芝麻翻几下就关火出锅啦~");
        values22.put("menu_id",2);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",53);
        values22.put("steps","8、香喷喷出锅~");
        values22.put("menu_id",2);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",54);
        values22.put("steps","1.锅中倒少许油，加适量冰糖，熬出糖色");
        values22.put("menu_id",3);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",55);
        values22.put("steps","2.放入事先焯过水的鸡翅");
        values22.put("menu_id",3);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",56);
        values22.put("steps","3.煎至两面金黄");
        values22.put("menu_id",3);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",57);
        values22.put("steps","4.加入2勺生抽，半勺老抽");
        values22.put("menu_id",3);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",58);
        values22.put("steps","5.加入一瓶500ml可乐，中火焖10分钟");
        values22.put("menu_id",3);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",59);
        values22.put("steps","6.大火收汁");
        values22.put("menu_id",3);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",60);
        values22.put("steps","7.撒上白芝麻");
        values22.put("menu_id",3);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",61);
        values22.put("steps","1.五花肉冷水下锅，加入葱、姜、干辣椒、干花椒，有白酒的可以加点白酒去腥，煮半小时捞出，表皮用牙签插上9999个洞，倒入少许老抽均匀上色");
        values22.put("menu_id",4);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",62);
        values22.put("steps","2.起锅烧油油热，将五花肉皮朝下下锅，盖上盖子避免溅油烫伤，煎大概4 到5分钟的样子捞出来，加开水泡泡10分钟（虎皮的关键）");
        values22.put("menu_id",4);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",63);
        values22.put("steps","3.切成厚厚的薄片，加入生姜一勺生抽，半勺老抽，一勺蚝油，一点盐、鸡精、胡椒粉，然后用手抓拌均匀，记住只能用手哦");
        values22.put("menu_id",4);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",64);
        values22.put("steps","4.找一个碗，将猪皮朝下进行均匀摆放，一般是12片左右");
        values22.put("menu_id",4);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",65);
        values22.put("steps","5.把梅干菜倒入碗中，用温水淘两遍，挤干水，起锅烧油，油热加入蒜，小米椒，炒香倒入梅干菜炒香，然后将梅干菜倒入装好肉片的碗中，平铺按紧，放入蒸锅中，用一个盘扣上，防止进水，蒸半小时就可以了");
        values22.put("menu_id",4);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",66);
        values22.put("steps","1.食材：全蛋4个，热开水290克，盐适量，生抽葱花随意，玉米粒，火腿肠，薄荷叶的梗，黄瓜");
        values22.put("menu_id",5);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",67);
        values22.put("steps","2.制作步骤：\n" +
                "（1）鸡蛋加盐搅散，分次加入热开水充分搅勻，用勺子舀出大的泡沫，蛋液过滤到大碗里用保鲜膜封好用牙签戳几个孔，开水上锅中火蒸13分钟左右，关火再焖5分钟～\n" +
                "（2）玉米焯熟，火腿肠切段改成花刀煎一下，黄瓜用削皮刀刮成片做草地，向日葵的叶子用黄瓜皮剪，花茎直接用薄荷的梗～\n" +
                "（3）蒸熟的蛋取出后用火腿肠先定位，用玉米粒摆出向日葵的花瓣，把做好的叶子和花茎放上就行了～最好用油醋汁哈!");
        values22.put("menu_id",5);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",68);
        values22.put("steps","3.成品");
        values22.put("menu_id",5);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",69);
        values22.put("steps","4.淋适量生抽");
        values22.put("menu_id",5);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",70);
        values22.put("steps","5.超嫩滑，趁热吃更好吃");
        values22.put("menu_id",5);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",71);
        values22.put("steps","1.大蒜和小米辣切碎");
        values22.put("menu_id",6);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",72);
        values22.put("steps","2.番茄去皮切块");
        values22.put("menu_id",6);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",73);
        values22.put("steps","3.鸡蛋煎至两面金黄");
        values22.put("menu_id",6);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",74);
        values22.put("steps","4.热油爆香蒜末和辣椒");
        values22.put("menu_id",6);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",75);
        values22.put("steps","5.倒入番茄炒出汤汁");
        values22.put("menu_id",6);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",76);
        values22.put("steps","6.加入2碗清水");
        values22.put("menu_id",6);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",77);
        values22.put("steps","7.加入一勺生抽");
        values22.put("menu_id",6);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",78);
        values22.put("steps","8.一勺老抽");
        values22.put("menu_id",6);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",79);
        values22.put("steps","9.一勺蚝油+一勺番茄酱");
        values22.put("menu_id",6);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",80);
        values22.put("steps","10.煮沸，加入面条");
        values22.put("menu_id",6);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",81);
        values22.put("steps","11.倒入荷包蛋");
        values22.put("menu_id",6);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",82);
        values22.put("steps","12.加入适量紫菜，盖盖子焖熟即可！");
        values22.put("menu_id",6);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",83);
        values22.put("steps","1.先调个凉拌汁：一勺蒜末+一勺芝麻+一勺辣椒粉");
        values22.put("menu_id",7);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",84);
        values22.put("steps","2.淋上热油");
        values22.put("menu_id",7);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",85);
        values22.put("steps","3.两勺生抽");
        values22.put("menu_id",7);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",86);
        values22.put("steps","4.两勺陈醋");
        values22.put("menu_id",7);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",87);
        values22.put("steps","5.一勺蚝油");
        values22.put("menu_id",7);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",88);
        values22.put("steps","6.半勺盐和糖");
        values22.put("menu_id",7);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",89);
        values22.put("steps","7.拌匀");
        values22.put("menu_id",7);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",90);
        values22.put("steps","8.黄瓜切丝，水开下面");
        values22.put("menu_id",7);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",91);
        values22.put("steps","9.煮熟捞出过凉水，沥干水份放入碗中");
        values22.put("menu_id",7);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",92);
        values22.put("steps","10.放入黄瓜丝，花生米，香菜");
        values22.put("menu_id",7);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",93);
        values22.put("steps","11.倒入酱汁，抓拌均匀即可开吃～");
        values22.put("menu_id",7);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",94);
        values22.put("steps","1.准备这些食材。肉切片，洗净，倒入少量酱油，蚝油，芝麻油，生粉腌制。");
        values22.put("menu_id",8);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",95);
        values22.put("steps","2.煮一锅开水备用，用酱油、蚝油和糖调一碗酱料，切点蒜末");
        values22.put("menu_id",8);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",96);
        values22.put("steps","3.起锅烧油，煎两个蛋。");
        values22.put("menu_id",8);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",97);
        values22.put("steps","4.煎完蛋锅里还有油，直接把腌制肉倒进去翻炒，炒到断生就盛出备用。");
        values22.put("menu_id",8);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",98);
        values22.put("steps","5.精髓一步来了！这一步决定这锅汤面好不好吃！\n" +
                "（1）锅里可以再放一点油，油热爆蒜末\n" +
                "（2）蒜末爆出香味之后，倒入那一碗调好的酱汁，盖上盖子（因为可能油会蹦，小仙女要小心别被崩到）\n" +
                "（3）这个时候可以摇一摇锅让酱料爆香，酱料从下锅开始内心默数10秒。\n" +
                "（4）揭盖，倒入刚刚煮好的热水");
        values22.put("menu_id",8);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",99);
        values22.put("steps","6.水开了放面");
        values22.put("menu_id",8);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",100);
        values22.put("steps","7.可以把面给摊开");
        values22.put("menu_id",8);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",101);
        values22.put("steps","8.放菜");
        values22.put("menu_id",8);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",102);
        values22.put("steps","9.菜断生之后就放入刚刚煎好的鸡蛋，还有炒好的猪肉，煮一会会");
        values22.put("menu_id",8);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",103);
        values22.put("steps","10.再放入紫菜（我实在是太喜欢紫菜煮面了，很好吃～）");
        values22.put("menu_id",8);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",104);
        values22.put("steps","11.关火，放香菜！我没有放盐，因为爆香的酱汁已经有酱油，我个人觉得OK了～如果你喜欢咸一点点，可以放一点点盐");
        values22.put("menu_id",8);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",105);
        values22.put("steps","1.混合葱，蒜，辣椒粉，白芝麻");
        values22.put("menu_id",9);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",105);
        values22.put("steps","2.倒入适量烧热的食用油");
        values22.put("menu_id",9);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",106);
        values22.put("steps","3.分两次倒入，搅拌均匀");
        values22.put("menu_id",9);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",107);
        values22.put("steps","4.生抽2勺");
        values22.put("menu_id",9);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",108);
        values22.put("steps","5.醋1勺");
        values22.put("menu_id",9);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",109);
        values22.put("steps","6.蚝油1勺");
        values22.put("menu_id",9);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",110);
        values22.put("steps","7.盐1小勺");
        values22.put("menu_id",9);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",111);
        values22.put("steps","8.糖1小勺");
        values22.put("menu_id",9);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",112);
        values22.put("steps","9.花生酱2勺");
        values22.put("menu_id",9);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",113);
        values22.put("steps","10.放入熟花生碎末和香菜搅拌均匀");
        values22.put("menu_id",9);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",114);
        values22.put("steps","11.饺子皮一分为3");
        values22.put("menu_id",9);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",115);
        values22.put("steps","12.擀成长皮，下锅煮5分钟左右捞出过凉水，再倒入调好麻酱汁，搅拌均匀");
        values22.put("menu_id",9);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",116);
        values22.put("steps","13.好吃到哭呦");
        values22.put("menu_id",9);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",117);
        values22.put("steps","1.准备所需要用到的材料，黄油、淡奶油、牛奶、黑胡椒碎、芝士粉，另外准备4号直面、盐、一点玉米淀粉");
        values22.put("menu_id",10);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",118);
        values22.put("steps","2.大火烧开水，放入160g面条，盖上盖子小火煮8-10分钟，注意盯着，会溢锅");
        values22.put("menu_id",10);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",119);
        values22.put("steps","3.煮好后捞入凉水放置");
        values22.put("menu_id",10);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",120);
        values22.put("steps","4.蘑菇洗净切片/培根切片/洋葱切小片备用");
        values22.put("menu_id",10);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",121);
        values22.put("steps","5.冷锅放黄油");
        values22.put("menu_id",10);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",122);
        values22.put("steps","6.融化后放入蘑菇、培根，洋葱煎一会儿，洋葱和蘑菇慢慢变透、出香味和着色");
        values22.put("menu_id",10);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",123);
        values22.put("steps","7.放入奶油、牛奶、少许黑胡椒碎小火煮一会儿，煮开后加入盐调味（酌情加盐，可能一茶匙，2g左右，建议试味），然后加入少许玉米淀粉（一小勺，多了会结块）搅拌均匀关火");
        values22.put("menu_id",10);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",124);
        values22.put("steps","8.面条沥水放入奶油料里翻拌均匀");
        values22.put("menu_id",10);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",125);
        values22.put("steps","9.摆盘后撒上芝士粉、黑胡椒碎（我觉得这两样在味道的层次上必不可少）");
        values22.put("menu_id",10);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",126);
        values22.put("steps","1.牛腩洗净切大块下锅");
        values22.put("menu_id",11);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",127);
        values22.put("steps","2.葱、姜、干辣椒、卤料包2包、大半瓶酱油、大半瓶料酒、再添少量水没过牛肉");
        values22.put("menu_id",11);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",128);
        values22.put("steps","3.大火烧开15分钟后转小火10分钟，关火30分钟，中小火15分钟，关火30分钟，小火10-15分钟。浸泡一晚上收工");
        values22.put("menu_id",11);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",129);
        values22.put("steps","4.好吃的酱牛肉就做好啦！");
        values22.put("menu_id",11);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",130);
        values22.put("steps","1.红枣洗净浸泡、葱切段、姜切片、萝卜切大块");
        values22.put("menu_id",12);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",131);
        values22.put("steps","2.锅烧热，放入肘子干锅煎一下去腥");
        values22.put("menu_id",12);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",132);
        values22.put("steps","3.烧一锅开水，放入肘子氽烫去油腻，洗净");
        values22.put("menu_id",12);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",133);
        values22.put("steps","4.锅中放入半锅水，放入葱、姜、红曲粉、萝卜、茴香、八角、桂皮、辣椒、香叶、5粒大枣烧开");
        values22.put("menu_id",12);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",134);
        values22.put("steps","5.放入肘子、冰糖、腐乳汁、料酒、鸡精、盐，盖上锅盖煮60分钟");
        values22.put("menu_id",12);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",135);
        values22.put("steps","6.加入大枣开大火收汁即可");
        values22.put("menu_id",12);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",136);
        values22.put("steps","1.生姜和蒜头剁成末，香葱切葱花");
        values22.put("menu_id",13);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",137);
        values22.put("steps","2.取一小碟，加一匙生抽、一匙陈醋、一小勺白糖、两匙白开水搅拌均匀，再将姜蒜末加入酱汁中搅拌均匀");
        values22.put("menu_id",13);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",138);
        values22.put("steps","3.准备小半锅清水，烧开水");
        values22.put("menu_id",13);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",139);
        values22.put("steps","4.烧水时将大闸蟹里里外外刷干净，水开后将大闸蟹放入蒸锅中，将调好的酱汁也放入锅中一起蒸15分钟左右");
        values22.put("menu_id",13);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",140);
        values22.put("steps","5.蒸好后将酱汁取出，撒上葱花搅拌均匀。好吃的清蒸大闸蟹就做好啦！");
        values22.put("menu_id",13);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",141);
        values22.put("steps","1.把鸡肉用凉水泡半个小时，泡出血水，再放两勺料酒两勺生抽，腌制半个小时");
        values22.put("menu_id",14);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",142);
        values22.put("steps","2.锅烧热，放一勺盐一勺花椒");
        values22.put("menu_id",14);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",143);
        values22.put("steps","3.把腌制好的鸡腿均匀地撒上炒好的椒盐上锅蒸半个小时");
        values22.put("menu_id",14);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",144);
        values22.put("steps","4.用筷子扎一下，透了就代表熟了");
        values22.put("menu_id",14);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",145);
        values22.put("steps","1.鸡蛋炒熟，胡萝卜刨丝，西葫芦刨丝加少许盐杀出水分");
        values22.put("menu_id",15);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",146);
        values22.put("steps","2.加入一勺生抽、一勺耗油、一勺鲜鸡汁、适量十三香，搅拌均匀");
        values22.put("menu_id",15);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",147);
        values22.put("steps","3.饺子皮擀大，包入馅料，收口捏起来");
        values22.put("menu_id",15);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",148);
        values22.put("steps","4.上锅蒸15分钟");
        values22.put("menu_id",15);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",149);
        values22.put("steps","5.出锅");
        values22.put("menu_id",15);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",150);
        values22.put("steps","1.鸡翅洗干净两面划刀口放入碗中，然后依次加入生抽两勺、料酒两勺、耗油一勺、姜片、蒜末、盐、糖、胡椒粉");
        values22.put("menu_id",16);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",151);
        values22.put("steps","2.用手充分按摩鸡翅五分钟，使之入味");
        values22.put("menu_id",16);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",152);
        values22.put("steps","3.盖上保鲜膜放入冰箱腌制两小时以上");
        values22.put("menu_id",16);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",153);
        values22.put("steps","4.面粉和淀粉按照1：1的量，开始裹鸡翅。重点来了！裹粉时要两面使劲按压几回，然后用手指在鸡翅表面来回捻，这样炸出来的鸡翅表面才会有鳞状脆皮哦，这是炸鸡的灵魂呀~");
        values22.put("menu_id",16);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",154);
        values22.put("steps","5.锅中倒入足量的油，没过鸡翅即可。油温大概到六七成热的时候，将火调到最小，然后开始依次放入鸡翅。开始计时七分钟！中途可以两面翻一下，计时结束后将鸡翅捞出。");
        values22.put("menu_id",16);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",155);
        values22.put("steps","6.锅中油加热至高温，然后将刚刚炸好的鸡翅第二次过油炸半分到一分钟，目的是为了让鸡翅表皮更加金黄，口感更加酥脆！注意千万不要糊掉！");
        values22.put("menu_id",16);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",156);
        values22.put("steps","7.沥油后就可以装盘啦！整个过程一定要注意火候和时间，这样做出来的炸鸡才能肉嫩多汁，表皮酥脆！");
        values22.put("menu_id",16);
        db.insert("Step",null,values22) ;


        values22.put("pic_id",157);
        values22.put("steps","1.土豆无需去皮切块上锅蒸20-25分钟至筷子能轻松插入");
        values22.put("menu_id",17);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",158);
        values22.put("steps","2.控干水分稍冷却撕掉皮，捣成泥状，加入玉米淀粉、适量盐、黑胡椒");
        values22.put("menu_id",17);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",159);
        values22.put("steps","3.揉成面团并整理成椭圆状");
        values22.put("menu_id",17);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",160);
        values22.put("steps","4.锅中加油烧热至放入筷子有气泡，加薯饼转中小火炸至两面金黄捞出，中途多翻面");
        values22.put("menu_id",17);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",161);
        values22.put("steps","5.再开大火升温复炸30秒即可");
        values22.put("menu_id",17);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",162);
        values22.put("steps","6.香香脆脆真美味");
        values22.put("menu_id",17);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",163);
        values22.put("steps","1.排骨洗净放入蒜末、半勺盐、一勺白糖、两勺生抽、一勺料酒、一勺耗油和两勺淀粉拌匀，腌制两小时入味");
        values22.put("menu_id",18);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",164);
        values22.put("steps","2.锅中放入适量油加热到筷子触碰会冒泡，一块一块放入排骨，小火慢炸至两面金黄，大概十分钟后捞出。之后将锅中的油用中火加热，倒入排骨复炸一分钟捞出。蒜香炸排骨就大功告成啦！");
        values22.put("menu_id",18);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",165);
        values22.put("steps","1.雪花里脊肉切片再切成条，厚约三毫米。这种肉口感最好，不柴，有嚼劲儿又不腻。");
        values22.put("menu_id",19);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",166);
        values22.put("steps","2.肉片放入大盆，加姜末、2克盐和1克花椒碎，抓匀盖保鲜膜腌制约30分钟，天热可放冰箱");
        values22.put("menu_id",19);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",167);
        values22.put("steps","3.红薯淀粉中加入鸡蛋，大致搅拌均匀。一开始会有很多的小疙瘩，没关系，盖保鲜膜静置20分钟，然后搅搅，如果还有疙瘩就再静置再搅，让红薯淀粉充分吸收蛋液。");
        values22.put("menu_id",19);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",168);
        values22.put("steps","4.调好的裹糊浓稠，可以顺利滴落，但滴落后纹路不会马上消失，这个状态挂糊最好，包裹很均匀，入油锅不会散");
        values22.put("menu_id",19);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",169);
        values22.put("steps","5.加2克盐和花椒碎拌匀");
        values22.put("menu_id",19);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",170);
        values22.put("steps","6.将腌好的肉片倒入淀粉糊中，大致拌到肉片都挂上厚浆");
        values22.put("menu_id",19);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",171);
        values22.put("steps","7.起油锅，烧至六成热，即筷子触碰会冒泡，就可以下小酥肉了。保持中小火，一条一条下肉条。一锅别炸太多，可以分次炸，炸的时候注意翻面");
        values22.put("menu_id",19);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",172);
        values22.put("steps","8.根据肉条大小、数量及火力等大约炸5-10分钟，两面金黄的时候捞出沥油。喜欢更脆一点的可以复炸，时间控制在2-3分钟");
        values22.put("menu_id",19);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",173);
        values22.put("steps","1.提前准备好食材，解冻剥出虾仁，撒点白胡椒去腥，盐少许备用。如图，把虾切开，不是切虾背那面，以免虾卷起来");
        values22.put("menu_id",20);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",174);
        values22.put("steps","2.把切好的虾先入淀粉里拍打均匀，再入蛋液洗个澡，最后入面包糠里滚一下，一定要沾均匀，才会好看又好吃");
        values22.put("menu_id",20);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",175);
        values22.put("steps","3.油烧热，60度就差不多，不要太高温以免下锅就糊了，中火慢炸，看颜色差不多就可以了");
        values22.put("menu_id",20);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",176);
        values22.put("steps","4.美美的凤尾虾，你学会了吗？");
        values22.put("menu_id",20);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",177);
        values22.put("steps","");
        values22.put("menu_id",21);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",178);
        values22.put("steps","");
        values22.put("menu_id",21);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",179);
        values22.put("steps","");
        values22.put("menu_id",21);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",180);
        values22.put("steps","");
        values22.put("menu_id",21);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",181);
        values22.put("steps","");
        values22.put("menu_id",21);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",182);
        values22.put("steps","");
        values22.put("menu_id",21);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",183);
        values22.put("steps","");
        values22.put("menu_id",21);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",184);
        values22.put("steps","");
        values22.put("menu_id",21);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",185);
        values22.put("steps","1.西红柿划刀用开水烫一下，把皮撕掉后切碎，锅中放入少许油，烧热倒入西红柿炒出汁。");
        values22.put("menu_id",22);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",186);
        values22.put("steps","2.锅中倒入适量清水煮沸");
        values22.put("menu_id",22);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",187);
        values22.put("steps","3.鸡蛋打散备用");
        values22.put("menu_id",22);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",188);
        values22.put("steps","4.把打散的鸡蛋缓慢倒入锅中");
        values22.put("menu_id",22);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",189);
        values22.put("steps","5.放入生抽、盐、最后撒入葱花、淋入香油");
        values22.put("menu_id",22);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",190);
        values22.put("steps","1、猪五花肉剁碎成肉糜");
        values22.put("menu_id",23);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",191);
        values22.put("steps","2、葱姜切末");
        values22.put("menu_id",23);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",192);
        values22.put("steps","3、将葱姜末加入肉糜");
        values22.put("menu_id",23);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",193);
        values22.put("steps","4、加适量酱油，盐，鸡精，十三香粉");
        values22.put("menu_id",23);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",194);
        values22.put("steps","5、打入一个鸡蛋");
        values22.put("menu_id",23);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",195);
        values22.put("steps","6、用筷子顺一个方向搅拌均匀，搅上劲儿（筷子能立在肉馅中不倒）。可根据肉糜的干湿程度适当加水");
        values22.put("menu_id",23);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",196);
        values22.put("steps","7、香菜洗净切末");
        values22.put("menu_id",23);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",197);
        values22.put("steps","8、冬瓜洗净去皮切成5mm左右的片");
        values22.put("menu_id",23);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",198);
        values22.put("steps","9、锅中适量水（高汤），煮至微开（锅底刚开始冒小气泡），用勺子将肉糜挖圆入锅");
        values22.put("menu_id",23);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",199);
        values22.put("steps","10、小火微开状态汆丸子。");
        values22.put("menu_id",23);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",200);
        values22.put("steps","11、待丸子煮定型后下入冬瓜片。");
        values22.put("menu_id",23);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",201);
        values22.put("steps","12、中火煮至冬瓜片变得透明状时加适量的盐，鸡精，喜欢吃胡椒粉的可以再适量加入胡椒粉调味。");
        values22.put("menu_id",23);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",202);
        values22.put("steps","13、起锅前淋入一点香油。");
        values22.put("menu_id",23);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",203);
        values22.put("steps","14、最后撒适量香菜末。");
        values22.put("menu_id",23);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",204);
        values22.put("steps","1、淮备一些新鲜蘑菇，去蒂。");
        values22.put("menu_id",24);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",205);
        values22.put("steps","2、切成薄片，再切一些洋葱，再来一点培根就再好不过了。");
        values22.put("menu_id",24);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",206);
        values22.put("steps","3、一小块黄油融化");
        values22.put("menu_id",24);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",207);
        values22.put("steps","4、下入洋葱和培根，炒香");
        values22.put("menu_id",24);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",208);
        values22.put("steps","5、再下入蘑菇炒软，翻炒个三分钟，加一点点盐出锅。");
        values22.put("menu_id",24);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",209);
        values22.put("steps","6、锅里小火融化20克黄油。");
        values22.put("menu_id",24);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",210);
        values22.put("steps","7、加入60克面粉，小火翻炒，喜欢喝浓稠一点的汤就多加一点面粉。");
        values22.put("menu_id",24);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",211);
        values22.put("steps","8、加一大碗清水，不停的搅拌。");
        values22.put("menu_id",24);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",212);
        values22.put("steps","9、成面糊状，加入100ml淡奶油，或者牛奶也可");
        values22.put("menu_id",24);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",213);
        values22.put("steps","10、小火煮开，其间要不停的搅拌，以免糊锅");
        values22.put("menu_id",24);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",214);
        values22.put("steps","11、加入刚刚炒好的配菜，搅拌均匀关火。");
        values22.put("menu_id",24);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",215);
        values22.put("steps","12、根据自己的口味加入黑胡椒粉和少许盐调味。有条件的在加一点欧芹碎。");
        values22.put("menu_id",24);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",216);
        values22.put("steps","1、南瓜去皮去籽，洗净切大块。");
        values22.put("menu_id",25);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",217);
        values22.put("steps","2、豆去皮切大块");
        values22.put("menu_id",25);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",218);
        values22.put("steps","3、八角2个，大蒜切片，小葱洗净切末");
        values22.put("menu_id",25);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",219);
        values22.put("steps","4、热锅冷油，小火爆香八角和蒜片");
        values22.put("menu_id",25);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",220);
        values22.put("steps","5、放入南瓜块和土豆块中火翻炒。");
        values22.put("menu_id",25);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",221);
        values22.put("steps","6、炒到稍微变软时，调入2汤匙生抽和适量盐");
        values22.put("menu_id",25);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",222);
        values22.put("steps","7、炒至如图中程度时倒入刚好淹没过南瓜土豆的清水，盖上锅盖大火煮。");
        values22.put("menu_id",25);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",223);
        values22.put("steps","8、水开后尝一下咸淡，盖上锅盖调中火继续煮。");
        values22.put("menu_id",25);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",224);
        values22.put("steps","9、煮至南瓜和土豆都绵软，汤汁浓郁后关火，撒入葱花即可。");
        values22.put("menu_id",25);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",225);
        values22.put("steps","1、准备好所有材料，黄油提前软化，安佳淡奶油要冷藏。");
        values22.put("menu_id",26);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",226);
        values22.put("steps","2、黄油切小块软化，一定要软化到位了再开始做哦，不然挤小花的时候会疯掉的。");
        values22.put("menu_id",26);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",227);
        values22.put("steps","3、糖粉和软化好的黄油用打蛋器搅拌均匀");
        values22.put("menu_id",26);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",228);
        values22.put("steps","4、加入香草精和蛋黄用打蛋器继续搅拌均匀");
        values22.put("menu_id",26);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",229);
        values22.put("steps","5、加入安佳淡奶油搅拌均匀");
        values22.put("menu_id",26);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",230);
        values22.put("steps","6、把所有粉类放进筛粉器筛入黄油中，用硅胶刮刀翻拌至无干粉即可。");
        values22.put("menu_id",26);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",231);
        values22.put("steps","7、选择适当的裱花嘴，把面糊放入裱花袋，烤盘铺油纸，均匀的挤上小花曲奇。");
        values22.put("menu_id",26);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",232);
        values22.put("steps","8、烤箱165度预热三分钟烤至20分钟，微黄上色即可。记得要看着烤哦，如果上色太快记得加盖锡纸或者自己调整温度。！");
        values22.put("menu_id",26);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",233);
        values22.put("steps","1、蛋清蛋黄分离盆子一定要无水无油");
        values22.put("menu_id",27);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",234);
        values22.put("steps","2、往蛋黄里倒入水玉米油再筛入低筋面粉搅拌均匀（不用一步一步来的这样更容易搅拌）搅拌好的蛋黄糊是顺滑的");
        values22.put("menu_id",27);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",235);
        values22.put("steps","3、打蛋清：用打蛋器高速打发蛋清到这个状态然后加入三分之一的糖");
        values22.put("menu_id",27);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",236);
        values22.put("steps","4、继续高速打发打发至变细腻出现小弯勾再加1次糖然后再打会儿加入第三次糖记得边缘的蛋白也要打到");
        values22.put("menu_id",27);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",237);
        values22.put("steps","5、加完第三次糖后高速打发至糖溶解然后慢速打一会去除大气泡每打一会会就要提起打蛋器看一下状态蛋白打到如图的小角不会向下弯曲就好了不要过度打发打发好的蛋白霜是细腻的，没有大气泡");
        values22.put("menu_id",27);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",238);
        values22.put("steps","6、时不时用手动打蛋器检查是否是细腻的状态如果有点变粗了就用用手动打蛋器抽打几下会变回细腻的状态");
        values22.put("menu_id",27);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",239);
        values22.put("steps","7、取一部分蛋白霜放入蛋黄糊中上下翻拌均匀 (此时可以开始预热烤箱）在翻拌好的蛋黄糊倒入蛋白霜盆里之前再用手动打蛋器抽打蛋白霜几下到细腻的状态！然后再将蛋黄糊倒入蛋白霜中翻拌均匀");
        values22.put("menu_id",27);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",240);
        values22.put("steps","8、从10厘米的高度缓缓将蛋糕糊倒入模具内这样子像绸缎一样晉起来说明没有消泡然后用刮刀稍稍摸平从20厘米的高度摔几下震掉大气泡");
        values22.put("menu_id",27);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",241);
        values22.put("steps","9、放入已经预热的烤箱120度40分钟130度20分钟即可。总共一小时！微微开裂是正常的哦。然后用手脱模蛋糕出炉后立刻从高处摔两下然后进行倒扣必须凉透！");
        values22.put("menu_id",27);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",242);
        values22.put("steps","1、将高筋面粉、牛奶、白糖、酵母混合均匀，揉至光滑，再加入橄榄油");
        values22.put("menu_id",28);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",243);
        values22.put("steps","2、揉匀后放温暖处发酵至二倍大。");
        values22.put("menu_id",28);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",244);
        values22.put("steps","3、榴莲打开取出两块果肉，榴莲去核后用保鲜袋压扁，或者用搅拌器打匀");
        values22.put("menu_id",28);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",245);
        values22.put("steps","4、发酵好的面团取出排气，滚圆静置5分钟，擀成大小合适的饼皮。");
        values22.put("menu_id",28);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",246);
        values22.put("steps","5、铺在抹了玉米油的披萨盘内，可以用手将饼皮整形，使之大小厚薄均匀合适，再用叉子在披萨皮上扎一些小孔。");
        values22.put("menu_id",28);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",247);
        values22.put("steps","6、面皮上铺上一层厚厚的榴莲果肉。");
        values22.put("menu_id",28);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",248);
        values22.put("steps","7、再撒上一层马苏里拉奶酪。");
        values22.put("menu_id",28);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",249);
        values22.put("steps","8、放入预热好的烤箱，焙烤200度，20分钟左右。");
        values22.put("menu_id",28);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",250);
        values22.put("steps","9、至奶酪完全融化，饼皮变色即可。");
        values22.put("menu_id",28);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",251);
        values22.put("steps","1、先将面团揉出手套膜");
        values22.put("menu_id",29);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",252);
        values22.put("steps","2、放进发酵箱进行一发，25到28度， 1小时左右（夏季一般为40分钟），40分钟后一定要随时观察，以免发酵过头");
        values22.put("menu_id",29);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",253);
        values22.put("steps","3、发酵完成，取出六等分，164g/份，进行松弛， 30分钟（滚圆的时候力道要轻，不要破坏了筋度）");
        values22.put("menu_id",29);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",254);
        values22.put("steps","4、松弛好后，第一次擀卷，再松弛15分钟");
        values22.put("menu_id",29);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",255);
        values22.put("steps","5、第二次擀卷，也要轻一些，不要伤害筋度，否则烤的时候容易边缘开裂");
        values22.put("menu_id",29);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",256);
        values22.put("steps","6、一个个小卷卷，不要卷太紧");
        values22.put("menu_id",29);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",257);
        values22.put("steps","7、放进吐司盒");
        values22.put("menu_id",29);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",258);
        values22.put("steps","8、进行第二次发酵，30到35度，一般我用 33度.湿度75%，50分钟到1小时左右");
        values22.put("menu_id",29);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",259);
        values22.put("steps","9、发酵到七八分满");
        values22.put("menu_id",29);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",260);
        values22.put("steps","10、放进烤箱最底层，带盖，上火160度，下火185度，30分钟。");
        values22.put("menu_id",29);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",261);
        values22.put("steps","1、提前准备好所有材料，这里需要注意淡奶油，奶油奶酪还有鸡蛋和蛋黄都要用室温的。");
        values22.put("menu_id",30);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",262);
        values22.put("steps","2、奶油奶酪提前室温软化（或者隔热水软化）至特别顺滑。加入糖，搅拌均匀至糖融化。分3次加入鸡蛋2颗＋蛋黄1颗，每次拌匀再加下一次。");
        values22.put("menu_id",30);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",263);
        values22.put("steps","3、加入淡奶油拌匀");
        values22.put("menu_id",30);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",264);
        values22.put("steps","4、加入玉米淀粉（不需要过筛），拌匀至没有颗粒的芝士糊。");
        values22.put("menu_id",30);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",265);
        values22.put("steps","5、6寸蛋糕模垫油纸，倒入芝士糊，倒入的时候过筛一下震动几下，磕出大气泡，稍微刮平表面，烤箱提前预热220度，入烤箱中层烤25~30分钟（喜欢上色深一点，蛋糕层凝固度高就烤足30分钟）");
        values22.put("menu_id",30);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",266);
        values22.put("steps","6、取出蛋糕，室温晾凉，入冰箱冷藏一夜，即可食用。");
        values22.put("menu_id",30);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",267);
        values22.put("steps","1.准备好全部的食材，鸡腿已去骨。");
        values22.put("menu_id",31);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",268);
        values22.put("steps","2.叉子上扎上一瓣生蒜，给鸡腿肉扎扎扎.....扎扎扎.....");
        values22.put("menu_id",31);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",269);
        values22.put("steps","3.撒上1/2茶匙白胡椒粉，1/2茶匙黑胡椒粉，1茶匙尖的盐抹匀给鸡腿调底味。");
        values22.put("menu_id",31);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",270);
        values22.put("steps","4.小土豆洗刷净，可以不去皮，切成粗条状，2瓣大蒜切片。");
        values22.put("menu_id",31);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",271);
        values22.put("steps","5.平底锅中倒入橄榄油烧热，鸡皮朝下放入鸡腿肉，小火慢煎。");
        values22.put("menu_id",31);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",272);
        values22.put("steps","6.煎至鸡皮成焦褐色再翻面，要耐心一点(J° V°)/香喷喷的感觉有木有~");
        values22.put("menu_id",31);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",273);
        values22.put("steps","7.接着放入土豆、大蒜和迷迭香继续煎，期间需给土豆条翻面以及用叉子横着压一下鸡腿肉。");
        values22.put("menu_id",31);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",274);
        values22.put("steps","8.直至煎熟，如果看锅中油过多可以用厨房纸擦拭掉一些。");
        values22.put("menu_id",31);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",275);
        values22.put("steps","9.改中大火淋入白葡萄酒(此处锅中容易有火焰升起，请朋友们注意也请勿担心)");
        values22.put("menu_id",31);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",276);
        values22.put("steps","10.待白葡萄酒酒气挥发完，加入1/2茶匙盐和1/2茶匙白胡椒粉调味，记得摇晃一下锅，使鸡腿肉土豆条均匀入味。");
        values22.put("menu_id",31);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",277);
        values22.put("steps","11.夹出鸡腿鸡皮朝下用锋利的西餐刀切条，再和土豆条一起摆盘，最后放上两根新鲜迷迭香装饰一下!");
        values22.put("menu_id",31);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",278);
        values22.put("steps","12.倒上红酒，鸡腿肉外焦里嫩，开吃吧。");
        values22.put("menu_id",31);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",279);
        values22.put("steps","1.大虾去壳留尾，加入海盐、烟熏红辣椒粉、大蒜粉、白胡椒粉和番茄膏，拌匀，腌制15分钟。");
        values22.put("menu_id",32);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",280);
        values22.put("steps","2.大蒜切片。小锅中加入4大勺橄榄油，放入蒜片小火煽至蒜片变黄，边缘微焦，盛出蒜片，橄榄油留在锅中。");
        values22.put("menu_id",32);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",281);
        values22.put("steps","3.将腌制过的大虾放入炸过蒜的橄榄油，转中火炒熟。");
        values22.put("menu_id",32);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",282);
        values22.put("steps","4.关火，撒上少许欧芹碎、黑胡椒碎、烟熏红辣椒粉和刚才煽过的蒜片，再撒一勺橄榄油即可上桌~");
        values22.put("menu_id",32);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",283);
        values22.put("steps","1.准备好的食材");
        values22.put("menu_id",33);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",284);
        values22.put("steps","2.三文鱼加盐、黑胡椒、柠檬汁、少许橄榄油腌制15分钟。");
        values22.put("menu_id",33);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",285);
        values22.put("steps","3.热锅小火融化黄油");
        values22.put("menu_id",33);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",286);
        values22.put("steps","4.放入未脱皮的蒜");
        values22.put("menu_id",33);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",287);
        values22.put("steps","5.百里香");
        values22.put("menu_id",33);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",288);
        values22.put("steps","6.放入三文鱼，调中火 煎1分钟");
        values22.put("menu_id",33);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",289);
        values22.put("steps","7.翻面煎一分钟");
        values22.put("menu_id",33);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",290);
        values22.put("steps","8.盛盘挤少许柠檬汁即可享用");
        values22.put("menu_id",33);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",291);
        values22.put("steps","1.烤箱预热:将烤箱调至烘焙模式/上下管加热模式，温度选择220C。温控键熄灭就代表预热完成。将黄油块装入小碗，放入烤箱中，至融化后取出。");
        values22.put("menu_id",34);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",292);
        values22.put("steps","2.土豆去皮，切成易入口的小块，清洗干净，沥干水分。");
        values22.put("menu_id",34);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",293);
        values22.put("steps","3.将土豆块放入碗中，淋入黄油，撒上盐、新鲜迷迭香、百里香、罗勒叶、牛至、黑椒碎、烟熏辣椒粉，拌匀。");
        values22.put("menu_id",34);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",294);
        values22.put("steps","4.烤盘铺上油纸/锡纸，将土豆块在烤盘内摆放均匀，将一整头蒜横切开来，放置在烤盘角落。");
        values22.put("menu_id",34);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",295);
        values22.put("steps","5.将烤箱温度调至200度，烤30分钟，至外表金黄即可。");
        values22.put("menu_id",34);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",296);
        values22.put("steps","6.根据口味撒上适量盐，趁热享用吧~");
        values22.put("menu_id",34);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",297);
        values22.put("steps","1.准备好食材:鸡蛋煮熟切块，鸡胸肉切成块加料酒黑胡椒腌制一会，放入锅中煮熟后捞出。鸡胸肉也可以加盐、橄榄油、胡椒粉、蒜蓉、蜂蜜腌制一会，小火煎熟后切块");
        values22.put("menu_id",35);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",298);
        values22.put("steps","2.按照颜色不同随便搭配就可以啦");
        values22.put("menu_id",35);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",299);
        values22.put("steps","3.最好用油醋汁哈!");
        values22.put("menu_id",35);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",300);
        values22.put("steps","4.完美!!!!");
        values22.put("menu_id",35);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",301);
        values22.put("steps","5.我用的这个苹果醋");
        values22.put("menu_id",35);
        db.insert("Step",null,values22) ;

        values22.put("pic_id",302);
        values22.put("steps","6.油醋汁:橄榄油2勺、生抽1勺、苹果醋2勺、蜂蜜1勺，少许现磨黑胡椒粉、一丢丢海盐。混合装在瓶子里，使劲摇晃均匀即可 ~");
        values22.put("menu_id",35);
        db.insert("Step",null,values22) ;

        //db.setTransactionSuccessful();
        //db.endTransaction();
        //db.close();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db,int oldVersion,int newVersion) {
        db.execSQL(DELETE_User);
        db.execSQL(DELETE_Step);
        db.execSQL(DELETE_Collection);
        onCreate(db);
    }
}