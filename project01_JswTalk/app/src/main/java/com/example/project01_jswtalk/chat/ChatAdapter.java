package com.example.project01_jswtalk.chat;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project01_jswtalk.databinding.ItemChatRectBinding;


import java.util.ArrayList;

public class ChatAdapter extends RecyclerView.Adapter<ChatAdapter.ViewHolder> {


    ItemChatRectBinding binding;
    ArrayList<ChatDTO> list;
    Context context;

    public ChatAdapter(ArrayList<ChatDTO> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ChatAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        binding = ItemChatRectBinding.inflate(inflater, parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ChatAdapter.ViewHolder h, int i) {
            h.binding.imgvChatProfile.setImageResource(list.get(i).getImgRes());
            h.binding.tvChatName.setText(list.get(i).getName());
            h.binding.tvChatMsg.setText(list.get(i).getMsg());
            h.binding.tvTime.setText(list.get(i).getDate());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
            ItemChatRectBinding binding;
        public ViewHolder(@NonNull ItemChatRectBinding binding) {
            super(binding.getRoot());
            this.binding = binding;

        }
    }
}
