package com.example.chuckjockes.data.entities;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "joke")
public class JokeEntity {
    @PrimaryKey
    public Integer id;

    public String joke;
}
