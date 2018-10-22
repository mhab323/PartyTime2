package com.example.user.partytime;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{

    ListView LvCountry;
    CustomAdapter adapter;
    ArrayList<Item> items;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        LvCountry = findViewById(R.id.LvCountry);

        items= new ArrayList<>();

        items.add(new Item(R.drawable.th,"first"));
        items.add(new Item(R.drawable.th2,"second"));
        items.add(new Item(R.drawable.th4,"third"));
        items.add(new Item(R.drawable.bg,"fourth"));



        LvCountry.setAdapter(adapter);
        LvCountry.setOnItemClickListener(this);








    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Item selectedItem =items.get(position);


    }





}
