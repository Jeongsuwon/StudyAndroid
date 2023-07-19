package com.example.andproject.around;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SlidingDrawer;

import com.example.andproject.R;
import com.example.andproject.databinding.ActivityMovieBinding;

import java.util.ArrayList;

import www.sanju.motiontoast.MotionToast;
import www.sanju.motiontoast.MotionToastStyle;

public class MovieActivity extends AppCompatActivity {
    ActivityMovieBinding binding;
    ActionBar actionBar;
    int imageIndex = 0;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMovieBinding.inflate(getLayoutInflater());
        actionBar = getSupportActionBar();
        actionBar.hide();
        getWindow().setStatusBarColor(Color.parseColor("#000000"));

        binding.aroundMovieInfoNotlike.setOnClickListener(view -> {
            changeImage();
            MotionToast.Companion.darkColorToast(this,
                    "",
                    "좋아요 한 영상에 담겼습니다.",
                    MotionToastStyle.SUCCESS,
                    MotionToast.GRAVITY_CENTER,
                    MotionToast.LONG_DURATION,
                    ResourcesCompat.getFont(this, www.sanju.motiontoast.R.font.helvetica_regular));
        });

        binding.aroundMovieInfoLike.setOnClickListener(view -> {
            changeImage();
            MotionToast.Companion.darkColorToast(this,
                    "",
                    "좋아요 한 영상이 취소되었습니다.",
                    MotionToastStyle.DELETE,
                    MotionToast.GRAVITY_CENTER,
                    MotionToast.LONG_DURATION,
                    ResourcesCompat.getFont(this, www.sanju.motiontoast.R.font.helvetica_regular));
        });

        binding.recvMovieInfo.setAdapter(new MovieInfoAdapter(this, getMovieInfo()));
        binding.recvMovieInfo.setLayoutManager(new LinearLayoutManager(this));


        binding.arrowUp.setOnClickListener(view -> {
            changeArrow();
        });



        binding.materialSwitch.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                binding.materialSwitch.isChecked();
            }
        });


    binding.aroundMovieinfoDown.setOnClickListener(v -> {
        finish();
    });


    setContentView(binding.getRoot());
    }




    public void changeImage() {

        if (imageIndex == 0) {
            binding.aroundMovieInfoNotlike.setVisibility(View.INVISIBLE);
            binding.aroundMovieInfoLike.setVisibility(View.VISIBLE);
            imageIndex = 1;
        } else if (imageIndex == 1) {
            binding.aroundMovieInfoNotlike.setVisibility(View.VISIBLE);
            binding.aroundMovieInfoLike.setVisibility(View.INVISIBLE);
            imageIndex = 0;
        }
    }

    public void changeArrow() {

        if (imageIndex == 0) {
            binding.arrowUp.setVisibility(View.INVISIBLE);
            binding.arrowDown.setVisibility(View.VISIBLE);
            imageIndex = 1;
        } else if (imageIndex == 1) {
            binding.arrowUp.setVisibility(View.VISIBLE);
            binding.arrowDown.setVisibility(View.INVISIBLE);
            imageIndex = 0;
        }
    }

    public ArrayList<NextMovieDTO> getMovieInfo(){
        ArrayList<NextMovieDTO> list = new ArrayList<>();

        list.add(new NextMovieDTO(R.drawable.nextmovie_img1,"[MV]Seven(feat.Latto)", "정국"));
        list.add(new NextMovieDTO(R.drawable.nextmovie_img2,"[MV]Air Force One | Artms", "ODD EYE CIRCLE"));
        list.add(new NextMovieDTO(R.drawable.nextmovie_img3,"[MV]바람", "코요태"));
        list.add(new NextMovieDTO(R.drawable.nextmovie_img4,"[MV]혼자 술 마시지 말고(Live Clip)", "송하예"));
        list.add(new NextMovieDTO(R.drawable.nextmovie_img5,"[티저]KILL MY DOUBT(CONCEPT CLIP 4)", "ITZY(있지)"));
        list.add(new NextMovieDTO(R.drawable.nextmovie_img6,"[MV]이게 사랑이지 뭐야(feat.Paul Blanco)", "효린"));
        list.add(new NextMovieDTO(R.drawable.nextmovie_img8,"[MV]시작되는 연인들을 위해(Feat.별은)", "김재환"));
        list.add(new NextMovieDTO(R.drawable.nextmovie_img7,"[MV]FESTIVAL", "산다라박"));




        return list;
    }
}