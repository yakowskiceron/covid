package com.programacion.covid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;

public class Test extends AppCompatActivity {

    //Declaracion de todos los radiobutton
    private RadioButton res1si; private RadioButton res1no; private RadioButton res2si; private RadioButton res2no;
    private RadioButton res3si; private RadioButton res3no; private RadioButton res4si; private RadioButton res4no;
    private RadioButton res5si; private RadioButton res5no; private RadioButton res6si; private RadioButton res6no;
    private RadioButton res7si; private RadioButton res7no; private RadioButton res8si; private RadioButton res8no;
    private RadioButton res9si; private RadioButton res9no; private RadioButton res10si; private RadioButton res10no;
    private RadioButton res11si; private RadioButton res11no; private RadioButton res12si; private RadioButton res12no;
    private RadioButton res13si; private RadioButton res13no;
    //Variable del boton
    Button resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        res1si = (RadioButton) findViewById(R.id.radiobutton1); res1no = (RadioButton) findViewById(R.id.radiobutton2);
        res2si = (RadioButton) findViewById(R.id.radiobutton3); res2no = (RadioButton) findViewById(R.id.radiobutton4);
        res3si = (RadioButton) findViewById(R.id.radiobutton5); res3no = (RadioButton) findViewById(R.id.radiobutton6);
        res4si = (RadioButton) findViewById(R.id.radiobutton7); res4no = (RadioButton) findViewById(R.id.radiobutton8);
        res5si = (RadioButton) findViewById(R.id.radiobutton9); res5no = (RadioButton) findViewById(R.id.radiobutton10);
        res6si = (RadioButton) findViewById(R.id.radiobutton11); res6no = (RadioButton) findViewById(R.id.radiobutton12);
        res7si = (RadioButton) findViewById(R.id.radiobutton13); res7no = (RadioButton) findViewById(R.id.radiobutton14);
        res8si = (RadioButton) findViewById(R.id.radiobutton15); res8no = (RadioButton) findViewById(R.id.radiobutton16);
        res9si = (RadioButton) findViewById(R.id.radiobutton17); res9no = (RadioButton) findViewById(R.id.radiobutton18);
        res10si = (RadioButton) findViewById(R.id.radiobutton19); res10no = (RadioButton) findViewById(R.id.radiobutton20);
        res11si = (RadioButton) findViewById(R.id.radiobutton21); res11no = (RadioButton) findViewById(R.id.radiobutton22);
        res12si = (RadioButton) findViewById(R.id.radiobutton23); res12no = (RadioButton) findViewById(R.id.radiobutton24);
        res13si = (RadioButton) findViewById(R.id.radiobutton25); res13no = (RadioButton) findViewById(R.id.radiobutton26);

        resultado = (Button) findViewById(R.id.btnResult);

    }
}