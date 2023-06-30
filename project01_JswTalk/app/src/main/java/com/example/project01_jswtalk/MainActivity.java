package com.example.project01_jswtalk;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.project01_jswtalk.chat.ChatFragment;
import com.example.project01_jswtalk.databinding.ActivityMainBinding;
import com.example.project01_jswtalk.friend.FriendFragment;
import com.example.project01_jswtalk.opentalk.OpenTalkMainFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    ActionBar actionBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction().replace(R.id.container, new FriendFragment()).commit();

        actionBar = getSupportActionBar();
        actionBar.setElevation(0f);

        LayoutInflater inflater = getLayoutInflater();
        LayoutInflater inflater1 = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
        LayoutInflater inflater2 = LayoutInflater.from(this);




        binding.bottomNavigation.setOnItemSelectedListener(item -> {
            Fragment fragment = null;
            if(item.getItemId()==R.id.tab1){
                fragment = new FriendFragment();
                actionBar.setTitle("친구");

            }else if(item.getItemId()==R.id.tab2){
                fragment = new ChatFragment();
                actionBar.setTitle("채팅");
                //package chat추가 후 ChatFragment 추가, ChatFragment에 리사이클러뷰를 이용하여 카카오톡의 채팅목록을 구현하기.


            }else if(item.getItemId()==R.id.tab3){
                fragment = new OpenTalkMainFragment();
                actionBar.setTitle("오픈채팅");
            }else if(item.getItemId()==R.id.tab4){
                actionBar.setTitle("쇼핑");
            }else if(item.getItemId()==R.id.tab5){
                actionBar.setTitle("더보기");
            }else{
                return false;//메뉴가 바뀌는 처리를 취소한다. ( 들어올가능성없음 )
            }
            if(fragment == null) {
                Toast.makeText(this, "아직 메뉴가 준비가 안되었습니다!!", Toast.LENGTH_SHORT).show();
            }else{
                manager.beginTransaction().replace(R.id.container, fragment).commit();
            }
            return true;
        });// 람다식의 메소드가 이해가 안간다면 new를 통해서 interface구조를 먼저 확인해볼것
    }
}