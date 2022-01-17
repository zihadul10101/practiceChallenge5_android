package com.zihadul.practicechallenge4;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout webToApp,videoPlyer,sendMessage,plyayList;
    ImageView cansel;


    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setTitle("Really Exit?")
                .setMessage("Are you sure you want to exit?")
                .setNegativeButton(android.R.string.no, null)
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface arg0, int arg1) {
                        setResult(RESULT_OK, new Intent().putExtra("EXIT", true));
                        finish();
                    }

                }).create().show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webToApp = findViewById(R.id.webToApp);
        videoPlyer = findViewById(R.id.videoPlyer);
        sendMessage = findViewById(R.id.sendMessage);
        plyayList = findViewById(R.id.plyayList);
        cansel =findViewById(R.id.cansel);



        cansel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               onBackPressed();
            }
        });

        plyayList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myTntent = new Intent(MainActivity.this,PlayList.class);
                startActivity(myTntent);
            }
        });



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
                startActivity(myTntent);
            }
        });
        videoPlyer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myTntent = new Intent(MainActivity.this,VideoPlyer.class);
                startActivity(myTntent);
            }
        });

    }
}