package com.example.user.partytime;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class NewBDActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tvNewItem;

    EditText ItemName;

    Button btDone;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_bd);

        tvNewItem = findViewById(R.id.tvNewItem);

        ItemName = findViewById(R.id.ItemName);

        btDone = findViewById(R.id.btDone);

        btDone.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btDone:
                Intent i = new Intent(this, BdList.class);
                startActivity(i);
                break;

        }
    }
}