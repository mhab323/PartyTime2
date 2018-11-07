package com.example.user.partytime;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.Map;

public class FireActivity extends AppCompatActivity implements View.OnClickListener {
    EditText etEmail, etPassword;

    Button btSave;

    TextView tvEmail, tvProfession;

    ListView lvUsers;
    ArrayList<String> users;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fire);
        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);

        final FirebaseDatabase database = FirebaseDatabase.getInstance();
        final DatabaseReference myRef = database.getReference().child("Users");

        btSave = findViewById(R.id.btSave);
/*
        btSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = etEmail.getText().toString();
                myRef.child("Name1").setValue(email);
                myRef.child("profession").setValue("student");
                //     myRef.child("Name1").push().setValue(email);

            }
        });
*/

        tvEmail = findViewById(R.id.tvEmail);
        tvProfession = findViewById(R.id.tvProfession);

        lvUsers = findViewById(R.id.lvUsers);
        users = new ArrayList<String>();


        final ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, users);
        lvUsers.setAdapter(adapter);

/*// Listener attached
//        myRef.addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(DataSnapshot dataSnapshot) {
//                //changes from database picture to my value
//                Map<String, String> map = (Map<String, String>) dataSnapshot.getValue();
//                String name = map.get("Name1");
//                String profession = map.get("profession");
//
//                tvEmail.setText(name);
//                tvProfession.setText(profession);
//            }
//
//            @Override
//            public void onCancelled(DatabaseError databaseError) {
//
//
//            }
//        });*/
        myRef.addChildEventListener(new ChildEventListener() {


            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                String name = dataSnapshot.getValue(String.class);
                users.add(name);
                // its like refresh to the arraylist
                adapter.notifyDataSetChanged();
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
    public void onClick (View v){


    }
}




