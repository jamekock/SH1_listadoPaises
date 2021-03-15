package com.sh1.listadospaises;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    ListView listViewPaises;
    TextView textView;
    HashMap<String, String> map = new HashMap<String, String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listViewPaises = findViewById(R.id.listViewPaises);
        textView = findViewById(R.id.textView);
        ArrayList<String> listPaises = new ArrayList<String>();
        listPaises.add("Argentina");
        listPaises.add("Chile");
        listPaises.add("Paraguay");
        listPaises.add("Bolivia");
        listPaises.add("Peru");
        listPaises.add("Ecuador");
        listPaises.add("Colombia");

        map.put("Argentina","18 Millones");
        map.put("Chile","19 Millones");
        map.put("Paraguay","20 Millones");
        map.put("Bolivia","21 Millones");
        map.put("Peru","22 Millones");
        map.put("Ecuador","23 Millones");
        map.put("Colombia","24 Millones");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, listPaises);
        listViewPaises.setAdapter(arrayAdapter);
        listViewPaises.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                textView.setText(map.get(parent.getAdapter().getItem(position)));
            }
        });
    }
}