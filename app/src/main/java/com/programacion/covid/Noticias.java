package com.programacion.covid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Noticias extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noticias);

        //Toolbar General
        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("Noticias");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //widget para acceder a las noticias
        WebView myWebView = (WebView) findViewById(R.id.wvNoticias);
        myWebView.getSettings().setJavaScriptEnabled(true);     //compatibilidad con JS
        //myWebView.getSettings().setBuiltInZoomControls(true);   //Zoom si no es responsive
        myWebView.loadUrl("https://www.who.int/es/news-room");

        myWebView.setWebViewClient(new WebViewClient(){
            public boolean shouldOverrideUrlLoading(WebView myWebView, String url){
                return false;
            }
        });
    }
}