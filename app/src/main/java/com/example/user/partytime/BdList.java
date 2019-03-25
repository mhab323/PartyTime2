package com.example.user.partytime;

import android.app.AlertDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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

public class  BdList extends AppCompatActivity implements View.OnClickListener {

    Button btBack;

    TextView tvAddItem;

    ImageButton addItem;

    CustomAdapter adapter;
    ArrayList<Item> BirthDay;

    ListView LvBdList;

    final FirebaseDatabase database = FirebaseDatabase.getInstance();
    final DatabaseReference myRef = database.getReference().child("Birthdays");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bd_list);

        addItem = findViewById(R.id.addItem);
        addItem.setOnClickListener(this);

        BirthDay= new ArrayList<>();

        tvAddItem = findViewById(R.id.tvAddItem);

        btBack = findViewById(R.id.btBack);
        btBack.setOnClickListener(this);

        LvBdList = findViewById(R.id.LvBdList);
        adapter = new CustomAdapter(this,R.layout.custom_row,BirthDay);
        LvBdList.setAdapter(adapter);

        myRef.addChildEventListener(new ChildEventListener() {

            @Override
            /**
             * this method adds new child to the firebase with name and image
             */
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                Map<String, String> map = (Map<String, String>) dataSnapshot.getValue();
                String name = map.get("image");
                String image = map.get("name");
                BirthDay.add(new Item(name, image));
                adapter.notifyDataSetChanged();
         //       tvEmail.setText(name);
          //      tvProfession.setText(profession);
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
    /**
     * this method opens dialog interface to user after clicking on the back button
     */
    public void onClick(View v) {


        switch (v.getId()) {
            case R.id.addItem:
                Intent i = new Intent(getApplicationContext(),NewBDActivity.class);
                Toast.makeText(getApplicationContext(),"Button is clicked",Toast.LENGTH_LONG).show();
                startActivity(i);
                break;
                case R.id.btBack:
                    Intent i2 = new Intent(getApplicationContext(),home.class);
                    Toast.makeText(getApplicationContext(),"Button is clicked",Toast.LENGTH_LONG).show();
                    startActivity(i2);
                    break;
                default:
                    break;

        }
    }
}


