package com.zihadul.practicechallenge4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout webToApp,videoPlyer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webToApp = findViewById(R.id.webToApp);
        videoPlyer = findViewById(R.id.videoPlyer);


        webToApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myTntent = new Intent(MainActivity.this,WebToApp.class);
            }
        });
        videoPlyer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myTntent = new Intent(MainActivity.this,VideoPlyer.class);
            }
        });

    }
}