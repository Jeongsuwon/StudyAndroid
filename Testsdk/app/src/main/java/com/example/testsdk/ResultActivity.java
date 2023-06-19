package com.example.testsdk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.ArrayList;

public class ResultActivity extends AppCompatActivity {
    TextView txt_colaCount, txt_ciderCount, txt_fantaCount, txt_sodaCount, txt_change;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        txt_colaCount = findViewById(R.id.txt_colaCount);
        txt_ciderCount = findViewById(R.id.txt_ciderCount);
        txt_fantaCount = findViewById(R.id.txt_fantaCount);
        txt_sodaCount = findViewById(R.id.txt_sodaCount);
        txt_change = findViewById(R.id.txt_change);

        Intent intent = getIntent();
        int uCola = intent.getIntExtra("uCola", -1);
        int uCider = intent.getIntExtra("uCider", -1);
        int uFanta = intent.getIntExtra("uFanta", -1);
        int uSoda = intent.getIntExtra("uSoda", -1);
        int change = intent.getIntExtra("change", -1);
        ArrayList<DrinkDTO> list = (ArrayList<DrinkDTO>) intent.getSerializableExtra("list");


        txt_change.setText("잔액: "+change+"원");
        if(uCola>0 && uCider>0 && uFanta>0 && uSoda>0){
        txt_colaCount.setText(list.get(0).getDrink()+uCola+"개");
        txt_ciderCount.setText(list.get(1).getDrink()+uCider+"개");
        txt_fantaCount.setText(list.get(2).getDrink()+uFanta+"개");
        txt_sodaCount.setText(list.get(3).getDrink()+uSoda+"개");

        }
    }
}