package com.example.andproject.home;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.andproject.PagerAdapter;
import com.example.andproject.R;
import com.example.andproject.databinding.FragmentUtilizeHomeBinding;
import com.google.android.material.chip.ChipGroup;

import java.util.ArrayList;

public class UtilizeHomeFragment extends Fragment {
    FragmentUtilizeHomeBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentUtilizeHomeBinding.inflate(inflater, container, false);


        PagerAdapter adapter = new PagerAdapter(this, getUtilizeList());
        binding.pagerUtilize.setAdapter(adapter);



        binding.chipGrpUtilize.setOnCheckedChangeListener(new ChipGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(ChipGroup group, int checkedId) {
                if(checkedId == R.id.utilize_chip_1){
                    binding.pagerUtilize.setCurrentItem(0, true);
                    adapter.notifyDataSetChanged();
                }else if(checkedId == R.id.utilize_chip_2){
                    binding.pagerUtilize.setCurrentItem(1, true);
                    adapter.notifyDataSetChanged();
                }else if(checkedId == R.id.utilize_chip_3){
                    binding.pagerUtilize.setCurrentItem(2, true);
                    adapter.notifyDataSetChanged();
                }
            }
        });

        binding.pagerUtilize.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                if(position==0){
                    binding.chipGrpUtilize.check(R.id.utilize_chip_1);
                }else if(position==1){
                    binding.chipGrpUtilize.check(R.id.utilize_chip_2);
                }
                else if(position==2){
                    binding.chipGrpUtilize.check(R.id.utilize_chip_3);
                }

            }
        });

        return binding.getRoot();
    }
    ArrayList<Fragment> getUtilizeList(){
        ArrayList<Fragment> list = new ArrayList<>();
        list.add(new UtilizeFragment());
        list.add(new BenefitFragment());
        list.add(new UtilizeMyFragment());

        return list;
    }
    }













