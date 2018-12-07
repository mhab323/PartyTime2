package com.example.user.partytime;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class home extends AppCompatActivity implements View.OnClickListener {

    TextView tvHome;

    Button btItemList, btGuestsList, btBDplaces,btBack2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        tvHome = findViewById(R.id.tvHome);

        btItemList = findViewById(R.id.btItemList);
        btItemList.setOnClickListener(this);
        btGuestsList = findViewById(R.id.btGuestsList);
        btGuestsList.setOnClickListener(this);
        btBDplaces = findViewById(R.id.btBDplaces);
        btBDplaces.setOnClickListener(this);
        btBack2 = findViewById(R.id.btBack2);
        btBack2.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btItemList:
                Intent i = new Intent(this, BdList.class);
                Toast.makeText(getApplicationContext(), "Button is clicked", Toast.LENGTH_LONG).show();
                startActivity(i);
                break;
            case R.id.btGuestsList:
                Intent i2 = new Intent(this, GuestsList.class);
                Toast.makeText(getApplicationContext(), "Button is clicked", Toast.LENGTH_LONG).show();
                startActivity(i2);
                break;
            case R.id.btBDplaces:
                Intent i3 = new Intent(this, Places.class);
                Toast.makeText(getApplicationContext(), "Button is clicked", Toast.LENGTH_LONG).show();
                startActivity(i3);
                break;
            case R.id.btBack:
                Intent i4 = new Intent(this, addParty.class);
                Toast.makeText(getApplicationContext(), "Button is clicked", Toast.LENGTH_LONG).show();
                startActivity(i4);
                break;
            default:
                break;


        }
    }
}
