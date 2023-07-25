package com.example.project_lastest.travel;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.project_lastest.R;
import com.example.project_lastest.databinding.FragmentTravelBinding;


public class TravelFragment extends Fragment {

    FragmentTravelBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentTravelBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }
}