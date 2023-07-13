package com.example.andproject.home;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.CheckBox;

import com.example.andproject.R;
import com.example.andproject.databinding.ActivityLoginBinding;

public class LoginActivity extends AppCompatActivity {
    ActionBar actionBar;
    ActivityLoginBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        actionBar = getSupportActionBar();
        actionBar.hide();

        CheckBox checkBox = (CheckBox) findViewById(R.id.login_checkbox) ;
        if (checkBox.isChecked()) {
            checkBox.setChecked(true) ;
        } else {
            checkBox.toggle() ;
        }

        binding.tvRegister.setOnClickListener(view -> {
            Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
            startActivity(intent);
        });

    }
}