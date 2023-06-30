package com.example.andproject.around;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.andproject.databinding.ItemFlochartRecvBinding;

import java.util.ArrayList;

public class FloChartAdapter extends RecyclerView.Adapter<FloChartAdapter.FloChartViewHolder>{

    ItemFlochartRecvBinding binding;
    Context context;
    ArrayList<FloChartDTO> list;

    public FloChartAdapter(Context context, ArrayList<FloChartDTO> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public FloChartViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        binding = ItemFlochartRecvBinding.inflate(inflater, parent, false);
        return new FloChartViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull FloChartViewHolder h, int i) {
            h.binding.imgvChartSong1.setImageResource(list.get(i).getImgFloChart());
            h.binding.imgvLsSong.setImageResource(list.get(i).getImgPlay());
            h.binding.tvFloChartSong1.setText(list.get(i).getTitle());
            h.binding.tvFloSinger1.setText(list.get(i).getSinger());
            h.binding.tvRank1.setText(list.get(i).getRank()+"");
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class FloChartViewHolder extends RecyclerView.ViewHolder {
        ItemFlochartRecvBinding binding;
        public FloChartViewHolder(@NonNull ItemFlochartRecvBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}

