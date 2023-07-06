package com.example.andproject.home;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.andproject.PagerAdapter;
import com.example.andproject.R;
import com.example.andproject.databinding.FragmentUtilizeBinding;
import com.google.android.material.chip.ChipGroup;

import java.util.ArrayList;

public class UtilizeFragment extends Fragment {

    FragmentUtilizeBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentUtilizeBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }



}