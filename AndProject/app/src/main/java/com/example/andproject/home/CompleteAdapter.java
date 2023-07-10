package com.example.andproject.home;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.andproject.around.FloChartAdapter;
import com.example.andproject.databinding.ItemCompleteRecvBinding;
import com.example.andproject.databinding.ItemFlochartRecvBinding;

import java.util.ArrayList;

public class CompleteAdapter extends  RecyclerView.Adapter<CompleteAdapter.ViewHolder>{

    Context context;
    ArrayList<CompleteDTO> list;
    ItemCompleteRecvBinding binding;

    public CompleteAdapter(Context context, ArrayList<CompleteDTO> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        binding = ItemCompleteRecvBinding.inflate(inflater, parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder h, int i) {
        h.binding.tvCompleteTitle.setText(list.get(i).getTitle());
//        h.binding.imgvCompleteForward.setImageResource(list.get(i).getForward());
//        h.binding.tvFlo.setText(list.get(i).getFlo());
//        h.binding.tvPaymentMeans.setText(list.get(i).getPayMean());
        h.binding.tvPeriod.setText(list.get(i).getPeriod());
//        h.binding.useEnd.setText(list.get(i).getUseEnd());
//        h.binding.tvPaymentSetting.setText(list.get(i).getPaySet());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ItemCompleteRecvBinding binding;
        public ViewHolder(@NonNull ItemCompleteRecvBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
