package com.zihadul.practicechallenge4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class WebToApp extends AppCompatActivity {

    public static String url = "";
    WebView mWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.web_to_app);


        mWebView = findViewById(R.id.mWebView);

        mWebView.getSettings().setJavaScriptEnabled(true);
        mWebView.loadUrl("https://internshala.com/");
    }
}