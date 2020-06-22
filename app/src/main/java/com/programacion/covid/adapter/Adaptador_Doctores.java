package com.programacion.covid.adapter;

/*Clase que permite alimentar al Recycler_View*/

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.programacion.covid.R;
import com.programacion.covid.modelo.Personaje_Doc;

import java.util.ArrayList;



public class Adaptador_Doctores extends RecyclerView.Adapter<Adaptador_Doctores.ViewHolderDoctores>
        implements View.OnClickListener {

    ArrayList<Personaje_Doc> lista_personaje;
    private View.OnClickListener listener;

    public Adaptador_Doctores (ArrayList<Personaje_Doc> lista_personaje)
    {
        this.lista_personaje = lista_personaje;
    }

    @NonNull
    @Override
    public ViewHolderDoctores onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.items,null,false);

        view.setOnClickListener(this);

        return new ViewHolderDoctores(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderDoctores holder, int position) {

        holder.Departamento.setText(lista_personaje.get(position).getInf());
        holder.Nombre_doc.setText(lista_personaje.get(position).getNombre());
        holder.foto.setImageResource(lista_personaje.get(position).getFoto());
    }

    @Override
    public int getItemCount() {

        return lista_personaje.size();
    }

    //

    public void setOnClickListener(View.OnClickListener listener)
    {
        this.listener = listener;
    }

    @Override
    public void onClick(View v) {

        if(listener != null)
        {
            listener.onClick(v);
        }

    }

    public class ViewHolderDoctores extends RecyclerView.ViewHolder {

        TextView Nombre_doc, Departamento;
        ImageView foto;

        public ViewHolderDoctores(@NonNull View itemView) {
            super(itemView);
            Nombre_doc  = (TextView) itemView.findViewById(R.id.txt_nombre_doc);
            Departamento = (TextView) itemView.findViewById(R.id.txt_Departemento);
            foto = (ImageView) itemView.findViewById(R.id.Imagen_Id);
        }
    }
}
