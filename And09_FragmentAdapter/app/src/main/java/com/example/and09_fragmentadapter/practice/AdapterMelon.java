package com.example.and09_fragmentadapter.practice;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.and09_fragmentadapter.R;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class AdapterMelon extends RecyclerView.Adapter<AdapterMelon.JswViewHolder> {
    LayoutInflater inflater;
    ArrayList<MelonDTO> list;

    public AdapterMelon(LayoutInflater inflater, ArrayList<MelonDTO> list) {
        this.inflater = inflater;
        this.list = list;
    }

    @NonNull
    @Override
    public JswViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.item_melon, parent, false);
        return new JswViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull JswViewHolder holder, int i) {
        holder.imgv_chart.setImageResource(list.get(i).imgRes);
        holder.tv_rank.setText(list.get(i).rank+"");
        holder.tv_title.setText(list.get(i).title);
        holder.tv_singer.setText(list.get(i).singer);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class JswViewHolder extends RecyclerView.ViewHolder{
        ImageView imgv_chart;
        TextView tv_rank, tv_title, tv_singer;

        public JswViewHolder(@NonNull View v) {
            super(v);
            imgv_chart = v.findViewById(R.id.imgv_chart);
            tv_rank = v.findViewById(R.id.tv_rank);
            tv_title = v.findViewById(R.id.tv_title);
            tv_singer = v.findViewById(R.id.tv_singer);
        }
    }
}

