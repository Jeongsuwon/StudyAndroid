package com.example.andproject.home;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.andproject.R;
import com.example.andproject.databinding.FragmentInternalBinding;
import com.example.andproject.databinding.FragmentTogetherBinding;

import java.util.ArrayList;


public class TogetherFragment extends Fragment {

    FragmentTogetherBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentTogetherBinding.inflate(inflater, container, false);
      //  binding.recvHomeToday.setAdapter(new HomeAdapter(getTogether(), getContext()));
      //  binding.recvHomeToday.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView.HORIZONTAL, false));
        return binding.getRoot();
    }

}