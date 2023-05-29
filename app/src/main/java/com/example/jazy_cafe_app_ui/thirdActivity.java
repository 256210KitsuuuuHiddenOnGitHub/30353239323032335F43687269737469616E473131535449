package com.example.jazy_cafe_app_ui;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.google.android.material.bottomsheet.BottomSheetDialog;

public class thirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.thirdactivity);

        //Get ImageButton
        ImageButton bckWin = findViewById(R.id.backWindow);
        bckWin.setOnClickListener(view -> {
            Intent bkWin = new Intent(getApplicationContext(), secondactivity.class);
            startActivity(bkWin);
            overridePendingTransition(R.anim.slide_left,R.anim.slide_right_out);
        });

        //Pull List Ready
        listUp();
    }

    public void listUp(){
        //Ready Bottom Sheet
        BottomSheetDialog strawberryBSD,chocoFrappeBSD;
        View sBSD,chfBSD;

        /*
        Most Important Part, Get Possible Orders
        Get Contents and Show Using BottomSheetDialog
         */

        //Get All Frappe
        //1.) Get Strawberry
        strawberryBSD = new BottomSheetDialog(this);
        sBSD = LayoutInflater.from(this).inflate(R.layout.pull_up_strawberry_frappe,null);
        strawberryBSD.setContentView(sBSD);
        //Get Strawberry Contents
        FrameLayout strawberry = findViewById(R.id.strawBerryFrappeLayout);
        strawberry.setOnClickListener(view -> strawberryBSD.show());

        // 2.) Get Choco Frappe
        chocoFrappeBSD = new BottomSheetDialog(this);
        chfBSD = LayoutInflater.from(this).inflate(R.layout.pull_up_strawberry_frappe,null);
        chocoFrappeBSD.setContentView(chfBSD);
        //Get Choco Frappe Contents
        FrameLayout chocoFrappe = findViewById(R.id.chocoFrappeLayout);
        chocoFrappe.setOnClickListener(view -> chocoFrappeBSD.show());

        //Get All Milkshakes
        // 3.) Get Choco Milkshake

        // 4.) Get Mango Milkshake


    }


    @Override
    public void onBackPressed(){
        Intent bkWin = new Intent(getApplicationContext(), secondactivity.class);
        startActivity(bkWin);
        overridePendingTransition(R.anim.slide_left,R.anim.slide_right_out);
    }
}
