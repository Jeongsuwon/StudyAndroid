package com.example.andproject.home;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.andproject.R;
import com.example.andproject.databinding.ActivityFavorBinding;

import java.util.ArrayList;

public class FavorActivity extends AppCompatActivity {
    ActionBar actionBar;
    ActivityFavorBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFavorBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.recvFavorMusic.setAdapter(new FavorAdapter(this, list()));
        binding.recvFavorMusic.setLayoutManager(new LinearLayoutManager(this));

        binding.imgvFaverBack.setOnClickListener(v -> {
            finish();
        });

        actionBar = getSupportActionBar();
        actionBar.hide();
    }

  public ArrayList<FavorDTO> list(){
        ArrayList<FavorDTO> list = new ArrayList<>();

        list.add(new FavorDTO("혼자 술 마시지 말고", "송하예", "2023.07.12 | 싱글 | 발라드", R.drawable.home_favor_music));
        list.add(new FavorDTO("[THE 시즌즈 Vol.6]<최정훈의 밤의 공···", "박기영", "2023.07.08 | 싱글 | 알앤비", R.drawable.home_favor_music2));
        list.add(new FavorDTO("시작되는 연인들을 위해", "김재환", "2023.07.11 | 싱글 | 발라드", R.drawable.home_favor_music3));
        list.add(new FavorDTO("킹더랜드 OST Part.5", "펀치(Punch)", "2023.07.09 | OST | TV 드라마, 댄스팝", R.drawable.home_favor_music4));
        list.add(new FavorDTO("바람", "코요태", "2023.07.12 | 싱글 | 댄스팝", R.drawable.home_favor_music5));
        list.add(new FavorDTO("재해석 Vol.2", "정승환", "2023.07.12 | 싱글 | 발라드", R.drawable.home_favor_music6));
        list.add(new FavorDTO("잊는 법", "이예준", "2023.07.09 | 싱글 | 발라드", R.drawable.home_favor_music7));
        list.add(new FavorDTO("여자는 말 못하고, 남자는 모르는 것들", "정동하", "2023.07.08 | 싱글 | 발라드", R.drawable.home_favor_music8));

        return list;
    }
}