package com.example.andproject.home;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.andproject.databinding.ItemCompleteRecvBinding;
import com.example.andproject.databinding.ItemFavorMusicBinding;

import java.util.ArrayList;

public class FavorAdapter extends RecyclerView.Adapter<FavorAdapter.ViewHoler> {

    ItemFavorMusicBinding binding;
    Context context;
    ArrayList<FavorDTO> list;

    public FavorAdapter(Context context, ArrayList<FavorDTO> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHoler onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        binding = ItemFavorMusicBinding.inflate(inflater, parent, false);
        return new ViewHoler(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHoler h, int i) {
        h.binding.imgvFavorMusic.setImageResource(list.get(i).getFavor_img());
        h.binding.tvFavorTitle.setText(list.get(i).getFavor_title());
        h.binding.tvFavorGenre.setText(list.get(i).getFavor_genre());
        h.binding.tvFavorSinger.setText(list.get(i).getFavor_singer());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHoler extends RecyclerView.ViewHolder {
        ItemFavorMusicBinding binding;

        public ViewHoler(@NonNull ItemFavorMusicBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
