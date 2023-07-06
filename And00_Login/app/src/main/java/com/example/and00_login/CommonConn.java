package com.example.and00_login;

import android.app.ProgressDialog;
import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import java.util.HashMap;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;


public class CommonConn {
    //Retrofit을 매 번 새로 인스턴스화해서 사용하는 것은 매우 귀찮음.
    //재사용이 가능한 구조를 하나 만들고 재사용하면 편함.
    private final String TAG = "CommonConn";
    private ProgressDialog dialog; // 모양이 다양하게 커스텀 가능 나중에 바꾸면 된다.
    private HashMap<String, Object> paramMap; //파라미터 전송용
    private Context context; // 화면 위에 토스트, ProgressDialog를 보여주기 위한 용도

    private String mapping; //list.cu, login, member 등의 맵핑을 받아오기 위한 것

    private JswCallBack callBack;

    public CommonConn(Context context, String mapping) {
        this.context = context;
        this.mapping = mapping;
        this.paramMap = new HashMap<>();
    }

    public void addParamMap(String key, Object value){
        if(key == null){
            Log.e(TAG, "파라미터 key 값이 null이 들어와서 추가 안했음.");
        }else if(value == null){
            Log.e(TAG, "파라미터 value 값이 null이 들어와서 추가 안했음.<- 경우에 따라서 커스텀 해야함.");
        }else{
            paramMap.put(key, value);
        }
    }

    //enque( 전송 실행 전 해야할 코드를 넣어줄 메소드 구현, (ProgressDialog보이게 처리))
    private void onPreExcute(){
        if(context != null && dialog == null){
            dialog = new ProgressDialog(context);
            dialog.setProgress(ProgressDialog.STYLE_SPINNER);
            dialog.setTitle("Common");
            dialog.setMessage("로딩중입니다.");
            dialog.setCancelable(false);
            dialog.show();
        }
    }

    //실제 enque가 되어야 하는 부분 (파라미터 등을 이용해서 실제로 Spring에 전송한다.)↑
    public void onExcute(JswCallBack callBack){
        onPreExcute();

        //옵저버 패턴 2번
        this.callBack = callBack;
        RetInterface api = new RetClient().getRet().create(RetInterface.class);
        //Get방식인지 Post방식인지를 받고와서 처리도 가능하다. (현재는 어려우니까 Post로 고정시켜놓기)
        api.postRet(mapping, paramMap).enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                Log.d(TAG, "onResponse: " + response.body());
                onPostExcute(true, response.body());
            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {
                Log.d(TAG, "onFailure: " + t.getMessage());
                Toast.makeText(context, "서버와의 연결에 실패했습니다.", Toast.LENGTH_SHORT).show();
                onPostExcute(false, null);
            }
        });
    }
    private void onPostExcute(boolean isResult, String data){
        if(dialog != null){
            dialog.dismiss();
        }
        //옵저버 패턴 3번
    callBack.onResult(isResult, data);
    }


    //옵저버 패턴 -> 감시하다가 어떤 작업이 끝나면 특정 메소드를 실행 : View.OnClickListener

    //옵저버 패턴 1번
    public interface JswCallBack{
        public void  onResult(boolean isResult, String data);
    }

}
