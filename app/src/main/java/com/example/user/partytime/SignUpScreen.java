package com.example.user.partytime;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SignUpScreen extends AppCompatActivity implements View.OnClickListener {
   private TextView SignUptv;

   private   EditText usernameSignup;
   private EditText EmailSignup;
   private EditText PasswordSignup;

   private Button btSignup;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_upscreen);

        SignUptv = findViewById(R.id.SignUptv);

        usernameSignup = findViewById(R.id.usernameSignup);
        EmailSignup = findViewById(R.id.EmailSignup);
        PasswordSignup = findViewById(R.id.PasswordSignup);



        btSignup = findViewById(R.id.btnSigup);
    }

    @Override
    public void onClick(View v) {

        String username = usernameSignup.getText().toString();
        String Email = EmailSignup.getText().toString();
        String password = PasswordSignup.getText().toString();

        switch (v.getId()) {
            case R.id.btSignup:
                Intent i = new Intent(this,NewBDActivity .class);

                startActivity(i);
                break;
            default:
                break;

        }
    }
}
