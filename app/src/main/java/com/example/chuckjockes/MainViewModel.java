package com.example.chuckjockes;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.chuckjockes.data.entities.JokeEntity;

import java.util.List;

public class MainViewModel extends ViewModel {

    private Repository repository;
    LiveData<JokeEntity> jokeData;//list

    public void loadData(Repository repository){
        this.repository = repository;
        if(jokeData==null){
            //repository= new Repository(context);
            jokeData=repository.getJokeData();
        }


    }
    public LiveData<JokeEntity> getJokeData(){
        return jokeData;
    }


    //public void getDataByCity(String city){
    //weatherData = repository.getWeatherForCity(city);
    //}
}
