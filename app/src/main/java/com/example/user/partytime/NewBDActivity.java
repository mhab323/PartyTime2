package com.example.user.partytime;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.Image;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class NewBDActivity extends AppCompatActivity implements View.OnClickListener {
    Bitmap photo;
    private static final int CAMERA_REQUEST = 0;

    TextView tvNewItem;

    EditText ItemName;

    Button btDone;

    ImageView imageView;
    ImageButton btGallery, btTakephoto;

    Bitmap bitmap;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_bd);

        tvNewItem = findViewById(R.id.tvNewItem);

        ItemName = findViewById(R.id.ItemName);

        btDone = findViewById(R.id.btDone);

        btDone.setOnClickListener(this);

        btGallery = findViewById(R.id.btGallery);
        btGallery.setOnClickListener(this);

        btTakephoto = findViewById(R.id.btTakephoto);
        btTakephoto.setOnClickListener(this);

        imageView= findViewById(R.id.imageView);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btDone:
                Intent i = new Intent(this, BdList.class);
           /*     BirthDay item = new BirthDay(photo, ItemName.getText().toString());
                i.putExtra("item", item);
           */     Toast.makeText(getApplicationContext(), "Button is clicked", Toast.LENGTH_LONG).show();
                startActivity(i);
                break;

        }

        if(v == btTakephoto){
            Intent i = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            startActivityForResult(i,CAMERA_REQUEST);

        }
    }

    public void onActivityResult(int requestCode,int resultCode,Intent data){
        if(requestCode == CAMERA_REQUEST && resultCode== Activity.RESULT_OK){
            photo = (Bitmap) data.getExtras().get("data");
            imageView.setImageBitmap(photo);
        }
    }

}