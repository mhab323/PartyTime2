package com.example.user.partytime;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.icu.util.ValueIterator;
import android.support.annotation.NonNull;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapter extends ArrayAdapter<Item> {

    private int resourceLayout;
    private Context mContext;


    public CustomAdapter(@NonNull View.OnClickListener context, int resource, @NonNull ArrayList<Item> objects) {
        super((Context) context, resource, objects);

        this.resourceLayout=resource;
        this.mContext= (Context) context;
}



    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View v= convertView;
        if(v==null)
            v= LayoutInflater.from(mContext).inflate(resourceLayout,parent,false);

        Item p= getItem(position);

        if (p != null){

            TextView tvName = (TextView) v.findViewById(R.id.tvTitle1);
            tvName.setText(p.getName());

            ImageView imageView =(ImageView) v.findViewById(R.id.imageView);
            imageView.setImageBitmap(StringToBitMap(p.getImage()));
        }
         return v;
    }
    public Bitmap StringToBitMap(String encodedString) {
        try {
            byte[] encodeByte = Base64.decode(encodedString, Base64.DEFAULT);
            Bitmap bitmap = BitmapFactory.decodeByteArray(encodeByte, 0,
                    encodeByte.length);
            return bitmap;
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
    }
}
