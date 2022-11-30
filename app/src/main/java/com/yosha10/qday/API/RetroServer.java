package com.yosha10.qday.API;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetroServer {
    private static final String baseURL = "https://type.fit/api/"; // Link Base URL API
    private static Retrofit retro;

    public static Retrofit connectRetrofit(){
        if (retro == null){
            retro = new Retrofit.Builder()
                    .baseUrl(baseURL)
                    .addConverterFactory(GsonConverterFactory.create()) // Mengconvert data JSON dari API menjadi bentuk RAW
                    .build();
        }
        return retro;
    }
}
