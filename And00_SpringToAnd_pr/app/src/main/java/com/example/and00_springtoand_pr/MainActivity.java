package com.example.and00_springtoand_pr;

import androidx.annotation.VisibleForTesting;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ApiInterface가 초기화 되어야 함.
        //초기화 식 : ApiInterface name = Retrofit.create( ApiInterface.class );

        //Collection 자료구조
        //HashMap<String, Object> map = new HashMap<>();
        //map.put("Spring 변수 이름", "보내주고 싶은 값");
        //키 값 중복시 마지막 키 값으로 덮어씌어진다.
        RetrofitInterface api = new RetrofitClient().getRetrofit().create(RetrofitInterface.class);
        HashMap<String, Object> paramMap = new HashMap<>();
        paramMap.put("param", "값안드");
        paramMap.put("param", "값안드");
        paramMap.put("param", "값안드1");
        paramMap.put("param1", "값안드2");

        //CallBack: Kakao Login
        //jsp 카카오 로그인 버튼 누름 -> Controller -> Rest Api ( 카카오 서버에 특정 맵핑을 호출하고, 파라미터를 넘겨 줌.(Client_id) -> 페이지
        //-> 사용자가 로그인 (언제 끝날지 모름) 끝나면 내가 만들어둔 나의 Controller로 데이터를 주라. -> Callback

        //Dialog처리 : 사용자는 기다리는 일을 잘못함. (-> 아무런 디자인 처리 없이)
        ProgressDialog dialog = new ProgressDialog(this);
        dialog.setTitle("레트로핏");
        dialog.setMessage("데이터를 가져오는중....");
        dialog.setProgress(ProgressDialog.STYLE_SPINNER);
        dialog.setCancelable(false);
        dialog.show();

        api.clientPostMethod("list.cu",paramMap).enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                Log.d("레트로핏", "onResponse: 응답이 왔음. Spring에서 이후 처리 진행");
                dialog.dismiss();
            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {
                Log.d("레트로핏", "onFailure: url, 포트가 틀림");
                dialog.dismiss();
            }
        });

    }
}