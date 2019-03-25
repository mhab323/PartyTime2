package com.example.user.partytime;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Cinema extends AppCompatActivity implements View.OnClickListener {

    TextView tvCinema,textView6;

    ImageView imageView5;

    Button btUrl3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cinema);

        tvCinema = findViewById(R.id.tvCinema);
        textView6 = findViewById(R.id.textView6);

        imageView5 = findViewById(R.id.imageView5) ;

    btUrl3= findViewById(R.id.btUrl3);
    btUrl3.setOnClickListener(this);
    }

    @Override
    /**
     * this method opens browser after clicking on button.
     */
    public void onClick(View v) {
        if(v == btUrl3){
            String url = "https://www.yesplanet.co.il/static/iw/il/birthday-in-cinemas";
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse(url));
            startActivity(intent);
        }

    }
}
