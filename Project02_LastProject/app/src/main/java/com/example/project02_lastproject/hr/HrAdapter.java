package com.example.project02_lastproject.hr;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project02_lastproject.customer.RecvAdapter;
import com.example.project02_lastproject.databinding.ItemRecvCustomerBinding;
import com.example.project02_lastproject.databinding.ItemRecvHrBinding;

import java.util.ArrayList;

public class HrAdapter extends RecyclerView.Adapter<HrAdapter.ViewHolder> {

    ArrayList<EmployeesVO> list;

    public HrAdapter(ArrayList<EmployeesVO> list) {
        this.list = list;
    }

    Context context;
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        ItemRecvHrBinding binding = ItemRecvHrBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder h, int i) {
        h.binding.tvId.setText(list.get(i).getEmployee_id()+"");
        h.binding.tvName.setText(list.get(i).getEmp_name());
        h.binding.tvEmail.setText(list.get(i).getEmail());
        h.binding.tvDname.setText(list.get(i).getDepartment_name());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ItemRecvHrBinding binding;
        public ViewHolder(@NonNull ItemRecvHrBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
