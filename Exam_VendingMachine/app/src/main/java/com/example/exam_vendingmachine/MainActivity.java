package com.example.exam_vendingmachine;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

//    ArrayList에 이미 담았기때문에 필요가 없음. (혼동)
//    TextView tv_name1, tv_name2, tv_name3, tv_name4, tv_cnt1, tv_cnt2, tv_cnt3, tv_cnt4;
    Button btn_order1, btn_order2, btn_order3, btn_order4;

//    int cola=1000, cider=1100, fanta=1200, sol=1300;
//    int cntCola=10, cntCider=11, cntFanta=12, cntSol=13;
    int userMoney = 99999999;
    ArrayList<DrinkDTO> list = new ArrayList<>();
//    ArrayList<TextView> nameList = new ArrayList<>();
//    ArrayList<TextView> cntList = new ArrayList<>();
    ArrayList<ViewHolder> viewList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list.add(new DrinkDTO("콜라", 1000, 10));
        list.add(new DrinkDTO("사이다", 1100, 11));
        list.add(new DrinkDTO("환타", 1200, 12));
        list.add(new DrinkDTO("솔의눈", 1300, 13));




        viewList.add(new ViewHolder(findViewById(R.id.tv_name1),findViewById(R.id.tv_cnt1),findViewById(R.id.btn_order1)));
        viewList.add(new ViewHolder(findViewById(R.id.tv_name2),findViewById(R.id.tv_cnt2),findViewById(R.id.btn_order2)));
        viewList.add(new ViewHolder(findViewById(R.id.tv_name3),findViewById(R.id.tv_cnt3),findViewById(R.id.btn_order3)));
        viewList.add(new ViewHolder(findViewById(R.id.tv_name4),findViewById(R.id.tv_cnt4),findViewById(R.id.btn_order4)));


        for(int i=0; i<viewList.size(); i++){ // 0 < N-1, 0~3(4-1)
            final int idx = 0;
            viewList.get(i).getBtn_order().setOnClickListener(new View.OnClickListener() {
                @Override
                 public void onClick(View v){
                    viewList.get(idx).getTv_cnt().setText("aaaaa");
                }
            });
//            1. 클래스 내부에는 생성자, 메소드, 필드 존재
//            2. 메소드 내부에는 메소드 만들기 x
//            3. 인터페이스에서는 변수는 반드시 final로 선언 ( 한 번 초기화 된 변수 값은 변경할 수 없음 ) -> 인터페이스 규칙
//            4.
        }

    class Test {
        void method() {
            //메소드 내부에 메소드 만들기 x
            Log.d("asd", "onCreate: ");
        }
    }


        viewList.get(0).getBtn_order().setOnClickListener(this);
        viewList.get(1).getBtn_order().setOnClickListener(this);
        viewList.get(2).getBtn_order().setOnClickListener(this);
        viewList.get(3).getBtn_order().setOnClickListener(this);


//        tv_name1 = findViewById(R.id.tv_name1);
//        tv_name2 = findViewById(R.id.tv_name2);
//        tv_name3 = findViewById(R.id.tv_name3);
//        tv_name4 = findViewById(R.id.tv_name4);



//        nameList.add(findViewById(R.id.tv_name1));
//        nameList.add(findViewById(R.id.tv_name2));
//        nameList.add(findViewById(R.id.tv_name3));
//        nameList.add(findViewById(R.id.tv_name4));

//        tv_cnt1 = findViewById(R.id.tv_cnt1);
//        tv_cnt2 = findViewById(R.id.tv_cnt2);
//        tv_cnt3 = findViewById(R.id.tv_cnt3);
//        tv_cnt4 = findViewById(R.id.tv_cnt4);

//        cntList.add(findViewById(R.id.tv_cnt1));
//        cntList.add(findViewById(R.id.tv_cnt2));
//        cntList.add(findViewById(R.id.tv_cnt3));
//        cntList.add(findViewById(R.id.tv_cnt4));
//
//        btn_order1 = findViewById(R.id.btn_order1);
//        btn_order2 = findViewById(R.id.btn_order2);
//        btn_order3 = findViewById(R.id.btn_order3);
//        btn_order4 = findViewById(R.id.btn_order4);
//
//
//        btn_order1.setOnClickListener(new JswOnClickListener(0));
//        btn_order2.setOnClickListener(new JswOnClickListener(1));
//        btn_order3.setOnClickListener(new JswOnClickListener(2));
//        btn_order4.setOnClickListener(new JswOnClickListener(3));

    }
    public void setTextMethod(TextView tv){
        tv.setText("테스트");
    }

    @Override
    public void onClick(View v) {

    }

    public interface  test{
        int i = 0; //인터페이스에서 변수의 규칙 (변수는 반드시 final로 변하지 않을 것)
    }


    //list <= 데이터를 묶어놓은 자료구조 (버튼 1번이 눌렀을 때는 자료구조의 인덱스 0번 주소값) => (2=>1)
//    public class JswOnClickListener implements View.OnClickListener {
//        private int index;
//
//
//        public JswOnClickListener(int index) {
//            this.index = index;
//        }
//
//        @Override
//        public void onClick(View v) {
//
//            userMoney -= list.get(index).getPrice(); //기존 금액 = 기존 금액 - 콜라 가격
//            list.get(index).setCnt(list.get(index).getCnt()-1);
//            nameList.get(index).setText("콜라" + list.get(index).getPrice() + "원");
//            cntList.get(index).setText(list.get(index).getCnt()+"개 남음");
//
//        }
//    }


}