package com.example.primeiroprojeto;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class calculoDoSalario extends AppCompatActivity {

    private EditText edt_salario;
    private TextView novo_salario;
    private RadioButton radio_40, radio_45, radio_50;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculo_do_salario);

        radio_40 = findViewById(R.id.radio_40);
        radio_45 = findViewById(R.id.radio_45);
        radio_50 = findViewById(R.id.radio_50);
        edt_salario = findViewById(R.id.edt_salario);
        novo_salario = findViewById(R.id.novo_salario);
    }

    public void calcularSalario(View view) {
        double resultado = 0;
        double salario = Float.parseFloat(edt_salario.getText().toString());
        
        if(radio_40.isChecked()){
            resultado = salario * 1.4;
        }

        if(radio_45.isChecked()){
            resultado = salario * 1.45;
        }

        if(radio_50.isChecked()){
            resultado = salario * 1.5;
        }
        
        novo_salario.setText(String.valueOf(resultado));
    }

    public void telaQuestao4(View view) {
        Intent it = new Intent(this, comanda.class);
        startActivity(it);
    }

}