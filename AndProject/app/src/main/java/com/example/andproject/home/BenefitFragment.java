package com.example.andproject.home;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.andproject.R;
import com.example.andproject.databinding.FragmentBenefitBinding;
import com.google.android.material.navigation.NavigationView;


public class BenefitFragment extends Fragment{

    FragmentBenefitBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentBenefitBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }




}