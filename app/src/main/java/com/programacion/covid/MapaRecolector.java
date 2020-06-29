package com.programacion.covid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MapaRecolector extends AppCompatActivity {

    Button Abrir_mapa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa_recolector);



        Abrir_mapa = (Button) findViewById(R.id.AbrirMapa);

        Abrir_mapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Mapa_Prueba_mapsActivity.class);
                startActivity(intent);
            }
        });
    }
}
