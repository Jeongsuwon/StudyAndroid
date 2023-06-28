package com.example.project01_jswtalk.opentalk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.project01_jswtalk.R;
import com.example.project01_jswtalk.databinding.ActivityOpenChatDetailBinding;

public class OpenChatDetailActivity extends AppCompatActivity {

    ActivityOpenChatDetailBinding binding;
    OpenChatDetailDTO dto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityOpenChatDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        dto = (OpenChatDetailDTO) getIntent().getSerializableExtra("dto");

        binding.imgvBack.setImageResource(dto.imgBack);
        binding.imgvProfile.setImageResource(dto.imgProfile);
        binding.participate.setImageResource(dto.imgPaticipate);
        binding.like.setImageResource(dto.imgLike);
        binding.chatType.setText(dto.type);
        binding.roomTitle.setText(dto.title);
        binding.hashtag.setText(dto.hash);
        binding.roomMaster.setText(dto.master);
        binding.roomInfo.setText(dto.info);

        binding.imgvClose.setOnClickListener(v -> {
            finish();
        });

    }
}