package com.example.cooking.ui.HomePage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.cooking.databinding.FragmentHomepageBinding;
public class HomePageFragment extends Fragment {

    private FragmentHomepageBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomePageViewModel homePageViewModel =
                new ViewModelProvider(this).get(HomePageViewModel.class);

        binding = FragmentHomepageBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textHomepage;
        homePageViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}