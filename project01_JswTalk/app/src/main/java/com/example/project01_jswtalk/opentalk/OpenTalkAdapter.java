package com.example.project01_jswtalk.opentalk;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project01_jswtalk.databinding.ItemOpenchatRecvBinding;

import java.util.ArrayList;

public class OpenTalkAdapter extends RecyclerView.Adapter<OpenTalkAdapter.ViewHoler>{
    ItemOpenchatRecvBinding binding;
    ArrayList<OpenChatDTO> list;

//    ArrayList<OpenChatDetailDTO> list2;
    Context context;



    public OpenTalkAdapter(ArrayList<OpenChatDTO> list, Context context) {
        this.list = list;
//        this.list2 = list2;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHoler onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        binding = ItemOpenchatRecvBinding.inflate(inflater, parent, false);
        return new ViewHoler(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHoler h, int i) {
            h.binding.tvOpenChatTitle1.setText(list.get(i).getTitle());
            h.binding.tvOpenChatInfo1.setText(list.get(i).getInfo());
            h.binding.imgvCategroy1.setImageResource(list.get(i).getImgRes());
            h.binding.rnOpenChat.setOnClickListener(v -> {
                Intent intent = new Intent(context, OpenChatDetailActivity.class);
//                intent.putExtra("dto", list2.get(i));
                context.startActivity(intent);

            });


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHoler extends RecyclerView.ViewHolder {
        ItemOpenchatRecvBinding binding;

        public ViewHoler(@NonNull ItemOpenchatRecvBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
