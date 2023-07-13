package com.example.project02_lastproject.hr;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.project02_lastproject.R;
import com.example.project02_lastproject.common.CommonConn;
import com.example.project02_lastproject.customer.CustomerVO;
import com.example.project02_lastproject.customer.RecvAdapter;
import com.example.project02_lastproject.databinding.FragmentHrBinding;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;

public class HrFragment extends Fragment {

    FragmentHrBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentHrBinding.inflate(inflater, container, false);

        select();
        return binding.getRoot();


    }

    public void select(){
        CommonConn conn = new CommonConn(getContext(), "list.hr");
        conn.onExcute((isResult, data) -> {
            ArrayList<EmployeesVO> list = new Gson().fromJson(data, new TypeToken<ArrayList<EmployeesVO>>(){}.getType());
            Log.d("리스트사이즈", "select: " + list.size());
            HrAdapter adapter = new HrAdapter(list);

            binding.recvHr.setAdapter(adapter);
            binding.recvHr.setLayoutManager(new LinearLayoutManager(getContext()));

        });
    }
}