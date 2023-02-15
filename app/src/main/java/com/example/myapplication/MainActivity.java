package com.example.myapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    //DATOS de alta
    String nombre;
    String email;
    String fecha_nac;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //DECLARACION DE ELEMENTOS EN PANTALLA
        Button btn_alta= (Button) findViewById(R.id.boton_alta);
        Button btn_ver= (Button) findViewById(R.id.boton_ver);
        Button btn_salir= (Button) findViewById(R.id.boton_salir);
        Button btn_checkbox= (Button) findViewById(R.id.boton_checkbox);
        Button btn_radio= (Button) findViewById(R.id.boton_radio);
        Button btn_spinner= (Button) findViewById(R.id.boton_spinner);
        Button btn_seekbar= (Button) findViewById(R.id.boton_seekbar);


        //DECLARACION DE LOS CLICKS
        btn_alta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inten=new Intent (MainActivity.this, Formulario.class);
                startActivityForResult(inten,1);
            }
        });


        btn_ver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


        btn_salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.exit(0);
            }
        });


        btn_checkbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


        btn_radio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


        btn_spinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


        btn_seekbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Button btn_ver= (Button) findViewById(R.id.boton_ver);
        switch (requestCode){
            case 1:{    //FORMULARIO
                nombre=data.getExtras().getString("nombre").toString();
                email=data.getExtras().getString("email");
                fecha_nac=data.getExtras().getString("edad");

                break;
            }
        }
    }
}