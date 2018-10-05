package com.example.user.partytime;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LogInScreen extends AppCompatActivity implements View.OnClickListener{
    EditText etUsernameLgin;
    EditText etPasswordLgin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in_screen);

        etUsernameLgin = findViewById(R.id.etUsernameLgin);
        etPasswordLgin = findViewById(R.id.etPasswordLgin);

    }

    @Override
    public void onClick(View v) {
        String username = etUsernameLgin.getText().toString();
        String password = etPasswordLgin.getText().toString();
    }
}
