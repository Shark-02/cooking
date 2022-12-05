package com.example.cooking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.widget.Toolbar;

import com.example.cooking.ui.Upload.UploadFragment;

public class Upload extends AppCompatActivity {

    ImageView sd;

    public static void ToMe(Context context, int type) {
        Intent intent = new Intent(context, Upload.class);
        intent.putExtra("type", type);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload);
        sd = findViewById(R.id.shutdown);
        int type = getIntent().getIntExtra("type", 0);
        TextView tvTitle = findViewById(R.id.create_text);
        LinearLayout llMore = findViewById(R.id.ll_more);
        if (type == 1) {
            tvTitle.setText("上传视频");
            llMore.setVisibility(View.GONE);
        } else if (type == 2) {
            tvTitle.setText("上传作品");
            llMore.setVisibility(View.GONE);
        }
        sd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Upload.this, MainActivity_bottom.class);
                intent.putExtra("fragment", 3);
                startActivity(intent);
                finish();

            }
        });
        //这里是发布
        Button upload = findViewById(R.id.upload_button);
        upload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Upload.this, Release.class);
                Toast t = Toast.makeText(Upload.this, "发布成功", Toast.LENGTH_SHORT);
                t.setGravity(Gravity.TOP, 0, 0);
                t.show();
                startActivity(intent);
                finish();
            }
        });
    }
}