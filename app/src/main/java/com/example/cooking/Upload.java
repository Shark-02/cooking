package com.example.cooking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.widget.Toolbar;

import com.example.cooking.ui.Upload.UploadFragment;

public class Upload extends AppCompatActivity {

    ImageView sd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload);
        sd=findViewById(R.id.shutdown);
        sd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(
                        Upload.this,
                        MainActivity_bottom.class
                );
                intent.putExtra("fragment",3);
                startActivity(intent);
                finish();

            }
        });
        //这里是发布
        Button upload=findViewById(R.id.upload_button);
        upload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Upload.this, Release.class);
                Toast t=Toast.makeText(Upload.this, "发布成功", Toast.LENGTH_SHORT);
                t.setGravity(Gravity.TOP,0,0);
                t.show();
                startActivity(intent);
                finish();
            }
        });
    }
}