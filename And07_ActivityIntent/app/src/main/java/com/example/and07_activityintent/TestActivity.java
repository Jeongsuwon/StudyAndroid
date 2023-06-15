package com.example.and07_activityintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class TestActivity extends AppCompatActivity {
    final String TAG = "로그";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        Intent intent = getIntent();
        String strValue= intent.getStringExtra("str");
        int intValue = intent.getIntExtra("int", -1);
        TestDTO dtoValue = (TestDTO) intent.getSerializableExtra("dtotest");
        ArrayList<TestDTO> list  = (ArrayList<TestDTO>) intent.getSerializableExtra("list");

        Log.d(TAG, "onCreate: "+ strValue);
        Log.d(TAG, "onCreate: "+ intValue);
        if(dtoValue != null){
            Log.d(TAG, "onCreate: "+ dtoValue.edt_str+dtoValue.edt_int);
        }

        if(list != null){
            Log.d(TAG, "onCreate: "+ list.get(0).edt_str+list.get(0).edt_int);
        }




    }
}