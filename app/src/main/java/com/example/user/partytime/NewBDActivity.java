package com.example.user.partytime;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.Image;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Base64;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class NewBDActivity extends AppCompatActivity implements View.OnClickListener {
    Bitmap photo;
    private static final int CAMERA_REQUEST = 0;
    private static final int SELECT_IMAGE = 1;

    TextView tvNewItem;

    EditText ItemName;

    Button btDone;

    ImageView imageView;
    ImageButton btGallery, btTakephoto;

    Bitmap bitmap;
    final FirebaseDatabase database = FirebaseDatabase.getInstance();
    final DatabaseReference myRef = database.getReference().child("Birthdays");

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_bd);

        tvNewItem = findViewById(R.id.tvNewItem);

        ItemName = findViewById(R.id.ItemName);

        btDone = findViewById(R.id.btDone);

        btDone.setOnClickListener(this);

        btGallery = findViewById(R.id.btGallery);
        btGallery.setOnClickListener(this);

        btTakephoto = findViewById(R.id.btTakephoto);
        btTakephoto.setOnClickListener(this);

        imageView = findViewById(R.id.imageView2);


    }

    @Override
    /**
     * this method opens another activity after clicking on button.
     */
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btDone:
                Intent i = new Intent(this, BdList.class);
                Item item;
                if(photo != null) {
                    item = new Item(BitMapToString(photo), ItemName.getText().toString());
                }else{
                    item = new Item( ItemName.getText().toString());
                }
                i.putExtra("item", item);
                myRef.push().setValue(item);

                Toast.makeText(getApplicationContext(), "Button is clicked", Toast.LENGTH_LONG).show();
                startActivity(i);
                break;
            default:
                break;

        }

        if (v == btTakephoto) {
            Intent i = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            startActivityForResult(i, CAMERA_REQUEST);

        }
        if (v == btGallery) {
            Intent i = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
            startActivityForResult(i, SELECT_IMAGE);
        }
    }

    /**
     * this method adds the camera picture or the gallery picture to the firebase as string
     * @param requestCode
     * @param resultCode
     * @param data
     */
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == CAMERA_REQUEST && resultCode == Activity.RESULT_OK) {

            photo = (Bitmap) data.getExtras().get("data");
            imageView.setImageBitmap(photo);
          String imagePath= saveImage(photo);

            SharedPreferences pref = getSharedPreferences("myPref",MODE_PRIVATE);
            //open the file for editing
            SharedPreferences.Editor editor = pref.edit();
            //Keyword , value format of values to be saved in the sharedprefrences
            //can be several values
            editor.putString("image",imagePath);

            editor.commit();
        } else if (requestCode == SELECT_IMAGE && resultCode == Activity.RESULT_OK) {
            Uri targetUri = data.getData();
            try {
                bitmap = BitmapFactory.decodeStream(getContentResolver().openInputStream(targetUri));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

        }
    }

    /**
     * this activity changes picture form bitmap to string
     * @param bitmap
     * @return
     */
    @RequiresApi(api = Build.VERSION_CODES.FROYO)
    public String BitMapToString(Bitmap bitmap) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, baos);
        byte[] b = baos.toByteArray();
        String temp = Base64.encodeToString(b, Base64.DEFAULT);
        return temp;
    }

    /**
     * this method saves the picture to add her to firebase
     * @param bitmap
     * @return
     */
    public String saveImage(Bitmap bitmap) {
        File root = Environment.getExternalStorageDirectory();

        String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());

        String filePath = root.getAbsolutePath() + "/DCIM/Camera/IMG" + timeStamp + ".jpg";
        //creating an object from type file
        File file = new File(filePath);

        try {
            file.createNewFile();
            FileOutputStream ostream = new FileOutputStream(file);
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, ostream);
            ostream.close();

        } catch (Exception e) {
            e.printStackTrace();
            Toast.makeText(this, "Faild to save image", Toast.LENGTH_SHORT).show();

        }
        return filePath;
    }



}


