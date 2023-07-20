package com.example.andproject.home;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.widget.CheckBox;
import android.widget.Toast;

import com.example.andproject.MainActivity;
import com.example.andproject.R;
import com.example.andproject.common.CommonConn;
import com.example.andproject.common.CommonVar;
import com.example.andproject.databinding.ActivityLoginBinding;
import com.google.gson.Gson;

public class LoginActivity extends AppCompatActivity {
    ActionBar actionBar;
    ActivityLoginBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getWindow().setStatusBarColor(Color.parseColor("#000000"));
        actionBar = getSupportActionBar();
        actionBar.hide();

        CheckBox checkBox = (CheckBox) findViewById(R.id.login_checkbox);
        if (checkBox.isChecked()) {
            checkBox.setChecked(true);
        } else {
            checkBox.toggle();
        }


        binding.tvRegister.setOnClickListener(view -> {
            Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
            startActivity(intent);
        });

        binding.imgvLoginLogo.setOnClickListener(v -> {
            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
            startActivity(intent);
        });

        binding.btnLogin.setOnClickListener(view -> {
            login();
        });


    }

    public void login() {
        if (binding.userid.getText().toString().length() < 1 || binding.password.getText().toString().length() < 1) {
            Toast.makeText(this, "아이디 또는 패스워드를 입력하세요.", Toast.LENGTH_SHORT).show();
            return;
        }

        CommonConn conn = new CommonConn(this, "flo/flo_Login");
        conn.addParamMap("user_id", binding.userid.getText().toString());
        conn.addParamMap("pw", binding.password.getText().toString());
        conn.onExcute((isResult, data) -> {
            if (isResult) {
                CommonVar.floLoginInfo = new Gson().fromJson(data, FloVO.class);
                if (CommonVar.floLoginInfo == null) {
                    Toast.makeText(this, "아이디 또는 비밀번호를 입력하세요.", Toast.LENGTH_SHORT).show();
                    Log.d("로그인값", "login: " + CommonVar.floLoginInfo);
                    binding.userid.requestFocus();
                }
//                else if(! CommonVar.floLoginInfo.getId().equals("user_id") || ! CommonVar.floLoginInfo.getId().equals("pw")) {
//                    Toast.makeText(this, "아이디 또는 비밀번호가 틀렸습니다.", Toast.LENGTH_SHORT).show();
//                    binding.userid.setText("");
//                    binding.password.setText("");
//                    binding.userid.requestFocus();
//
//
//                }
                else{
                   Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);
                    Toast.makeText(this, binding.userid.getText().toString() +"님 환영합니다.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}