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
    ArrayAdapter<String> arrayAdapter;
    ArrayList<String> arrayList = new ArrayList<> ();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        LvCountry = findViewById(R.id.LvCountry);

        arrayList.add("Germany");
        arrayList.add("France");
        arrayList.add("Italy");

        arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arrayList);
        LvCountry.setAdapter(arrayAdapter);

    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String selectedItem =arrayList.get(position);
        if(selectedItem.equals("Germany"))

        if(position== 0) {

        }


    }





}
