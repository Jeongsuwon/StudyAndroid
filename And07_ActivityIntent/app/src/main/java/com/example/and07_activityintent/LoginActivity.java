package com.example.and07_activityintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class LoginActivity extends AppCompatActivity {
    EditText id, pw;
    Button login;
    final String TAG = "확인";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        id = findViewById(R.id.id);
        pw = findViewById(R.id.pw);
        //editText에 있는 글자를 가져오는 메소드 : editText.getText()입니다. ※ getText메소드가 리턴해주는 타입은 뭘까?
        //id가 admin 비밀번호가 admin 1234일 때 다음화면 / 그외에는 Toast를 이용해서 아이디 또는 비밀번호 틀림 메시지

        login = findViewById(R.id.login);





        login.setOnClickListener(new View.OnClickListener() { // 인터페이스를 new로 생성하면 메소드가 반드시 있어야해서 익명의 클래스 지역을 만든다.
            @Override
            public void onClick(View v) {
                //Intent를 이용하면 화면 전환 -> Intent객체 (안드로이드의 4대 컴포넌트의 통신을 담당) Act => 'Intent' => Act
                //Context(맥락, 상태정보 확인) : 현재 화면에 떠있는 객체인지?
                //ex) DAO, DTO, VO -> 화면에 떠있는 객체가 아니기때문에 그래픽 작업을 하면 오류가 발생함. -> 일반 클래스
                //ex) Act, Fragment -> 화면에 떠있는 객체이기때문에 그래픽 작업 가능. 하지만 화면에 떠있는지의 상태를 알려줄 수 있는게 필요 -> Context
                // -> 일반 클래스에서도 그래픽 처리가 가능하게 만드려면 Activity가 Context라는 것을 파라미터로 보내줬을 때 가능.
                if(id.getText().toString().equals("admin") && pw.getText().toString().equals("admin1234")){

                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    intent.putExtra("strkey", id.getText().toString()+" indent");
                    intent.putExtra("intkey", 3);

                    LoginDTO dto = new LoginDTO(id.getText().toString() + "1", pw.getText().toString() + "1");
                    intent.putExtra("dtokey", dto);

                    ArrayList<LoginDTO> list = new ArrayList<>();

                    list.add(new LoginDTO("a1","b1"));
                    list.add(new LoginDTO("a2","b2"));
                    list.add(new LoginDTO("a3","b3"));
                    list.add(new LoginDTO("a4","b4"));
                    list.add(new LoginDTO("a5","b5"));

                    intent.putExtra("list", list); // startActivity메소드 전에 작성
                    startActivity(intent);
                }else{
                        Toast.makeText(LoginActivity.this, "아이디 또는 비밀번호가 다릅니다.", Toast.LENGTH_SHORT).show();
                }

                Log.d(TAG, "->" + id.getText());
                Log.d(TAG, "->" + pw.getText());

            }
        });

    }

    public class JswClass implements Serializable {

    }

    public class JswClass2 implements Serializable{

    }

    public void method(Serializable k){
        //역직렬화 : JswClass k2 = (JswClass) k;
    }
}