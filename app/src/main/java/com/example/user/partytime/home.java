package com.example.user.partytime;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class home extends AppCompatActivity implements View.OnClickListener,DialogInterface.OnClickListener {

    TextView tvHome;

    Button btItemList, btGuestsList, btBDplaces, btBack2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        tvHome = findViewById(R.id.tvHome);

        btItemList = findViewById(R.id.btItemList);
        btItemList.setOnClickListener(this);
        btGuestsList = findViewById(R.id.btGuestsList);
        btGuestsList.setOnClickListener(this);
        btBDplaces = findViewById(R.id.btBDplaces);
        btBDplaces.setOnClickListener(this);
        btBack2 = findViewById(R.id.btBack2);
        btBack2.setOnClickListener(this);

    }

    @Override
    /**
     * this method adds new child to the firebase with name and image
     */
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btItemList:
                Intent i = new Intent(this, BdList.class);
                Toast.makeText(getApplicationContext(), "Button is clicked", Toast.LENGTH_LONG).show();
                startActivity(i);
                break;
            case R.id.btGuestsList:
                Intent i2 = new Intent(this, GuestsList.class);
                Toast.makeText(getApplicationContext(), "Button is clicked", Toast.LENGTH_LONG).show();
                startActivity(i2);
                break;
            case R.id.btBDplaces:
                Intent i3 = new Intent(this, Places.class);
                Toast.makeText(getApplicationContext(), "Button is clicked", Toast.LENGTH_LONG).show();
                startActivity(i3);
                break;
            case R.id.btBack2:
                Intent i4 = new Intent(this, addParty.class);
                Toast.makeText(getApplicationContext(), "Button is clicked", Toast.LENGTH_LONG).show();
                startActivity(i4);
                break;
            default:
                break;


        }
    }

    /**
     * this method create menu
     * @param menu
     * @return
     */
       public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    /**
     * this method do functions on the item selected
     * @param item
     * @return
     */
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.item1:
                Toast.makeText(getApplicationContext(), "Profile Selected", Toast.LENGTH_LONG).show();
                return true;
            case R.id.item2:
                Toast.makeText(getApplicationContext(), "Settings Selected", Toast.LENGTH_LONG).show();
                return true;
            case R.id.item3:
                Toast.makeText(getApplicationContext(), "Privacy Selected", Toast.LENGTH_LONG).show();
                return true;
            case R.id.item4:
                Intent i = new Intent(this, LogInScreen.class);
                Toast.makeText(getApplicationContext(), "Log Out", Toast.LENGTH_LONG).show();
                startActivity(i);
                return true;

            default:
                return super.onOptionsItemSelected(item);


        }
    }


    @Override
    /**
     * this method dose functions on alert dialog buttons
     */
        public void onClick (DialogInterface dialog,int which){
            if (which == dialog.BUTTON_POSITIVE) {
                super.onBackPressed();
                dialog.cancel();
            }
            if (which == dialog.BUTTON_NEGATIVE) {
                dialog.cancel();
            }


        }
    /**this method opens dialog interface to user after clicking on the back button
     *
     */
    public void onBackPressed(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Are you sure?");
        builder.setCancelable(false);
        builder.setPositiveButton("Yes",this);
        builder.setNegativeButton("No",this);
        AlertDialog dialog=builder.create();
        dialog.show();


    }
    }
