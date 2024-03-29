package com.example.chuckjockes;

import android.app.Application;

public class JokeApp extends Application {
    private Repository repository;

    @Override
    public void onCreate() {
        super.onCreate();
        repository = new Repository(this);
    }

    public Repository getRepository() {
        return repository;
    }
}
