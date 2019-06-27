package com.example.chuckjockes.data;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.chuckjockes.data.entities.JokeEntity;

@Database(entities = {JokeEntity.class},version = 1)
public abstract class JokeDB extends RoomDatabase {
    public abstract JokeDao weatherDao();
}
