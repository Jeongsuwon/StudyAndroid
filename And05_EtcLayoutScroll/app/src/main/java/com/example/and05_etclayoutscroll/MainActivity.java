package com.example.and05_etclayoutscroll;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv_text = findViewById(R.id.tv_text);
        //TextView.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR // <= Static Member : 클래스가 인스턴스화 하지 않아도 메모리에 이미 올라가있는 멤버
        //textview.append();// <= Instance Member : 클래스가 인스턴스화 해야지만 메모리에 로딩
        Button btn = findViewById(R.id.btn);
        ScrollView scroll = findViewById(R.id.scroll);
        HorizontalScrollView horizon = findViewById(R.id.horizon);


        for(int i=0; i<=50; i++) {
            for (int j = 0; j < 20; j++) {
            tv_text.append("안녕하세요");
            }
            tv_text.append("안녕하세요"+"\n");
        }


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("스크롤 위치", "getScrollY" + scroll.getScrollY());
                scroll.scrollTo(0,  scroll.getScrollY()+100);
                horizon.smoothScrollTo(horizon.getScrollX()+100, 0);
            }
        });


    }
}