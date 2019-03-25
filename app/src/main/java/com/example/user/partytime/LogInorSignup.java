package com.example.user.partytime;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class LogInorSignup extends AppCompatActivity implements View.OnClickListener {

    private TextView tv2;

    private Button btnLogin,btnSignup;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_inor_signup);

        tv2= (TextView) findViewById(R.id.tv2);


        btnLogin = (Button) findViewById(R.id.btnLogin);
        btnSignup = (Button) findViewById(R.id.btnSigup);

        btnLogin.setOnClickListener((View.OnClickListener) this);
        btnSignup.setOnClickListener((View.OnClickListener) this);
    }

    @Override
    /**
     * this method opens another activity after clicking on button.
     */
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnLogin:
                Intent i = new Intent(this,LogInScreen.class);
                Toast.makeText(getApplicationContext(), "Button is clicked", Toast.LENGTH_LONG).show();

                startActivity(i);
                break;
            case R.id.btnSigup:
                Intent i2 = new Intent(this,SignUpScreen.class);
                Toast.makeText(getApplicationContext(), "Button is clicked", Toast.LENGTH_LONG).show();
                startActivity(i2);
                break;
            default:
                break;



    }
}


























}
