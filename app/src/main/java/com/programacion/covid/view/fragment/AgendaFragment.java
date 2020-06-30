package com.programacion.covid.view.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.programacion.covid.Perfil;
import com.programacion.covid.R;
import com.programacion.covid.adapter.Adaptador_Doctores;
import com.programacion.covid.modelo.Modelo;
import com.programacion.covid.modelo.Personaje_Doc;

import java.util.ArrayList;

public class AgendaFragment extends Fragment {

    RecyclerView recyclerView_doctores;
    ArrayList<Personaje_Doc> listadoctores2;
    static String Nombre, info;

    public AgendaFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View vista = inflater.inflate(R.layout.fragment_agenda, container, false);

        listadoctores2 = new ArrayList<>();
        recyclerView_doctores = (RecyclerView) vista.findViewById(R.id.RecyclerId);
        recyclerView_doctores.setLayoutManager(new LinearLayoutManager(getContext()));

        llenarDoctores();

        Adaptador_Doctores adaptador = new Adaptador_Doctores(listadoctores2);
        recyclerView_doctores.setAdapter(adaptador);

        adaptador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // En funcion de los departamentos
                Nombre = listadoctores2.get(recyclerView_doctores.getChildAdapterPosition(v)).getNombre();
                info = listadoctores2.get(recyclerView_doctores.getChildAdapterPosition(v)).getInf();
                consulta();
                Toast.makeText(getContext(),""+Nombre,Toast.LENGTH_LONG).show();

                Intent myIntene = new Intent(getActivity(),Perfil.class);
                startActivity(myIntene);


               /* Toast.makeText(getApplicationContext(),"Selecciono: "+lista_personaje.
                        get(recyclerDoctores.getChildAdapterPosition(v)).getInf(),Toast.LENGTH_LONG).show(); */
            }
        });


        return vista;
    }

    private void llenarDoctores() {
        listadoctores2.add(new Personaje_Doc("Masaya","Magdalena Pavón",R.drawable.doctora2));
        listadoctores2.add(new Personaje_Doc("Masaya","Mildred Vivas",R.drawable.doctora2));
        listadoctores2.add(new Personaje_Doc("Chinandega","Francisco Lopez",R.drawable.doctor3));
        listadoctores2.add(new Personaje_Doc("Leon","Mirian Mena",R.drawable.doctora2));
        listadoctores2.add(new Personaje_Doc("Esteli","Carlos Hernandez",R.drawable.doctor3));
        listadoctores2.add(new Personaje_Doc("Managua","Victor Norori",R.drawable.doctor3));


    }

    public void consulta()
    {
        Modelo model = new Modelo();
        model.setConsulta(info);
    }
}
