package com.example.cooking;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.widget.Toolbar;

import com.bumptech.glide.Glide;
import com.example.cooking.ui.Upload.UploadFragment;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

public class Upload extends AppCompatActivity {

    ImageView sd;
    ImageView ivImage;
    File file;

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
        MyDatabaseHelper myopenHelper = new MyDatabaseHelper(this,"Cooking.db",null,1);

        sd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent = new Intent(Upload.this, MainActivity_bottom.class);
                //intent.putExtra("fragment", 3);
                //startActivity(intent);
                finish();

            }
        });
        View view = findViewById(R.id.rl_up);
        ivImage = findViewById(R.id.iv_image);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(new Intent(Intent.ACTION_PICK,
                        android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI), 100);
            }
        });
        //这里是发布
        Button upload = findViewById(R.id.upload_button);
        upload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //获取edittext数据填入数据库
                SQLiteDatabase db = myopenHelper.getReadableDatabase();
                ContentValues values=new ContentValues();
                ContentValues values2=new ContentValues();
                EditText title=(EditText) findViewById(R.id.recipe_name);
                EditText content=(EditText)findViewById(R.id.recipe_content);
                EditText ingre=(EditText)findViewById(R.id.ingre_input);
                EditText step=(EditText)findViewById(R.id.step_input);
                String menuTitle=title.getText().toString();
                String menuContent=content.getText().toString();
                String menuIngre=ingre.getText().toString();
                String menuStep=step.getText().toString();
                values2.put("pic",file.toString());
                db.insert("Picture",null,values2);
                Cursor cursor = db.rawQuery("select count(id) from Picture", null);
                cursor.moveToFirst();
                Integer count = cursor.getInt(0);
                cursor.close();
                values.put("cover",count);
                values.put("title",menuTitle);
                values.put("user_id",2);
                values.put("introduction",menuContent);
                db.insert("Menu",null,values);


                Intent intent = new Intent(Upload.this, Release.class);
                intent.putExtra("imgpath",file.toString());
                intent.putExtra("title",menuTitle);
                Toast t = Toast.makeText(Upload.this, "发布成功", Toast.LENGTH_SHORT);
                t.setGravity(Gravity.TOP, 0, 0);
                t.show();
                startActivity(intent);
                finish();
            }
        });
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK) {
            Uri uri = data.getData();
            try {
                InputStream inputStream = getContentResolver().openInputStream(uri);
                file = new File(getExternalCacheDir(), System.currentTimeMillis() + ".jpg");
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