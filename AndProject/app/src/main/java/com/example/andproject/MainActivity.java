package com.example.andproject;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;


import com.example.andproject.around.AroundFragment;
import com.example.andproject.databinding.ActivityMainBinding;
import com.example.andproject.home.HomeFragment;
import com.example.andproject.search.SearchFragment;


public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    ActionBar actionBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction().replace(R.id.container, new HomeFragment()).commit();

        actionBar = getSupportActionBar();
        actionBar.hide();


        binding.navigation.setOnItemReselectedListener(item -> {
            Fragment fragment = null;
            actionBar.show();//??
            if(item.getItemId() == R.id.tab_home){
                actionBar.hide();
                fragment = new HomeFragment();

            }else if(item.getItemId() == R.id.tab_around){
                fragment = new AroundFragment();
                    actionBar.setTitle("둘러보기");
            }else if(item.getItemId() == R.id.tab_search){
                fragment = new SearchFragment();
                actionBar.setTitle("검색");
            }else if(item.getItemId() == R.id.tab_repository){
//                fragment = new RepositoryFragment();
                actionBar.setTitle("저장소");
            }
            manager.beginTransaction().replace(R.id.container, fragment).commit();

        });
    }
}