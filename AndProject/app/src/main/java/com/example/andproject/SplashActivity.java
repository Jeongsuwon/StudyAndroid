package com.example.andproject;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.andproject.databinding.ActivitySplashBinding;
import com.example.andproject.home.LoginActivity;

public class SplashActivity extends AppCompatActivity {

    ActivitySplashBinding binding;
    ActionBar actionBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySplashBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        actionBar = getSupportActionBar();
        actionBar.hide();
        ProgressDialog dialog = new ProgressDialog(this);
        dialog.setTitle("FLO");
        dialog.setCancelable(false);
        dialog.show();

        new Handler().postDelayed(()->{
            dialog.dismiss();
            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
            finish();
        }, 1000 * 3);
    }
}