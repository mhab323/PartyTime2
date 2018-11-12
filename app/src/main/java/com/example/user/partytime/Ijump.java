package com.example.user.partytime;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Ijump extends AppCompatActivity implements View.OnClickListener {

    TextView tvIjump, textView5;

    ImageView imageView3;

    Button btUrl;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ijump);

        tvIjump= findViewById(R.id.tvIjump);
        textView5 = findViewById(R.id.textView5);

        imageView3 = findViewById(R.id.imageView3);

        btUrl = findViewById(R.id.btUrl);
        btUrl.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v == btUrl){
            String url = "http://www.ijump.co.il/";
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse(url));
            startActivity(intent);
        }



    }
}
