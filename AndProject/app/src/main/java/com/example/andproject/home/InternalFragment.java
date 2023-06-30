package com.example.andproject.home;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.andproject.R;
import com.example.andproject.databinding.FragmentHomeBinding;
import com.example.andproject.databinding.FragmentInternalBinding;

import java.util.ArrayList;


public class InternalFragment extends Fragment {

        FragmentInternalBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentInternalBinding.inflate(inflater, container, false);
        binding.recvHomeToday.setAdapter(new HomeAdapter(getIntenal(), getContext()));
        binding.recvHomeToday.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView.HORIZONTAL, false));
        return binding.getRoot();
    }
    public ArrayList<HomeCateDTO> getIntenal(){
        ArrayList<HomeCateDTO> list = new ArrayList<>();

        list.add(new HomeCateDTO(R.drawable.foreign_img1, R.drawable.full_foward, "SWINE", "Demi Lovato"));
        list.add(new HomeCateDTO(R.drawable.foreign_img2, R.drawable.full_foward, "The Good Witch", "Maisie Peters"));
        list.add(new HomeCateDTO(R.drawable.foreign_img3, R.drawable.full_foward, "Coming", "Around Again"));
        list.add(new HomeCateDTO(R.drawable.foreign_img4, R.drawable.full_foward, "Lay Your Hands Upon My Heart", "Rosa Linn"));
        list.add(new HomeCateDTO(R.drawable.foreign_img5, R.drawable.full_foward, "BEACH BALL", "Busta Rhymes & BIA"));
        list.add(new HomeCateDTO(R.drawable.foreign_img6, R.drawable.full_foward, "Point Your Finger", "Trousdale"));
        list.add(new HomeCateDTO(R.drawable.foreign_img7, R.drawable.full_foward, "Without you", "Diplo & Elle King"));
        list.add(new HomeCateDTO(R.drawable.foreign_img8, R.drawable.full_foward, "Chris Black Changed My Life", "Porutgal. The man"));


        return list;
    }
}