package com.example.user.partytime;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Places extends AppCompatActivity implements View.OnClickListener {
    Button btIjump, btXpark, btCinema, btBowling;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places);

        btIjump = findViewById(R.id.btIjump);
        btIjump.setOnClickListener(this);
        btXpark = findViewById(R.id.btXpark);
        btXpark.setOnClickListener(this);
        btCinema = findViewById(R.id.btCinema);
        btCinema.setOnClickListener(this);
        btBowling = findViewById(R.id.btBowling);
        btBowling.setOnClickListener(this);

    }

    @Override
    /**
     *
     * this method opens another activity after clicking on button.
     */
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btIjump:
                Intent i = new Intent(this, Ijump.class);
                Toast.makeText(getApplicationContext(), "Button is clicked", Toast.LENGTH_LONG).show();
                startActivity(i);
                break;
            case R.id.btXpark:
                Intent i2 = new Intent(this, Xpark.class);
                Toast.makeText(getApplicationContext(), "Button is clicked", Toast.LENGTH_LONG).show();
                startActivity(i2);
                break;
            case R.id.btCinema:
                Intent i3 = new Intent(this, Cinema.class);
                Toast.makeText(getApplicationContext(), "Button is clicked", Toast.LENGTH_LONG).show();
                startActivity(i3);
                break;
            case R.id.btBowling:
                Intent i4 = new Intent(this, Bowling.class);
                Toast.makeText(getApplicationContext(), "Button is clicked", Toast.LENGTH_LONG).show();
                startActivity(i4);
                break;
            default:
                break;


        }
    }
}
