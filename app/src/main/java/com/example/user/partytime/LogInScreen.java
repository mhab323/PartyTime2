//package com.example.user.partytime;
//
//import android.content.Intent;
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.TextView;
//import android.widget.Toast;
//
//public class LogInScreen extends AppCompatActivity implements View.OnClickListener{
//   private TextView lgintv;
//
//  private  EditText etUsernameLgin;
//  private   EditText etPasswordLgin;
//
//   private Button btLgin;
//
//
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_log_in_screen);
//
//        lgintv =findViewById(R.id.lgIntv);
//
//        etUsernameLgin = findViewById(R.id.etUsernameLgin);
//        etPasswordLgin = findViewById(R.id.etPasswordLgin);
//
//        btLgin= findViewById(R.id.btLgin);
//        btLgin.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (v == btLgin) {
//                    Intent intent = new Intent(this, BdList.class);
//                    startActivity(intent);
//                }
//            }
//
//
//
//
//
//
//
//
////         if (v == null) {
////                    Intent i = new Intent(this, BdList.class);
////                    Toast.makeText(getApplicationContext(), "Button is clicked", Toast.LENGTH_LONG).show();
////                    v.getContext().startActivity(i)
//
////    String username = etUsernameLgin.getText().toString();
////    String password = etPasswordLgin.getText().toString();
//
