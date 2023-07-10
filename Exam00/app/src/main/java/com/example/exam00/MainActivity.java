package com.example.exam00;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv1;
    Button btn1, btn_start, btn_stop;
    ClacDAO dao = new ClacDAO();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 = findViewById(R.id.tv1);
        btn1 = findViewById(R.id.btn1);
        btn_start = findViewById(R.id.btn_start);
        btn_stop = findViewById(R.id.btn_stop);
//        getSum(1, 2); //메소드가 구현(정의)되어있는 파라미터부 = 호출부의 파라미터 값을 합치면 변수 초기화식이 된다.
        tv1.setText(dao.getSum(1,2)+"");
        btn1.setText(dao.getSum(1,2)+"");

    }

//    void getSum(int i, int j){
//        Log.d("두수의 합", "getSum: " + (i + j));
//        tv1.setText(i+j+"");
//    };

    public interface JswCallback{

    }

}