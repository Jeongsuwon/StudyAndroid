package com.example.ym01_designtemplate.social.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.ym01_designtemplate.R;
import com.example.ym01_designtemplate.social.dto.SearchDTO;

import java.util.ArrayList;

public class Adapter_Search extends RecyclerView.Adapter<Adapter_Search.ViewHolderSearch> {

    Context mContext;
    ArrayList<SearchDTO> arrayList;

    public Adapter_Search(Context context, ArrayList<SearchDTO> getdata) {
        mContext = context;
        arrayList = getdata;
    }

    @NonNull
    @Override
    public ViewHolderSearch onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_search, parent, false);
        return new ViewHolderSearch(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderSearch holder, int position) {
        setFadeAnimation(holder.itemView);
        SearchDTO search = arrayList.get(position);
        holder.text_name.setText(search.getName());
        Glide.with(mContext).load(search.getProfileImage()).into(holder.profileImage);

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public void setFadeAnimation(View view) {
        AlphaAnimation anim = new AlphaAnimation(0.0f, 1.0f);
        anim.setDuration(500);
        view.startAnimation(anim);
    }


    public class ViewHolderSearch extends RecyclerView.ViewHolder {

        public ImageView profileImage;
        public TextView text_name;

        public ViewHolderSearch(@NonNull View itemView) {
            super(itemView);
            profileImage = itemView.findViewById(R.id.profileImage);
            text_name = itemView.findViewById(R.id.User_Name);
        }
    }
}
