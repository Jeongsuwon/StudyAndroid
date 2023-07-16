package com.example.andproject.around;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;

import com.example.andproject.R;
import com.example.andproject.databinding.FragmentAroundBinding;
import com.google.android.material.chip.ChipGroup;

import java.util.ArrayList;

public class AroundFragment extends Fragment {

    FragmentAroundBinding binding;
    ScrollView scrollView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentAroundBinding.inflate(inflater, container, false);

        binding.recvFloChart1.setAdapter(new FloChartAdapter(getContext(), getFloChart()));
        binding.recvFloChart1.setLayoutManager(new LinearLayoutManager(getContext()));

        binding.recvForeginChart.setAdapter(new FloChartAdapter(getContext(), getForeignChart()));
        binding.recvForeginChart.setLayoutManager(new LinearLayoutManager(getContext()));

        binding.recvVChart.setAdapter(new FloChartAdapter(getContext(), getVChart()));
        binding.recvVChart.setLayoutManager(new LinearLayoutManager(getContext()));


        binding.recvGenre.setAdapter(new GenreAdapter(getContext(), genre()));
        binding.recvGenre.setLayoutManager(new LinearLayoutManager(getContext()));

        binding.recvAroundAudio.setAdapter(new GenreAdapter(getContext(), audio()));
        binding.recvAroundAudio.setLayoutManager(new LinearLayoutManager(getContext()));

        binding.aroundMovieImg1.setOnClickListener(view -> {
            Intent intent = new Intent(getContext(), MovieActivity.class);
            startActivity(intent);
        });

