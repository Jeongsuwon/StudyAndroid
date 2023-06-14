package com.example.and07_activityintent;

import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    final String TAG = "수명주기";
    // 현재는 onCreate내부에서만 코드처리를 해도 무방함.
    // 추후에 여러 화면이나 Spring연동 시 새로고침 등의 처리가 필요할 때는 수명주기가 있다는 것을 생각하고,
    // 적절한 수명주기 이용

    // 안드로이드도 Spring과 마찬가지로 Debugging를 잘하면 오류찾는게 빠르다. (디버깅모드를 한번씩 연습해보는 습관을 들이면 좋음)

    EditText edt_call, edt_search, edt_send, edt_str, edt_int;

    Button btn_call, btn_search, btn_send, btn_str, btn_int, btn_strint, btn_list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Log.d(TAG, "onCreate: ");

        Intent intent = getIntent();//방금 LoginActivity에서 startActivity('indent') 사용된 intent를 가져옴. (내부에 넣어둔(putExtra) 데이터를 빼오기 위해서)

        String strValue = intent.getStringExtra("strkey");
        Integer intValue = intent.getIntExtra("intkey", -1);

        LoginDTO dto = (LoginDTO) intent.getSerializableExtra("dtokey");//객체 타입을 주고 강제로 바꾸는 것 -> 역직렬화 -> 내부에 있는 멤버를 사용하기 위해 Serializable -> dto

        // name으로 값을 찾았을 때 없다면, 기본 값을 어떤 걸로 할껀지 defaultValue

        Log.d(TAG, "onCreate: " + strValue);
        Log.d(TAG, "onCreate: " + intValue);
        Log.d(TAG, "onCreate: " + dto.getId());

        ArrayList<LoginDTO> list = (ArrayList<LoginDTO>) intent.getSerializableExtra("list");

        Log.d(TAG, "onCreate: " + list);



    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: ");

        edt_call =  findViewById(R.id.edt_call);
        edt_search = findViewById(R.id.edt_search);
        edt_send = findViewById(R.id.edt_send);

        btn_call = findViewById(R.id.btn_call);
        btn_search = findViewById(R.id.btn_search);
        btn_send = findViewById(R.id.btn_send);

        edt_str = findViewById(R.id.edt_str);
        edt_int = findViewById(R.id.edt_int);
        btn_str =  findViewById(R.id.btn_str);
        btn_int =  findViewById(R.id.btn_int);
        btn_strint = findViewById(R.id.btn_strint);
        btn_list = findViewById(R.id.btn_list);

        //lamda 인터페이스를  파라미터로 넘겨야할 때 함수로 메소드 지역만 만들어 냄. this를 써보면 new와 함수형 lamda식을 알 수 있음.
        //주의사항. 람다식에서 인터페이스를 함수형으로 쓸 때 인터페이스 내부에는 메소드가 반드시 하나여야만 함.
        //명시적 : activity -> activity.class 이동 시 많이 사용.
        //암시적, 묵시적 : activity -> action(내가 없는 기능) 사용할 때 씀.
        btn_call.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_DIAL,
                    Uri.parse("tel:/" + edt_call.getText().toString()));
            startActivity(intent);

        });

        btn_search.setOnClickListener(this);
        btn_send.setOnClickListener(this);
        btn_str.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btn_search){
            Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
            intent.putExtra(SearchManager.QUERY, edt_search.getText().toString());
            startActivity(intent);
        }else if(v.getId() == R.id.btn_send) {
            Intent intent = new Intent(Intent.ACTION_SENDTO);
            intent.setData(Uri.parse("smsto:" + Uri.encode("010-1234-5678")));
            intent.putExtra("sms_body", edt_send.getText().toString());
            startActivity(intent);
        }else if(v.getId() == R.id.btn_str){
            Intent intent = new Intent(MainActivity.this, TestActivity.class);
            intent.putExtra("str", edt_str.getText().toString());
            startActivity(intent);
        }else if(v.getId()==R.id.btn_int){
            Intent intent = new Intent(MainActivity.this, TestActivity.class);
            intent.putExtra("int", Integer.parseInt(edt_int.getText().toString()));
            startActivity(intent);
        }

        TestDTO dtoTest = new TestDTO(edt_str.getText().toString(), Integer.parseInt(edt_int.getText().toString()));
        Intent intent = new Intent(MainActivity.this, TestActivity.class);
        intent.putExtra("dtotest", dtoTest);

            //암시적 인텐트나 명시적 인텐트를 사용해서 통신 후 다시 결과를 받아와야하는 상황에 쓰는 것들이 있음.
            //ActivityLauncher, startActivityForResult


        }



    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: ");
    }


}