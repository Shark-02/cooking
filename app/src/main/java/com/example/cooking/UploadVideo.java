package com.example.cooking;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;

public class UploadVideo extends AppCompatActivity {

    ImageView sd;
    ImageView ivImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload_video);
        sd = findViewById(R.id.shutdown);
        sd = findViewById(R.id.shutdown);
        View view = findViewById(R.id.rl_up);
        ivImage = findViewById(R.id.iv_image);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(new Intent(Intent.ACTION_GET_CONTENT).setType("video/*"), 100);
            }
        });
        sd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UploadVideo.this, MainActivity_bottom.class);
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
                Intent intent = new Intent(UploadVideo.this, Release.class);
                Toast t = Toast.makeText(UploadVideo.this, "发布成功", Toast.LENGTH_SHORT);
                t.setGravity(Gravity.TOP, 0, 0);
                t.show();
                startActivity(intent);
                finish();
            }
        });
    }

    private String fileName = "";

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK) {
            Uri uri = data.getData();
            try {
                InputStream inputStream = getContentResolver().openInputStream(uri);
                File file = new File(getExternalCacheDir(), System.currentTimeMillis() + ".mp4");
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                byte[] b = new byte[inputStream.available()];
                inputStream.read(b);
                fileOutputStream.write(b);
                fileOutputStream.close();
                inputStream.close();
                Glide.with(ivImage).load(file).into(ivImage);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}