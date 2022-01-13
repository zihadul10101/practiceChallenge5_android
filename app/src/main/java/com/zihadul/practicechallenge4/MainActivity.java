package com.zihadul.practicechallenge4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout webToApp,videoPlyer,sendMessage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webToApp = findViewById(R.id.webToApp);
        videoPlyer = findViewById(R.id.videoPlyer);
        sendMessage = findViewById(R.id.sendMessage);


        sendMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myTntent = new Intent(Intent.ACTION_VIEW, Uri.fromParts("sms","01850649283",null));
                myTntent.putExtra("sms,body","hello Dear");
                startActivity(myTntent);
            }
        });

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