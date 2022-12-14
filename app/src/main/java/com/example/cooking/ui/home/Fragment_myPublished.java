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
 * Use the {@link Fragment_myPublished#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment_myPublished extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    MyAdapter ma;
    RecyclerView rcv;
    List<recipe> published_data;
    View root;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Fragment_myPublished() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Fragment_myPublished.
     */
    // TODO: Rename and change types and number of parameters
    public static Fragment_myPublished newInstance(String param1, String param2) {
        Fragment_myPublished fragment = new Fragment_myPublished();
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
        root=inflater.inflate(R.layout.fragment_my_published, container, false);
        SetupAdapter();
        return root;
    }

    void SetupAdapter(){
        published_data= new ArrayList<>();
        MyDatabaseHelper dbHelper = new MyDatabaseHelper(getActivity(),"Cooking.db",null,1);
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        Cursor cursor=db.rawQuery("select title,introduction,pic from Menu,Picture where Picture.id=cover and user_id=2 ",null);
        //Cursor cursor1 = db.rawQuery("select title,pic from Menu,Picture where Picture.id=cover and user_id=2" ,null);

        //这里还要加”我的收藏“的查询语句
        /*int menuid=0;
        Cursor cursor2=db.rawQuery("select menu_id from Collection where user_id=2", null);*/

        if(cursor.moveToFirst()){
            do{
                recipe rs = new recipe();
                String img=cursor.getString(cursor.getColumnIndexOrThrow("pic"));
                BitmapFactory.Options opt = new BitmapFactory.Options();
                opt.inPreferredConfig = Bitmap.Config.RGB_565;
                Bitmap bitmap = BitmapFactory.decodeFile(img, opt);
                rs.img=bitmap;
                Log.d("pic",cursor.getString(cursor.getColumnIndexOrThrow("pic")));
                rs.title = cursor.getString(cursor.getColumnIndexOrThrow("title"));
                Log.d("title",cursor.getString(cursor.getColumnIndexOrThrow("title")));
                rs.content = cursor.getString(cursor.getColumnIndexOrThrow("introduction"));
                Log.d("introduction",cursor.getString(cursor.getColumnIndexOrThrow("introduction")));
                published_data.add(rs);
            }while (cursor.moveToNext() & cursor.moveToNext());
        }
        /*if (cursor2.moveToFirst())
        {menuid=cursor2.getInt(cursor2.getColumnIndexOrThrow("menu_id"));}
        Cursor cursor3 = db.rawQuery("select title,introduction,pic from Menu,Menu,Picture where Picture.id=cover and menu_id= " + menuid, null);
        if (cursor3.moveToFirst()) {
            recipe rs = new recipe();
            rs.img=getImageBitmap(cursor3.getString(cursor3.getColumnIndexOrThrow("pic")));
            Log.d("pic",cursor3.getString(cursor3.getColumnIndexOrThrow("pic")));
            rs.title = cursor3.getString(cursor3.getColumnIndexOrThrow("title"));
            Log.d("title",cursor3.getString(cursor3.getColumnIndexOrThrow("title")));
            rs.content = cursor3.getString(cursor3.getColumnIndexOrThrow("introduction"));
            Log.d("introduction",cursor3.getString(cursor3.getColumnIndexOrThrow("introduction")));
            favorite_data.add(rs);
        }*/
        cursor.close();
        //cursor1.close();
        //cursor2.close();
        //cursor3.close();

        ma=new MyAdapter(R.layout.view_list_itemlayout,published_data);
        if (root.findViewById(R.id.published_content) != null) {
            rcv = root.findViewById(R.id.published_content);
            StaggeredGridLayoutManager sm = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
            rcv.setLayoutManager(sm);
            rcv.setAdapter(ma);
            /*ma2.setOnItemClickListener(new OnItemClickListener() {
                @Override
                public void onItemClick(@NonNull BaseQuickAdapter adapter, @NonNull View view, int position) {
                    Intent intent = new Intent(getContext(), Menu.class);
                    intent.putExtra("title",data.get(position).title);
                    startActivity(intent);
                }
            });*/
        }


        //View view = View.inflate(getContext(), R.layout.fragment_my_favorite, null);



    }
}