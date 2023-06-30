package com.example.andproject.around;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.andproject.R;
import com.example.andproject.databinding.FragmentChartBinding;

import java.util.ArrayList;


public class ChartFragment extends Fragment {

    FragmentChartBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentChartBinding.inflate(inflater, container, false);
        binding.recvFloChart.setAdapter(new FloChartAdapter(getContext(), getFloChart()));
        binding.recvFloChart.setLayoutManager(new LinearLayoutManager(getContext()));

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



}