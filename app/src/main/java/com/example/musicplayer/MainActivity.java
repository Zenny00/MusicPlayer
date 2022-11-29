package com.example.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private MediaPlayer mp;
    private Button play;
    private Button pause;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Setup new media player
        mp = MediaPlayer.create(this, R.raw.cow_moo);

        //Get references to screen buttons
        play = (Button) findViewById(R.id.play_button);
        pause = (Button) findViewById(R.id.pause_button);

        //Add action listeners to buttons
        play.setOnClickListener(playSound);
        pause.setOnClickListener(pauseSound);
    }

    //Play button listener
    private final View.OnClickListener playSound = new View.OnClickListener() {
        @Override
        //Logic for button press
        public void onClick(View view) {
            mp.start();
        }
    };

    //Pause button listener
    private final View.OnClickListener pauseSound = new View.OnClickListener() {
        @Override
        //Logic for button press
        public void onClick(View view) {
            mp.pause();
        }
    };
}