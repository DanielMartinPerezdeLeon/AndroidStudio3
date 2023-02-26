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
    String nombre="null";
    String email="null";
    int fecha_nac=0;
    boolean aceptar_datos=false;
    boolean recibir_informacion=false;
    String sexo="null";
    String pais="null";
    int rango=-1;



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
                Intent ver =new Intent(MainActivity.this, ActivityVer.class);
                ver.putExtra("nombre",nombre);
                ver.putExtra("email",email);
                ver.putExtra("edad",fecha_nac);
                ver.putExtra("datos",aceptar_datos);
                ver.putExtra("informacion",recibir_informacion);
                ver.putExtra("sexo",sexo);
                ver.putExtra("pais",pais);
                ver.putExtra("rango",rango);
                setResult(1);
                startActivity(ver);
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
                Intent inten=new Intent (MainActivity.this, ActivityDatos.class);
                startActivityForResult(inten,1);
            }
        });


        btn_radio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inten=new Intent (MainActivity.this, ActivitySexo.class);
                startActivityForResult(inten,1);
            }
        });


        btn_spinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inten=new Intent (MainActivity.this, ActivityPais.class);
                startActivityForResult(inten,1);
            }
        });


        btn_seekbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inten=new Intent (MainActivity.this, ActivityRango.class);
                startActivityForResult(inten,1);
            }
        });


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Button btn_ver= (Button) findViewById(R.id.boton_ver);
        switch (resultCode){

            case 1:{    //FORMULARIO
                nombre=data.getExtras().getString("nombre").toString();
                email=data.getExtras().getString("email");
                fecha_nac=data.getExtras().getInt("edad");

                break;
            }
            case 2:{
                aceptar_datos=data.getExtras().getBoolean("Datos");
                recibir_informacion=data.getExtras().getBoolean("Informacion");

                break;
            }
            case 3:{
                sexo=data.getExtras().getString("Sexo");
                break;
            }
            case 4:{
                pais=data.getExtras().getString("Pais");
                break;
            }
            case 5:{
                rango=data.getExtras().getInt("Rango");
                break;
            }
            default:{
                break;
            }
        }
    }
}