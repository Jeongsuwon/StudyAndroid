package com.example.project01_jswtalk.chat;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.project01_jswtalk.R;
import com.example.project01_jswtalk.databinding.FragmentChatBinding;
import com.example.project01_jswtalk.friend.FriendAdapter;

import java.util.ArrayList;
import java.util.Date;

public class ChatFragment extends Fragment {
    FragmentChatBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentChatBinding.inflate(getLayoutInflater());
        binding.recvChat.setAdapter(new ChatAdapter(getList(), getContext()));
        binding.recvChat.setLayoutManager(new LinearLayoutManager(getContext()));
        return binding.getRoot();
    }

    public ArrayList<ChatDTO> getList(){
        ArrayList<ChatDTO> list = new ArrayList<>();

        list.add(new ChatDTO(R.drawable.img1, "정수원", "안녕하세요", "11시 30분"));
        list.add(new ChatDTO(R.drawable.img2, "아무개", "반가워요", "11시 20분" ));
        list.add(new ChatDTO(R.drawable.img3, "박무개", "어디세요?", "2023-06-25" ));
        list.add(new ChatDTO(R.drawable.img4, "김무개", "고맙습니다!", "2023-06-24"));

        return list;
    }

}