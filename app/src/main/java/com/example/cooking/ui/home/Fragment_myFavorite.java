package com.example.cooking.ui.home;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.cooking.Adapter.MyAdapter;
import com.example.cooking.Data_view.recipe;
import com.example.cooking.MyDatabaseHelper;
import com.example.cooking.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Fragment_myFavorite#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment_myFavorite extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    RecyclerView rcv;
    MyAdapter ma2;
    View root;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Fragment_myFavorite() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Fragment_myFavorite.
     */
    // TODO: Rename and change types and number of parameters
    public static Fragment_myFavorite newInstance(String param1, String param2) {
        Fragment_myFavorite fragment = new Fragment_myFavorite();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        root=inflater.inflate(R.layout.fragment_my_favorite, container, false);
        SetupAdapter();
        return root;
    }


    void SetupAdapter(){

        ma2=new MyAdapter(R.layout.view_list_itemlayout,getData());
        Log.d("133",String.valueOf(getData().size()));
        rcv=root.findViewById(R.id.favorite_content);
        StaggeredGridLayoutManager sm2=new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
        rcv.setLayoutManager(sm2);
        rcv.setAdapter(ma2);

    }

    public Bitmap getImageBitmap(String imgName){
        String DIR = "/data/data/com.example.cooking/img/";
        String img= DIR+imgName;
        BitmapFactory.Options opt = new BitmapFactory.Options();
        opt.inPreferredConfig = Bitmap.Config.RGB_565;
        Bitmap bitmap = BitmapFactory.decodeFile(img, opt);
        return bitmap;

    }

    public List<recipe> getData(){
        List<recipe> data22 = new ArrayList<>();
        //Toast.makeText(MatchIngredient.this, "没有查询到数据", Toast.LENGTH_SHORT).show();
        MyDatabaseHelper myopenHelper = new MyDatabaseHelper(getContext(),"Cooking.db",null,1);
        SQLiteDatabase db = myopenHelper.getReadableDatabase();
        Cursor cursor = db.rawQuery("select title,pic from Menu,Picture,Collection where  Picture.id=cover and Collection.menu_id=Menu.menu_id  order by Collection.id desc" , null);
        if (cursor.moveToFirst()){
            recipe rs = new recipe();
            //rs.img_id = cursor.getInt(cursor.getColumnIndexOrThrow("pic_id"));
            if(getImageBitmap(cursor.getString(cursor.getColumnIndexOrThrow("pic")))==null){
                rs.img=  BitmapFactory.decodeResource(getResources(), R.drawable.lose, null);
            }
            else{
                rs.img=getImageBitmap(cursor.getString(cursor.getColumnIndexOrThrow("pic")));
            }
            //Log.d("pic",cursor.getString(cursor.getColumnIndexOrThrow("pic")));

            int inx=cursor.getColumnIndex("title");
            rs.title= cursor.getString(inx);

            /*int inx2=cursor.getColumnIndex("introduction");
            rs.content= cursor.getString(inx2);

            //Log.d("amount",rs.ingre_title);*/
            data22.add(rs);
        }
        while(cursor.moveToNext()) {
            //moveToNext()移动光标到下一行
            //count+=1;
            recipe rs = new recipe();
            //rs.img_id = cursor.getInt(cursor.getColumnIndexOrThrow("pic_id"));
            if(getImageBitmap(cursor.getString(cursor.getColumnIndexOrThrow("pic")))==null){
                rs.img=  BitmapFactory.decodeResource(getResources(), R.drawable.lose, null);
            }
            else{
                rs.img=getImageBitmap(cursor.getString(cursor.getColumnIndexOrThrow("pic")));
            }
            //Log.d("pic",cursor.getString(cursor.getColumnIndexOrThrow("pic")));

            int inx = cursor.getColumnIndex("title");
            rs.title = cursor.getString(inx);

            /*int inx2 = cursor.getColumnIndex("introduction");
            rs.content = cursor.getString(inx2);

            //Log.d("amount",rs.ingre_title);*/
            data22.add(rs);
        }
        Log.d("12",String.valueOf(data22.size()));
        return data22;

    }
}