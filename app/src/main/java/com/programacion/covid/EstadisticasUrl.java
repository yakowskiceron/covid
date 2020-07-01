package com.programacion.covid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class EstadisticasUrl extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estadisticas_url);

        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("Estadísticas");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        WebView view = (WebView) findViewById(R.id.webViewEstadiaticas);
        view.getSettings().setJavaScriptEnabled(true);//Permite que algunas paginas funcionen bien
        view.getSettings().setBuiltInZoomControls(true);//Permite el zoom si la pagina no es responsive
        view.loadUrl("https://www.arcgis.com/apps/opsdashboard/index.html#/85320e2ea5424dfaaa75ae62e5c06e61");

        //Metodo que permite navegar dentro del webView sin abrir el navegador

        view.setWebViewClient(new WebViewClient(){
            public boolean shouldOverriceUrlLoading(WebView view, String url){
                return false;
            }
        });

    }
}
