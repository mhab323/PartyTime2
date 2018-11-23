package com.example.user.partytime;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class addParty extends AppCompatActivity implements View.OnClickListener{
    TextView tvAddParty;

     ListView lvParties;

    ImageButton addItem2;

    ArrayList<BirthDay> Birthday2;
    BirthdayCustomAdapter adapter2;

    final FirebaseDatabase database = FirebaseDatabase.getInstance();
    final DatabaseReference myRef = database.getReference().child("Birthdays");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_party);

        tvAddParty = findViewById(R.id.tvAddParty);

        addItem2 = findViewById(R.id.addItem);
        addItem2.setOnClickListener(this);

        Birthday2= new ArrayList<>();

        lvParties = findViewById(R.id.LvBdList);
        adapter2 = new BirthdayCustomAdapter(this,R.layout.custom_row,Birthday2);
        lvParties.setAdapter(adapter2);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.addItem2:
                Intent i = new Intent(getApplicationContext(),NewBDparty.class);
                Toast.makeText(getApplicationContext(),"Button is clicked",Toast.LENGTH_LONG).show();
                startActivity(i);
                break;
            default:
                break;

        }

    }
}
