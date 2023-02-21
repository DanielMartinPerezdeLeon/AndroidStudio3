package com.example.myapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.TextView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Formulario extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);


        //DECLARACION DE LOS BOTONES
        Button btn_aceptar = (Button) findViewById(R.id.btn_aceptar_formulario);
        Button btn_cancelar = (Button) findViewById(R.id.btn_cancelar_formulario);
        EditText text_nombre = (EditText) findViewById(R.id.text_nombre);
        EditText text_email = (EditText) findViewById(R.id.text_email);
        EditText fechatexto = (EditText) findViewById(R.id.editTextDate);


        //CLICKS
        btn_aceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent form =new Intent();
                form.putExtra("nombre",text_nombre.getText().toString());
                form.putExtra("email",text_email.getText().toString());

                SimpleDateFormat df = new SimpleDateFormat("dd/MM-yyyy");

                String DOB = fechatexto.getText().toString();
                Date dateOfBirth;

                try {
                    dateOfBirth=new SimpleDateFormat("dd/MM/yyyy").parse(DOB);
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }

                Date fechactual = new Date();
                int diasactual=fechactual.getYear()*365+fechactual.getMonth()*31+fechactual.getDay();
                int diasfecha=dateOfBirth.getYear()*365+dateOfBirth.getMonth()*31+dateOfBirth.getDay();
                int edad=(diasactual-diasfecha)/365;

                form.putExtra("edad", edad);
                setResult(1,form);
                finish();
            }
        });

        btn_cancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent form =new Intent();
                setResult(0,form);
                finish();
            }
        });

    }
}