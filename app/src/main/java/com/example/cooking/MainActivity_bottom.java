package com.example.cooking;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.NavGraph;
import androidx.navigation.NavInflater;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.cooking.databinding.ActivityMainBottomBinding;

public class MainActivity_bottom extends AppCompatActivity {

    private ActivityMainBottomBinding binding;
    int jumpnum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBottomBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                 R.id.navigation_homepage, R.id.navigation_home, R.id.navigation_message,R.id.navigation_upload,R.id.navigation_view)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main_bottom);
        NavInflater navInflater = navController.getNavInflater();
        NavGraph navGraph = navInflater.inflate(R.navigation.mobile_navigation);

        Intent intent=getIntent();
        jumpnum=intent.getIntExtra("fragment",1);
        switch (jumpnum){
            case 1:
                navGraph.setStartDestination(R.id.navigation_homepage);
                break;
            case 3:
                navGraph.setStartDestination(R.id.navigation_upload);
        }

        navController.setGraph(navGraph);
        NavigationUI.setupWithNavController(binding.navView, navController);
        ImageView select_ingredient=findViewById(R.id.choose_ingredient);

    }

}