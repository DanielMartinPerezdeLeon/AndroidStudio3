package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Spinner;

import java.util.ArrayList;

public class ActivityPais extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pais);

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        Button botonaceptar = (Button) findViewById(R.id.btn_aceptar);

        ArrayList<String> paises = new ArrayList<String>();
        paises.add("España");
        paises.add("Italia");
        paises.add("Alemania");
        paises.add("Otro");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, paises);
        spinner.setAdapter(adapter);


        botonaceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent form =new Intent();

                String pais = (String) spinner.getItemAtPosition(spinner.getSelectedItemPosition());

                form.putExtra("Pais",pais);


                setResult(4,form);
                finish();
            }
        });
    }
}