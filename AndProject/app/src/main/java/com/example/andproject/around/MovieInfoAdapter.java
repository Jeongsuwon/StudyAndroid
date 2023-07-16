package com.example.andproject.around;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.andproject.databinding.ItemFlochartRecvBinding;
import com.example.andproject.databinding.ItemMovieInfoBinding;

import java.util.ArrayList;

public class MovieInfoAdapter extends RecyclerView.Adapter<MovieInfoAdapter.MovieInfoViewHolder>{

    ItemMovieInfoBinding binding;
    Context context;
    ArrayList<NextMovieDTO> list;

    public MovieInfoAdapter(Context context, ArrayList<NextMovieDTO> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MovieInfoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        binding = ItemMovieInfoBinding.inflate(inflater, parent, false);
        return new MovieInfoViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull MovieInfoViewHolder h, int i) {
            h.binding.imgvMovieInfoImg.setImageResource(list.get(i).getMovie_info_img());
            h.binding.tvMovieInfoSinger.setText(list.get(i).getMovie_info_singer());
            h.binding.tvMovieInfoTitle.setText(list.get(i).getMovie_info_title());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MovieInfoViewHolder extends RecyclerView.ViewHolder {
        ItemMovieInfoBinding binding;
        public MovieInfoViewHolder(@NonNull ItemMovieInfoBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}

