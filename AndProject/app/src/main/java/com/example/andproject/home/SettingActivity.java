package com.example.andproject.home;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.andproject.R;
import com.example.andproject.databinding.ActivitySettingBinding;

public class SettingActivity extends AppCompatActivity {
    ActionBar actionBar;
    ActivitySettingBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySettingBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        actionBar = getSupportActionBar();
        actionBar.hide();
        binding.imgvSetBack.setOnClickListener(view -> {
            finish();
        });
    }
}