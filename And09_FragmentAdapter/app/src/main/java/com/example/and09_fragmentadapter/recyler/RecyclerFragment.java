package com.example.and09_fragmentadapter.recyler;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.and09_fragmentadapter.R;

import java.util.ArrayList;

public class RecyclerFragment extends Fragment {

    RecyclerView recv;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_recycler, container, false);
        new NormalClass().testTost(getActivity(), "프레그먼트이기에 get으로 받아옴");
        recv = v.findViewById(R.id.recv);
        recv.setAdapter(new AdapterRecv(inflater, getList()));

        //Context: 현재 앱의 모든 상태와 외부의 리소스 등에 접근하는 모든 기능들을 의미함.
        //*안드로이드 4대 컴포넌트는 모두 Context를 이용해서 만들어졌고 4대 컴포넌트들만 Context에 자유롭게 접근이 가능하다.*
        //4대 컴포넌트 <- Activity

        recv.setLayoutManager(new LinearLayoutManager(getContext()));
         getList();
        return v;

    }

    ArrayList<RecvDTO> getList(){
        ArrayList<RecvDTO> list = new ArrayList<>();
        list.add(new RecvDTO("수컷", "판돌", "대나무숲", 2, R.drawable.img1));
        list.add(new RecvDTO("수컷", "돌핀", "대나무숲", 3, R.drawable.img2));
        list.add(new RecvDTO("암컷", "돌돌", "대나무숲", 4, R.drawable.img3));
        list.add(new RecvDTO("여", "이성경", "대나무숲", 1, R.drawable.img4));
        list.add(new RecvDTO("암컷", "피구", "해남", 2, R.drawable.img5));

        return list;
    }
}