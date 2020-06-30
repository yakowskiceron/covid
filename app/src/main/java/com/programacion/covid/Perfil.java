package com.programacion.covid;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.ActivityCompat;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.programacion.covid.modelo.Modelo;

import static android.Manifest.permission.CALL_PHONE;

public class Perfil extends AppCompatActivity {


    private String Identificador;
    private static String URL = "https://accounts.google.com/ServiceLogin/signinchooser?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin";
    private String texto = "Los Médicos previenen, diagnostican y tratan diversas enfermedades para mejorar la salud general de sus pacientes. En principio, se dividen en dos grandes grupos: Médicos Generales y Médicos Especialistas.";
    private ImageView Imagen_Doctor, Imagen;
    private TextView Nombre_Perfil, Local, Rama_Doctor, Celular_Doctor, Doc_correo, Horario;
    ImageView llamar, mensajes;

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);


        if(requestCode == 100)
        {
            if(grantResults.length == 1 && grantResults[0] == PackageManager.PERMISSION_GRANTED )
            {
                Toast.makeText(getApplicationContext(),"Oh! Yeaaaa beibi",Toast.LENGTH_LONG).show();
            }
        }


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);

        referenciar();


        // Enviar Correo
        mensajes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Si sirve correos", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(Perfil.this, Correo.class);

                intent.putExtra("valor",URL); // Envia la URL xd
                startActivity(intent);
            }
        });

        llamar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent llamada = new Intent(Intent.ACTION_CALL, Uri.parse("tel: 88982005"));
                // hay que pasar el  contexto de l actividad trabajada
                if(ActivityCompat.checkSelfPermission(Perfil.this, CALL_PHONE) !=
                        PackageManager.PERMISSION_GRANTED){

                    // Pidiendo los permisos
                    AlertDialog.Builder dialogo =  new AlertDialog.Builder(Perfil.this);
                    dialogo.setTitle("Permisos desactivados");
                    dialogo.setMessage("Acepte los permisos para que sirva la app equisde");


                    dialogo.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                        @RequiresApi(api = Build.VERSION_CODES.M)
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            requestPermissions(new String[]{CALL_PHONE},100);
                        }
                    });

                    dialogo.show();
                    return;
                }
                startActivity(llamada);
            }
        });






        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("Perfil");
        setSupportActionBar(toolbar);


        Imagen = (ImageView) findViewById(R.id.Imagen_Perfil);
        MainActivity p = new MainActivity();
        Modelo n = new Modelo();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Identificador = n.getConsulta();
        mostrar();


    }



    private void referenciar()
    {
        llamar = (ImageView) findViewById(R.id.Llamadas);
        mensajes = (ImageView) findViewById(R.id.correos);

        Imagen_Doctor = (ImageView) findViewById(R.id.Imgen_Doctor);
        Imagen = (ImageView) findViewById(R.id.Imagen_Perfil);

        Nombre_Perfil = (TextView) findViewById(R.id.Nombre_Perfil);
        Local = (TextView) findViewById(R.id.Local);
        Rama_Doctor = (TextView) findViewById(R.id.Rama_doctor);
        Celular_Doctor = (TextView) findViewById(R.id.Celular_doctor);
        Doc_correo = (TextView) findViewById(R.id.Doc_correo);
        Horario = (TextView) findViewById(R.id.Disponibilidad);
    }

    private void mostrar()
    {
        if(Identificador.equals("Mildred Vivas"))
        {
            Imagen.setImageResource(R.drawable.doctora2);
            Nombre_Perfil.setText("Doc. Mildred Vivas");
            Rama_Doctor.setText("Pediatra, medico general");
            Local.setText(Identificador);
            Celular_Doctor.setText("+505 88982707");
            Doc_correo.setText("mildredV24@gmail.com");
            Horario.setText("8:00 am - 8:00 pm");

        }
        else if (Identificador.equals("Magdalena Pavón"))
        {
            Imagen.setImageResource(R.drawable.doctora2);
            Nombre_Perfil.setText("Doc. Magdalena Pavón");
            Rama_Doctor.setText("Medico general");
            Local.setText(Identificador);
            Celular_Doctor.setText("+505 57340999");
            Doc_correo.setText("magdalenapavon65@gmail.com");
            Horario.setText("8:30 am - 10:00 pm");

        }
        else if (Identificador.equals("Francisco Lopez"))
        {
            Imagen.setImageResource(R.drawable.doctor3);
            Nombre_Perfil.setText("Doc. Francisco Lopez");
            Rama_Doctor.setText("Pediatría");
            Local.setText(Identificador);
            Celular_Doctor.setText("+505 2277 6886");
            Doc_correo.setText("m.mena74@yahoo.com");
            Horario.setText("6:00 pm - 6:00 am");

        }
        else if (Identificador.equals("Mirian Mena"))
        {
            Imagen.setImageResource(R.drawable.doctora2);
            Nombre_Perfil.setText("Doc. Mirian Mena");
            Rama_Doctor.setText("Dermatología");
            Local.setText(Identificador);
            Celular_Doctor.setText("+505 2245 4456");
            Doc_correo.setText("herngan_c@gmail.com");
            Horario.setText("10:00 am - 11:00 pm");
        }
        else if(Identificador.equals("Carlos Hernandez"))
        {
            Imagen.setImageResource(R.drawable.doctor3);
            Nombre_Perfil.setText("Doc.Carlos Hernandez");
            Rama_Doctor.setText("Otorrinolaringología");
            Local.setText(Identificador);
            Celular_Doctor.setText("+505 73800897");
            Doc_correo.setText("norori_v@gmail.com");
            Horario.setText("6:00 am - 9:00 pm");
        }
        else if(Identificador.equals("Victor Norori"))
        {
            Imagen.setImageResource(R.drawable.doctor3);
            Nombre_Perfil.setText("Doc.Victor Norori");
            Rama_Doctor.setText("Otorrinolaringología");
            Local.setText(Identificador);
            Celular_Doctor.setText("+505 73800897");
            Doc_correo.setText("norori_v@gmail.com");
            Horario.setText("6:00 am - 9:00 pm");
        }
    }
}