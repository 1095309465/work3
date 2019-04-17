package com.example.myapplication;

import com.example.myapplication.module.BaseResponse;
import com.example.myapplication.module.Demo;
import com.example.myapplication.utils.Constans;

import java.util.Map;

import io.reactivex.Observable;
import okhttp3.ResponseBody;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ApiService {

    @GET("mobile/get?")
    Observable<CityBean> getCityBean(@Query("phone")String phone, @Query("key")String key);
    @FormUrlEncoded
    @POST("mobile/get")
    Observable<ResponseBody> postFile(@Field("phone") String phone,@Field("key")String key);

    @FormUrlEncoded
    @POST("mobile/get")
    Observable<ResponseBody>  postFile(@FieldMap Map<String,String> map);

    @POST(Constans.retrofit)
    Observable<BaseResponse<Demo>>  getRetrofit();
}
