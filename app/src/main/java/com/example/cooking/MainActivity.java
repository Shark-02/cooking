package com.example.cooking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    MyDatabaseHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
    }
}