        binding.chipGrp.setOnCheckedChangeListener(new ChipGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(ChipGroup group, int checkedId) {
                if(checkedId == R.id.around_chip_1){
                    binding.chartScroll.smoothScrollTo(0, binding.tvChartCategory1.getTop());
                }
                else if(checkedId == R.id.around_chip_2){
                    binding.chartScroll.smoothScrollTo(0, binding.lnChartCategory2.getTop());
                }else if(checkedId == R.id.around_chip_3){
                    binding.chartScroll.smoothScrollTo(0, binding.lnChartCategory3.getTop());
                }else if(checkedId == R.id.around_chip_4){
                    binding.chartScroll.smoothScrollTo(0, binding.lnChartCategory4.getTop());
                }else if(checkedId == R.id.around_chip_5){
                    binding.chartScroll.smoothScrollTo(0, binding.lnChartCategory5.getTop());
                }

            }
        });



        return binding.getRoot();
    }

    public ArrayList<FloChartDTO> getFloChart(){
        ArrayList<FloChartDTO> list = new ArrayList<>();

        list.add(new FloChartDTO(R.drawable.chart_img1, R.drawable.play, 1, "퀸카(Queencard)", "(여자)아이들"));
        list.add(new FloChartDTO(R.drawable.chart_img2, R.drawable.play, 2, "I AM", "IVE (아이브)"));
        list.add(new FloChartDTO(R.drawable.chart_img3, R.drawable.play, 3, "이브, 프시케 그리고 푸른 수염의 아내", "LE SSERAFIM (르세라핌)"));
        list.add(new FloChartDTO(R.drawable.chart_img4, R.drawable.play, 4, "Spicy", "aespa"));
        list.add(new FloChartDTO(R.drawable.chart_img5, R.drawable.play, 5, "Kitsch", "IVE (아이브)"));
        list.add(new FloChartDTO(R.drawable.chart_img6, R.drawable.play, 6, "UNFORGIVEN (feat. Nile Rodgers)", "LE SSERAFIM (르세라핌)"));
        list.add(new FloChartDTO(R.drawable.chart_img7, R.drawable.play, 7, "사랑은 늘 도망가", "임영웅"));
        list.add(new FloChartDTO(R.drawable.chart_img8, R.drawable.play, 8, "우리들의 블루스", "임영웅"));
        list.add(new FloChartDTO(R.drawable.chart_img9, R.drawable.play, 9, "Hype Boy", "NewJeans"));
        list.add(new FloChartDTO(R.drawable.chart_img10, R.drawable.play, 10, "모래알갱이", "임영웅"));
        list.add(new FloChartDTO(R.drawable.chart_img11, R.drawable.play, 11, "퀸카(Queencard)", "(여자)아이들"));
        list.add(new FloChartDTO(R.drawable.chart_img12, R.drawable.play, 12, "Ditto", "NewJeans"));
        list.add(new FloChartDTO(R.drawable.chart_img13, R.drawable.play, 13, "헤어지자 말해요", "박재정"));
        list.add(new FloChartDTO(R.drawable.chart_img14, R.drawable.play, 14, "이제 나만 믿어요", "임영웅"));
        list.add(new FloChartDTO(R.drawable.chart_img15, R.drawable.play, 15, "꽃", "지수(JISOO)"));
        list.add(new FloChartDTO(R.drawable.chart_img11, R.drawable.play, 16, "무지개", "임영웅"));
        list.add(new FloChartDTO(R.drawable.chart_img11, R.drawable.play, 17, "아버지", "임영웅"));
        list.add(new FloChartDTO(R.drawable.chart_img18, R.drawable.play, 18, "Polaroid", "임영웅"));
        list.add(new FloChartDTO(R.drawable.chart_img18, R.drawable.play, 19, "London Boy", "임영웅"));
        list.add(new FloChartDTO(R.drawable.chart_img11, R.drawable.play, 20, "인생찬가", "임영웅"));

        return list;
    }

    public ArrayList<FloChartDTO> getForeignChart(){
        ArrayList<FloChartDTO> list = new ArrayList<>();

        list.add(new FloChartDTO(R.drawable.around_foreign_chart1, R.drawable.play, 1, "vampire (Explicit Ver.)", "Olivia Rodrigo"));
        list.add(new FloChartDTO(R.drawable.around_foreign_chart2, R.drawable.play, 2, "Cruel Summer", "Taylor Swift"));
        list.add(new FloChartDTO(R.drawable.around_foreign_chart3, R.drawable.play, 3, "Calm Down", "Rema&Selena Gomez"));
        list.add(new FloChartDTO(R.drawable.around_foreign_chart4, R.drawable.play, 4, "Ella Baila Sola", "Eslabon Armado&Peso Pluma"));
        list.add(new FloChartDTO(R.drawable.around_foreign_chart5, R.drawable.play, 5, "Flowers", "Miley Cyrus"));
        list.add(new FloChartDTO(R.drawable.around_foreign_chart6, R.drawable.play, 6, "La Bebe (Remix) (Explicit Ver.)", "Yng Lvcas&Peso Pluma"));
        list.add(new FloChartDTO(R.drawable.around_foreign_chart7, R.drawable.play, 7, "Creepin' (Explicit Ver.)", "Metro Boomin&The Weeknd"));
        list.add(new FloChartDTO(R.drawable.around_foreign_chart8, R.drawable.play, 8, "Fast Car", "Luke Combs"));
        list.add(new FloChartDTO(R.drawable.around_foreign_chart9, R.drawable.play, 9, "I Wanna Be Yours", "Arctic Monkeys"));
        list.add(new FloChartDTO(R.drawable.around_foreign_chart10, R.drawable.play, 10, "SABOR FRESA (Explicit Ver.)","Fuerza Regida"));
        list.add(new FloChartDTO(R.drawable.around_foreign_chart11, R.drawable.play, 11, "Sprinter (Explicit Ver.)", "Central Cee"));
        list.add(new FloChartDTO(R.drawable.around_foreign_chart12, R.drawable.play, 12, "As It Was", "Harry Styles"));
        list.add(new FloChartDTO(R.drawable.around_foreign_chart13, R.drawable.play, 13, "Cupid (Twin Ver.)", "FIFTY FIFTY"));
        list.add(new FloChartDTO(R.drawable.around_foreign_chart14, R.drawable.play, 14, "Kill Bill", "SZA"));
        list.add(new FloChartDTO(R.drawable.around_foreign_chart15, R.drawable.play, 15, "All My Life (feat. J. Cole) (Explicit Ver.)", "Lil Durk"));
        list.add(new FloChartDTO(R.drawable.around_foreign_chart16, R.drawable.play, 16, "fukumean (Explicit Ver.)", "Gunna"));
        list.add(new FloChartDTO(R.drawable.around_foreign_chart17, R.drawable.play, 17, "Say Yes To Heaven", "Lana Del Rey"));
        list.add(new FloChartDTO(R.drawable.around_foreign_chart18, R.drawable.play, 18, "Last Night (Explicit Ver.)", "Morgan Wallen"));
        list.add(new FloChartDTO(R.drawable.around_foreign_chart19, R.drawable.play, 19, "Karma (Explicit Ver.)", "Taylor Swift"));
        list.add(new FloChartDTO(R.drawable.around_foreign_chart20, R.drawable.play, 20, "TULUM (Explicit Ver.)", "Peso Pluma&Grupo Frontera"));

        return list;
    }

    public ArrayList<FloChartDTO> getVChart(){
        ArrayList<FloChartDTO> list = new ArrayList<>();

        list.add(new FloChartDTO(R.drawable.around_v_chart1, R.drawable.play, 1, "Super Shy", "New Jeans"));
        list.add(new FloChartDTO(R.drawable.around_v_chart2, R.drawable.play, 2, "여행", "볼빨간사춘기"));
        list.add(new FloChartDTO(R.drawable.around_v_chart3, R.drawable.play, 3, "나는 계속 장마야", "유주"));
        list.add(new FloChartDTO(R.drawable.around_v_chart4, R.drawable.play, 4, "다시 여기 바닷가", "싹쓰리(유두래곤,린다G,비룡)"));
        list.add(new FloChartDTO(R.drawable.around_v_chart5, R.drawable.play, 5, "비도 오고 그래서(Feat.신···", "IVE (아이브)"));
        list.add(new FloChartDTO(R.drawable.around_v_chart6, R.drawable.play, 6, "I AM", "IVE(아이브)"));
        list.add(new FloChartDTO(R.drawable.around_v_chart7, R.drawable.play, 7, "나에게 그대만이", "탑현"));
        list.add(new FloChartDTO(R.drawable.around_v_chart8, R.drawable.play, 8, "비와 당신(영화'라디오스···", "럼블피쉬"));
        list.add(new FloChartDTO(R.drawable.around_v_chart9, R.drawable.play, 9, "나는 계속 장마야", "범준이"));
        list.add(new FloChartDTO(R.drawable.around_v_chart10, R.drawable.play, 10, "헤어지자 말해요", "박재정"));
        list.add(new FloChartDTO(R.drawable.around_v_chart11, R.drawable.play, 11, "비처럼 음악처럼", "규현"));
        list.add(new FloChartDTO(R.drawable.around_v_chart12, R.drawable.play, 12, "이브, 프시케 그리고 푸른···", "LE SSERAFIM (르세라핌)"));
        list.add(new FloChartDTO(R.drawable.around_v_chart13, R.drawable.play, 13, "우산(feat.윤하)", "에픽하이"));
        list.add(new FloChartDTO(R.drawable.around_v_chart14, R.drawable.play, 14, "Rain Drop(Feat.Kelsey K···", "뎁트 & 릴리초이"));
        list.add(new FloChartDTO(R.drawable.around_v_chart15, R.drawable.play, 15, "잠 못 드는 밤 비는 내리고", "김건모"));
        list.add(new FloChartDTO(R.drawable.around_v_chart16, R.drawable.play, 16, "퀸카(Queencard)", "(여자)아이들"));
        list.add(new FloChartDTO(R.drawable.around_v_chart17, R.drawable.play, 17, "장마", "박보람"));
        list.add(new FloChartDTO(R.drawable.around_v_chart18, R.drawable.play, 18, "Dangerously", "Charlie Puth"));
        list.add(new FloChartDTO(R.drawable.around_v_chart19, R.drawable.play, 19, "너에게 닿을게", "정승환"));
        list.add(new FloChartDTO(R.drawable.around_v_chart20, R.drawable.play, 20, "퇴근하겠습니다", "장미여관"));

        return list;
    }

    public ArrayList<GenreRecvDTO> genre(){
        ArrayList<GenreRecvDTO> list = new ArrayList<>();
        list.add(new GenreRecvDTO(R.drawable.around_genre1, R.drawable.around_genre2));
        list.add(new GenreRecvDTO(R.drawable.around_genre3, R.drawable.around_genre4));
        list.add(new GenreRecvDTO(R.drawable.around_genre5, R.drawable.around_genre6));
        list.add(new GenreRecvDTO(R.drawable.around_genre7, R.drawable.around_genre8));
        list.add(new GenreRecvDTO(R.drawable.around_genre9, R.drawable.around_genre10));
        list.add(new GenreRecvDTO(R.drawable.around_genre11, R.drawable.around_genre12));
        list.add(new GenreRecvDTO(R.drawable.around_genre13, R.drawable.around_genre14));
        list.add(new GenreRecvDTO(R.drawable.around_genre15, R.drawable.around_genre16));
        list.add(new GenreRecvDTO(R.drawable.around_genre17, R.drawable.around_genre18));

        return list;
        }
    public ArrayList<GenreRecvDTO> audio(){
        ArrayList<GenreRecvDTO> list = new ArrayList<>();
        list.add(new GenreRecvDTO(R.drawable.around_audio_img1, R.drawable.around_audio_img2));
        list.add(new GenreRecvDTO(R.drawable.around_audio_img3, R.drawable.around_audio_img4));
        list.add(new GenreRecvDTO(R.drawable.around_audio_img5, R.drawable.around_audio_img6));
        list.add(new GenreRecvDTO(R.drawable.around_audio_img7, R.drawable.around_audio_img8));
        list.add(new GenreRecvDTO(R.drawable.around_audio_img9, R.drawable.around_audio_img10));

        return list;
    }

}