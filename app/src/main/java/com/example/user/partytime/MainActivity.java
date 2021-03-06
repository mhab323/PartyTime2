package com.example.user.partytime;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Movie;
import android.graphics.drawable.AnimationDrawable;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.InputStream;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView tvPartyTime;

    Button btStart;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvPartyTime = findViewById(R.id.tvPartyTime);

        btStart = findViewById(R.id.btStart);
        btStart.setOnClickListener(this);

        Intent i = new Intent(this,MusicServiec.class);
        startService(i);

//       MediaPlayer bdsong = MediaPlayer.create(MainActivity.this,R.raw.bdsong);
//
//        bdsong.start();


    }


    @Override
    /**
     * this method opens another activity after clicking on button.
     */
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btStart: {
                Intent tent = new Intent(this, LogInorSignup.class);
                Toast.makeText(getApplicationContext(), "Button is clicked", Toast.LENGTH_LONG).show();
                startActivity(tent);

            }
        }


    }
}
