package com.example.jazy_cafe_app_ui;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Button
        Button btnStart = findViewById(R.id.NextBtnStart);
        btnStart.setOnClickListener(view -> {
            //Go to Next Window
            Intent nx = new Intent(getApplicationContext(), secondactivity.class);
            startActivity(nx);
        });
    }


}