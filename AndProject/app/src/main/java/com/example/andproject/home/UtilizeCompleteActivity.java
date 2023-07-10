package com.example.andproject.home;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.andproject.R;
import com.example.andproject.databinding.ActivityUtilizeCompleteBinding;

import java.util.ArrayList;

public class UtilizeCompleteActivity extends AppCompatActivity {
    ActivityUtilizeCompleteBinding binding;
    ActionBar actionBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityUtilizeCompleteBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
//        actionBar.setTitle("사용 완료된 이용권");

        binding.recvUtilizeComplete.setAdapter(new CompleteAdapter(this, complete()));
        binding.recvUtilizeComplete.setLayoutManager(new LinearLayoutManager(this));
    }

    public ArrayList<CompleteDTO> complete(){
    ArrayList<CompleteDTO> list = new ArrayList<>();
    list.add(new CompleteDTO("무제한 듣기 T멤버십",  "사용기간 2023-05-13 ~ 2023-06-12"));
    list.add(new CompleteDTO("무제한 듣기 T멤버십",  "사용기간 2023-04-13 ~ 2023-05-12"));
    list.add(new CompleteDTO("무제한 듣기 T멤버십",  "사용기간 2023-03-13 ~ 2023-04-12"));
    list.add(new CompleteDTO("무제한 듣기 T멤버십",  "사용기간 2023-02-13 ~ 2023-03-12"));
    list.add(new CompleteDTO("무제한 듣기 T멤버십",  "사용기간 2023-02-13 ~ 2023-03-12"));
    return list;
    }

}