package com.example.andproject.home;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.andproject.R;
import com.example.andproject.databinding.ActivityNotifyBinding;

public class NotifyActivity extends AppCompatActivity {

    ActivityNotifyBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityNotifyBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}