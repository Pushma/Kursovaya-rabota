package com.example.chuckjockes.data;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.example.chuckjockes.data.entities.JokeEntity;

@Dao
public interface JokeDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public void insertJoke(JokeEntity jokeEntity);

    @Update
    public void update(JokeEntity jokeEntity);

    @Delete
    public void delete(JokeEntity jokeEntity);

    @Query("DELETE FROM joke")
    public void clearDB();
    @Query("SELECT * FROM joke")
    LiveData<JokeEntity> getJoke();
}
