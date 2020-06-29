 package com.programacion.covid.view.fragment;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.programacion.covid.R;
import com.programacion.covid.adapter.MedidasAdapterRecyclerView;
import com.programacion.covid.modelo.ContextoMedidas;

import java.util.ArrayList;

 /**
 * A simple {@link Fragment} subclass.
 */
public class RecomendacionFragment extends Fragment {

     public RecomendacionFragment() {
         // Required empty public constructor
     }
     @Override
     public View onCreateView(LayoutInflater inflater, ViewGroup container,
                              Bundle savedInstanceState) {
         // Inflate the layout for this fragment
         View view = inflater.inflate(R.layout.fragment_recomendacion, container, false);
         //Division de pantallas
         GridLayoutManager lmGrid = new GridLayoutManager(getContext(),2);

         RecyclerView medidasRecycler = (RecyclerView) view.findViewById(R.id.lista_medidas);
         medidasRecycler.setLayoutManager(lmGrid);
         medidasRecycler.setHasFixedSize(true);
         /*/Para que se pinten los registros, es el gestor de datos
         LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
         linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
         medidasRecycler.setLayoutManager(linearLayoutManager);*/

         MedidasAdapterRecyclerView medidasAdapterRecyclerView = new MedidasAdapterRecyclerView(buildTextos()
                 , R.layout.texto_medidas, getActivity());

         medidasRecycler.setAdapter(medidasAdapterRecyclerView);
         return view;
     }


     public ArrayList<ContextoMedidas> buildTextos(){
         ArrayList<ContextoMedidas> textos = new ArrayList<>();
         textos.add(new ContextoMedidas("Lavarse las manos, con frecuencia con agua y jabón por al" +
                 " menos 20 segundos, especialmente después de haber estado en un lugar público, o después" +
                 " de sonarse la nariz, toser o estornudar","Lavarse las manos frecuentemente:"
                 , "https://www.ecestaticos.com/imagestatic/clipping/1d7/7b1/1d77b177b700852b5a9348121398a949/como-lavar-exactamente-tus-manos-de-acuerdo-con-los-doctores.jpg?mtime=1587135939"));

         textos.add(new ContextoMedidas("Evite el contacto cercano con personas que están enfermas," +
                 " incluso dentro de su casa. De ser posible, mantenga una distancia de 6 pies entre la " +
                 "persona enferma y otros miembros de su hogar.","Evitar el contacto cercano",
                 "https://static.vecteezy.com/system/resources/previews/000/952/903/non_2x/social-distancing-man-and-woman-vector.jpg"));

         textos.add(new ContextoMedidas("Usted podría propagar el COVID-19 incluso si no se siente " +
                 "enfermo.Todos deberían usar una cubierta de tela para la cara cuando salen de sus casas."
                 ,"Cubrirse la boca y la nariz al estar rodeados" +
                 " de personas", "https://www.infobae.com/new-resizer/9s0lXt6Go26V9ffc7o8AiU7VEOQ=/1043x830/filters:format(jpg):quality(100)//arc-anglerfish-arc2-prod-infobae.s3.amazonaws.com/public/2E3ZYRTS6BCINF47NCZOM3ALWU.jpg"));

         textos.add(new ContextoMedidas("Si usted está rodeado de personas y no lleva puesta una" +
                 " cubre boca, recuerde siempre cubrirse la boca y la nariz con un" +
                 " pañuelo desechable cuando tosa o estornude o cúbrase con la parte interna del codo y" +
                 " no escupa.","Cúbrase la nariz y la boca al " +
                 "toser y estornudar", "https://www.lavanguardia.com/r/GODO/LV/p7/WebSite/2020/03/23/Recortada/img_econcejo_20200323-160639_imagenes_lv_otras_fuentes_manos_codo-kEcG-U48573476804cF-992x558@LaVanguardia-Web.jpg"));

         textos.add(new ContextoMedidas("Limpie Y desinfecte las superficies que se " +
                 "tocan con frecuencia, ejemplo, las mesas, las manijas de las puertas, los interruptores" +
                 " de luz, los escritorios, los inodoros, los lavamanos, etc.Si las superficies están sucias, límpielas. " +
                 "Lávelas con agua y detergente o jabón."
                 ,"Limpie y desinfecte","https://image.freepik.com/vector-gratis/covid-19-mano-rocia-desinfectante-aerosol-antiseptico-sobre-coronavirus_208509-24.jpg"));

         textos.add(new ContextoMedidas("Esté atento a los síntomas. Esté atento a la aparición de fiebre, tos, dificultad" +
                 " para respirar u otros síntomas del COVID-19. Puede hacer el test que se encuentra abajo para detectar si es un " +
                 "posible caso de COVID-19","Monitorear su salud","https://image.freepik.com/vector-gratis/concepto-control-salud-tecnologia-telemedicina_34089-98.jpg"));
         return textos;
     }



 }
