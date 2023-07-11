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

        binding.recvUtilizeComplete.setAdapter(new CompleteAdapter(this, complete()));
        binding.recvUtilizeComplete.setLayoutManager(new LinearLayoutManager(this));

        binding.btnCompleteClose.setOnClickListener(view -> {
            finish();
        });
    }

    public ArrayList<CompleteDTO> complete(){
    ArrayList<CompleteDTO> list = new ArrayList<>();
    list.add(new CompleteDTO("무제한 듣기 T멤버십",  "사용기간 2023-05-13 ~ 2023-06-12"));
    list.add(new CompleteDTO("무제한 듣기 T멤버십",  "사용기간 2023-04-13 ~ 2023-05-12"));
    list.add(new CompleteDTO("무제한 듣기 T멤버십",  "사용기간 2023-03-13 ~ 2023-04-12"));
    list.add(new CompleteDTO("무제한 듣기 T멤버십",  "사용기간 2023-02-13 ~ 2023-03-12"));
    list.add(new CompleteDTO("무제한 듣기 T멤버십",  "사용기간 2023-02-13 ~ 2023-03-12"));
    list.add(new CompleteDTO("무제한 듣기 T멤버십",  "사용기간 2023-01-12 ~ 2023-02-12"));
    list.add(new CompleteDTO("무제한 듣기 정기결제",  "사용기간 2022-12-05 ~ 2023-01-04"));
    list.add(new CompleteDTO("무제한 듣기 정기결제",  "사용기간 2022-12-05 ~ 2023-01-04"));
    list.add(new CompleteDTO("무제한 듣기 정기결제",  "사용기간 2022-12-05 ~ 2023-01-04"));
    list.add(new CompleteDTO("무제한 듣기 정기결제",  "사용기간 2022-11-05 ~ 2023-12-04"));
    list.add(new CompleteDTO("무제한 듣기 정기결제",  "사용기간 2022-10-05 ~ 2023-11-04"));
    list.add(new CompleteDTO("무제한 듣기 정기결제",  "사용기간 2022-09-05 ~ 2023-10-04"));
    list.add(new CompleteDTO("무제한 듣기 정기결제",  "사용기간 2022-08-05 ~ 2023-09-04"));
    return list;
    }

}