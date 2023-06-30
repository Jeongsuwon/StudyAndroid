package com.example.project01_jswtalk.exam;

import android.view.View;

import androidx.annotation.NonNull;

public class JswAdapterParent {

    public abstract static class JswAdapter<JSW extends JswViewHolder>{
//        public abstract JSW onCreateViewHolder;
    }


    public abstract static class JswViewHolder{
        //디자인 파일을 묶어놓은 객체 --> View
        @NonNull
        final View view; /*상수의 규칙 (1. 상수를 선언과 동시에 값 할당 --> 초기화 해놓는 방법)
                                        2. 생성자를 이용해서 초기화*/

        protected JswViewHolder(@NonNull View view) {
            this.view = view;
        }
    }
}
