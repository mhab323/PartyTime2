package com.example.user.partytime;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Bowling extends AppCompatActivity implements View.OnClickListener {
    TextView tvBowling,textView7;

    ImageView imageView6;

    Button btUrl4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bowling);

        tvBowling = findViewById(R.id.tvBowling);
        textView7 = findViewById(R.id.textView7);

        imageView6 = findViewById(R.id.imageView6);

        btUrl4 = findViewById(R.id.btUrl4);
        btUrl4.setOnClickListener(this);
    }

    @Override/**
 this method opens browser after clicking on button.
 **/
    public void onClick(View v) {
        if(v == btUrl4){
            String url = "http://www.bola.co.il/Info.aspx?ContentTypeID=1&ContentID=54";
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse(url));
            startActivity(intent);
        }

    }
}
