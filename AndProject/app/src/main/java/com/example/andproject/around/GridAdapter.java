package com.example.andproject.around;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.andproject.R;
import com.example.andproject.databinding.ItemGenreGridBinding;
import com.example.andproject.home.GenreDTO;

import java.util.ArrayList;

public class GridAdapter extends BaseAdapter {

    ItemGenreGridBinding binding;
    ArrayList<GenreDTO> list;
    Context context;

    public GridAdapter(ArrayList<GenreDTO> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        return null;
    }

}
