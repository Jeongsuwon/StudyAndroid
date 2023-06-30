package com.example.andproject.home;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.andproject.databinding.FragmentHomeBinding;
import com.example.andproject.databinding.ItemHomeNewestBinding;

import java.util.ArrayList;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.ViewHolder>{

    ItemHomeNewestBinding binding;
    ArrayList<HomeCateDTO> list;

    Context context;


    public HomeAdapter(ArrayList<HomeCateDTO> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        binding = ItemHomeNewestBinding.inflate(inflater, parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder h, int i) {
        h.binding.imgvHomeNewest1.setImageResource(list.get(i).getImgHome());
        h.binding.imgvHomePlay.setImageResource(list.get(i).getImgPlay());
        h.binding.tvNewestSinger.setText(list.get(i).getHomeSinger());
        h.binding.tvNewestTitle1.setText(list.get(i).getHomeSong());


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ItemHomeNewestBinding binding;

        public ViewHolder(@NonNull ItemHomeNewestBinding binding) {
            super(binding.getRoot());
            this.binding=binding;
        }
    }
}
