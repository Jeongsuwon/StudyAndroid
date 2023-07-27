package com.example.ym01_designtemplate.social;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.example.ym01_designtemplate.R;
import com.example.ym01_designtemplate.databinding.ActivitySocialBinding;
import com.example.ym01_designtemplate.social.customui.CustomBottomNavigationView;
import com.example.ym01_designtemplate.social.fragments.Fr_CreatePost;
import com.example.ym01_designtemplate.social.fragments.Fr_Main;
import com.example.ym01_designtemplate.social.fragments.Fr_Search;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class SocialActivity  extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    ActivitySocialBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySocialBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        CustomBottomNavigationView bottomNavigation = findViewById(R.id.customBottomBar);
        bottomNavigation.inflateMenu(R.menu.social_navigation);
        bottomNavigation.setOnNavigationItemSelectedListener(this);
        setFragment(new Fr_Main());
        binding.txtTitle.setText("Feeds");



        binding.addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showNewPostDialog();
            }
        });

    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

        if(menuItem.getItemId() == R.id.navigation_home){
            setFragment(new Fr_Main());
            binding.txtTitle.setText("Feeds");
        }else if (menuItem.getItemId() == R.id.navigation_search){
            setFragment(new Fr_Search());
            binding.txtTitle.setText("Search");
        }else if (menuItem.getItemId() == R.id.navigation_search){
            binding.txtTitle.setText("Notification");
        }else if (menuItem.getItemId() == R.id.navigation_search){
            binding.txtTitle.setText("Profile");
        }else {

        }

        return true;

    }

    public void setFragment(Fragment fragment) {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.main_frame, fragment);
        ft.commit();
    }


    private void showNewPostDialog() {
        FragmentManager fm = getSupportFragmentManager();
        Fr_CreatePost fr_createPost = new Fr_CreatePost();
        fr_createPost.show(fm, "Fr_CreatePost");

    }
}