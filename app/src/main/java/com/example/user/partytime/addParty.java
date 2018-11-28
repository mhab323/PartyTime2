package com.example.user.partytime;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.Map;

public class addParty extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemClickListener, DialogInterface.OnClickListener{
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

        addItem2 = findViewById(R.id.addItem2);
        addItem2.setOnClickListener(this);

        Birthday2= new ArrayList<>();

        lvParties = findViewById(R.id.lvParties);
        adapter2 = new BirthdayCustomAdapter(this,R.layout.custom_row2,Birthday2);
        lvParties.setAdapter(adapter2);
        lvParties.setOnItemClickListener(this);

        myRef.addChildEventListener(new ChildEventListener() {

            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                Map<String, String> map = (Map<String, String>) dataSnapshot.getValue();
                String date = map.get("date");
                String name = map.get("name");
                String place = map.get("place");
                Birthday2.add(new BirthDay(name, date, place));
                adapter2.notifyDataSetChanged();

            }
            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });


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

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            BirthDay birthDay = Birthday2.get(position);
            Intent i = new Intent(addParty.this, PartyDetailsActivity.class);
            i.putExtra("birthday", birthDay);
            startActivity(i);
    }
    @Override
    public void onClick(DialogInterface dialog, int which) {
        if(which==dialog.BUTTON_POSITIVE){
            super.onBackPressed();
            dialog.cancel();
        }
        if(which==dialog.BUTTON_NEGATIVE){
            dialog.cancel();
        }
    }

    @Override
    public void onBackPressed(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Are you sure?");
        builder.setCancelable(false);
        builder.setPositiveButton("Yes",this);
        builder.setNegativeButton("No",this);
        AlertDialog dialog=builder.create();
        dialog.show();


    }
}
