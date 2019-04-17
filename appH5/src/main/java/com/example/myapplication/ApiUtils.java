package com.example.myapplication;


import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiUtils {

    private static ApiService apiService;

    private ApiUtils() {
    }

    public static ApiService newInstance() {
        if (apiService == null) {
            Retrofit retrofit = new Retrofit.Builder()
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .baseUrl(Colltion.BaseUrl)
                    .build();

            apiService = retrofit.create(ApiService.class);

        }

        return apiService;

    }

}
