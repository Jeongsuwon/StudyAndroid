package com.example.andproject.search;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.andproject.R;
import com.example.andproject.databinding.FragmentSearchBinding;

import java.util.ArrayList;


public class SearchFragment extends Fragment {

    FragmentSearchBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSearchBinding.inflate(inflater, container, false);
        binding.recvSearchList.setAdapter(new SearchAdapter(getContext(), getSearch()));
        binding.recvSearchList.setLayoutManager(new LinearLayoutManager(getContext()));
        return binding.getRoot();
    }

    ArrayList<SearchDTO> getSearch(){
        ArrayList<SearchDTO> list = new ArrayList<>();
        list.add(new SearchDTO(1, "비오는 날 듣기 좋은 노래"));
        list.add(new SearchDTO(2, "잔나비"));
        list.add(new SearchDTO(3, "헤어지자 말해요"));
        list.add(new SearchDTO(4, "아이브"));
        list.add(new SearchDTO(5, "샤이니"));
        list.add(new SearchDTO(6, "오늘도 빛나는 너에게"));
        list.add(new SearchDTO(7, "찰리 푸스"));
        list.add(new SearchDTO(8, "르세라핌"));
        list.add(new SearchDTO(9, "브루노 마스"));
        list.add(new SearchDTO(10, "장마"));
        list.add(new SearchDTO(11, "아이유"));
        list.add(new SearchDTO(12, "뉴진스"));
        list.add(new SearchDTO(13, "박재정"));
        list.add(new SearchDTO(14, "성시경"));
        list.add(new SearchDTO(15, "싸이"));
        list.add(new SearchDTO(16, "세븐틴"));
        list.add(new SearchDTO(17, "겁도 없이"));
        list.add(new SearchDTO(18, "최예나"));
        list.add(new SearchDTO(19, "퀸카"));
        list.add(new SearchDTO(20, "애쉬 아일랜드"));

        return list;
    }
}