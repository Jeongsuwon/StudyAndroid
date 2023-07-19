package com.example.project02_lastproject.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.project02_lastproject.R;
import com.example.project02_lastproject.common.RetClient;
import com.example.project02_lastproject.common.RetInterface;
import com.example.project02_lastproject.databinding.ActivityPracBinding;

import java.util.HashMap;
import java.util.Random;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class PracActivity extends AppCompatActivity {
    ActivityPracBinding binding;
//    CallbackJsw callback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPracBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

//        callback = new CallbackJsw() {
//            @Override
//            public void onResult(String data) {
//                binding.tvResult.setText(data);
//
//            }
//        };

        binding.btnSelect.setOnClickListener(v -> {
            //RetrofitClient : 접속 방법, 컨버터 등 통신에 대한 전반적인 방법이 있는 객체.
            //RetrofitInterface : 접속 후 데이터 전송 방식, 파라메터 타입 등등의 기능에 가까운 객체.



            commonExcute(binding.edtMapping.getText().toString(), new HashMap<>(), new CallbackJsw() {
                @Override
                public void onResult(String data) {
                    binding.tvResult.setText("select 결과 후 처리 : " + data);
                }
            });

//            api.postRet("retrofit/select", new HashMap<>()).enqueue(new Callback<String>() {
//                @Override
//                public void onResponse(Call<String> call, Response<String> response) {
//                  callback.onResult(response.body());
//                }
//
//                @Override
//                public void onFailure(Call<String> call, Throwable t) {
//                    callback.onResult(t.getMessage());
//                }
//            });
        });

        binding.btnInsert.setOnClickListener(v -> {
            HashMap<String, Object> params = new HashMap<>();
            params.put("col1", "random값1:"+new Random().nextInt(100));
            params.put("col2", "random값2:"+new Random().nextInt(100));
            RetInterface api = new RetClient().getRet().create(RetInterface.class);
            commonExcute("retrofit/insert", params, data -> {
                binding.tvResult.setText("insert의 결과 1은 성공" + data);
            });

//            api.postRet("retrofit/insert", params).enqueue(new Callback<String>() {
//                @Override
//                public void onResponse(Call<String> call, Response<String> response) {
//                    binding.tvResult.setText(response.body());
//                    method(callback);
//                    method(new CallbackJsw() {
//                        @Override
//                        public void onResult(String data) {
//                            Log.d("로그", "onResult: 여기가 실행 ");
//                        }
//                    });
//                }
//
//                @Override
//                public void onFailure(Call<String> call, Throwable t) {
//                    binding.tvResult.setText(t.getMessage());
//                }
//            });
//        });
    });
    }
    public void commonExcute(String url, HashMap<String, Object> map, CallbackJsw callback){
            RetInterface api = new RetClient().getRet().create(RetInterface.class);

        api.postRet(url,map).enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                callback.onResult(response.body());
            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {
                callback.onResult(t.getMessage());
            }
        });

    }


    public interface CallbackJsw{
        public void onResult(String data);
    }

}