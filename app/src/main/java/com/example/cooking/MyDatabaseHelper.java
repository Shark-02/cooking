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
    public static final String DELETE_User ="DROP TABLE IF EXISTS User";
    public static final String DELETE_Step ="DROP TABLE IF EXISTS Step";
    public static final String DELETE_Collection ="DROP TABLE IF EXISTS Collection";

    private Context mContext;

   public MyDatabaseHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    public void onCreate(SQLiteDatabase db){
        db.execSQL(CREATE_User);
        db.execSQL(CREATE_Step);
        db.execSQL(CREATE_Collection);
    }

    public void onUpgrade(SQLiteDatabase db,int oldVersion,int newVersion) {
        db.execSQL(DELETE_User);
        db.execSQL(DELETE_Step);
        db.execSQL(DELETE_Collection);
        onCreate(db);
    }

}