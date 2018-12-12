package com.example.user.partytime;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class LogInScreen extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "FIREBASE";

    private TextView lgintv;

    private EditText etUsernameLgin;
    private EditText etPasswordLgin;

    private Button btnLogin;

    private FirebaseAuth mAuth;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in_screen);

        lgintv = findViewById(R.id.lgIntv);

        etUsernameLgin = findViewById(R.id.etUsernameLgin);
        etPasswordLgin = findViewById(R.id.etPasswordLgin);

        btnLogin = findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(this);

        mAuth = FirebaseAuth.getInstance();

//        btnLogin.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                signIn(etUsernameLgin.getText().toString(), etPasswordLgin.getText().toString());
//
//            }
//
//        });

    }

    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();
//        updateUI(currentUser);
    }

    @Override
    public void onClick(View v) {

        String username = etUsernameLgin.getText().toString();
        String password = etPasswordLgin.getText().toString();

        if (v == btnLogin) {
            Intent i = new Intent(this, addParty.class);
            Toast.makeText(getApplicationContext(), "Button is clicked", Toast.LENGTH_LONG).show();
            startActivity(i);

        } else {
            if (username.equals("") || password.equals("")) {
                Toast.makeText(getApplicationContext(), "Empty username or password", Toast.LENGTH_LONG).show();
            }
            else{
                signIn(username,password);
            }
        }
    }

    public void signIn(String email, String password) {
        mAuth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information
                            Log.d(TAG, "signInWithEmail:success");
                            FirebaseUser user = mAuth.getCurrentUser();
                            Intent i = new Intent(LogInScreen.this,addParty.class);
                            startActivity(i);
//                                updateUI(user);
                        } else {
                            // If sign in fails, display a message to the user.
                            Log.w(TAG, "signInWithEmail:failure", task.getException());
                            Toast.makeText(LogInScreen.this, "Authentication failed.",
                                    Toast.LENGTH_SHORT).show();
//                                updateUI(null);
                        }

                        // ...
                    }
                });


    }
}










