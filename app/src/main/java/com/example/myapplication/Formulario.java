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
        CalendarView calendar = (CalendarView) findViewById(R.id.calendarView);


        //CLICKS
        btn_aceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent form =new Intent();
                form.putExtra("nombre",text_nombre.getText().toString());
                form.putExtra("email",text_email.getText().toString());
                long milis= calendar.getDate();
                Date f = new Date(milis);
                Date act = new Date();
                int anos=act.getYear()-f.getYear();

                form.putExtra("edad",Integer.toString(anos));
                setResult(1,form);
                finish();
            }
        });

        btn_cancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}