package com.example.ling.home;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.ling.R;
import com.example.ling.databinding.ActivityCalendarAddBinding;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CalendarAddActivity extends AppCompatActivity {
    
    ActivityCalendarAddBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCalendarAddBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


    }
}