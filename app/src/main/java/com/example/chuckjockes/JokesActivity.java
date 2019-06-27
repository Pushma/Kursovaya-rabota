package com.example.chuckjockes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.widget.TextView;

import com.example.chuckjockes.data.entities.JokeEntity;

public class JokesActivity extends AppCompatActivity implements Observer<JokeEntity> {

    LiveData<JokeEntity> jokeData;
    TextView jokeText;
    Repository repository;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jokes);
        jokeText = findViewById(R.id.jokeText);

        MainViewModel mainViewModel = ViewModelProviders.of(this).get(MainViewModel.class);
        repository=((JokeApp)getApplication()).getRepository();
        mainViewModel.loadData(repository);

        //mainViewModel.loadData(this,City);
        jokeData = mainViewModel.getJokeData();
        jokeData.observe(this,this);

    }

    @Override
    public void onChanged(JokeEntity root) {
        if (root != null) {
            jokeText.setText(""+root.joke);

        }
    }
}
