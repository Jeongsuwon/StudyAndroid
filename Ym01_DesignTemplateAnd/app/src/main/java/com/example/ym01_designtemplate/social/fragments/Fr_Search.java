package com.example.ym01_designtemplate.social.fragments;


import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ym01_designtemplate.R;
import com.example.ym01_designtemplate.social.dto.SearchDTO;
import com.example.ym01_designtemplate.social.adapter.Adapter_Search;

import java.util.ArrayList;
import java.util.Random;

public class Fr_Search extends Fragment {

    Context mContext;
    RecyclerView recyclerView;

    public Fr_Search() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        mContext = context;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fr_search, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.RecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(mContext));
        Adapter_Search ad_search = new Adapter_Search(mContext, getdata());
        recyclerView.setAdapter(ad_search);
    }

    private ArrayList<SearchDTO> getdata() {
        ArrayList<SearchDTO> arrayList = new ArrayList<>();
        arrayList.add(new SearchDTO("Name" + new Random().nextInt(50), "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRoMnq8bzCU6CUb2PkFvfBnME6H6qYtnZe6n8_t1Cmh3392Kk8e"));
        arrayList.add(new SearchDTO("Name" + new Random().nextInt(50), "https://mobirise.com/bootstrap-template/profile-template/assets/images/timothy-paul-smith-256424-1200x800.jpg"));
        arrayList.add(new SearchDTO("Name" + new Random().nextInt(50), "https://i.ytimg.com/vi/7Xu_s1YJhyg/maxresdefault.jpg"));
        arrayList.add(new SearchDTO("Name" + new Random().nextInt(50), "https://content-static.upwork.com/uploads/2014/10/02123010/profilephoto_goodcrop.jpg"));
        arrayList.add(new SearchDTO("Name" + new Random().nextInt(50), "https://images.askmen.com/1080x540/2016/01/25-021526-facebook_profile_picture_affects_chances_of_getting_hired.jpg"));
        arrayList.add(new SearchDTO("Name" + new Random().nextInt(50), "https://www.rd.com/wp-content/uploads/2017/09/01-shutterstock_476340928-Irina-Bg.jpg"));
        return arrayList;
    }
}
