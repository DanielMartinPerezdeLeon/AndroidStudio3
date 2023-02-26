package com.example.myapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class ActivityVer extends AppCompatActivity {

    String nombre;
    String email;
    int edad;
    boolean datos;
    boolean informacion;
    String sexo;
    String pais;
    int rango;

    Button botonaceptar = (Button) findViewById(R.id.botonaceptar);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver);

        Intent intent = getIntent();

        TextView field_nombre = (TextView) findViewById(R.id.field_nombre);
        TextView field_email = (TextView) findViewById(R.id.field_email);
        TextView field_edad = (TextView) findViewById(R.id.field_edad);
        TextView field_datos = (TextView) findViewById(R.id.field_terminos);
        TextView field_informacion = (TextView) findViewById(R.id.field_informacion);
        TextView field_sexo = (TextView) findViewById(R.id.field_sexo);
        TextView field_pais = (TextView) findViewById(R.id.field_pais);
        TextView field_rango = (TextView) findViewById(R.id.field_rango);

        nombre=intent.getExtras().getString("nombre");
        email=intent.getExtras().getString("email");
        edad=intent.getExtras().getInt("edad");
        datos=intent.getExtras().getBoolean("datos");
        informacion=intent.getExtras().getBoolean("informacion");
        sexo=intent.getExtras().getString("sexo");
        pais=intent.getExtras().getString("pais");
        rango=intent.getExtras().getInt("rango");

        field_nombre.setText(nombre);
        field_email.setText(email);
        field_edad.setText(Integer.toString(edad));
        if(datos==true){
            field_datos.setText("Si");
        }else{
            field_datos.setText("No");
        }
        if(informacion==true){
            field_informacion.setText("Si");
        }else{
            field_informacion.setText("No");
        }
        field_sexo.setText(sexo);
        field_pais.setText(pais);
        field_rango.setText(Integer.toString(edad));


        botonaceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ver =new Intent(ActivityVer.this, MainActivity.class);
                startActivity(ver);
            }
        });

    }







}