package com.example.project01_jswtalk.opentalk;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.project01_jswtalk.R;
import com.example.project01_jswtalk.databinding.FragmentOpenTalkMainBinding;
import com.google.android.material.chip.ChipGroup;

import java.util.ArrayList;

public class OpenTalkMainFragment extends Fragment {

    FragmentOpenTalkMainBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentOpenTalkMainBinding.inflate(getLayoutInflater() , container , false);

        //Adapter는 개발자가 모양을 커스텀하기 편하게, 기본 구조를 갖춰놓고 나머지는 자유롭게 메소드를 구현해서 모양 만들게 해줌.
        FragmentAdapter adapter = new FragmentAdapter(this, getFragmentList());
        binding.pager2.setAdapter(adapter);

        binding.chipGrp.setOnCheckedChangeListener(new ChipGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(ChipGroup group, int checkedId) {
                Log.d("들어온 정보", "onCheckedChanged: ");
                if(checkedId == R.id.chip_1){
                    binding.pager2.setCurrentItem(0, true);
                }else if(checkedId == R.id.chip_2){
                    binding.pager2.setCurrentItem(1, true);
                }else if(checkedId == R.id.chip_3){
                    binding.pager2.setCurrentItem(2, true);
                }else if(checkedId == R.id.chip_4){
                    binding.pager2.setCurrentItem(3, true);
                }
            }
        });

        binding.pager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                if(position==0){
                   binding.chipGrp.check(R.id.chip_1);
                }else if(position==1){
                    binding.chipGrp.check(R.id.chip_2);
                }
                else if(position==2){
                    binding.chipGrp.check(R.id.chip_3);
                }
                else if(position==3){
                    binding.chipGrp.check(R.id.chip_4);
                }
            }
        });

        return binding.getRoot();


    }

    ArrayList<Fragment> getFragmentList(){
        ArrayList<Fragment> list = new ArrayList<>();
        list.add(new OpenSub1Fragment());
//        list.add(new OpenSub1Fragment());
//        list.add(new OpenSub1Fragment());
//        list.add(new OpenSub1Fragment());
        return list;
    }
}