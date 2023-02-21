package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class ActivitySexo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sexo);

        RadioGroup gruporadios = (RadioGroup) findViewById(R.id.grupo_radio);
        Button botonaceptar = (Button) findViewById(R.id.btn_aceptar);


        botonaceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent form =new Intent();

                int hijo=gruporadios.getCheckedRadioButtonId();
                View radioButton = gruporadios.findViewById(hijo);
                int idx= gruporadios.indexOfChild(radioButton);

                RadioButton r = (RadioButton) gruporadios.getChildAt(idx);
                String textosexo = r.getText().toString();

                form.putExtra("Sexo",textosexo);


                setResult(3,form);
                finish();
            }
        });
    }
}