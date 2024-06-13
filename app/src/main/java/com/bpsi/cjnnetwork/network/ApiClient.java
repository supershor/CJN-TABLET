package com.bpsi.cjnnetwork.network;

import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class ApiClient {
    private static Retrofit retrofit = null;
    private static final String API_KEY = "987654321";


    /*Gson gson = new GsonBuilder()
            .setLenient()
            .create();*/


    public static Retrofit getClient() {
        if (retrofit==null) {

            Gson gson = new GsonBuilder()
                    .setLenient()
                    .create();

            Interceptor apiKeyInterceptor = chain -> {
                Request originalRequest = chain.request();
                Request newRequest = originalRequest.newBuilder()
                        .header("apikey", API_KEY)
                        .build();
                return chain.proceed(newRequest);
            };

            // Build OkHttpClient with the Interceptor
            OkHttpClient okHttpClient = new OkHttpClient.Builder()
                    .addInterceptor(apiKeyInterceptor)
                    .build();
            retrofit = new Retrofit.Builder()
                    .baseUrl(WebserviceConstants.HTTP_BASE_URL+WebserviceConstants.SMART_COOKIE_STUDNET_BASE_URL)
                   // .baseUrl("https://dev.smartcookie.in/")
                    //.baseUrl("https://test.smartcookie.in/")
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .client(okHttpClient)
                    .build();
        }
        Log.i("BAseUrl", WebserviceConstants.HTTP_BASE_URL+WebserviceConstants.SMART_COOKIE_STUDNET_BASE_URL);
        return retrofit;
    }
}
