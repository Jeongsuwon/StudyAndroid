package com.example.andproject.home;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.andproject.R;
import com.example.andproject.databinding.FragmentHomeBinding;
import com.google.android.material.chip.ChipGroup;

import java.util.ArrayList;


public class HomeFragment extends Fragment {

    FragmentHomeBinding binding;
    private Handler sliderHandler = new Handler();

    int currentPage = 0;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        binding = FragmentHomeBinding.inflate(inflater, container, false);
        binding.recvHomeNewest.setAdapter(new HomeAdapter(getHome(), getContext()));
        binding.recvHomeNewest.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView.HORIZONTAL, false));

        binding.recvHomeAudio.setAdapter(new HomeAdapter(getHome_audio(), getContext()));
        binding.recvHomeAudio.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView.HORIZONTAL, false));

        binding.recvSummer.setAdapter(new HomeAdapter(getHome_summer(), getContext()));
        binding.recvSummer.setLayoutManager(new LinearLayoutManager(getContext(),RecyclerView.HORIZONTAL, false));

        binding.imageSlide.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                sliderHandler.removeCallbacks(sliderRunnable);
                sliderHandler.postDelayed(sliderRunnable, 4000);
            }
        });

        binding.imgvHomeMike.setOnClickListener(view -> {
            AlertDialog.Builder oDialog = new AlertDialog.Builder(getContext(),
                    android.R.style.Theme_Dialog);

            oDialog.setMessage("음성인식,음악검색 기능을 사용하기 위해 마이크 권한이 필요합니다. 설정>FLO에서 마이크 권한을 허용해주세요.")
                    .setPositiveButton("아니오", new DialogInterface.OnClickListener()
                    {
                        @Override
                        public void onClick(DialogInterface dialog, int which)
                        {
                            Log.i("Dialog", "취소");
                        }
                    })
                    .setNeutralButton("설정으로 이동", new DialogInterface.OnClickListener()
                    {
                        public void onClick(DialogInterface dialog, int which)
                        {
                        }
                    })
                    .setCancelable(false) // 백버튼으로 팝업창이 닫히지 않도록 한다.


                    .show();
        });

        binding.imgvUtilize.setOnClickListener(v -> {
            Intent intent = new Intent(getContext(), UtilizeActivity.class);
            startActivity(intent);
        });

        binding.imgvNotify.setOnClickListener(v -> {
            Intent intent = new Intent(getContext(), NotifyActivity.class);
            startActivity(intent);
        });

        binding.imgvSet.setOnClickListener(v -> {
            Intent intent = new Intent(getContext(), SettingActivity.class);
            startActivity(intent);
        });

        binding.imgvFavor.setOnClickListener(v -> {
            Intent intent = new Intent(getContext(), FavorActivity.class);
            startActivity(intent);
        });


        HomeAdapter adapter = new HomeAdapter(getTogether(), getContext());
        binding.pagerToday.setAdapter(adapter);
        binding.pagerToday.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView.HORIZONTAL, false));

