package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.TextView;

public class Formulario extends AppCompatActivity {

    Button btn_aceptar = (Button) findViewById(R.id.btn_aceptar_formulario);
    Button btn_cancelar = (Button) findViewById(R.id.btn_cancelar_formulario);
    TextView view_nombre = (TextView) findViewById(R.id.textViewNombre);
    TextView view_email = (TextView) findViewById(R.id.textViewEmail);
    CalendarView calendar = (CalendarView) findViewById(R.id.calendarView);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);

        btn_aceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent form =new Intent();
                form.putExtra("nombre",view_nombre.getText());
                form.putExtra("email",view_email.getText());
                form.putExtra("fecha",calendar.getDate());
                setResult(form);
            }
        });


        btn_cancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent (MainActivity.this, Formulario.class));
            }
        });

    }
}