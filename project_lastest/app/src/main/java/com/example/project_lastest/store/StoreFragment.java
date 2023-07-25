package com.example.project_lastest.store;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.project_lastest.R;
import com.example.project_lastest.databinding.FragmentBoardBinding;
import com.example.project_lastest.databinding.FragmentStoreBinding;


public class StoreFragment extends Fragment {

    FragmentStoreBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentStoreBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }
}