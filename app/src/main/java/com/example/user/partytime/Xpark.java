package com.example.user.partytime;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Xpark extends AppCompatActivity implements View.OnClickListener {
    TextView tvXpark,textView4;

    ImageView imageView4;

    Button btUrl2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xpark);

        tvXpark = findViewById(R.id.tvXpark);
        textView4 = findViewById(R.id.textView4);

        imageView4 = findViewById(R.id.imageView4);

        btUrl2 = findViewById(R.id.btUrl2);
        btUrl2.setOnClickListener(this);
    }

    @Override
    /**
     * this method opens browser after clicking on button.
     */
    public void onClick(View v) {
        if(v == btUrl2){
            String url = "https://www.pex.co.il/";
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse(url));
            startActivity(intent);
        }

    }
}
