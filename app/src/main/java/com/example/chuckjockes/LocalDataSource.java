package com.example.chuckjockes;

import android.content.Context;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.room.Room;

import com.example.chuckjockes.data.JokeDB;
import com.example.chuckjockes.data.entities.JokeEntity;
import com.example.chuckjockes.data.entities.Root;

import java.util.ArrayList;
import java.util.List;

public class LocalDataSource {
    final JokeDB db;
    private MutableLiveData<JokeEntity> JokeData;

    public LocalDataSource(Context context){
        db= Room.databaseBuilder(context, JokeDB.class, "joke").build();
    }

    public void storeWeatherForDay(Root joke){
        int key = 1;
        String strJoke = joke.getValue().getJoke();
        JokeEntity jk = new JokeEntity();
        jk.id = key;
        jk.joke = strJoke;
        db.weatherDao().insertJoke(jk);
        //weatherData.postValue(wthrEnt);
    }


    public LiveData<JokeEntity> getWeatherforDay(){

        return db.weatherDao().getJoke();
    }

}
