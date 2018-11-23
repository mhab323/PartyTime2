package com.example.user.partytime;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class NewBDparty extends AppCompatActivity implements View.OnClickListener {

    TextView tvNewParty;

    EditText etPartyName,etDate,etAddress;

    Button btDone2;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_bdparty);

        tvNewParty = findViewById(R.id.tvNewParty);
        etPartyName = findViewById(R.id.etPartyName);
        etDate = findViewById(R.id.etDate);
        etAddress = findViewById(R.id.etAddress);

        btDone2 = findViewById(R.id.btDone2);
        btDone2.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.btDone2:
                Intent i = new Intent(getApplicationContext(),addParty.class);
                Toast.makeText(getApplicationContext(),"Button is clicked",Toast.LENGTH_LONG).show();
                startActivity(i);
                break;
            default:
                break;

        }

    }
}
