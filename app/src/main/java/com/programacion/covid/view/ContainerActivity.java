package com.programacion.covid.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.programacion.covid.Noticias;
import com.programacion.covid.R;
import com.programacion.covid.view.fragment.AgendaFragment;
import com.programacion.covid.view.fragment.HomeFragment;
import com.programacion.covid.view.fragment.MapFragment;
import com.programacion.covid.view.fragment.RecomendacionFragment;
import com.programacion.covid.view.fragment.TestFragment;
import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnTabSelectListener;

public class ContainerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_container);

        BottomBar bottomBar = (BottomBar) findViewById(R.id.bottombar);
        bottomBar.setDefaultTab(R.id.home);

        bottomBar.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelected(int tabId) {

                switch (tabId){
                    case R.id.home:
                        HomeFragment homeFragment = new HomeFragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,homeFragment).
                                setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE).addToBackStack(null).commit();
                        break;
                    case R.id.info:
                        RecomendacionFragment infoFragment = new RecomendacionFragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, infoFragment)
                                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_CLOSE).addToBackStack(null).commit();
                        break;
                    case R.id.agenda:
                        AgendaFragment agendaFragment = new AgendaFragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, agendaFragment)
                                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).addToBackStack(null).commit();
                        break;
                    case R.id.map:
                        MapFragment mapFragment = new MapFragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, mapFragment)
                                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).addToBackStack(null).commit();
                        break;
                    case R.id.test:
                        TestFragment testFragment = new TestFragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, testFragment)
                                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).addToBackStack(null).commit();

                }

            }
        });
    }
}
