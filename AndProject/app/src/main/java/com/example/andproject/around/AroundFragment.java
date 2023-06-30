package com.example.andproject.around;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.andproject.PagerAdapter;
import com.example.andproject.R;
import com.example.andproject.databinding.FragmentAroundBinding;
import com.google.android.material.chip.ChipGroup;

import java.util.ArrayList;

public class AroundFragment extends Fragment {

    FragmentAroundBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentAroundBinding.inflate(inflater, container, false);
        PagerAdapter adapter = new PagerAdapter(this, getAround());
        binding.pager.setAdapter(adapter);

        binding.chipGrp.setOnCheckedChangeListener(new ChipGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(ChipGroup group, int checkedId) {
                if(checkedId == R.id.around_chip_1){
                    binding.pager.setCurrentItem(0, true);
                }
            }
        });

        binding.pager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                if(position==0){
                    binding.chipGrp.check(R.id.around_chip_1);
                }
            }
        });

        return binding.getRoot();
    }

    ArrayList<Fragment> getAround(){
        ArrayList<Fragment> list = new ArrayList<>();
        list.add(new ChartFragment());

        return list;
    }
}