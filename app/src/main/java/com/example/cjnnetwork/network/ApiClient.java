package com.example.cjnnetwork.network;

import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class ApiClient {
    private static Retrofit retrofit = null;

    /*Gson gson = new GsonBuilder()
            .setLenient()
            .create();*/


    public static Retrofit getClient() {
        if (retrofit==null) {

            Gson gson = new GsonBuilder()
                    .setLenient()
                    .create();
            retrofit = new Retrofit.Builder()
                    .baseUrl(WebserviceConstants.HTTP_BASE_URL+WebserviceConstants.SMART_COOKIE_STUDNET_BASE_URL)
                   // .baseUrl("https://dev.smartcookie.in/")
                    //.baseUrl("https://test.smartcookie.in/")
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .build();
        }
        Log.i("BAseUrl", WebserviceConstants.HTTP_BASE_URL+WebserviceConstants.SMART_COOKIE_STUDNET_BASE_URL);
        return retrofit;
    }
}
