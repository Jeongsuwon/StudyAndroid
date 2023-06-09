package com.example.and04_framelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn_change;
    Button btn_change1;

//    ImageView imgv1, imgv2, imgv3;

    ArrayList<ImageView> imgList = new ArrayList<>();
//    HashMap<ImageView,> imgMap = new HashMap<>();

    //현재 객체를 선언만 해둔 상태에서는 4개의 객체 모두 null인 상태
    //null이 아니게 하려면 어떤 처리가 필요할까?

    //null이 아니게 만들고 if문을 이용하여 nullcheck를 하고 log를 찍어보기
    //nullCheck: btn....imgv3 중 하나라도 null이라면 null이 섞여있음 이라는 로그, 그게 아니면 전부 초기화 완료라고 로그에 찍힘



    int count= 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn_change = findViewById(R.id.btn);
        btn_change1 = findViewById(R.id.btn1);
        //ArrayList<E> list.add(E);
        imgList.add(findViewById(R.id.img1));
        imgList.add(findViewById(R.id.img2));
        imgList.add(findViewById(R.id.img3));
//        imgv1 = findViewById(R.id.img1);
//        imgv2 = findViewById(R.id.img2);
//        imgv3 = findViewById(R.id.img3);

        //버튼의 클릭을 감지하는 메소드. 인터페이스 View.OnClickListner<-
        //1. 직접 인터페이스를 인터페이스화하여 파라미터로 넘기는 방법
//        View.OnClickListener jswOnClick = new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.d("버튼", "버튼이 눌림");
//            }
//        };
        //2. 인터페이스를 초기화 할 수 있는 new 생성자로 파라미터를 넘기는 방법
//        btn_change.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.d("버튼", "버튼이 눌림 new");
//            }
//        });


        //3. 자바의 인터페이스 단점을 보완-> lamda (람다식, 함수형으로 new나 불필요한 코드를 생략하고 사용하는 방법)
        //인터페이스의 abstract메소드가 1개의 경우에만 사용가능. (인터페이스의 내부 구조를 모르면 사용이 거의 불가능)


        //4. 인터페이스를 상속받는 방법
        //-> Spring MVC의 경우에는 DAO 또는 Service가 반드시 구현해야만 하는 메소드의 형태를 만들어서 설계도
        //   개념으로 사용.(많은 개발자가 협업 시 편리한 방법)
        //-> Android <- 다형성을 이용한 방법. : View.OnClickListener <= onClick이라는 메소드를 반드시 가지고 있음.
        //                                      View.OnClickListener라는 것을 상속받은 Class는 == View.OnClickListener와 같다가 성립.


        btn_change1.setOnClickListener(v -> { //내부적으로 가지고있는 interface가 setter에 의해서 초기화 됨.
            count--;


            //count변수를 imgList 0~n(index)
            if(count == -1){
                count = 2;
            }
            Log.d("로그", "변수 로그:" + count);
        });


        btn_change1.setOnClickListener(v -> { //내부적으로 가지고있는 interface가 setter에 의해서 초기화 됨.
            count++;

            for (int i = 0; i < imgList.size(); i++) {
                imgList.get(i).setVisibility(View.GONE);

            }
            //count변수를 imgList 0~n(index)
            if(count == imgList.size()){
                count = 0;
            }
            imgList.get(count).setVisibility(View.VISIBLE);
        });

//        btn_change.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.d("버튼", "인터페이스 상속받아서 버튼 눌림을 감지");
//                if(count==3){
//                    imgv3.setVisibility(View.GONE);
//                    imgv2.setVisibility(View.VISIBLE);
//                    Log.d("이전 버튼클릭", "3");
//                }else if(count==2){
//                    imgv2.setVisibility(View.GONE);
//                    imgv1.setVisibility(View.VISIBLE);
//                    Log.d("이전 버튼클릭", "2");
//                }else if(count==1){
//                    imgv1.setVisibility(View.GONE);
//                    imgv3.setVisibility(View.VISIBLE);
//                    Log.d("이전 버튼클릭", "1");
//                    count=3;
//                    return;
//                }
//                count--;
//
//            }
//        });
    }

    @Override
    public void onClick(View v) {

    }

    public void changeImage(){
        for (int i = 0; i < imgList.size(); i++) {
            imgList.get(i).setVisibility(View.GONE);
        }
        imgList.get(count).setVisibility(View.VISIBLE);
    }


//    @Override
//        public void onClick(View v) {
//            if (count == 1) {
//                imgv3.setVisibility(View.GONE);
//                imgv1.setVisibility(View.VISIBLE);
//                Log.d("다음 버튼클릭", "1");
//            } else if (count == 2) {
//                imgv1.setVisibility(View.GONE);
//                imgv2.setVisibility(View.VISIBLE);
//                Log.d("다음 버튼클릭", "2");
//            } else if (count == 3) {
//                imgv2.setVisibility(View.GONE);
//                imgv3.setVisibility(View.VISIBLE);
//                Log.d("다음 버튼클릭", "3");
//                count = 1;
//                return;
//            }
//            count++;
//        }

}

