package com.example.and09_fragmentadapter.practiceMelon;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AdapterRemelon extends RecyclerView.Adapter<AdapterRemelon.JswViewHolder>{

    LayoutInflater inflater;
    public AdapterRemelon(LayoutInflater inflater) {
        this.inflater = inflater;
    }



    @NonNull
    @Override
    public JswViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull JswViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class JswViewHolder extends RecyclerView.ViewHolder {

        public JswViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
