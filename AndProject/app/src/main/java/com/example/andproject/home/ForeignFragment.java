package com.example.andproject.home;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.andproject.R;
import com.example.andproject.databinding.FragmentForeignBinding;

import java.util.ArrayList;


public class ForeignFragment extends Fragment {

    FragmentForeignBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentForeignBinding.inflate(inflater, container, false);
        binding.recvHomeToday.setAdapter(new HomeAdapter(getForeign(), getContext()));
        binding.recvHomeToday.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView.HORIZONTAL, false));
        return binding.getRoot();
    }

    public ArrayList<HomeCateDTO> getForeign(){
        ArrayList<HomeCateDTO> list = new ArrayList<>();

        list.add(new HomeCateDTO(R.drawable.today_img1, R.drawable.full_foward, "That's Me", "선예"));
        list.add(new HomeCateDTO(R.drawable.together_img1, R.drawable.full_foward, "책갈피", "유별"));
        list.add(new HomeCateDTO(R.drawable.together_img2, R.drawable.full_foward, "안녕한가요", "이세연"));
        list.add(new HomeCateDTO(R.drawable.together_img3, R.drawable.full_foward, "우산", "이찬혁비디오"));
        list.add(new HomeCateDTO(R.drawable.together_img4, R.drawable.full_foward, "PLAY LIST", "유키스"));
        list.add(new HomeCateDTO(R.drawable.together_img5, R.drawable.full_foward, "Her", "coldnight"));
        list.add(new HomeCateDTO(R.drawable.today_img6, R.drawable.full_foward, "Fluid", "NECTA"));
        list.add(new HomeCateDTO(R.drawable.today_img8, R.drawable.full_foward, "앞으로가", "SONIC STONES(소닉스톤···"));
        list.add(new HomeCateDTO(R.drawable.today_img9, R.drawable.full_foward, "착지", "정지아"));
        list.add(new HomeCateDTO(R.drawable.today_img10, R.drawable.full_foward, "트랄랄라 브라더스", "various Artists"));

        return list;
    }
}