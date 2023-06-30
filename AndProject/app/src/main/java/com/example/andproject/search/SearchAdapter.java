package com.example.andproject.search;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.andproject.databinding.ItemSearchListBinding;

import java.util.ArrayList;

public class SearchAdapter extends RecyclerView.Adapter<SearchAdapter.ViewHoler> {

    ItemSearchListBinding binding;
    Context context;

    ArrayList<SearchDTO> list;

    public SearchAdapter(Context context, ArrayList<SearchDTO> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHoler onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        binding = ItemSearchListBinding.inflate(inflater, parent, false);
        return new ViewHoler(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHoler h, int i) {
        h.binding.tvSearchRank.setText(list.get(i).getRank()+"");
        h.binding.tvSearchTitle.setText(list.get(i).getTitle());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHoler extends RecyclerView.ViewHolder {

        ItemSearchListBinding binding;
        public ViewHoler(@NonNull ItemSearchListBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
