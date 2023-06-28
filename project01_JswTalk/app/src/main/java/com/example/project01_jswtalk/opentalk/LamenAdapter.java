package com.example.project01_jswtalk.opentalk;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project01_jswtalk.databinding.ItemLamenRecvBinding;

import java.util.ArrayList;

public class LamenAdapter extends RecyclerView.Adapter<LamenAdapter.ViewHolder>{

    ItemLamenRecvBinding binding;
    ArrayList<LamenDTO> list;
    Context context;

    public LamenAdapter(ArrayList<LamenDTO> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        binding = ItemLamenRecvBinding.inflate(inflater, parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder h, int i) {
            h.binding.imgvCategroy1.setImageResource(list.get(i).getImgRes());
            h.binding.tvLamenTitle1.setText(list.get(i).getTitle());
            h.binding.tvLamenInfo1.setText(list.get(i).getPeople());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ItemLamenRecvBinding binding;

        public ViewHolder(@NonNull ItemLamenRecvBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
