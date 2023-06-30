package com.example.andproject.home;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.andproject.PagerAdapter;
import com.example.andproject.R;
import com.example.andproject.databinding.FragmentHomeBinding;
import com.google.android.material.chip.ChipGroup;

import java.util.ArrayList;


public class HomeFragment extends Fragment {

    FragmentHomeBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        binding.recvHomeNewest.setAdapter(new HomeAdapter(getHome(), getContext()));
        binding.recvHomeNewest.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView.HORIZONTAL, false));

        binding.recvHomeAudio.setAdapter(new HomeAdapter(getHome_audio(), getContext()));
        binding.recvHomeAudio.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView.HORIZONTAL, false));

        binding.imgvUtilize.setOnClickListener(v -> {
            Intent intent = new Intent(getContext(), UtilizeActivity.class);
            startActivity(intent);
        });

        PagerAdapter adapter = new PagerAdapter(this, getFragmentList());
        binding.pagerToday.setAdapter(adapter);




        binding.chipGrpToday.setOnCheckedChangeListener(new ChipGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(ChipGroup group, int checkedId) {
                if(checkedId == R.id.today_chip_1){
                    binding.pagerToday.setCurrentItem(0, true);
                }else if(checkedId == R.id.today_chip_2){
                    binding.pagerToday.setCurrentItem(1, true);
                }else if(checkedId == R.id.today_chip_3){
                    binding.pagerToday.setCurrentItem(2, true);
                }
            }
        });

        binding.pagerToday.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                if(position==0){
                    binding.chipGrpToday.check(R.id.today_chip_1);
                }else if(position==1){
                    binding.chipGrpToday.check(R.id.today_chip_2);
                }
                else if(position==2){
                    binding.chipGrpToday.check(R.id.today_chip_3);
                }

            }
        });

        return binding.getRoot();
    }

    ArrayList<Fragment> getFragmentList(){
        ArrayList<Fragment> list = new ArrayList<>();
        list.add(new TogetherFragment());
        list.add(new InternalFragment());
        list.add(new ForeignFragment());
        return list;
    }

    public ArrayList<HomeCateDTO> getHome(){
        ArrayList<HomeCateDTO> list = new ArrayList<>();

        list.add(new HomeCateDTO(R.drawable.home_newest1, R.drawable.full_foward, "훅 까놓고 말해서 Part 2", "허각"));
        list.add(new HomeCateDTO(R.drawable.home_newest2, R.drawable.full_foward, "How Does it Feel(A.T.G Remix)", "Tom Grennan"));
        list.add(new HomeCateDTO(R.drawable.home_newest3, R.drawable.full_foward, "어떤 날도, 어떤 말도(여름날 우리 X 펀치···", "펀치(Punch)"));
        list.add(new HomeCateDTO(R.drawable.home_newest4, R.drawable.full_foward, "Shy Boy", "Carly Rae Jepsen"));
        list.add(new HomeCateDTO(R.drawable.home_newest5, R.drawable.full_foward, "2 Kids On The Block - Part.1", "다이나믹 듀오"));

        return list;
    }

    public ArrayList<HomeCateDTO> getHome_audio(){
        ArrayList<HomeCateDTO> list = new ArrayList<>();

        list.add(new HomeCateDTO(R.drawable.home_audio_img1, R.drawable.full_foward, "갓쇼의 사이다썰", "예능/미스터리"));
        list.add(new HomeCateDTO(R.drawable.home_audio_img2, R.drawable.full_foward, "송은이·김숙 비밀보장", "예능/미스터리"));
        list.add(new HomeCateDTO(R.drawable.home_audio_img3, R.drawable.full_foward, "MBC 손·경·제", "시사/경제"));
        list.add(new HomeCateDTO(R.drawable.home_audio_img4, R.drawable.full_foward, "Tigger ASMR", "ASMR/힐링"));
        list.add(new HomeCateDTO(R.drawable.home_audio_img5, R.drawable.full_foward, "윈터웨일", "ASMR/힐링"));
        list.add(new HomeCateDTO(R.drawable.home_audio_img6, R.drawable.full_foward, "위로받는 밤 ASMR", "ASMR/힐링"));
        list.add(new HomeCateDTO(R.drawable.home_audio_img7, R.drawable.full_foward, "엄마의 인형동화", "오디오드라마/오디오북"));
        list.add(new HomeCateDTO(R.drawable.home_audio_img8, R.drawable.full_foward, "슈카월드", "시사/경제"));
        list.add(new HomeCateDTO(R.drawable.home_audio_img9, R.drawable.full_foward, "MBC 지라시 '웃음이 묻어나...", "예능/미스터리"));
        list.add(new HomeCateDTO(R.drawable.home_audio_img10, R.drawable.full_foward, "마음 챙겨주는 힐링&수면음악", "ASMR/힐링, 스포츠/건강"));

        return list;
    }


}