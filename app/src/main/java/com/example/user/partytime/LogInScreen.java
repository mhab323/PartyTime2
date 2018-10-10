package com.example.user.partytime;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LogInScreen extends AppCompatActivity implements View.OnClickListener{
   private TextView lgintv;

  private  EditText etUsernameLgin;
  private   EditText etPasswordLgin;

   private Button btLgin;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in_screen);

        lgintv =findViewById(R.id.lgIntv);

        etUsernameLgin = findViewById(R.id.etUsernameLgin);
        etPasswordLgin = findViewById(R.id.etPasswordLgin);

        btLgin= findViewById(R.id.btLgin);


    }

    @Override
    public void onClick(View v) {
        String username = etUsernameLgin.getText().toString();
        String password = etPasswordLgin.getText().toString();
        switch (v.getId()) {
            case R.id.btLgin:
                Intent i = new Intent(this,BdList .class);

                startActivity(i);
                break;
            default:
                break;

        }
    }
}
