package com.example.project01_jswtalk.friend;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.project01_jswtalk.R;
import com.example.project01_jswtalk.databinding.FragmentFriendBinding;

import java.util.ArrayList;


public class FriendFragment extends Fragment {

    FragmentFriendBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentFriendBinding.inflate(inflater, container, false);
        binding.recvFriend.setAdapter(new FriendAdapter(getList()));
        binding.recvFriend.setLayoutManager(new LinearLayoutManager(getContext()));

        return binding.getRoot();
    }

    public ArrayList<FriendDTO> getList(){
        ArrayList<FriendDTO> list = new ArrayList<>();
        list.add(new FriendDTO(R.drawable.img2, "이름1", ""));
        list.add(new FriendDTO(R.drawable.img3, "이름2", ""));
        list.add(new FriendDTO(R.drawable.img4, "이름3", ""));
        list.add(new FriendDTO(R.drawable.img5, "이름4", ""));
        list.add(new FriendDTO(R.drawable.danang, "이름5", ""));
        list.add(new FriendDTO(R.drawable.kosamui, "이름6", ""));
        list.add(new FriendDTO(R.drawable.japan, "이름7", ""));
        return list;
    }

}