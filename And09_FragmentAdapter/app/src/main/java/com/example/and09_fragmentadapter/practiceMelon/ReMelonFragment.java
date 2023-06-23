package com.example.and09_fragmentadapter.practiceMelon;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.and09_fragmentadapter.R;


public class ReMelonFragment extends Fragment {
    RecyclerView re_melon;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View v = inflater.inflate(R.layout.fragment_re_melon, container, false);
       re_melon = v.findViewById(R.id.re_melon);
       re_melon.setAdapter(new AdapterRemelon(inflater));
       re_melon.setLayoutManager(new LinearLayoutManager(getContext()));
        return v;
    }
}