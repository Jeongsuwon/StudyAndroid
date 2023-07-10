package com.example.exam00;

import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

public class ClacDAO {
    //클래스의 멤버는 크게 2가지가 있다.

    //왜 멤버를 나눠서 사용?
    //-->

    int num1, num2; //인스턴스 멤버 - 인스턴스화를 통해서 메모리에 올라가기 때문에 인스턴스화 과정이 필요하다.
    private int num3;
    public int num4;


    static int num5;//스태틱 멤버 - 메모리에 항상 먼저 올라가 있기 때문에 인스턴스화를 거치지 않고 사용할 수 있다.
    private static int num6;
    public static int num7;
    public int getSum(int i, int j){
        return i+j;
    }

//    public void getSum(int i, int j, TextView tv1){
//        Log.d("두수의 합", "getSum: " + (i + j));
//        tv1.setText(i+j+"");
//
//    };
//    public void getSum(int i, int j,Button btn1){
//        btn1.setText(i+j+"");
//    };
}
