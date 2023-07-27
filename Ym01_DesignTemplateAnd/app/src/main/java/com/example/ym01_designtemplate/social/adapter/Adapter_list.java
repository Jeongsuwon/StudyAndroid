package com.example.ym01_designtemplate.social.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.ym01_designtemplate.R;
import com.example.ym01_designtemplate.social.dto.StoriesDTO;

import java.util.ArrayList;

public class Adapter_list extends RecyclerView.Adapter<Adapter_list.holder> {

    ArrayList<StoriesDTO> list;
    Context mContext;

    public Adapter_list(ArrayList<StoriesDTO> data, Context context) {
        mContext = context;
        list = data;
    }

    @NonNull
    @Override
    public holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_view, parent, false);
        return new holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull holder holder, int position) {
        StoriesDTO stories = list.get(position);
        holder.name_tx.setText(stories.getName());
        Glide.with(mContext).load(stories.getImageUrl()).into(holder.store_iv);

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class holder extends RecyclerView.ViewHolder {
        ImageView store_iv;
        TextView name_tx;

        public holder(@NonNull View itemView) {
            super(itemView);
            store_iv = itemView.findViewById(R.id.image_store);
            name_tx = itemView.findViewById(R.id.User_Name);
        }
    }
}
