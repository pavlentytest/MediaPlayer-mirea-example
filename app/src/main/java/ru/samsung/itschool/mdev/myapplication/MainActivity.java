package ru.samsung.itschool.mdev.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void doPlay(View v) {

        switch(v.getId()) {
            case R.id.button:
                if(mp == null) {
                    mp = MediaPlayer.create(this,R.raw.canon);
                    mp.start();
                } else {
                    if(mp.isPlaying()) {
                        mp.pause();
                    } else {
                        mp.start();
                    }
                }
                break;
            case R.id.button2: // stop
                mp.stop();
                //mp.release(); // освобожд. память.
                mp = null;
                break;
        }
    }
}