package com.zihadul.practicechallenge4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class VideoPlyer extends AppCompatActivity {

    WebView videoPlyer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.video_plyer);

        videoPlyer =findViewById(R.id.videoPlyer);

       videoPlyer.getSettings().setJavaScriptEnabled(true);
        videoPlyer.loadUrl("https://www.youtube.com/embed/01Ej5I4AliE");



    }
}