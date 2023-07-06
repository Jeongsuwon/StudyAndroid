package com.example.andproject.home;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;

import com.example.andproject.PagerAdapter;
import com.example.andproject.R;
import com.example.andproject.around.AroundFragment;
import com.example.andproject.databinding.ActivityUtilizeBinding;
import com.example.andproject.search.SearchFragment;
import com.google.android.material.chip.ChipGroup;

import java.util.ArrayList;

public class UtilizeActivity extends AppCompatActivity {

    ActivityUtilizeBinding binding;
    ActionBar actionBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityUtilizeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction().replace(R.id.container, new UtilizeHomeFragment()).commit();



        actionBar = getSupportActionBar();
        actionBar.hide();


        binding.imgvBackHome.setOnClickListener(v -> {
            finish();
        });

//        binding.utilizeChip1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                manager.beginTransaction().replace(R.id.container, new UtilizeFragment()).commit();
//            }
//        });
//
//        binding.utilizeChip2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                manager.beginTransaction().replace(R.id.container, new BenefitFragment()).commit();
//            }
//        });
//
//        binding.utilizeChip3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                manager.beginTransaction().replace(R.id.container, new BenefitFragment()).commit();
//            }
//        });


//        binding.navigation.setOnItemReselectedListener(item -> {
//            Fragment fragment = null;
//            actionBar.show();//??
//            if(item.getItemId() == R.id.tab_home){
//                actionBar.hide();
//                fragment = new HomeFragment();
//
//            }else if(item.getItemId() == R.id.tab_around){
//                fragment = new AroundFragment();
//                actionBar.setTitle("둘러보기");
//            }else if(item.getItemId() == R.id.tab_search){
//                fragment = new SearchFragment();
//                actionBar.setTitle("검색");
//            }else if(item.getItemId() == R.id.tab_repository){
////                fragment = new RepositoryFragment();
//                actionBar.setTitle("저장소");
//            }
//            manager.beginTransaction().replace(R.id.container, fragment).commit();
//
//        });

//        PagerAdapter adapter = new PagerAdapter(this, getUtilize());
//        binding.pagerUtilize.setAdapter(adapter);

//        binding.chipGrpUtilize.setOnCheckedChangeListener(new ChipGroup.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(ChipGroup group, int checkedId) {
//                if(checkedId==R.id.utilize_chip_1){
//                    binding.pagerUtilize.setCurrentItem(0, true);
//                }else if(checkedId==R.id.utilize_chip_2) {
//                    binding.pagerUtilize.setCurrentItem(1, true);
//                }if(checkedId==R.id.utilize_chip_3) {
//                    binding.pagerUtilize.setCurrentItem(2, true);
//                }
//            }
//        });
//
//        binding.pagerUtilize.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
//            @Override
//            public void onPageSelected(int position) {
//                if(position==0){
//                    binding.chipGrpUtilize.check(R.id.utilize_chip_1);
//                }else if(position==1){
//                    binding.chipGrpUtilize.check(R.id.utilize_chip_2);
//                }
//                else if(position==2){
//                    binding.chipGrpUtilize.check(R.id.utilize_chip_3);
//                }
//
//            }
//        });
//    }
//
//    ArrayList<Fragment> getUtilize(){
//        ArrayList<Fragment> list = new ArrayList<>();
//        list.add(new UtilizeFragment());
//
//        return list;
    }
}