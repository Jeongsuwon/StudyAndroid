package com.example.project_lastest;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Html;
import android.view.Menu;

import com.example.project_lastest.board.BoardFragment;
import com.example.project_lastest.calendar.CalendarActivity;
import com.example.project_lastest.chat.ChatFragment;
import com.example.project_lastest.databinding.ActivityMainBinding;
import com.example.project_lastest.home.HomeFragment;
import com.example.project_lastest.store.StoreFragment;
import com.example.project_lastest.travel.TravelFragment;

import java.util.Calendar;
import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    ActionBar actionBar;
    Fragment fragment = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        actionBar = getSupportActionBar();
        actionBar.hide();
        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction().replace(R.id.container, new HomeFragment()).commit();
        binding.navigation.setSelectedItemId(R.id.tab_home);
        binding.navigation.setBackground(null);

//        binding.mainFab.setOnClickListener(view -> {
//            Intent intent = new Intent(MainActivity.this, CalendarActivity.class );
//            startActivity(intent);
//        });


        binding.navigation.setOnItemSelectedListener(item -> {

            actionBar.show();//다시 보이게 하기.
        
            if(item.getItemId() == R.id.tab_travel){
                fragment = new TravelFragment();
                actionBar.setTitle(Html.fromHtml("<font color='#ffffff'>여행지</font>"));

            }else if(item.getItemId() == R.id.tab_chat){
                fragment = new ChatFragment();
                actionBar.setTitle(Html.fromHtml("<font color='#ffffff'>채팅</font>"));
//                actionBar.setTitle(Html.fromHtml("<font color='#ffffff'>둘러보기 </font>"));
//                getWindow().setStatusBarColor(Color.parseColor("#000000"));
//                actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#000000")));
//                binding.container.setBackgroundColor(Color.parseColor("#000000"));
            }else if(item.getItemId() == R.id.tab_home){
//                actionBar.setTitle(Html.fromHtml("<font color='#ffffff'>검색 </font>"));
//                getWindow().setStatusBarColor(Color.parseColor("#18191B"));
//                actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#18191B")));
//                binding.container.setBackgroundColor(Color.parseColor("#18191B"));
                  actionBar.hide();
                  fragment = new HomeFragment();
//                getSupportActionBar().setDisplayShowHomeEnabled(true);
//                getSupportActionBar().setIcon(R.drawable.search_mike);
//                getSupportActionBar().setIcon(R.drawable.search_music);
            }else if(item.getItemId() == R.id.tab_store){
                fragment = new StoreFragment();
                actionBar.setTitle(Html.fromHtml("<font color='#ffffff'>스토어 </font>"));
//                getWindow().setStatusBarColor(Color.parseColor("#000000"));
//                actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#000000")));
//                binding.container.setBackgroundColor(Color.parseColor("#000000"));
            }else if(item.getItemId() == R.id.tab_board){
                fragment = new BoardFragment();
                actionBar.setTitle(Html.fromHtml("<font color='#ffffff'>게시판 </font>"));
            }
            manager.beginTransaction().replace(R.id.container, fragment).commit();

            return true;
        });
    }


//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.home_btm_nav, menu);
//        return super.onCreateOptionsMenu(menu);
//    }
}