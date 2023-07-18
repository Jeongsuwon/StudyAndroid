package com.example.andproject.home;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.andproject.databinding.ItemHomeMainBinding;

import java.util.ArrayList;

public class SliderAdapter extends RecyclerView.Adapter<SliderAdapter.SliderViewHolder> {

    Context context;
    ArrayList<HomeMainDTO> list;

    public SliderAdapter(Context context, ArrayList<HomeMainDTO> list) {
        this.context = context;
        this.list = list;
    }

    ItemHomeMainBinding binding;

    @NonNull
    @Override
    public SliderViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        binding = ItemHomeMainBinding.inflate(inflater, parent, false);
        return new SliderViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull SliderViewHolder h, int i) {
//            h.binding.homeMainSubimg1.setImageResource(list.get(i).getImgHomesub1());
//            h.binding.homeMainSubimg2.setImageResource(list.get(i).getImgHomesub2());
//            h.binding.homeMainSubimg3.setImageResource(list.get(i).getImgHomesub3());
            h.binding.imgvHomemain.setImageResource(list.get(i).getImgHomeMain());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class SliderViewHolder extends RecyclerView.ViewHolder{
        ItemHomeMainBinding binding;
        public SliderViewHolder(@NonNull  ItemHomeMainBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
