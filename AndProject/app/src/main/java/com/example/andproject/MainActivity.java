package com.example.andproject;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;


import com.example.andproject.around.AroundFragment;
import com.example.andproject.databinding.ActivityMainBinding;
import com.example.andproject.home.HomeFragment;
import com.example.andproject.repository.RepositoryFragment;
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

        getWindow().setStatusBarColor(Color.parseColor("#000000"));

        binding.navigation.setOnItemSelectedListener(item -> {
            Fragment fragment = null;
            actionBar.show();//다시 보이게 하기.
            if(item.getItemId() == R.id.tab_home){
                actionBar.hide();
                fragment = new HomeFragment();

            }else if(item.getItemId() == R.id.tab_around){
                fragment = new AroundFragment();
                    actionBar.setTitle("둘러보기");
                    getWindow().setStatusBarColor(Color.parseColor("#000000"));
                    actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#000000")));
                    binding.container.setBackgroundColor(Color.parseColor("#000000"));
            }else if(item.getItemId() == R.id.tab_search){
                fragment = new SearchFragment();
                actionBar.setTitle("검색");
                actionBar.setIcon(R.drawable.search_mike1);
                getWindow().setStatusBarColor(Color.parseColor("#18191B"));
                actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#18191B")));
                binding.container.setBackgroundColor(Color.parseColor("#18191B"));
            }else if(item.getItemId() == R.id.tab_repository){
                fragment = new RepositoryFragment();
                actionBar.setTitle("저장소");
                getWindow().setStatusBarColor(Color.parseColor("#000000"));
                actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#000000")));
                binding.container.setBackgroundColor(Color.parseColor("#000000"));
                actionBar.setIcon(R.drawable.full_foward);
            }
            manager.beginTransaction().replace(R.id.container, fragment).commit();

            return true;
        });
    }
}