package com.example.project01_jswtalk.exam;

import android.view.View;

import androidx.annotation.NonNull;

public class JswAdapter extends JswAdapterParent.JswAdapter<JswAdapter.ViewHoler>{

    public class ViewHoler extends JswAdapterParent.JswViewHolder{

        protected ViewHoler(@NonNull View view) {
            super(view);
        }
    }
}
