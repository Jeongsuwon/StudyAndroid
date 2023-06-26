package com.example.project01_jswtalk.friend;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.example.project01_jswtalk.R;
import com.example.project01_jswtalk.databinding.ActivityFriendDetailBinding;

public class FriendDetailActivity extends AppCompatActivity {

    ActivityFriendDetailBinding binding;
    FriendDTO dto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFriendDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        dto = (FriendDTO) getIntent().getSerializableExtra("dto");

        getSupportActionBar().hide(); // 액션 바를 안 보이게 처리한다.
        // 스테이터스바를 투명하게 만들기, 현재 액티비티를 조금 더 크게 보이게 하는 것 (외우거나 따로 공부 x, 구글링)
        Window window = getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
        window.setStatusBarColor(Color.TRANSPARENT);
        View view = getWindow().getDecorView();
        view.setSystemUiVisibility(view.getSystemUiVisibility() & ~view.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);

        //============================================================================================================//

        binding.imgvBackground.setImageResource(dto.getResImgId());
        binding.imgvProfile.setImageResource(dto.getResImgId());
        binding.tvName.setText(dto.getName());
        binding.tvMsg.setText(dto.getMsg());

        binding.imgvClose.setOnClickListener(v->{
            finish(); // 액티비티 종료
        });

    }
}