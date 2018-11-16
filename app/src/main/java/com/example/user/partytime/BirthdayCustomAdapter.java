//package com.example.user.partytime;
//
//import android.content.Context;
//import android.graphics.Bitmap;
//import android.graphics.BitmapFactory;
//import android.support.annotation.NonNull;
//import android.util.Base64;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ArrayAdapter;
//import android.widget.ImageView;
//import android.widget.TextView;
//
//import java.util.ArrayList;
//
//public class BirthdayCustomAdapter extends ArrayAdapter<Item> {
//
//    private int resourceLayout;
//    private Context mContext;
//
//
//   // public BirthdayCustomAdapter(@NonNull View.OnClickListener context, int resource, @NonNull ArrayList<BirthDay> objects) {
//      //  super((Context) context, resource, objects);
//
//        this.resourceLayout=resource;
//        this.mContext= (Context) context;
//}
//
//
////
////    @Override
////    public View getView(int position, View convertView, ViewGroup parent){
////        View v= convertView;
////        if(v==null)
////            v= LayoutInflater.from(mContext).inflate(resourceLayout,parent,false);
////
////      //  BirthDay p= getBirthDay(position);
////
////       // if (p != null){
////
////            TextView tvName = (TextView) v.findViewById(R.id.tvTitle1);
////            tvName.setText(p.getDate());
////
////
////        }
////         return v;
////    }
//    public Bitmap StringToBitMap(String encodedString) {
//        try {
//            byte[] encodeByte = Base64.decode(encodedString, Base64.DEFAULT);
//            Bitmap bitmap = BitmapFactory.decodeByteArray(encodeByte, 0,
//                    encodeByte.length);
//            return bitmap;
//        } catch (Exception e) {
//            e.getMessage();
//            return null;
//        }
//    }
//}
