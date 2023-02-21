package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.SeekBar;

public class ActivityRango extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rango);

        Button botonaceptar = (Button) findViewById(R.id.btn_aceptar);
        SeekBar barra = (SeekBar) findViewById(R.id.rango);

        barra.setMax(100);


        botonaceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent form =new Intent();

                int rango=barra.getProgress();

                form.putExtra("Rango",rango);


                setResult(5,form);
                finish();
            }
        });
    }
}