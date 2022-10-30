package com.example.cooking.ui.Upload;

import androidx.lifecycle.ViewModelProvider;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.example.cooking.R;
import com.example.cooking.Upload;

public class UploadFragment extends Fragment {

    private UploadViewModel mViewModel;
    View vup;
    ImageView re_up;
    public static UploadFragment newInstance() {
        return new UploadFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        vup=inflater.inflate(R.layout.fragment_upload, container, false);
        re_up=vup.findViewById(R.id.upload_recipe);
        re_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().onBackPressed();//销毁自己，这里不能用finish()
                Intent i = new Intent(getActivity(), Upload.class);
                startActivity(i);
            }
        });
        return vup;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(UploadViewModel.class);
        // TODO: Use the ViewModel
    }

}