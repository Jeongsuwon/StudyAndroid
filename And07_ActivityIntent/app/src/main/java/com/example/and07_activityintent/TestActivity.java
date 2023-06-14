package com.example.and07_activityintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class TestActivity extends AppCompatActivity {
    final String TAG = "로그";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        Intent intent = getIntent();
        String strValue= intent.getStringExtra("str");
//        int intValue = intent.getIntExtra("int");

        Log.d(TAG, "onCreate: "+ strValue);
//        Log.d(TAG, "onCreate: "+ intValue);




    }
}