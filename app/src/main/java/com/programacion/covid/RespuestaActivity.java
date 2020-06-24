package com.programacion.covid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import com.programacion.covid.modelo.Picture;

public class RespuestaActivity extends AppCompatActivity {

    String Respuesta, inciso="", preguntas;
    String si= "", no ="";
    int valor;
    ImageView imagen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_respuesta);

        referenciar();

        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("Noticias");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);




    }



    private void referenciar()
    {
        imagen = (ImageView) findViewById(R.id.imagenCovid);


    }

    private void mostrar_respuesta(){

        if (inciso.equalsIgnoreCase( "1")){

            imagen.setImageResource(R.drawable.agenda);
            RadioButton si1= (RadioButton) findViewById(R.id.RadioButtonSi);
            RadioButton no1 = (RadioButton) findViewById(R.id.RadioButtonNo);

        }

    }



}
