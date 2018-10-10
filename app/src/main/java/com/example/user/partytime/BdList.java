package com.example.user.partytime;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class BdList extends AppCompatActivity {

    ImageButton addItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bd_list);

        addItem=(ImageButton) findViewById(R.id.addItem);
        addItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Button is clicked",Toast.LENGTH_LONG).show();
                switch (v.getId()) {
                    case R.id.addItem:
                        Intent i = new Intent(getApplicationContext(),NewBDActivity.class);
                        startActivity(i);
                        break;
                    default:
                        break;

                }


            }
        });
    }
}
