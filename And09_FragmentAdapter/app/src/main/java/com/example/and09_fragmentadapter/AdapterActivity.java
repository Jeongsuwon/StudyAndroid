package com.example.and09_fragmentadapter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.example.and09_fragmentadapter.listv.ListFragment;

public class AdapterActivity extends AppCompatActivity implements View.OnClickListener {
    ListView listv;
    Button btn_list, btn_grid, btn_recy, btn_practice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adapter);

        btn_list = findViewById(R.id.btn_list);
        btn_grid = findViewById(R.id.btn_grid);
        btn_recy = findViewById(R.id.btn_recy);
        btn_practice = findViewById(R.id.btn_practice);

        btn_list.setOnClickListener(this);
        btn_grid.setOnClickListener(this);
        btn_recy.setOnClickListener(this);
        btn_practice.setOnClickListener(this);

        //용도나 형태에 따라서 어댑터의 종류는 많음. 사용빈도가 가장 낮은 것은 오래 된 방식. ( Array형태로 String 넣는 방식)
        //ArrayAdapter (기본적으로 안드로이드에서 제공해주는 어댑터)

        //ArrayAdapter(Context, 반복 될 모양의 xml, 내용이 바뀌어야한다면 사용 될 데이터);

//        String[] arrItem = new String[10];
//
//        for (int i = 0; i < arrItem.length ; i++) {
//            arrItem[i] = "JSW" + UUID.randomUUID().toString();
//        }
//
//        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arrItem);
//
//        //기본 템플릿 : android.R.layout.simple_list_item_1
//        //기본 템플릿으로는 모든 모양을 만들 수가 없음. Custom -> 이후 사용하게 됨.(Adapter)
//
//
//        //Context(맥락) : 현재 모든 앱의 상태, 그리고 화면에 떠있는 객체의 상태 등 모든 상태를 알 수 있는 변수.
//        //↑액티비티나 화면에 떠있는 객체(상태)이냐를 묻는 것이라고 판단을 하면 더 편함.
//
//        listv = findViewById(R.id.listv);
//        listv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Log.d("리스트뷰", "onItemClick: " + position);
//                Toast.makeText(AdapterActivity.this, arrItem[position], Toast.LENGTH_SHORT).show();
//
//            }
//        });
//
//        listv.setAdapter(adapter);
    }

    @Override
    public void onClick(View v) {

        FragmentManager manager = getSupportFragmentManager();
        if(v.getId()==R.id.btn_list){
            manager.beginTransaction().replace(R.id.container, new ListFragment()).commit();
        }
    }
}