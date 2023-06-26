package com.example.project01_jswtalk.friend;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project01_jswtalk.MainActivity;
import com.example.project01_jswtalk.databinding.ItemFriendRecvBinding;

import java.util.ArrayList;

//2. 만들어놓은 ViewHolder를 이용해서 어댑터 상속받기
public class FriendAdapter extends RecyclerView.Adapter<FriendAdapter.ViewHolder> {

    ItemFriendRecvBinding binding;
    ArrayList<FriendDTO> list;

    Context context;

    public FriendAdapter(ArrayList<FriendDTO> list, Context context) {
        this.list = list;
        this.context = context;
    }




    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        LayoutInflater inflater = (LayoutInflater) parent.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        binding = ItemFriendRecvBinding.inflate(inflater, parent, false);
        return new ViewHolder(binding);
    }
    //리사이클러뷰의 칸마다의 데이터 연결이나 이벤트 연결을 하는 메소드.
    @Override
    public void onBindViewHolder(@NonNull ViewHolder h, int i) {
        h.binding.imgvProfile.setImageResource(list.get(i).getResImgId());
        h.binding.tvName.setText(list.get(i).getName());
        h.binding.lnFriend.setOnClickListener(v->{

            Intent intent = new Intent(context, FriendDetailActivity.class);
            //인텐트 객체를 통해서 선택된 아이템을 -> FriendDetailActivity로 전송해보기

            //Web(Customer List화면 아이템 하나 클릭): web에서의 id와 db의 id가 일치하면 그 id의 list를 보여준다.


            intent.putExtra("dto", list.get(i));
            context.startActivity(intent);
        });

        String[] dialogItems = { "즐겨찾기에 추가", "이름 변경", "숨김", "차단"};

        h.binding.lnFriend.setOnLongClickListener(v -> {
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setTitle(list.get(i).getName());//제목 부분
            builder.setItems(dialogItems, ((dialog, idx) -> {
                if(dialogItems[idx].equals("차단")){
                    list.remove(i);

                    //adapter에 있는 메소드 notifyDataSetChanged(); <= 내부에 있는 리스트가 바뀌면 바뀌었다는 것을 어댑터에 전달하고 어댑터는 내용을 다시 그린다.
                    notifyDataSetChanged();
                    dialog.dismiss(); // 다이얼로그를 안 보이게 처리.


                }
            }));

            builder.create().show();

            return true;
        } );
    }

    @Override
    public int getItemCount() {
        return 10;
    }

    //1. 위젯들을 묶어서 저장해놓을 객체 ViewHolder

    public class ViewHolder extends RecyclerView.ViewHolder {
        ItemFriendRecvBinding binding;
        public ViewHolder(@NonNull ItemFriendRecvBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
