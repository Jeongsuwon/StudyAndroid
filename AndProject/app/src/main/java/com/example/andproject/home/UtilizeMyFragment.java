package com.example.andproject.home;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.andproject.R;
import com.example.andproject.databinding.FragmentUtilizeMyBinding;

public class UtilizeMyFragment extends Fragment implements View.OnClickListener {

    FragmentUtilizeMyBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentUtilizeMyBinding.inflate(inflater, container, false);
        //onClick(null);
        //View.OnClickListener on = new UtilizeMyFragment();

//        binding.btnUtilizeComplete.setOnClickListener(v1 -> {
//            Intent intent = new Intent(getContext(), UtilizeCompleteActivity.class);
//            startActivity(intent);
//        });

        binding.btnUtilizeComplete.setOnClickListener(this);
        return binding.getRoot();

    }


    @Override
    public void onClick(View v) {
        Intent intent = new Intent(getContext(), UtilizeCompleteActivity.class);
        startActivity(intent);
    }
}