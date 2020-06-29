package com.programacion.covid.view.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.programacion.covid.EstadisticasUrl;
import com.programacion.covid.MapaRecolector;
import com.programacion.covid.R;

public class MapFragment extends Fragment {

    public MapFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_map, container, false);



        ImageButton btnBarra = (ImageButton) view.findViewById(R.id.barra);

        btnBarra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MapaRecolector.class);
                startActivity(intent);
            }
        });


        return view;













    }
}
