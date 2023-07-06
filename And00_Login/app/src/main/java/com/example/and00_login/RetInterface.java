package com.example.and00_login;

import java.util.HashMap;

import retrofit2.Call;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;
import retrofit2.http.Url;

public interface RetInterface {

    @GET("{mapping}")
    Call<String> getRet(@Path("mapping")String mapping, @QueryMap HashMap<String, Object> paramMap);

    @FormUrlEncoded
    @POST
    Call<String> postRet(@Url String url, @FieldMap HashMap<String, Object> paramMap);

}
