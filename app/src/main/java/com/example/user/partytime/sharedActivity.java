package com.example.user.partytime;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class sharedActivity extends AppCompatActivity implements View.OnClickListener {

    EditText etName;

    Button btSave2;

    TextView tvName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared);

        etName = findViewById(R.id.etName);

        btSave2 = findViewById(R.id.btSave2);
        btSave2.setOnClickListener(this);
        //in case shared prefrences dosen't contain keyworf "name" null is returned
        tvName = findViewById(R.id.tvName);
        SharedPreferences pref = getSharedPreferences("myPref",MODE_PRIVATE);

        String name = pref.getString("name",null);

        if(name !=null){

            tvName.setText(name);
        }
    }


    @Override
    /**
     * this method share child with firebase
     */
    public void onClick(View v) {
        SharedPreferences pref = getSharedPreferences("myPref",MODE_PRIVATE);
        //open the file for editing
        SharedPreferences.Editor editor = pref.edit();
        //Keyword , value format of values to be saved in the sharedprefrences
        //can be several values
        editor.putString("name",etName.getText().toString());

        editor.commit();


    }
}
