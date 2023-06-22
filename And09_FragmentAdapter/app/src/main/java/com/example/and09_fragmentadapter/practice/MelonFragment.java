package com.example.and09_fragmentadapter.practice;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.and09_fragmentadapter.R;
import com.example.and09_fragmentadapter.recyler.RecvDTO;

import java.util.ArrayList;


public class MelonFragment extends Fragment {

    RecyclerView m_recv;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_melon, container, false);
        m_recv = v.findViewById(R.id.m_recv);
        m_recv.setAdapter(new AdapterMelon(inflater, melonList()));
        m_recv.setLayoutManager(new LinearLayoutManager(getActivity()));
        melonList();
        return  v;
    }
    ArrayList<MelonDTO> melonList(){
        ArrayList<MelonDTO> list = new ArrayList<>();
        list.add(new MelonDTO(R.drawable.chart_img1, 1, "퀸카 (Queencard)", "(여자)아이들"));
        list.add(new MelonDTO(R.drawable.chart_img2, 2, "I AM", "IVE (아이브)"));
        list.add(new MelonDTO(R.drawable.chart_img3, 3, "Spicy", "aespa"));
        list.add(new MelonDTO(R.drawable.chart_img4, 4, "이브, 프시케 그리고 푸른 수...", "LE SSERAFIM(르세라핌)"));
        list.add(new MelonDTO(R.drawable.chart_img5, 5, "UNFORGIVEN (feat. Nile Rod...", "LE SSERAFIM(르세라핌)"));
        list.add(new MelonDTO(R.drawable.chart_img6, 6, "Kitsch", "IVE (아이브)"));
        list.add(new MelonDTO(R.drawable.chart_img7, 7, "사랑은 늘 도망가", "임영웅"));

        return list;
    }

}