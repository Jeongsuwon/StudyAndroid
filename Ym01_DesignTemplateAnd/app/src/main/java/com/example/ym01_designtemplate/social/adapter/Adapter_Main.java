package com.example.ym01_designtemplate.social.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.ym01_designtemplate.R;
import com.example.ym01_designtemplate.social.customui.CenterZoomLayoutManager;
import com.example.ym01_designtemplate.social.dto.PostDTO;
import com.example.ym01_designtemplate.social.dto.StoriesDTO;

import java.util.ArrayList;

public class Adapter_Main extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    ArrayList<PostDTO> list;
    private Context mContext;

    private static final int TYPE_POST = 0;
    private static final int TYPE_LIST = 2;

    public Adapter_Main(Context context, ArrayList<PostDTO> data) {
        this.list = data;
        mContext = context;
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        RecyclerView.ViewHolder viewHolder = null;

        switch (viewType) {
            case TYPE_POST:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_post, parent, false);
                viewHolder = new ViewHolderPost(view);
                break;
            case TYPE_LIST:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
                viewHolder = new ViewHolderList(view ,mContext);
                break;
        }
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        PostDTO post = list.get(position);
        setFadeAnimation(holder.itemView);

        switch (holder.getItemViewType()) {
            case TYPE_POST:
                ViewHolderPost viewHolderPost = (ViewHolderPost) holder;
                Glide.with(mContext).load(post.getImage()).into(viewHolderPost.imageView);
                if(isOddNumber(position)){
                    Glide.with(mContext).load(R.drawable.ic_favorite_heart).into(viewHolderPost.like);
                }
                break;

            case TYPE_LIST:
                ViewHolderList viewHolderList = (ViewHolderList) holder;
                break;
        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    @Override
    public int getItemViewType(int position) {

        if (list.get(position).getType() == TYPE_POST) {
            return TYPE_POST;
        } else if (list.get(position).getType() == TYPE_LIST) {
            return TYPE_LIST;
        } else {
            return -1;
        }
    }
    public void setFadeAnimation(View view) {
        AlphaAnimation anim = new AlphaAnimation(0.0f, 1.0f);
        anim.setDuration(500);
        view.startAnimation(anim);
    }

    public boolean isOddNumber(int num) {
        return (num & 1) != 0;
    }






    public class ViewHolderPost extends RecyclerView.ViewHolder {

        public ImageView imageView , like;

        public ViewHolderPost(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.post_iv);
            like = itemView.findViewById(R.id.like);
        }
    }





    public class ViewHolderList extends RecyclerView.ViewHolder {

        private RecyclerView recyclerView;
        CenterZoomLayoutManager centerZoomLayoutManager;
        LinearSnapHelper snapHelper;

        public ViewHolderList(@NonNull View itemView, Context mContext) {
            super(itemView);
            recyclerView = itemView.findViewById(R.id.RecyclerView);
            recyclerView.setHasFixedSize(true);
            recyclerView.setNestedScrollingEnabled(false);
            recyclerView.setFocusable(false);
            centerZoomLayoutManager = new CenterZoomLayoutManager(mContext, RecyclerView.HORIZONTAL, false);
            recyclerView.setLayoutManager(centerZoomLayoutManager);
            snapHelper = new LinearSnapHelper();
            snapHelper.attachToRecyclerView(recyclerView);
            recyclerView.setOnFlingListener(snapHelper);
            Adapter_list ad_list = new Adapter_list(getData(), mContext);
            recyclerView.setAdapter(ad_list);
            recyclerView.smoothScrollToPosition(1);

        }


        private ArrayList<StoriesDTO> getData() {
            ArrayList<StoriesDTO> arrayList = new ArrayList<>();
            arrayList.add(new StoriesDTO("https://yt3.ggpht.com/bIHY6TDWPd-5ni8rGLBIry1dNNUW1YrOsmhvEyFf2CrOFrsYRIhdOLm8ODLlyhBpyC7wfYbgQbw=s900-c-k-c0xffffffff-no-rj-mo", "123"));
            arrayList.add(new StoriesDTO("https://cdn.vox-cdn.com/thumbor/hJq_hq_GDsldfqsPJJIw8xJX-rA=/0x354:1064x1166/1200x800/filters:focal(376x510:546x680)/cdn.vox-cdn.com/uploads/chorus_image/image/56956201/2x3__25_.0.png", "123"));
            arrayList.add(new StoriesDTO("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQQJqNY9tNsNMOq2rZ4VTVh_rw_7Bi7QgpLyA1ZDCKzoaROy-Et", "456"));
            arrayList.add(new StoriesDTO("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRcai8fsvjYdJiUs4bTNVoCJxwrI1ULzZc8CuFkZQu9JaIpPlZE", "789"));
            arrayList.add(new StoriesDTO("https://cdn.animenewsnetwork.com/thumbnails/max400x400/cms/news.3/150796/vegmovie.jpg", "1011"));
            arrayList.add(new StoriesDTO("https://avatarfiles.alphacoders.com/752/75205.png", "1213"));
            arrayList.add(new StoriesDTO("https://displate.com/displates/2015-06-24/ccd7b20be2db6f02da7886f7bc9fb423.jpg?w=280", "11545"));
            return arrayList;
        }
    }


}
