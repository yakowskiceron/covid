package com.programacion.covid.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.programacion.covid.R;
import com.programacion.covid.modelo.Picture;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class PictureAdapterRecyclerView  extends  RecyclerView.Adapter<PictureAdapterRecyclerView.PictureViewHolder>  {

    private ArrayList<Picture> pictures;
    private int resource;
    private Activity activity;

    public PictureAdapterRecyclerView(ArrayList<Picture> pictures, int resource, Activity activity) {
        this.pictures = pictures;
        this.resource = resource;
        this.activity = activity;
    }
    @NonNull
    @Override
    public PictureViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        View view = LayoutInflater.from(parent.getContext()).inflate(resource,parent, false);
        return new PictureViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PictureViewHolder holder, int position) {
        Picture picture = pictures.get(position);
        holder.PreguntasNumeroCard.setText(picture.getPreguntasnumero());
        holder.PreguntaCard.setText(picture.getPregunta());
        holder.SiCard.setText(picture.getSi());
        holder.NoCard.setText(picture.getNo());
        holder.inciso_pregunta.setText(picture.getInciso());


        Picasso.get().load(picture.getPicture()).into(holder.pictureCard);

    }


    @Override
    public int getItemCount() {

        return pictures.size();
    }

    public class PictureViewHolder extends RecyclerView.ViewHolder {

        private ImageView pictureCard;
        private TextView PreguntasNumeroCard;
        private TextView PreguntaCard;
        private RadioButton SiCard;
        private RadioButton NoCard;
        private TextView inciso_pregunta;

        public PictureViewHolder (View itemView) {
            super(itemView);
            pictureCard = (ImageView) itemView.findViewById(R.id.imagenCovid);
            PreguntasNumeroCard =(TextView)itemView.findViewById(R.id.preguntas_Covid);
            PreguntaCard=(TextView)itemView.findViewById(R.id.first_question);
            SiCard =(RadioButton) itemView.findViewById(R.id.RadioButtonSi);
            NoCard =(RadioButton) itemView.findViewById(R.id.RadioButtonNo);
            inciso_pregunta = (TextView) itemView.findViewById(R.id.inciso1);
        }

    }


}