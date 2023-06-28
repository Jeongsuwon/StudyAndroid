package com.example.project01_jswtalk.opentalk;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project01_jswtalk.databinding.ItemListenRecvBinding;

import java.util.ArrayList;

public class ListenAdapter extends RecyclerView.Adapter<ListenAdapter.viewHolder> {
    ArrayList<ListenDTO> list;
    Context context;
    ItemListenRecvBinding binding;

    public ListenAdapter(ArrayList<ListenDTO> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        binding = ItemListenRecvBinding.inflate(inflater, parent, false);
        return new viewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder h, int i) {
        h.binding.imgvLsmusic1.setImageResource(list.get(i).getImgHeadRes());
        h.binding.imgvLnCharacter1.setImageResource(list.get(i).getImgChatRes1());
        h.binding.imgvLnCharacter2.setImageResource(list.get(i).getImgChatRes2());
        h.binding.imgvLnCharacter3.setImageResource(list.get(i).getImgChatRes3());
        h.binding.imgvLnmusic1.setImageResource(list.get(i).getImgRoomRes1());
        h.binding.imgvLnmusic2.setImageResource(list.get(i).getImgRoomRes2());
        h.binding.imgvLnmusic3.setImageResource(list.get(i).getImgRoomRes3());
        h.binding.tvLsmusic1.setText(list.get(i).getHead());
        h.binding.tvLnTitle1.setText(list.get(i).getChatTitle1());
        h.binding.tvLnTitle2.setText(list.get(i).getChatTitle2());
        h.binding.tvLnTitle3.setText(list.get(i).getChatTitle3());
        h.binding.tvLnPeople1.setText(list.get(i).getChatPeople1());
        h.binding.tvLnPeople2.setText(list.get(i).getChatPeople2());
        h.binding.tvLnPeople3.setText(list.get(i).getChatPeople3());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        ItemListenRecvBinding binding;

        public viewHolder(@NonNull ItemListenRecvBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
