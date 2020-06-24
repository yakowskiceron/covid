package com.programacion.covid.view.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.programacion.covid.Perfil;
import com.programacion.covid.R;
import com.programacion.covid.RespuestaActivity;
import com.programacion.covid.adapter.Adaptador_Doctores;
import com.programacion.covid.adapter.PictureAdapterRecyclerView;
import com.programacion.covid.modelo.Picture;
import com.programacion.covid.view.ContainerActivity;

import java.util.ArrayList;

public class TestFragment extends Fragment {

    static RecyclerView PreguntasRecycler;

    public TestFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_test, container, false);

        //Lienea de codigo que hace posible paginar en 2 preguntas
        GridLayoutManager lmGrid = new GridLayoutManager(getContext(),2);

        // este va
        PreguntasRecycler = (RecyclerView) view.findViewById(R.id.picture_recycler);
        PreguntasRecycler.setLayoutManager(lmGrid);
        PreguntasRecycler.setHasFixedSize(true);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        PreguntasRecycler.setLayoutManager(linearLayoutManager);

        PictureAdapterRecyclerView pictureAdapterRecyclerView = new PictureAdapterRecyclerView(buildPictures()
                , R.layout.cardview_picture, getActivity());

        PreguntasRecycler.setAdapter(pictureAdapterRecyclerView);

        DividerItemDecoration dividerItemDecoration = new
                DividerItemDecoration(PreguntasRecycler.getContext(), ((LinearLayoutManager)PreguntasRecycler.getLayoutManager()).getOrientation());
        PreguntasRecycler.addItemDecoration(dividerItemDecoration);

        // RecyclerView medidasRecycler = (RecyclerView) view.findViewById(R.id.picture_recycler)
        // medidasRecycler.setAdapter(pictureAdapterRecyclerView);


        FloatingActionButton respuesta = (FloatingActionButton) view.findViewById(R.id.respuesta);
        respuesta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),RespuestaActivity.class);
                startActivity(intent);
            }
        });





        return view;
    }


    public void goRespuesta(View view){



        Intent intent = new Intent(getActivity(), RespuestaActivity.class);

        startActivity(intent);
    }



    public ArrayList<Picture> buildPictures(){
        ArrayList<Picture> pictures = new ArrayList<>();
        pictures.add(new Picture("R.drawable.fondo_pregunta",
                "Preguntas Numero 1","Cuanto de fiebre presenta mayor a 37.5º?","Si","No","1"));

        pictures.add(new Picture("R.drawable.fondo_pregunta",
                "Preguntas Numero 2","Presentas sintomas de tos seca?","Si","No","2"));

        pictures.add(new Picture("R.drawable.fondo_pregunta",
                "Preguntas Numero 3","Presenta Fatiga o cansancio?","Si","No","3"));

        pictures.add(new Picture("R.drawable.fondo_pregunta",
                "Preguntas Numero 4","Falta de aire brusco o problemas al respirar?","Si","No","4"));

        pictures.add(new Picture("R.drawable.fondo_pregunta",
                "Preguntas Numero 5","Dolor de garganta?","Si","No","5"));

        pictures.add(new Picture("R.drawable.fondo_pregunta",
                "Preguntas Numero 6","Ha perdido el gusto o el olfato por mucho tiempo?","Si","No","6"));

        pictures.add(new Picture("R.drawable.fondo_pregunta",
                "Preguntas Numero 7","Dolores de cabeza Intenso - Moderado?","Si","No","7"));

        pictures.add(new Picture("R.drawable.fondo_pregunta",
                "Preguntas Numero 8","Sigue presentando los sintomas anteriores por las ultimos 2 semanas?","Si","No","8"));

        return pictures;
    }
}
