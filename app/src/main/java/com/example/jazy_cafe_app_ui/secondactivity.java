package com.example.jazy_cafe_app_ui;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class secondactivity extends AppCompatActivity {
    public int backPress = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondactivity);

        //Get Button to Next Window
        ImageButton nxt = findViewById(R.id.nextWindow);
        nxt.setOnClickListener(view -> {
            Intent nxtWin = new Intent(getApplicationContext(), thirdActivity.class);
            startActivity(nxtWin);
            overridePendingTransition(R.anim.slide_right,R.anim.slide_left_out);
        });

        //Bottom Sheet Dialog


    }

    //Exit Program Fully
    @Override
    public void onBackPressed(){
        //Press Again to Exit
        if(backPress == 1){
            moveTaskToBack(true);
            android.os.Process.killProcess(android.os.Process.myPid());
            System.exit(0);
        }else{
            Toast.makeText(getApplicationContext(),"Press Back Again to Exit",Toast.LENGTH_SHORT).show();
            backPress++;
        }
    }
}
