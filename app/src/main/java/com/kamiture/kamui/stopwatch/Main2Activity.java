package com.kamiture.kamui.stopwatch;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;


import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {
    private SharedPreferences data;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        data = getSharedPreferences("CountResult", MODE_PRIVATE);
        long elapsedTime = data.getLong("CountLong", 0);

        ArrayList data = new ArrayList<>();
        //data.add(elapsedTime);
        //ArrayAdapter adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, data);

       // listView.setAdapter(adapter);
    }
}
