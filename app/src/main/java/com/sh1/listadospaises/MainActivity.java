package com.sh1.listadospaises;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    ListView listViewPaises;
    HashMap<String, Integer> maap = new HashMap<String, Integer>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listViewPaises = findViewById(R.id.listViewPaises);
        ArrayList<String> listPaises = new ArrayList<String>();
        listPaises.add("Argentina");
        listPaises.add("Chile");
        listPaises.add("Paraguay");
        listPaises.add("Bolivia");
        listPaises.add("Peru");
        listPaises.add("Ecuador");
        listPaises.add("Colombia");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, listPaises);
        listViewPaises.setAdapter(arrayAdapter);

    }
}