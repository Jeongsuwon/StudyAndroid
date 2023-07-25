package com.example.project_lastest.calendar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.project_lastest.R;
import com.example.project_lastest.databinding.ActivityCalendarBinding;

public class CalendarActivity extends AppCompatActivity {

    ActivityCalendarBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCalendarBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}