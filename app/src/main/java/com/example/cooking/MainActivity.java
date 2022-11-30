package com.example.cooking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;
import android.database.sqlite.SQLiteDatabase;

import io.rong.imkit.RongIM;
import io.rong.imkit.utils.RouteUtils;
import io.rong.imlib.RongIMClient;

public class MainActivity extends AppCompatActivity {

    private MyDatabaseHelper dbHelper;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String token = "mwAl2co/dQcL3n74wA9P3fk3+H+NA/RppRr3qfv3eKM=@wczf.cn.rongnav.com;wczf.cn.rongcfg.com";
        RongIM.connect(token, new RongIMClient.ConnectCallback() {
            @Override
            public void onSuccess(String userId) {
                // 登录成功，跳转到默认会话列表页。
                //RouteUtils.routeToConversationListActivity(MainActivity.this, "");
            }

            @Override
            public void onError(RongIMClient.ConnectionErrorCode connectionErrorCode) {

            }

            @Override
            public void onDatabaseOpened(RongIMClient.DatabaseOpenStatus databaseOpenStatus) {

            }
        });
        final Intent main = new Intent(this, MainActivity_bottom.class); // 要转向的Activity

        Timer timer = new Timer();

        TimerTask task = new TimerTask() {

            @Override

            public void run() {

                startActivity(main); // 启动新的Activity      //或不写该段仅让当前Activity消失

                MainActivity.this.finish();

            }

        };

        timer.schedule(task, 1000 * 3); // 8秒后执行
        dbHelper = new MyDatabaseHelper(this,"Cooking.db",null,1);
        dbHelper.getWritableDatabase();
        //SQLiteDatabase db= dbHelper.getWritableDatabase();
        //dbHelper.onCreate(db);
        //ContentValues values=new ContentValues();
        //ContentValues values1=new ContentValues();






        timer.schedule(task, 1000 * 3); // 3秒后执行
    }


}