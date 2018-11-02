package com.example.user.partytime;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.ArrayList;

public class BdList extends AppCompatActivity implements View.OnClickListener {

    ImageButton addItem;
    CustomAdapter adapter;
    ArrayList<BirthDay> BirthDay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bd_list);

        addItem = findViewById(R.id.addItem);
        addItem.setOnClickListener(this);

        BirthDay= new ArrayList<>();

        BirthDay.add(new BirthDay("15.7",R.drawable.bg));
        BirthDay.add(new BirthDay("sada",R.drawable.th2));
        BirthDay.add(new BirthDay("adsd",R.drawable.th4));
        BirthDay.add(new BirthDay("aasds",R.drawable.bg));



                adapter = new CustomAdapter(this,R.layout.custom_row,BirthDay);


            }

    @Override
    public void onClick(View v) {


                switch (v.getId()) {
                    case R.id.addItem:
                        Intent i = new Intent(getApplicationContext(),NewBDActivity.class);
                        Toast.makeText(getApplicationContext(),"Button is clicked",Toast.LENGTH_LONG).show();
                        startActivity(i);
                        break;
                    default:
                        break;

                }
    }
}


