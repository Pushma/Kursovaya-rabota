package com.example.chuckjockes;

import android.content.Context;
import android.util.Log;

import androidx.lifecycle.LiveData;

import com.example.chuckjockes.data.entities.JokeEntity;

import java.util.List;
import java.util.concurrent.Executors;

public class Repository {
    private LocalDataSource localDataSource;
    private RemoteDataSource remoteDataSource;
    public Repository (Context context){
        localDataSource = new LocalDataSource(context);
        remoteDataSource = new RemoteDataSource();
    }
    public LiveData<JokeEntity> getJokeData(){

        Executors.newSingleThreadExecutor().execute(new Runnable() {
            @Override
            public void run() {
                localDataSource.storeWeatherForDay(remoteDataSource.getJoke());
            }
        } );
        return localDataSource.getWeatherforDay();
    }
}
