package com.example.andproject.home;

import android.app.Dialog;
import android.content.Context;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;

import com.example.andproject.R;
import com.example.andproject.common.CommonConn;

public class FloDialog extends Dialog {
    public FloDialog(@NonNull Context context, FloVO floVO) {
        super(context);
        setContentView(R.layout.activity_register);
        EditText edt_id = findViewById(R.id.edt_id);
        EditText edt_name = findViewById(R.id.edt_name);
        EditText edt_pw = findViewById(R.id.edt_password);
        EditText edt_phone = findViewById(R.id.edt_phone);
        Button btn_register = findViewById(R.id.btn_register);
        if(floVO == null){
            btn_register.setOnClickListener(v -> {
                CommonConn conn = new CommonConn(getContext(), "insert");
                conn.addParamMap("id", edt_id.getText().toString());
                conn.addParamMap("password", edt_pw.getText().toString());
                conn.addParamMap("name", edt_name.getText().toString());
                conn.addParamMap("phone", edt_phone.getText().toString());
                conn.onExcute((isResult, data) ->  {
                    Toast.makeText(context, edt_id + "회원가입이 완료되었습니다.", Toast.LENGTH_SHORT).show();
                });
                dismiss(); //show() / dismiss()
            });
//        }else{
//            btn_register.setText("수정하기");
//            edt_name.setText(customerVO.getName());
//            edt_email.setText(customerVO.getEmail());
//            edt_phone.setText(customerVO.getPhone());
//
//
//            btn_submit.setOnClickListener(v -> {
//                //Insert처리를 해주면 됨.
//                CommonConn conn = new CommonConn(getContext(), "update.cu");
//                conn.addParamMap("name", edt_name.getText().toString());
//                conn.addParamMap("email", edt_email.getText().toString());
//                conn.addParamMap("phone", edt_phone.getText().toString());
//                conn.onExcute((isResult, data) ->  {
//
//                });
//                dismiss(); //show() / dismiss()
//            });

        }

    }
}
