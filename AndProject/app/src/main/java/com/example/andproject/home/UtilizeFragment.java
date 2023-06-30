package com.example.andproject.home;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.andproject.R;
import com.example.andproject.databinding.FragmentUtilizeBinding;

public class UtilizeFragment extends Fragment {

    FragmentUtilizeBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentUtilizeBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }
}