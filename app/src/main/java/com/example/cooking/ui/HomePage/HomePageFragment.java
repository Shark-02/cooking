package com.example.cooking.ui.HomePage;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SearchView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.cooking.MainActivity_bottom;
import com.example.cooking.R;
import com.example.cooking.SearchActivity;
import com.example.cooking.SelectIngredient;
import com.example.cooking.databinding.FragmentHomepageBinding;
import com.example.cooking.jiachang_enter;

public class HomePageFragment extends Fragment {
    View root;
    ImageView select_ingredient,jiachangiv,search_other;



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomePageViewModel homePageViewModel =
                new ViewModelProvider(this).get(HomePageViewModel.class);

        root = inflater.inflate(R.layout.fragment_homepage, container, false);
        select_ingredient=root.findViewById(R.id.choose_ingredient);
        jiachangiv=root.findViewById(R.id.home_cooking);
        search_other=root.findViewById(R.id.search_box_home);
        select_ingredient.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SelectIngredient.class);
                startActivity(intent);
            }

        });

        search_other.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SearchActivity.class);
                startActivity(intent);
            }

        });

        jiachangiv.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), jiachang_enter.class);
                startActivity(intent);
            }

        });
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();

    }
}