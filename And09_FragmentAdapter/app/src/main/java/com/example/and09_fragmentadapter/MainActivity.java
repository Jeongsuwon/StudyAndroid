package com.example.and09_fragmentadapter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    FrameLayout container;
    Button btn_menu1, btn_menu2, btn_adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Fragment를 붙이기 위한 공간, Fragment, FragmentManager 3가지의 요소가 필요하다.

//        container_fl = findViewById(R.id.container); <-FragmentManager에서는 객체로 초기화 된 위젯이 필요 x, 디자인 파일에 있는 id만 명시해주면 o

        btn_menu1 = findViewById(R.id.btn_menu1);
        btn_menu2 = findViewById(R.id.btn_menu2);
        btn_adapter = findViewById(R.id.btn_adapter);


        btn_menu1.setOnClickListener(this);
        btn_menu2.setOnClickListener(this);
        btn_adapter.setOnClickListener(this);



        //트랜잭션 : ?   <=>    세트: Commit & Rollback
        //manager.beginTransaction().add(R.id.container, new HomeFragment(), "A").commit();


    }

    @Override
    public void onClick(View v) {
        FragmentManager manager = getSupportFragmentManager(); //프래그먼트 매니저의 초기화식
        Intent intent = new Intent(MainActivity.this, AdapterActivity.class);
        if(v.getId() == R.id.btn_menu1){
        manager.beginTransaction().replace(R.id.container, new HomeFragment()).commit();
        }else if(v.getId() == R.id.btn_menu2){
        manager.beginTransaction().replace(R.id.container, new SubFragment()).commit();
        }else if(v.getId() == R.id.btn_adapter){
            startActivity(intent);
        }
    }
}