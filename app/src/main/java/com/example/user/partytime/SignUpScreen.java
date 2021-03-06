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

public class SignUpScreen extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "firebase" ;
     TextView SignUptv;

      EditText usernameSignup;
    EditText EmailSignup;
    EditText PasswordSignup;


    Button btSignup;

     FirebaseAuth mAuth;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_upscreen);

        SignUptv = findViewById(R.id.SignUptv);

        usernameSignup = findViewById(R.id.usernameSignup);
        EmailSignup = findViewById(R.id.EmailSignup);
        PasswordSignup = findViewById(R.id.PasswordSignup);



        btSignup = findViewById(R.id.btnSigup);
        btSignup.setOnClickListener(this);

        mAuth = FirebaseAuth.getInstance();
    }

    @Override
    /**
     *      * this method opens another activity after clicking on button.
     */
    public void onClick(View v) {

        String username = usernameSignup.getText().toString();
        String Email = EmailSignup.getText().toString();
        String password = PasswordSignup.getText().toString();

        if (v == btSignup) {
            Intent i = new Intent(this, addParty.class);
            Toast.makeText(getApplicationContext(), "Button is clicked", Toast.LENGTH_LONG).show();
            v.getContext().startActivity(i);
            if(Email.equals("") || password.equals("") ) {
                Toast.makeText(SignUpScreen.this, "Missing information", Toast.LENGTH_SHORT).show();
            }
            else{
                    createUser(Email, password);

                }





            }


    }

    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();
//        updateUI(currentUser);
    }

    /**
     * this method creates new user with email and password and adds him to firebase
     * @param email
     * @param password
     */
    public  void createUser(String email, String password){
        mAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information
                            Log.d(TAG, "createUserWithEmail:success");
                            FirebaseUser user = mAuth.getCurrentUser();
//                            updateUI(user);
                        } else {
                            // If sign in fails, display a message to the user.
                            Log.w(TAG, "createUserWithEmail:failure", task.getException());
                            Toast.makeText( SignUpScreen.this, "Authentication failed.",
                                    Toast.LENGTH_SHORT).show();
//                            updateUI(null);
                        }


                    }
                });
    }
}

