package com.programacion.covid;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.FragmentActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import static android.Manifest.permission.ACCESS_FINE_LOCATION;

public class Mapa_Prueba_mapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa__prueba_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;




        /*// Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(-34, 151);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney))

         */

        // Habilitamos la vista en el centro de nicaragua "es Boaco"
        LatLng Boaco = new LatLng(12.676311561124919, -85.0432476218124);


        // Hospital Militar  1
        LatLng Hospital_Militar = new LatLng(12.1359262, -86.276865);
        mMap.addMarker(new MarkerOptions().position(Hospital_Militar).title("Hospital Militar").snippet("Disponible para pacientes con Covid-19")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.hospital)));

        // Hospital Aleman   2
        LatLng Hospital_Aleman = new LatLng(12.1467819, -86.2187847);
        mMap.addMarker(new MarkerOptions().position(Hospital_Aleman).title("Hospital Aleman").snippet("Disponible para pacientes con Covid-19")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.hospital)));

        // Hospital Vivian_Pellas  3
        LatLng Hospital_Vivian_Pellas = new LatLng(12.0859976, -86.2339393);
        mMap.addMarker(new MarkerOptions().position(Hospital_Vivian_Pellas).title("Hospital Metropolitano Vivian Pellas").snippet("Disponible para pacientes con Covid-19")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.hospital)));

        // Hospital Lenin_Fonseca  4
        LatLng Hospital_Lenin_Fonseca = new LatLng(12.1489482, -86.3107299);
        mMap.addMarker(new MarkerOptions().position(Hospital_Lenin_Fonseca).title("Hospital Lenin Fonseca").snippet("Disponible para pacientes con Covid-19")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.hospital)));


        // Hospital Humberto_Alavarado   5
        LatLng Hospital_Humberto_Alavarado = new LatLng(11.9748599, -86.0813649);
        mMap.addMarker(new MarkerOptions().position(Hospital_Humberto_Alavarado).title("Hospital Humberto Alavarado").snippet("Disponible para pacientes con Covid-19")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.hospital)));


        // Hospital Amistad_Mexico   6
        LatLng Hospital_Amistad_Mexico = new LatLng(12.0281783, -86.20276802883993);
        mMap.addMarker(new MarkerOptions().position(Hospital_Amistad_Mexico).title("Hospital Amistad Mexico").snippet("Disponible para pacientes con Covid-19")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.hospital)));


        // Hospital Hospital Escuela Oscar_Danilo   7
        LatLng Hospital_Oscar_Danilo = new LatLng(12.433590800000001, -86.87791152716144);
        mMap.addMarker(new MarkerOptions().position(Hospital_Oscar_Danilo).title("Hospital Oscar Danilo").snippet("Disponible para pacientes con Covid-19")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.hospital)));

        // Hospital Escuela Cesar Amador Molina 8

        LatLng Hospital_Cesar_Amador = new LatLng(12.941000500000001, -85.91471801096426);
        mMap.addMarker(new MarkerOptions().position(Hospital_Cesar_Amador).title("Hospital Cesar Amador").snippet("Disponible para pacientes con Covid-19")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.hospital)));

        // Hospital Julio Videa 9

        LatLng Hospital_Julio_Videa = new LatLng(12.941000500000001, -85.91471801096426);
        mMap.addMarker(new MarkerOptions().position(Hospital_Julio_Videa).title("Hospital Julio Videa").snippet("Disponible para pacientes con Covid-19")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.hospital)));

        // Hospital España 10

        LatLng Hospital_espana = new LatLng(12.6261142, -87.1439881);
        mMap.addMarker(new MarkerOptions().position(Hospital_espana).title("Hospital España").snippet("Disponible para pacientes con Covid-19")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.hospital)));

        // Hospital Gaspar Garcia 11
        LatLng Hospital_Gaspar_Garcia = new LatLng(11.43929625, -85.83991274340622);
        mMap.addMarker(new MarkerOptions().position(Hospital_Gaspar_Garcia).title("Hospital Gaspar García").snippet("Disponible para pacientes con Covid-19")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.hospital)));


        // Hospital Alfonso Moncada 12
        LatLng Hospital_Alfonso_Moncada = new LatLng(13.629746749999999, -86.4776226643644);
        mMap.addMarker(new MarkerOptions().position(Hospital_Alfonso_Moncada).title("Hospital Alfonso Moncada").snippet("Disponible para pacientes con Covid-19")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.hospital)));

        // Hospital Nuevo Amanecer Bilwi 13
        LatLng Hospital_Bilwi = new LatLng(14.0370101, -83.393843316979);
        mMap.addMarker(new MarkerOptions().position(Hospital_Bilwi).title("Hospital Nuevo Amanecer Bilwi").snippet("Disponible para pacientes con Covid-19")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.hospital)));

        // Hospital Ernesto Sequeira 14
        LatLng Hospital_Ernesto = new LatLng(12.008664, -83.76779823194934);
        mMap.addMarker(new MarkerOptions().position(Hospital_Ernesto).title("Hospital Ernesto Sequeira").snippet("Disponible para pacientes con Covid-19")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.hospital)));



        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Boaco,7));
        mMap.getUiSettings().setZoomControlsEnabled(true);


        // Hbilitando los permisos del usario
        if(ActivityCompat.checkSelfPermission(Mapa_Prueba_mapsActivity.this, ACCESS_FINE_LOCATION) !=
                PackageManager.PERMISSION_GRANTED)
        {

            // Pidiendo los permisos
            AlertDialog.Builder dialogo =  new AlertDialog.Builder(Mapa_Prueba_mapsActivity.this);
            dialogo.setTitle("Permisos desactivados");
            dialogo.setMessage("Acepte los permisos para que sirva la app");


            dialogo.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                @RequiresApi(api = Build.VERSION_CODES.M)
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    requestPermissions(new String[]{ACCESS_FINE_LOCATION},100);
                }
            });

            dialogo.show();
            return;
        }


        mMap.setMyLocationEnabled(true);

    }


    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        if(requestCode == 100)
        {
            if(grantResults.length == 1 && grantResults[0] == PackageManager.PERMISSION_GRANTED )
            {
                Toast.makeText(getApplicationContext(),"Bienvenido a google maps",Toast.LENGTH_LONG).show();
            }
        }
    }
}
