package com.kamiture.kamui.stopwatch;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main2Activity extends AppCompatActivity {
    private SharedPreferences data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        data = getSharedPreferences("CountResult", MODE_PRIVATE);
        long elapsedTime = data.getLong("CountLong", 0);
    }
}
