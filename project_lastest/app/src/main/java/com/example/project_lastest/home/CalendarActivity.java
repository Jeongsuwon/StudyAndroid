package com.example.project_lastest.home;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ling.databinding.ActivityCalendarBinding;

public class CalendarActivity extends AppCompatActivity {

    ActivityCalendarBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCalendarBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.imgvCalendarHome.setOnClickListener(v -> {
            finish();
        });

        binding.imgvCalendarAdd.setOnClickListener(v -> {
            Intent intent = new Intent(CalendarActivity.this, CalendarAddActivity.class);
            startActivity(intent);
        });
    }
}