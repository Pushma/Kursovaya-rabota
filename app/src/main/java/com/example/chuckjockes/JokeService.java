package com.example.chuckjockes;

import com.example.chuckjockes.data.entities.Root;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface JokeService {
    @GET("/jokes/random")
    Call<Root> getJoke();

}