//        SliderAdapter adapter1 = new SliderAdapter(getContext(), getHomeMain());
//        binding.recvHomeMain.setAdapter(adapter1);
//        binding.recvHomeMain.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView.HORIZONTAL, false));

        binding.imageSlide.setAdapter(new SliderAdapter(getContext(), getHomeMain()));




        binding.chipGrpToday.setOnCheckedChangeListener(new ChipGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(ChipGroup group, int checkedId) {
                if(checkedId == R.id.today_chip_1){
                    adapter.list = getTogether();
                    adapter.notifyDataSetChanged();
                }else if(checkedId == R.id.today_chip_2){
                    adapter.list = getIntenal();
                    adapter.notifyDataSetChanged();
                }else if(checkedId == R.id.today_chip_3){
                    adapter.list = getForeign();
                    adapter.notifyDataSetChanged();

                }
                binding.pagerToday.smoothScrollToPosition(0);
            }
        });

        Intent intent = new Intent(Intent.ACTION_VIEW);
        binding.imgvFacebook.setOnClickListener(view -> {
            intent.setData(Uri.parse("https://m.facebook.com")); //  -> /music.flo.official
            startActivity(intent);
        });

        binding.imgvInsta.setOnClickListener(view -> {
            intent.setData(Uri.parse("https://www.instagram.com/flo.music.official/?igshid=t5zfyar4ceeu")); //  -> /music.flo.official
            startActivity(intent);
        });

        binding.imgvYoutube.setOnClickListener(view -> {
            intent.setData(Uri.parse("https://www.youtube.com/@studioflo")); //  -> /music.flo.official
            startActivity(intent);
        });

        binding.imgvTwitter.setOnClickListener(view -> {
            intent.setData(Uri.parse("https://twitter.com/i/flow/login?redirect_after_login=%2F%3Flang%3Dko")); //  -> /music.flo.official
            startActivity(intent);
        });




        return binding.getRoot();
    }

    private Runnable sliderRunnable = new Runnable() {
        @Override
        public void run() {
            binding.imageSlide.setCurrentItem(binding.imageSlide.getCurrentItem() + 1);
            if(currentPage == 5) {
                currentPage = 0;
            }
            binding.imageSlide.setCurrentItem(currentPage++, true);
        }
    };

    public ArrayList<HomeMainDTO> getHomeMain(){
        ArrayList<HomeMainDTO> list = new ArrayList<>();
        list.add(new HomeMainDTO(R.drawable.recmd1, R.drawable.home_main_subimg1, R.drawable.home_main_subimg2, R.drawable.home_main_subimg3));
        list.add(new HomeMainDTO(R.drawable.recmd2, R.drawable.home_main_subimg1, R.drawable.home_main_subimg2, R.drawable.home_main_subimg3));
        list.add(new HomeMainDTO(R.drawable.recmd3, R.drawable.home_main_subimg1, R.drawable.home_main_subimg2, R.drawable.home_main_subimg3));
        list.add(new HomeMainDTO(R.drawable.recmd4, R.drawable.home_main_subimg1, R.drawable.home_main_subimg2, R.drawable.home_main_subimg3));
        list.add(new HomeMainDTO(R.drawable.recmd5, R.drawable.home_main_subimg1, R.drawable.home_main_subimg2, R.drawable.home_main_subimg3));


        return list;
    }

    public ArrayList<HomeCateDTO> getForeign(){
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

    public ArrayList<HomeCateDTO> getIntenal(){
        ArrayList<HomeCateDTO> list = new ArrayList<>();
        list.add(new HomeCateDTO(R.drawable.today_img1, R.drawable.full_foward, "That's Me", "선예"));
        list.add(new HomeCateDTO(R.drawable.today_img2, R.drawable.full_foward, "책갈피", "유별"));
        list.add(new HomeCateDTO(R.drawable.today_img3, R.drawable.full_foward, "안녕한가요", "이세연"));
        list.add(new HomeCateDTO(R.drawable.today_img4, R.drawable.full_foward, "우산", "이찬혁비디오"));
        list.add(new HomeCateDTO(R.drawable.today_img5, R.drawable.full_foward, "PLAY LIST", "유키스"));
        list.add(new HomeCateDTO(R.drawable.today_img6, R.drawable.full_foward, "Her", "coldnight"));
        list.add(new HomeCateDTO(R.drawable.today_img6, R.drawable.full_foward, "Fluid", "NECTA"));
        list.add(new HomeCateDTO(R.drawable.today_img8, R.drawable.full_foward, "앞으로가", "SONIC STONES(소닉스톤···"));
        list.add(new HomeCateDTO(R.drawable.today_img9, R.drawable.full_foward, "착지", "정지아"));
        list.add(new HomeCateDTO(R.drawable.today_img10, R.drawable.full_foward, "트랄랄라 브라더스", "various Artists"));



        return list;
    }
    public ArrayList<HomeCateDTO> getTogether(){
        ArrayList<HomeCateDTO> list = new ArrayList<>();

        list.add(new HomeCateDTO(R.drawable.today_img1, R.drawable.full_foward, "That's Me", "선예"));
        list.add(new HomeCateDTO(R.drawable.together_img1, R.drawable.full_foward, "책갈피", "유별"));
        list.add(new HomeCateDTO(R.drawable.together_img2, R.drawable.full_foward, "안녕한가요", "이세연"));
        list.add(new HomeCateDTO(R.drawable.together_img3, R.drawable.full_foward, "우산", "이찬혁비디오"));
        list.add(new HomeCateDTO(R.drawable.together_img4, R.drawable.full_foward, "PLAY LIST", "유키스"));
        list.add(new HomeCateDTO(R.drawable.together_img5, R.drawable.full_foward, "Her", "coldnight"));
        list.add(new HomeCateDTO(R.drawable.today_img6, R.drawable.full_foward, "Fluid", "NECTA"));
        list.add(new HomeCateDTO(R.drawable.today_img8, R.drawable.full_foward, "앞으로가", "SONIC STONES(소닉스톤···"));
        list.add(new HomeCateDTO(R.drawable.today_img9, R.drawable.full_foward, "착지", "정지아"));
        list.add(new HomeCateDTO(R.drawable.today_img10, R.drawable.full_foward, "트랄랄라 브라더스", "various Artists"));

        return list;
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

    public ArrayList<HomeCateDTO> getHome_summer(){
        ArrayList<HomeCateDTO> list = new ArrayList<>();

        list.add(new HomeCateDTO(R.drawable.summer_img1,R.drawable.full_foward, "만성피로에 비타민 같은 상큼 케이팝",""));
        list.add(new HomeCateDTO(R.drawable.summer_img2,R.drawable.full_foward, "고막 제습기 상큼 팝",""));
        list.add(new HomeCateDTO(R.drawable.summer_img3,R.drawable.full_foward, "습도 100%? 내 기분은 습도 0%",""));
        list.add(new HomeCateDTO(R.drawable.summer_img4,R.drawable.full_foward, "출근길 잠 깨워주는 시원한 팝",""));
        list.add(new HomeCateDTO(R.drawable.summer_img5,R.drawable.full_foward, "산뜻한 발라드로 불쾌 지수 잠 재우기",""));
        list.add(new HomeCateDTO(R.drawable.summer_img6,R.drawable.full_foward, "상쾌함 가득 담은 K-힙합과 알앤비▤",""));
        list.add(new HomeCateDTO(R.drawable.summer_img7,R.drawable.full_foward, "출퇴근 길이 드라이브 코스가 돼",""));
        return list;
    }





}