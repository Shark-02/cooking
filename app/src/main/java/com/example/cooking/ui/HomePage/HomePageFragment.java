package com.example.cooking.ui.HomePage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.cooking.R;
import com.example.cooking.databinding.FragmentHomepageBinding;
public class HomePageFragment extends Fragment {
    View root;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomePageViewModel homePageViewModel =
                new ViewModelProvider(this).get(HomePageViewModel.class);

        root = inflater.inflate(R.layout.fragment_homepage, container, false);

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();

    }
}