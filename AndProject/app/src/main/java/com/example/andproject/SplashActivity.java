package com.example.andproject;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

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
        getWindow().setStatusBarColor(Color.parseColor("#000000"));
        ProgressDialog dialog = new ProgressDialog(this);
//        Animation anim = AnimationUtils.loadAnimation(this, R.anim.splash);
        dialog.setTitle("flo");
//        binding.imgvSplash.setAnimation(anim);

        dialog.setCancelable(false);
        dialog.show();

        new Handler().postDelayed(()->{
            dialog.dismiss();
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            finish();
        }, 1000 * 3);
    }
}