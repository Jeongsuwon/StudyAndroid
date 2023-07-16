package com.example.andproject.home;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.andproject.databinding.ActivityNotifyBinding;

public class NotifyActivity extends AppCompatActivity {

    ActivityNotifyBinding binding;

    ActionBar actionBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityNotifyBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.imgvNoticeBack.setOnClickListener(view -> {
            finish();
        });

        binding.imgvNoticeSet.setOnClickListener(view -> {
            Intent intent = new Intent(NotifyActivity.this, NotifySetActivity.class);
            startActivity(intent);
        });

        actionBar = getSupportActionBar();
        actionBar.hide();
    }
}