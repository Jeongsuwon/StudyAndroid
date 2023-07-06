package com.example.and00_login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.and00_login.databinding.ActivityMainBinding;

import java.util.HashMap;
import java.util.Objects;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());



        binding.btnLogin.setOnClickListener(v -> {
            CommonConn conn = new CommonConn(this, "member/login");
            conn.addParamMap("id", binding.edtId.getText().toString());
            conn.addParamMap("pw", binding.edtPw.getText().toString());
            conn.onExcute(new CommonConn.JswCallBack() {
                @Override
                public void onResult(boolean isResult, String data) {

                }
            }); // onExcute 메소드가 실행되면 일단 Spring으로 전송처리는 정상적으로 작동한다. (결과를 가져오려면 어떻게?)

        });
    }




}