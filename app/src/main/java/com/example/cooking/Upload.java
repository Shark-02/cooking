package com.example.cooking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

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

            }
        });
    }
}