package com.zihadul.practicechallenge4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout webToApp;
    WebView mWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webToApp = findViewById(R.id.webToApp);
        mWebView = findViewById(R.id.mWebView);

        webToApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mWebView.getSettings().setJavaScriptEnabled(true);
                mWebView.loadUrl("https://internshala.com/");
            }
        });

    }
}