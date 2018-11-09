package com.example.user.partytime;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class BirthdayPlaces extends AppCompatActivity implements View.OnClickListener{

    TextView tvPlaces;

    ImageView ivPlaces;

    Button btPlaces;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birthday_places);

        tvPlaces = findViewById(R.id.tvPlaces);

        ivPlaces = findViewById(R.id.ivPlaces);

        btPlaces = findViewById(R.id.btPlaces);
        btPlaces.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v ==btPlaces){
            Intent intent = new Intent(this,Places.class);
            startActivity(intent);
        }

    }
}
