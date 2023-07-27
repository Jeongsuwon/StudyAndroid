package com.example.ym01_designtemplate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.ym01_designtemplate.databinding.ActivityMainBinding;
import com.example.ym01_designtemplate.dialog.DialogActivity;
import com.example.ym01_designtemplate.social.SocialActivity;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    Intent intent = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.btnSocial.setOnClickListener(v->{
            intent = new Intent(this , SocialActivity.class);
            startActivity(intent);

        });

        binding.btnDialog.setOnClickListener(v->{
            intent = new Intent(this , DialogActivity.class);
            startActivity(intent);

        });


    }
}