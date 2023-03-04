package com.example.cooking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Release extends AppCompatActivity {
    String title;
    String img;
    ImageView cover;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent=getIntent();
        title=intent.getStringExtra("title");

        img=intent.getStringExtra("imgpath");
        //Log.d("img",img);
        setContentView(R.layout.activity_release);
        TextView release_back=findViewById(R.id.release_back);
        tv=findViewById(R.id.textView4);
        cover=findViewById(R.id.cover);
        tv.setText(title);
        //显示图片
        BitmapFactory.Options opt = new BitmapFactory.Options();
        opt.inPreferredConfig = Bitmap.Config.RGB_565;
        Bitmap bitmap = BitmapFactory.decodeFile(img, opt);
        if(bitmap==null){
            bitmap=  BitmapFactory.decodeResource(getResources(), R.drawable.lose, null);
        }
        cover.setImageBitmap(bitmap);
        release_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent = new Intent(Release.this, MainActivity_bottom.class);
                //intent.putExtra("fragment",3);
                //startActivity(intent);
                finish();

            }
        });
    }
}