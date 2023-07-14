package com.example.andproject.repository;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.andproject.R;
import com.example.andproject.databinding.FragmentRepositoryBinding;
import com.example.andproject.home.LoginActivity;

public class RepositoryFragment extends Fragment {
    FragmentRepositoryBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentRepositoryBinding.inflate(inflater, container, false);

        binding.loginTest.setOnClickListener(v -> {
            Intent intent = new Intent(getContext(), LoginActivity.class);
            startActivity(intent);
        });

        return (binding.getRoot());

    }

}