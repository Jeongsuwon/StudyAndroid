package com.example.and98_practice;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.GridView;

import com.example.and98_practice.databinding.FragmentCategoryBinding;

import java.util.ArrayList;


public class CategoryFragment extends Fragment {

        FragmentCategoryBinding binding;
        GridView gridv;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentCategoryBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    public ArrayList<CategoryDTO> getList(){
        ArrayList<CategoryDTO> list = new ArrayList<>();

        list.add(new CategoryDTO(R.drawable.myinfo, "나의 정보"));
        list.add(new CategoryDTO(R.drawable.schedule_training, "훈련일정 자율선택"));
        list.add(new CategoryDTO(R.drawable.myinfo, "전국단위 훈련신청"));
        list.add(new CategoryDTO(R.drawable.myinfo, "휴일예비군 훈련신청"));
        list.add(new CategoryDTO(R.drawable.myinfo, "훈련연기 보류신청"));
        list.add(new CategoryDTO(R.drawable.myinfo, "훈련신청 결과확인"));
        list.add(new CategoryDTO(R.drawable.myinfo, "훈련장 위치/ 예비군 부대 찾기"));
        list.add(new CategoryDTO(R.drawable.myinfo, "비상근예비군 지원"));
        list.add(new CategoryDTO(R.drawable.myinfo, "인증센터"));

        return list;
    }

}