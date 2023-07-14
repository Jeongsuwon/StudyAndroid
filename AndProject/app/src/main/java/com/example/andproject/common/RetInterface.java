package com.example.andproject.common;

import java.util.HashMap;

import retrofit2.Call;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import retrofit2.http.Url;

public interface RetInterface {

    @FormUrlEncoded
    @POST
    Call<String> postRet(@Url String url, @FieldMap HashMap<String, Object> paramMap);
}
