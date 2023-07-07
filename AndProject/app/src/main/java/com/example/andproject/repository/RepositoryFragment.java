package com.example.andproject.repository;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.andproject.R;
import com.example.andproject.databinding.FragmentRepositoryBinding;

public class RepositoryFragment extends Fragment {
    FragmentRepositoryBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentRepositoryBinding.inflate(inflater, container, false);
        return (binding.getRoot());
    }
}