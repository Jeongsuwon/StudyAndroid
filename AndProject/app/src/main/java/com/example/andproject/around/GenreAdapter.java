package com.example.andproject.around;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.andproject.databinding.ItemGenreRecvBinding;

import java.util.ArrayList;

public class GenreAdapter extends RecyclerView.Adapter<GenreAdapter.ViewHoler> {
    ItemGenreRecvBinding binding;
    Context context;
    ArrayList<GenreRecvDTO> list;

    public GenreAdapter(Context context, ArrayList<GenreRecvDTO> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHoler onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        binding = ItemGenreRecvBinding.inflate(inflater, parent, false);
        return new ViewHoler(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHoler h, int i) {
            h.binding.imgvRecvGenre1.setImageResource(list.get(i).getGenreRes1());
            h.binding.imgvRecvGenre2.setImageResource(list.get(i).getGetGenreRes2());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHoler extends RecyclerView.ViewHolder {
        ItemGenreRecvBinding binding;
        public ViewHoler(@NonNull ItemGenreRecvBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
