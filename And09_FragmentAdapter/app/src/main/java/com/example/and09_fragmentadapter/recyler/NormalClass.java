package com.example.and09_fragmentadapter.recyler;

import android.content.Context;
import android.widget.Toast;

public class NormalClass {
    //토스트 창을 띄우는 기능을 메소드로 만들고 싶음.
    //어떻게 해야할까?
    public void testTost(Context context, String msg){
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }
}
