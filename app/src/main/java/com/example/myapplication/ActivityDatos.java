package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class ActivityDatos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos);

        CheckBox cb1 = (CheckBox) findViewById(R.id.checkBoxAcepto);
        CheckBox cb2 = (CheckBox) findViewById(R.id.checkBoxInformacion);
        Button botonaceptar = (Button) findViewById(R.id.botonaceptar);


        botonaceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent form =new Intent();
                form.putExtra("Datos",cb1.isActivated());
                form.putExtra("Información", cb2.isActivated());

                setResult(2,form);
                finish();
            }
        });

    }
}