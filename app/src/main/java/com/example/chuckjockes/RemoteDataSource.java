package com.example.chuckjockes;

import android.util.Log;

import com.example.chuckjockes.data.entities.Root;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RemoteDataSource {

    private JokeService jokeService;

    public RemoteDataSource(){
        Retrofit retrofit= new Retrofit.Builder()
                .baseUrl("http://api.icndb.com")
                .addConverterFactory(GsonConverterFactory.create())
                //.client(client)
                .build();
        jokeService = retrofit.create(JokeService.class);
    }

    public Root getJoke(){
        Call<Root> call=jokeService.getJoke();
        try {
            Response<Root> response = call.execute();
            if (response.isSuccessful()) {
                return response.body();
            }
        }catch(IOException ioex){
            Log.e("Remote",""+ioex);

            //return null;
        }
        return null;
    }


}
