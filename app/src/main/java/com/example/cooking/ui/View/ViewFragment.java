package com.example.cooking.ui.View;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.example.cooking.Adapter.MyAdapter;
import com.example.cooking.Data_view.DataGenerator;
import com.example.cooking.Data_view.recipe;
import com.example.cooking.R;

import java.util.List;

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
        data= DataGenerator.genData();

        ma=new MyAdapter(R.layout.view_list_itemlayout,data);
        lv=view.findViewById(R.id.view_lv);
        LinearLayoutManager layoutManager = new LinearLayoutManager(lv.getContext());

        lv.setLayoutManager(layoutManager);
        lv.setAdapter(ma);

    }




}