package com.example.stayweeb;


import com.example.stayweeb.Anime.Anime;

import retrofit2.Call;
import retrofit2.http.GET;

public interface API_Request {
    @GET("seasons/now")
    Call<Anime> getAllData();

    @GET("top/anime")
    Call<Anime> getRankdata();
}
