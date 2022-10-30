package com.example.cooking.ui.HomePage;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomePageViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public HomePageViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is HomePage fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}