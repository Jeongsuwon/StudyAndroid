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

import com.example.ym01_designtemplate.R;
import com.example.ym01_designtemplate.databinding.SocialFrMainBinding;
import com.example.ym01_designtemplate.social.dto.PostDTO;
import com.example.ym01_designtemplate.social.adapter.Adapter_Main;

import java.util.ArrayList;
import java.util.Random;

public class Fr_Main extends Fragment {

    private Context mContext;
    SocialFrMainBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = SocialFrMainBinding.inflate(inflater , container ,false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        binding.recyclerview.setLayoutManager(new LinearLayoutManager(mContext));
        binding.recyclerview.setNestedScrollingEnabled(false);
        Adapter_Main ad_main = new Adapter_Main(mContext, getData());
        binding.recyclerview.setAdapter(ad_main);

    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        mContext = context;
    }

    private ArrayList<PostDTO> getData() {
        ArrayList<PostDTO> arrayList = new ArrayList<>();
        arrayList.add(new PostDTO(new Random().nextInt(50)+"", R.drawable.post, "", 2));
        arrayList.add(new PostDTO(new Random().nextInt(50)+"", R.drawable.post2, "", 0));
        arrayList.add(new PostDTO(new Random().nextInt(50)+"", R.drawable.post3, "", 0));
        arrayList.add(new PostDTO(new Random().nextInt(50)+"", R.drawable.post4, "", 0));
        arrayList.add(new PostDTO(new Random().nextInt(50)+"", R.drawable.profile, "", 0));
        return arrayList;
    }


}
