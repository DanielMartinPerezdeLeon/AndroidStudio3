package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn_alta= (Button) findViewById(R.id.boton_alta);
    Button btn_ver= (Button) findViewById(R.id.boton_ver);
    Button btn_salir= (Button) findViewById(R.id.boton_salir);
    Button btn_checkbox= (Button) findViewById(R.id.boton_checkbox);
    Button btn_radio= (Button) findViewById(R.id.boton_radio);
    Button btn_spinner= (Button) findViewById(R.id.boton_spinner);
    Button btn_seekbar= (Button) findViewById(R.id.boton_seekbar);



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_alta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent (MainActivity.this, Formulario.class));
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




}