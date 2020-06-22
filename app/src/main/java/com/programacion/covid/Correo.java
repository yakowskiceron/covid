package com.programacion.covid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Correo extends AppCompatActivity {

    private WebView gmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_correo);


        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // Extrallendo la URL
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String url = (String) extras.get("valor");
        gmail = (WebView) findViewById(R.id.gmail);
        gmail.getSettings().setJavaScriptEnabled(true);
        gmail.getSettings().setBuiltInZoomControls(true);
        gmail.loadUrl(url); // se carga la URL
        // metodo que permite navegar en el WebView sin abrir el navegador
        gmail.setWebViewClient( new WebViewClient(){
            public boolean shouldOverriceUrlLoading(WebView view, String url)
            {
                return false; // permite que la pagina se refresque en el webView
            }
        });

    }
}
