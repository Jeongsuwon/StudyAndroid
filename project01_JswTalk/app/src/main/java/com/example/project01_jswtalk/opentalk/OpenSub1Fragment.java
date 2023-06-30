package com.example.project01_jswtalk.opentalk;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.project01_jswtalk.R;
import com.example.project01_jswtalk.databinding.FragmentOpenSub1Binding;

import java.util.ArrayList;


public class OpenSub1Fragment extends Fragment {

    FragmentOpenSub1Binding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentOpenSub1Binding.inflate(getLayoutInflater(), container, false);
        binding.recvChatRoom.setAdapter(new OpenTalkAdapter(getOpenChatList(), getContext()));
        binding.recvChatRoom.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView.HORIZONTAL, false));

        binding.recvListen.setAdapter(new ListenAdapter(getListen(),getContext()));
        binding.recvListen.setLayoutManager(new LinearLayoutManager(getContext(),RecyclerView.HORIZONTAL, false));

        binding.recvLamen.setAdapter(new LamenAdapter(getLamen(), getContext()));
        binding.recvLamen.setLayoutManager(new LinearLayoutManager(getContext(),RecyclerView.HORIZONTAL, false));

        return binding.getRoot();
    }



    ArrayList<LamenDTO> getLamen(){
        ArrayList<LamenDTO> list = new ArrayList<>();
        list.add(new LamenDTO(R.drawable.lamen1, "라면의 아일랜드 방", "3명"));
        list.add(new LamenDTO(R.drawable.lamen2, "라면좋앙^^", "2명"));
        list.add(new LamenDTO(R.drawable.lamen3, "맛있는 라면 채팅방", "2명"));
        list.add(new LamenDTO(R.drawable.lamen4, "라면", "7명"));
        list.add(new LamenDTO(R.drawable.lamen5, "라면의", "4명"));
        list.add(new LamenDTO(R.drawable.lamen6, "라면에 미친자들", "2명"));

        return list;
    }

    ArrayList<OpenChatDTO> getOpenChatList(){
        ArrayList<OpenChatDTO> list = new ArrayList<>();

        list.add(new OpenChatDTO(R.drawable.img1, "안고독한거지방", "269명 | 30분 전"));
        list.add(new OpenChatDTO(R.drawable.img3, "거지방", "29명 | 방금 대화"));
        list.add(new OpenChatDTO(R.drawable.img4, "냅다거지방", "38명 | 방금 대화"));
        list.add(new OpenChatDTO(R.drawable.img6, "40대거지방", "269명 | 30분 전"));
        list.add(new OpenChatDTO(R.drawable.img7, "거지방", "333명 | 방금 대화"));
        list.add(new OpenChatDTO(R.drawable.img10, "정신줄 놓은 거지방", "39명 | 1시간 전"));


        return list;
    }

    ArrayList<ListenDTO> getListen(){
        ArrayList<ListenDTO> list = new ArrayList<>();
        list.add(new ListenDTO(R.drawable.lsmusic1, R.drawable.ln_character1, R.drawable.ln_character2, R.drawable.ln_character3, R.drawable.lnmusic1, R.drawable.lnmusic2, R.drawable.lnmusic3, "음악감상"
                                , "조금 고독한 음악 감상방", "16명", "오늘도 재즈 음악 감상", "3명", "음악폭격기", "5명"));

        list.add(new ListenDTO(R.drawable.lsmovie1, R.drawable.ln_character4, R.drawable.ln_character5, R.drawable.ln_character6, R.drawable.lnmovie1, R.drawable.lnmovie2, R.drawable.lnmovie3, "영화감상"
                                , "헐리우드 고저녕화 감상모임", "16명", "온라인 영화감상 모임(zoom)", "6명", "영화감상소모임 순간순간", "3명"));



        return list;
    }


}