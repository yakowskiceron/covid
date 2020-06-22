package com.programacion.covid.adapter;


import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.programacion.covid.R;
import com.programacion.covid.modelo.ContextoMedidas;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class MedidasAdapterRecyclerView extends RecyclerView.Adapter<MedidasAdapterRecyclerView.MedidasViewHolder> {
    private ArrayList<ContextoMedidas> modelo;
    private int resource;
    private Activity activity;
    public MedidasAdapterRecyclerView(ArrayList<ContextoMedidas> modelo, int resource, Activity activity) {
        this.modelo = modelo;
        this.resource = resource;
        this.activity = activity;
    }
    @NonNull
    @Override
    public MedidasViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Esta me va a extender la vista del fragment
        View view = LayoutInflater.from(parent.getContext()).inflate(resource, parent, false);
        return new MedidasViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MedidasViewHolder holder, int position) {
        ContextoMedidas contextoMedidas = modelo.get(position);
        holder.medida.setText(contextoMedidas.getTexto());
        holder.encabezado.setText(contextoMedidas.getTexto2());
        Picasso.get().load(contextoMedidas.getPicture()).resize(115,115).into(holder.pictureMedidas);
    }
    @Override
    public int getItemCount() {
        return modelo.size();
    }

    public class MedidasViewHolder extends RecyclerView.ViewHolder{
        private ImageView pictureMedidas;
        private TextView medida;
        private TextView encabezado;

        public MedidasViewHolder(View view){
            super(view);

            pictureMedidas = (ImageView) view.findViewById(R.id.Imagen_medidas);
            medida = (TextView) view.findViewById(R.id.enunciado);
            encabezado = (TextView) view.findViewById(R.id.enunciado_principal);


        }



    }

}
