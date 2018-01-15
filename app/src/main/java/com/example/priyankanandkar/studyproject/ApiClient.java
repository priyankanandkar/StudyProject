package com.example.priyankanandkar.studyproject;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by priyanka.nandkar on 1/11/2018.
 */

public class ApiClient {
    //public static final String BASE_URL = "https://api.themoviedb.org/3/movie/550?api_key=0c24d3c0b5cc6045bf4f6556db164c7b";
    private static Retrofit retrofit = null;
    public static final String BASE_URL = "http://api.themoviedb.org/3/";
    public static Retrofit getClient(){
        if (retrofit == null){
            retrofit = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofit;
    }
}
