package com.example.cooking.ui.View;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.example.cooking.Adapter.MyAdapter;
import com.example.cooking.Data_view.Chat_member;
import com.example.cooking.Data_view.DataGenerator;
import com.example.cooking.Data_view.recipe;
import com.example.cooking.R;

import java.util.List;
import java.util.Random;

public class ViewFragment extends Fragment {

    private ViewViewModel mViewModel;
    MyAdapter ma;
    List<recipe> data;
    RecyclerView lv;
    View view;
    public static ViewFragment newInstance() {
        return new ViewFragment();
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_view, container, false);
        setupView();
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(ViewViewModel.class);

        // TODO: Use the ViewModel
    }

    void setupView(){
        data= DataGenerator.genRecipeData();
        //Log.d("size",String.valueOf(data.size()));
        int num= new Random().nextInt(20);
        for (int i=0;i<num;i++){
            recipe rs = new recipe();
            rs.img_id = R.drawable.to_po;
            rs.title = "番茄炒蛋";
            rs.content = "Content of " + data.size();
            data.add(rs);
        }
        //ma.notifyDataSetChanged();
        //data=DataGenerator.addRecipe(data,num);
        ma=new MyAdapter(R.layout.view_list_itemlayout,data);
        lv=view.findViewById(R.id.view_lv);
        //LinearLayoutManager layoutManager = new LinearLayoutManager(lv.getContext());
        StaggeredGridLayoutManager sm=new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
        //lv.setLayoutManager(layoutManager);
        lv.setLayoutManager(sm);
        lv.setAdapter(ma);

    }




}