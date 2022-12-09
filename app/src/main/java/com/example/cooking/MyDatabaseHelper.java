package com.example.cooking;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class MyDatabaseHelper extends SQLiteOpenHelper {

    public static final String CREATE_Pic = "create table Picture(" +
            //primary key 将id列设为主键    autoincrement表示id列是自增长的
            "id integer primary key autoincrement," +
            "pic varchar(255))";
    public static final String CREATE_Ingredient = "create table Ingredient(" +
            //primary key 将id列设为主键    autoincrement表示id列是自增长的
            "id integer primary key autoincrement," +
            "name text," +
            "pic_id integer )";
    public static final String CREATE_Finish = "create table Finish(" +
            //primary key 将id列设为主键    autoincrement表示id列是自增长的
            "id integer primary key autoincrement," +
            "menu_id integer," +
            "user_id integer)";
    public static final String CREATE_Menu = "create table Menu(" +
            //primary key 将id列设为主键    autoincrement表示id列是自增长的
            "menu_id integer primary key autoincrement," +
            "cover integer," +
            "title String," +
            "user_id integer," +
            "introduction String)";

    public static final String CREATE_User = "create table User(" +
            "id integer primary key autoincrement," +
            "user_name String," +
            "user_id integer," +
            "password String," +
            "pic_id integer," +
            "user_id integer," +
            "user_id integer)";
    public static final String CREATE_Step = "create table Step(" +
            "id integer primary key autoincrement," +
            "pic_id integer," +
            "steps String," +
            "menu_id integer)";
    public static final String CREATE_Collection = "create table Collection(" +
            "id integer primary key autoincrement," +
            "user_id integer," +
            "menu_id integer)";
    public static final String DELETE_pic ="DROP TABLE IF EXISTS Picture";
    public static final String DELETE_Ingredient ="DROP TABLE IF EXISTS Ingredient";
    public static final String DELETE_Finish ="DROP TABLE IF EXISTS Finish";
    public static final String DELETE_Menu ="DROP TABLE IF EXISTS Menu";
    public static final String DELETE_User ="DROP TABLE IF EXISTS User";
    public static final String DELETE_Step ="DROP TABLE IF EXISTS Step";
    public static final String DELETE_Collection ="DROP TABLE IF EXISTS Collection";

    private Context mContext;

   public MyDatabaseHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
        mContext = context;
    }

    public void onCreate(SQLiteDatabase db){
        db.execSQL(CREATE_Pic);
        db.execSQL(CREATE_Ingredient);
        db.execSQL(CREATE_Finish);
        db.execSQL(CREATE_Menu);
        db.execSQL(CREATE_User);
        db.execSQL(CREATE_Step);
        db.execSQL(CREATE_Collection);

        ContentValues values=new ContentValues();
        ContentValues values1=new ContentValues();
        ContentValues values2=new ContentValues();
        ContentValues values22=new ContentValues();
        //db.beginTransaction();
        //db.beginTransaction();
        values.put("pic","C:/cooking/img/xcfn_cover.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/fwqz_cover.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/kljc_cover.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/mckr_cover.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/xrk_cover.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/fqm_cover.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/lbm_cover.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/mmtm_cover.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/mjm_cover.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/nyym_cover.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/jnr_cover.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/pxzz_cover.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/dzx_cover.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/jyjt_cover.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/jdb_cover.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/zjc_cover.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/zsb_cover.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/zpg_cover.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/gzxsr_cover.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/fwx_cover.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/bcdft_cover.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/jdt_cover.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/wzt_cover.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/mgt_cover.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/tdt_cover.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/cookie_cover.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/8cake_cover.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/pizza_cover.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/toast_cover.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/bskcake_cover.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/jjtr_cover.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/tapas_cover.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/swy_cover.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/ktd_cover.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/cobb_cover.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/xcfnstep_1.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/xcfnstep_2.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/xcfnstep_3.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/xcfnstep_4.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/xcfnstep_5.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/xcfnstep_6.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/xcfnstep_7.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/xcfnstep_8.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/xcfnstep_9.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/xcfnstep_10.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/fwqzstep_1.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/fwqzstep_2.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/fwqzstep_3.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/fwqzstep_4.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/fwqzstep_5.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/fwqzstep_6.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/fwqzstep_7.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/fwqzstep_8.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/kljcstep_1.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/kljcstep_2.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/kljcstep_3.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/kljcstep_4.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/kljcstep_5.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/kljcstep_6.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/kljcstep_7.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/mckrstep_1.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/mckrstep_2.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/mckrstep_3.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/mckrstep_4.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/mckrstep_5.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/xrkstep_1.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/xrkstep_2.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/xrkstep_3.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/xrkstep_4.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/xrkstep_5.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/fqmstep_1.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/fqmstep_2.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/fqmstep_3.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/fqmstep_4.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/fqmstep_5.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/fqmstep_6.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/fqmstep_7.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/fqmstep_8.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/fqmstep_9.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/fqmstep_10.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/fqmstep_11.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/fqmstep_12.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/lbmstep_1.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/lbmstep_2.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/lbmstep_3.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/lbmstep_4.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/lbmstep_5.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/lbmstep_6.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/lbmstep_7.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/lbmstep_8.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/lbmstep_9.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/lbmstep_10.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/lbmstep_11.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/mmtmstep_1.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/mmtmstep_2.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/mmtmstep_3.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/mmtmstep_4.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/mmtmstep_5.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/mmtmstep_6.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/mmtmstep_7.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/mmtmstep_8.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/mmtmstep_9.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/mmtmstep_10.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/mmtmstep_11.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/mjmstep_1.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/mjmstep_3.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/mjmstep_4.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/mjmstep_5.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/mjmstep_6.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/mjmstep_7.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/mjmstep_8.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/mjmstep_9.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/mjmstep_10.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/mjmstep_11.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/mjmstep_12.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/mjmstep_13.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/nyymstep_1.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/nyymstep_2.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/nyymstep_3.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/nyymstep_4.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/nyymstep_5.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/nyymstep_6.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/nyymstep_7.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/nyymstep_8.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/nyymstep_9.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/jnrstep_1.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/jnrstep_2.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/jnrstep_3.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/jnrstep_4.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/pxzzstep_1.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/pxzzstep_2.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/pxzzstep_3.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/pxzzstep_4.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/pxzzstep_5.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/pxzzstep_6.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/dzxstep_1.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/dzxstep_2.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/dzxstep_3.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/dzxstep_4.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/dzxstep_5.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/jyjtstep_1.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/jyjtstep_2.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/jyjtstep_3.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/jyjtstep_4.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/jdbstep_1.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/jdbstep_2.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/jdbstep_3.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/jdbstep_4.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/jdbstep_5.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/zjcstep_1.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/zjcstep_2.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/zjcstep_3.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/zjcstep_4.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/zjcstep_5.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/zjcstep_6.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/zjcstep_7.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/zsbstep_1.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/zsbstep_2.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/zsbstep_3.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/zsbstep_4.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/zsbstep_5.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/zsbstep_6.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/zpg_1.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/zpg_2.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/gzxsrstep_1.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/gzxsrstep_2.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/gzxsrstep_3.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/gzxsrstep_4.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/gzxsrstep_5.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/gzxsrstep_6.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/gzxsrstep_7.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/gzxsrstep_8.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/fwxstep_1.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/fwxstep_2.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/fwxstep_3.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/fwxstep_4.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/bcdftstep_1.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/bcdftstep_2.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/bcdftstep_3.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/bcdftstep_4.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/bcdftstep_5.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/bcdftstep_6.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/bcdftstep_7.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/bcdftstep_8.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/jdtstep_1.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/jdtstep_2.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/jdtstep_3.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/jdtstep_4.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/jdtstep_5.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/wztstep_1.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/wztstep_2.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/wztstep_3.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/wztstep_4.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/wztstep_5.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/wztstep_6.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/wztstep_7.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/wztstep_8.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/wztstep_9.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/wztstep_10.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/wztstep_11.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/wztstep_12.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/wztstep_13.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/wztstep_14.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/mgtstep_1.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/mgtstep_2.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/mgtstep_3.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/mgtstep_4.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/mgtstep_5.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/mgtstep_6.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/mgtstep_7.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/mgtstep_8.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/mgtstep_9.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/mgtstep_10.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/mgtstep_11.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/mgtstep_12.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/tdtstep_1.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/tdtstep_2.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/tdtstep_3.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/tdtstep_4.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/tdtstep_5.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/tdtstep_6.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/tdtstep_7.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/tdtstep_8.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/tdtstep_9.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/cookiestep_1.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/cookiestep_2.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/cookiestep_3.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/cookiestep_4.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/cookiestep_5.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/cookiestep_6.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/cookiestep_7.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/cookiestep_8.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/8cakestep_1.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/8cakestep_2.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/8cakestep_3.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/8cakestep_4.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/8cakestep_5.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/8cakestep_6.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/8cakestep_7.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/8cakestep_8.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/8cakestep_9.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/pizzastep_1.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/pizzastep_2.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/pizzastep_3.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/pizzastep_4.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/pizzastep_5.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/pizzastep_6.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/pizzastep_7.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/pizzastep_8.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/pizzastep_9.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/toaststep_1.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/toaststep_2.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/toaststep_3.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/toaststep_4.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/toaststep_5.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/toaststep_6.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/toaststep_7.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/toaststep_8.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/toaststep_9.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/toaststep_10.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/bskcakestep_1.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/bskcakestep_2.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/bskcakestep_3.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/bskcakestep_4.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/bskcakestep_5.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/bskcakestep_6.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/jjtrstep_1.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/jjtrstep_2.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/jjtrstep_3.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/jjtrstep_4.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/jjtrstep_5.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/jjtrstep_6.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/jjtrstep_7.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/jjtrstep_8.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/jjtrstep_9.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/jjtrstep_10.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/jjtrstep_11.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/jjtrstep_12.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/tapasstep_1.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/tapasstep_2.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/tapasstep_3.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/tapasstep_4.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/swystep_1.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/swystep_2.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/swystep_3.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/swystep_4.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/swystep_5.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/swystep_6.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/swystep_7.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/swystep_8.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/ktdstep_1.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/ktdstep_2.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/ktdstep_3.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/ktdstep_4.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/ktdstep_5.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/ktdstep_6.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/cobbstep_1.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/cobbstep_2.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/cobbstep_3.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/cobbstep_4.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/cobbstep_5.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/cobbstep_6.jpg");
        db.insert("Picture",null,values);
        values.put("pic","C:/cooking/img/baicai.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",303);
        values1.put("name","白菜");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/baihujiaofen.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",304);
        values1.put("name","白胡椒粉");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/baijiu.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",305);
        values1.put("name","白酒");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/bailixiang.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",306);
        values1.put("name","百里香");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/bailuobo.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",307);
        values1.put("name","白萝卜");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/baimogu.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",308);
        values1.put("name","白蘑菇");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/baiputaojiu.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",309);
        values1.put("name","白葡萄酒");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/baitang.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",310);
        values1.put("name","白糖");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/baiyou.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",311);
        values1.put("name","白油");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/baizhima.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",312);
        values1.put("name","白芝麻");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/baizhuozhi.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",313);
        values1.put("name","白灼汁");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/bajiao.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",314);
        values1.put("name","八角");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/beef.png");
        db.insert("Picture",null,values);
        values1.put("pic_id",315);
        values1.put("name","牛肉");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/bingtang.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",316);
        values1.put("name","冰糖");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/caomei.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",317);
        values1.put("name","草莓");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/caoyu.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",318);
        values1.put("name","草鱼");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/chengzhi.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",319);
        values1.put("name","橙汁");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/chicken_spt.png");
        db.insert("Picture",null,values);
        values1.put("pic_id",320);
        values1.put("name","鸡肉");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/congbai.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",321);
        values1.put("name","葱白");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/conghua.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",322);
        values1.put("name","葱花");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/cu.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",323);
        values1.put("name","醋");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/dacong.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",324);
        values1.put("name","大葱");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/dadou.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",325);
        values1.put("name","大豆");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/dami.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",326);
        values1.put("name","大米");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/dannaiyou.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",327);
        values1.put("name","淡奶油");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/daomiyou.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",328);
        values1.put("name","稻米油");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/dazhaxie.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",329);
        values1.put("name","大闸蟹");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/dianfen.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",330);
        values1.put("name","淀粉");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/dijinmianfen.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",331);
        values1.put("name","低筋面粉");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/diwangxie.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",332);
        values1.put("name","帝王蟹");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/donggua.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",333);
        values1.put("name","冬瓜");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/dougan.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",334);
        values1.put("name","豆干");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/douya.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",335);
        values1.put("name","豆芽");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/douyou.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",336);
        values1.put("name","豆油");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/egg.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",337);
        values1.put("name","鸡蛋");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/fangqiejiang.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",338);
        values1.put("name","番茄酱");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/fanqiegao.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",339);
        values1.put("name","蕃茄膏");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/feiniu.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",340);
        values1.put("name","肥牛");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/fengmi.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",341);
        values1.put("name","蜂蜜");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/furu.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",342);
        values1.put("name","腐乳");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/fuzhu.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",343);
        values1.put("name","腐竹");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/ganhuajiao.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",344);
        values1.put("name","干花椒");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/ganlajiao.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",345);
        values1.put("name","干辣椒");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/ganlanyou.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",346);
        values1.put("name","橄榄油");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/gaojinmianfen.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",347);
        values1.put("name","高筋面粉");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/guipi.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",348);
        values1.put("name","桂皮");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/haiyan.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",349);
        values1.put("name","海盐");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/haoyou.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",350);
        values1.put("name","耗油");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/heidou.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",351);
        values1.put("name","黑豆");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/heihujiao.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",352);
        values1.put("name","黑胡椒");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/heihujiaofen.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",353);
        values1.put("name","黑胡椒粉");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/heihujiaosui.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",354);
        values1.put("name","黑胡椒碎");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/heimi.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",355);
        values1.put("name","黑米");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/hongcha.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",356);
        values1.put("name","红茶");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/hongdou.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",357);
        values1.put("name","红豆");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/hongjiu.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",358);
        values1.put("name","红酒");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/hongqvfen.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",359);
        values1.put("name","红曲粉");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/hongshudianfen.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",360);
        values1.put("name","红薯淀粉");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/hongzao.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",361);
        values1.put("name","红枣");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/huajiao.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",362);
        values1.put("name","花椒");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/huajiaofen.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",363);
        values1.put("name","花椒粉");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/huajiaoyou.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",364);
        values1.put("name","花椒油");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/huangdou.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",365);
        values1.put("name","黄豆");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/huanggua.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",366);
        values1.put("name","黄瓜");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/huangyou.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",367);
        values1.put("name","黄油");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/huashengjiang.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",368);
        values1.put("name","花生酱");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/huashengmi.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",369);
        values1.put("name","花生米");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/huashengsui.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",370);
        values1.put("name","花生碎");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/huashengyou.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",371);
        values1.put("name","花生油");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/huixiang.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",372);
        values1.put("name","茴香");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/hujiaofen.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",373);
        values1.put("name","胡椒粉");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/huluobo.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",374);
        values1.put("name","胡萝卜");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/jiang.png");
        db.insert("Picture",null,values);
        values1.put("pic_id",375);
        values1.put("name","姜");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/jiangyou.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",376);
        values1.put("name","酱油");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/jiaomu.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",377);
        values1.put("name","酵母");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/jiaozipi.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",378);
        values1.put("name","饺子皮");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/jichi.png");
        db.insert("Picture",null,values);
        values1.put("pic_id",379);
        values1.put("name","鸡翅");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/jijing.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",380);
        values1.put("name","鸡精");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/jinzhengu.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",381);
        values1.put("name","金针菇");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/jitui.png");
        db.insert("Picture",null,values);
        values1.put("pic_id",382);
        values1.put("name","鸡腿");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/jiweijiu.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",383);
        values1.put("name","鸡尾酒");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/jixiongrou.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",384);
        values1.put("name","鸡胸肉");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/jiyu.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",385);
        values1.put("name","鲫鱼");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/jizhi.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",386);
        values1.put("name","鸡汁");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/jizhua.png");
        db.insert("Picture",null,values);
        values1.put("pic_id",387);
        values1.put("name","鸡爪");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/kele.png");
        db.insert("Picture",null,values);
        values1.put("pic_id",388);
        values1.put("name","可乐");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/koumo.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",389);
        values1.put("name","口蘑");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/kuihuayou.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",390);
        values1.put("name","葵花油");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/kuihuaziyou.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",391);
        values1.put("name","葵花籽油");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/lajiang.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",392);
        values1.put("name","辣酱");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/lajiaofen.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",393);
        values1.put("name","辣椒粉");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/lajiaomian.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",394);
        values1.put("name","辣椒面");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/laochou.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",395);
        values1.put("name","老抽");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/liaojiu.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",396);
        values1.put("name","料酒");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/liji.png");
        db.insert("Picture",null,values);
        values1.put("pic_id",397);
        values1.put("name","里脊");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/liulian.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",398);
        values1.put("name","榴莲");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/liyu.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",399);
        values1.put("name","鲤鱼");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/longjing.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",400);
        values1.put("name","龙井");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/longxia.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",401);
        values1.put("name","龙虾");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/luliao.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",402);
        values1.put("name","卤料");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/luoleye.png");
        db.insert("Picture",null,values);
        values1.put("pic_id",403);
        values1.put("name","罗勒叶");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/lvcha.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",404);
        values1.put("name","绿茶");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/lvdou.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",405);
        values1.put("name","绿豆");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/mangguo.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",406);
        values1.put("name","芒果");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/masulilanailao.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",407);
        values1.put("name","马苏里拉奶酪");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/mayou.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",408);
        values1.put("name","麻油");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/meigancai.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",409);
        values1.put("name","梅干菜");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/mianbaitang.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",410);
        values1.put("name","绵白糖");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/mianbaokang.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",411);
        values1.put("name","面包糠");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/mianbaoxie.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",412);
        values1.put("name","面包蟹");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/mianbing.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",413);
        values1.put("name","面饼");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/mianfen.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",414);
        values1.put("name","面粉");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/miantiao.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",415);
        values1.put("name","面条");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/mianziyou.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",416);
        values1.put("name","棉籽油");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/midiexiang.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",417);
        values1.put("name","迷迭香");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/mixian.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",418);
        values1.put("name","米线");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/mogu.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",419);
        values1.put("name","蘑菇");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/naifen.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",420);
        values1.put("name","奶粉");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/naiyounailao.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",421);
        values1.put("name","奶油奶酪");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/nangua.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",422);
        values1.put("name","南瓜");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/neizhidoufu.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",423);
        values1.put("name","内酯豆腐");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/nendoufu.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",424);
        values1.put("name","嫩豆腐");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/ningmeng.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",425);
        values1.put("name","柠檬");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/niuliji.png");
        db.insert("Picture",null,values);
        values1.put("pic_id",426);
        values1.put("name","牛里脊");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/niunai.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",427);
        values1.put("name","牛奶");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/niunan.png");
        db.insert("Picture",null,values);
        values1.put("pic_id",428);
        values1.put("name","牛腩");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/niupai.png");
        db.insert("Picture",null,values);
        values1.put("pic_id",429);
        values1.put("name","牛排");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/niuyou.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",430);
        values1.put("name","牛油");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/niuyouguo.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",431);
        values1.put("name","牛油果");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/niuza.png");
        db.insert("Picture",null,values);
        values1.put("pic_id",432);
        values1.put("name","牛杂");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/nuomi.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",433);
        values1.put("name","糯米");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/ouqinsui.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",434);
        values1.put("name","欧芹碎");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/paigu.png");
        db.insert("Picture",null,values);
        values1.put("pic_id",435);
        values1.put("name","排骨");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/pangxie.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",436);
        values1.put("name","螃蟹");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/peigen.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",437);
        values1.put("name","培根");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/pingguocu.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",438);
        values1.put("name","苹果醋");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/pipixia.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",439);
        values1.put("name","皮皮虾");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/puer.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",440);
        values1.put("name","普洱");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/qiezi.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",441);
        values1.put("name","茄子");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/qingcai.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",442);
        values1.put("name","青菜");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/qingyu.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",443);
        values1.put("name","青鱼");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/sanwenyu.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",444);
        values1.put("name","三文鱼");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/selayou.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",445);
        values1.put("name","色拉油");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/shengchou.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",446);
        values1.put("name","生抽");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/shisanxiang.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",447);
        values1.put("name","十三香");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/sigua.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",448);
        values1.put("name","丝瓜");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/suan.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",449);
        values1.put("name","蒜");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/suannai.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",450);
        values1.put("name","酸奶");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/suantou.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",451);
        values1.put("name","蒜头");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/suozixie.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",452);
        values1.put("name","梭子蟹");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/tieguanyin.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",453);
        values1.put("name","铁观音");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/tudou.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",454);
        values1.put("name","土豆");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/wawacai.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",455);
        values1.put("name","娃娃菜");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/wuhua.png");
        db.insert("Picture",null,values);
        values1.put("pic_id",456);
        values1.put("name","五花肉");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/xia.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",457);
        values1.put("name","虾");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/xiangcai.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",458);
        values1.put("name","香草");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/xiangcaojing.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",459);
        values1.put("name","香草精");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/xiangcong.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",460);
        values1.put("name","香葱");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/xianggu.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",461);
        values1.put("name","香菇");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/xiangye.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",462);
        values1.put("name","香叶");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/xiangyou.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",463);
        values1.put("name","香油");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/xiaocong.png");
        db.insert("Picture",null,values);
        values1.put("pic_id",464);
        values1.put("name","小葱");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/xiaofanqie.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",465);
        values1.put("name","小番茄");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/xiaomai.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",466);
        values1.put("name","小麦");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/xiaomi.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",467);
        values1.put("name","小米");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/xiaomijiao.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",468);
        values1.put("name","小米椒");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/xiaomila.png");
        db.insert("Picture",null,values);
        values1.put("pic_id",469);
        values1.put("name","小米辣");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/xiaren.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",470);
        values1.put("name","虾仁");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/xiarou.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",471);
        values1.put("name","虾肉");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/xihongshi.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",472);
        values1.put("name","西红柿");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/xihulu.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",473);
        values1.put("name","西葫芦");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/xilanhua.png");
        db.insert("Picture",null,values);
        values1.put("pic_id",474);
        values1.put("name","西兰花");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/xingrenyou.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",475);
        values1.put("name","杏仁油");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/xuebi.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",476);
        values1.put("name","雪碧");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/xuelijiu.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",477);
        values1.put("name","雪莉酒");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/yamaziyou.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",478);
        values1.put("name","亚麻籽油");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/yan.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",479);
        values1.put("name","盐");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/yangcong.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",480);
        values1.put("name","洋葱");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/yayou.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",481);
        values1.put("name","鸭油");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/yezhi.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",482);
        values1.put("name","椰汁");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/yidalimian.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",483);
        values1.put("name","意大利面");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/yumidianfen.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",484);
        values1.put("name","玉米淀粉");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/yumiyou.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",485);
        values1.put("name","玉米油");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/zhima.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",486);
        values1.put("name","芝麻");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/zhimayou.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",487);
        values1.put("name","芝麻油");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/zhishifen.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",488);
        values1.put("name","芝士粉");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/zhiwuyou.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",489);
        values1.put("name","植物园");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/zhudu.png");
        db.insert("Picture",null,values);
        values1.put("pic_id",490);
        values1.put("name","猪肚");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/zhurou.png");
        db.insert("Picture",null,values);
        values1.put("pic_id",491);
        values1.put("name","猪肉");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/zhuyou.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",492);
        values1.put("name","猪油");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/zhuzhou.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",493);
        values1.put("name","猪肘");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/zicai.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",494);
        values1.put("name","紫菜");
        db.insert("Ingredient",null,values1);
        values.put("pic","C:/cooking/img/niuzhi.jpg");
        db.insert("Picture",null,values);
        values1.put("pic_id",495);
        values1.put("name","牛至");
        db.insert("Ingredient",null,values1);

        values2.put("menu_id",1);
        values2.put("cover",1);
        values2.put("title","白灼香菜肥牛");
        values2.put("user_id",1);
        values2.put("introduction","超受欢迎的香菜拌肥牛~快速简单美味！");
        db.insert("Menu",null,values2);

        values2.put("menu_id",2);
        values2.put("cover",2);
        values2.put("title","风味茄子");
        values2.put("user_id",1);
        values2.put("introduction","麻辣鲜香带一丢丢酸甜，好吃到词穷！");
        db.insert("Menu",null,values2);

        values2.put("menu_id",3);
        values2.put("cover",3);
        values2.put("title","可乐鸡翅");
        values2.put("user_id",1);
        values2.put("introduction","我能炫十个！！");
        db.insert("Menu",null,values2);

        values2.put("menu_id",4);
        values2.put("cover",4);
        values2.put("title","梅菜扣肉");
        values2.put("user_id",1);
        values2.put("introduction","看朋友圈晒酒席的时候看到这道菜就馋了，吃了还想做。煎猪皮的时候要小心被油溅到哦~");
        db.insert("Menu",null,values2);

        values2.put("menu_id",5);
        values2.put("cover",5);
        values2.put("title","向日葵水蒸蛋");
        values2.put("user_id",1);
        values2.put("introduction","春天是一个充满活力的季节，到处都是绿茵茵的小草和快开的小花花，今天就安排一个向日葵小花花的水蒸蛋，嫩滑爽口，花花好看养眼～");
        db.insert("Menu",null,values2);

        values2.put("menu_id",6);
        values2.put("cover",6);
        values2.put("title","番茄荷包蛋焖面");
        values2.put("user_id",1);
        values2.put("introduction","汤汁浓郁，好吃过瘾的番茄荷包蛋焖面！早上来上一碗，开启元气满满的一天，香喷喷的荷包蛋，裹满浓郁的番茄汁，咬下去一口真的太满足了！做法简单！");
        db.insert("Menu",null,values2);

        values2.put("menu_id",7);
        values2.put("cover",7);
        values2.put("title","凉拌面");
        values2.put("user_id",1);
        values2.put("introduction","秋老虎，闷热的天气，没什么胃口，赶紧安排个酸辣口的很开胃～酸辣凉拌面！专治没胃口，酸辣面条搭配爽口黄瓜丝，还有酥脆的花生米，嗦的一口～太幸福了！");
        db.insert("Menu",null,values2);

        values2.put("menu_id",8);
        values2.put("cover",8);
        values2.put("title","妈妈汤面");
        values2.put("user_id",1);
        values2.put("introduction","以前我煮汤面就是很清汤寡水，没什么美味。但是每次回家妈妈煮的汤面就是很不一样很好吃！于是我就偷师了哈哈！汤面的汤真的是精髓\n" +
                "除了面以外，其他的食材可以替换其他自己喜欢的\n" +
                "另外值得一提的是加点紫菜会好吃很多！！\n");
        db.insert("Menu",null,values2);

        values2.put("menu_id",9);
        values2.put("cover",9);
        values2.put("title","麻酱拌面皮");
        values2.put("user_id",1);
        values2.put("introduction","零难度的麻酱拌面皮，好吃到飞");
        db.insert("Menu",null,values2);

        values2.put("menu_id",10);
        values2.put("cover",10);
        values2.put("title","奶油蘑菇培根意大利面");
        values2.put("user_id",1);
        values2.put("introduction","两人份，煮面的时候可以准备其他，最后也可以放芝士片");
        db.insert("Menu",null,values2);

        values2.put("menu_id",11);
        values2.put("cover",11);
        values2.put("title","酱牛肉");
        values2.put("user_id",1);
        values2.put("introduction","好吃！简单！扔锅直接煮！");
        db.insert("Menu",null,values2);

        values2.put("menu_id",12);
        values2.put("cover",12);
        values2.put("title","飘香肘子");
        values2.put("user_id",1);
        values2.put("introduction","家宴上的经典菜，平时也要安排起来！");
        db.insert("Menu",null,values2);

        values2.put("menu_id",13);
        values2.put("cover",13);
        values2.put("title","清蒸大闸蟹");
        values2.put("user_id",1);
        values2.put("introduction","");
        db.insert("Menu",null,values2);

        values2.put("menu_id",14);
        values2.put("cover",14);
        values2.put("title","椒盐鸡腿");
        values2.put("user_id",1);
        values2.put("introduction","");
        db.insert("Menu",null,values2);

        values2.put("menu_id",15);
        values2.put("cover",15);
        values2.put("title","西葫芦鸡蛋蒸包");
        values2.put("user_id",1);
        values2.put("introduction","低脂低卡，免揉面，好吃到哭");
        db.insert("Menu",null,values2);

        values2.put("menu_id",16);
        values2.put("cover",16);
        values2.put("title","脆皮炸鸡翅");
        values2.put("user_id",1);
        values2.put("introduction","谁不爱炸鸡呢");
        db.insert("Menu",null,values2);

        values2.put("menu_id",17);
        values2.put("cover",17);
        values2.put("title","炸薯饼");
        values2.put("user_id",1);
        values2.put("introduction","炸得香香脆脆的太美味啦！土豆真的无论怎么做都吃不腻！");
        db.insert("Menu",null,values2);

        values2.put("menu_id",18);
        values2.put("cover",18);
        values2.put("title","蒜香炸排骨");
        values2.put("user_id",1);
        values2.put("introduction","喜欢的友友们一起来动手做吧，好吃到停不下来！");
        db.insert("Menu",null,values2);

        values2.put("menu_id",19);
        values2.put("cover",19);
        values2.put("title","干炸小酥肉");
        values2.put("user_id",1);
        values2.put("introduction","炸鸡块、炸鸡腿啥的都弱爆了，还是炸酥肉最香！");
        db.insert("Menu",null,values2);

        values2.put("menu_id",20);
        values2.put("cover",20);
        values2.put("title","酥炸凤尾虾");
        values2.put("user_id",1);
        values2.put("introduction","馋到你了吗？心动就行动吧！");
        db.insert("Menu",null,values2);

        values2.put("menu_id",21);
        values2.put("cover",21);
        values2.put("title","白菜豆腐汤");
        values2.put("user_id",1);
        values2.put("introduction","简单操作，新手小白也能一次性成功！！喝起来就是小时候妈妈做的味道呀。");
        db.insert("Menu",null,values2);

        values2.put("menu_id",22);
        values2.put("cover",22);
        values2.put("title","西红柿鸡蛋汤");
        values2.put("user_id",1);
        values2.put("introduction","家常汤品。");
        db.insert("Menu",null,values2);

        values2.put("menu_id",23);
        values2.put("cover",23);
        values2.put("title","冬瓜丸子汤");
        values2.put("user_id",1);
        values2.put("introduction","喝水不如喝汤。冬瓜丸子汤，浓香不油腻、鲜美可口。冬瓜性味甘、淡、有利尿、清热、化痰、解渴等功效，其中糖类，维生素含量均较高且不含脂肪，最适合这个季节吃了！");
        db.insert("Menu",null,values2);

        values2.put("menu_id",24);
        values2.put("cover",24);
        values2.put("title","奶油蘑菇汤");
        values2.put("user_id",1);
        values2.put("introduction","吃西餐偶然间爱上了这道奶油蘑菇汤，奶香浓郁，回味悠然，自己也可以在家做，非常的简单。");
        db.insert("Menu",null,values2);

        values2.put("menu_id",25);
        values2.put("cover",25);
        values2.put("title","南瓜土豆汤");
        values2.put("user_id",1);
        values2.put("introduction","从小到大一直喜欢吃老妈做的南瓜土豆汤，南瓜软糯甘甜，土豆绵软细腻，汤水滋味浓郁.……百吃不厌。那是一种记忆中难以忘怀的味道，因为映射了一段时光，也承载了一段回忆。");
        db.insert("Menu",null,values2);

        values2.put("menu_id",26);
        values2.put("cover",26);
        values2.put("title","黄油小花曲奇");
        values2.put("user_id",1);
        values2.put("introduction","又是一年圣诞节，每年的圣诞节都会跟朋友们在家里聚会，布置餐桌，点上蜡烛，忙活着做甜点，小花曲奇是最不能少的，孩子们一会能能吃掉好几盘，这次选择了\n" +
                "安佳奶油做的小花曲奇更酥更香了~而且超级简单，烘焙小白也可以做哦！\n");
        db.insert("Menu",null,values2);

        values2.put("menu_id",27);
        values2.put("cover",27);
        values2.put("title","八寸戚风蛋糕");
        values2.put("user_id",1);
        values2.put("introduction","戚风是很多新入坑的小伙伴必做的一款蛋糕，组织蓬松细腻，如云朵般轻柔，深受大家的喜欢。");
        db.insert("Menu",null,values2);

        values2.put("menu_id",28);
        values2.put("cover",28);
        values2.put("title","榴莲披萨");
        values2.put("user_id",1);
        values2.put("introduction","榴莲披萨，绝对让你对榴莲的认识上一个新台阶。");
        db.insert("Menu",null,values2);

        values2.put("menu_id",29);
        values2.put("cover",29);
        values2.put("title","牛奶吐司");
        values2.put("user_id",1);
        values2.put("introduction","好吃的牛奶吐司！");
        db.insert("Menu",null,values2);

        values2.put("menu_id",30);
        values2.put("cover",30);
        values2.put("title","巴斯克芝士蛋糕");
        values2.put("user_id",1);
        values2.put("introduction","天气热的时候太需要这样的口感了，细腻顺滑，浓郁醇香，回味无穷！巴斯克芝士蛋糕来源于著名的美食圣地，法国与西班牙交界的一个地区：巴斯克克这款蛋糕独一无二的外表焦黑内里绵密顺滑口感让它成为ins 上的热门，非常浓郁的芝士味、入口即化。");
        db.insert("Menu",null,values2);

        values2.put("menu_id",31);
        values2.put("cover",31);
        values2.put("title","法式土豆煎鸡腿肉");
        values2.put("user_id",1);
        values2.put("introduction","简单西餐。");
        db.insert("Menu",null,values2);

        values2.put("menu_id",32);
        values2.put("cover",32);
        values2.put("title","Tapas西班牙蒜辣虾");
        values2.put("user_id",1);
        values2.put("introduction","简单好吃。");
        db.insert("Menu",null,values2);

        values2.put("menu_id",33);
        values2.put("cover",33);
        values2.put("title","柠檬香煎三文鱼");
        values2.put("user_id",1);
        values2.put("introduction","爱的料理，不需要复杂的调味，需要新鲜的食材和一颗戴着爱的心。");
        db.insert("Menu",null,values2);

        values2.put("menu_id",34);
        values2.put("cover",34);
        values2.put("title","西式香草烤土豆");
        values2.put("user_id",1);
        values2.put("introduction","不用水煮后再烤，直接烤口感更好，也更方便，水煮过再烤会粉粉的，也比较难烤出金黄的颜色会用到比较多品种的香草，有新鲜的最好啦，没有就用干的吧~如果没有那么多品种，有多少就用多少");
        db.insert("Menu",null,values2);

        values2.put("menu_id",35);
        values2.put("cover",35);
        values2.put("title","cobb salad考伯沙拉");
        values2.put("user_id",1);
        values2.put("introduction","cobb salad: 考伯沙拉，它不是普通的配菜沙拉，是可以做主食来吃的~还可以加任何自己想吃的蔬菜，因为颜色鲜艳营养丰富而广受大家喜爱，推荐使用低卡油醋汁，好吃不怕胖!减脂餐也能吃出新花样!");
        db.insert("Menu",null,values2);

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
        //db.setTransactionSuccessful(); // 设置事务处理成功，不设置会自动回滚不提交
        //db.endTransaction();
        //db.close();
    }

    public void onUpgrade(SQLiteDatabase db,int oldVersion,int newVersion) {
        db.execSQL(DELETE_pic);
        db.execSQL(DELETE_Ingredient);
        db.execSQL(DELETE_Finish);
        db.execSQL(DELETE_Menu);
        db.execSQL(DELETE_User);
        db.execSQL(DELETE_Step);
        db.execSQL(DELETE_Collection);
        onCreate(db);
    }

}