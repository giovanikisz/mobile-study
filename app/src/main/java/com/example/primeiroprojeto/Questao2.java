package com.example.primeiroprojeto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

public class Questao2 extends AppCompatActivity {
    private CheckBox chk_arroz, chk_leite, chk_carne, chk_feijao, chk_coca;
    private EditText compra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao2);

        chk_arroz = findViewById(R.id.chk_arroz);
        chk_leite = findViewById(R.id.chk_leite);
        chk_carne = findViewById(R.id.chk_carne);
        chk_feijao = findViewById(R.id.chk_feijao);
        chk_coca = findViewById(R.id.chk_coca);
        compra = findViewById(R.id.compra);
    }

    public void calcular(View view){
        double arroz = 0;
        double leite = 0;
        double carne = 0;
        double feijao = 0;
        double coca = 0;

        if(chk_arroz.isChecked()){
            arroz = 2.69;
        }

        if(chk_leite.isChecked()){
            leite = 2.70;
        }

        if(chk_carne.isChecked()){
            carne = 16.70;
        }

        if(chk_feijao.isChecked()){
            feijao = 3.38;
        }

        if(chk_coca.isChecked()){
            coca = 3.00;
        }

        double soma = arroz + leite + carne + feijao + coca;
        compra.setText(String.valueOf(soma));
    }

    public void telaQuestao3(View view) {
        Intent it = new Intent(this, calculoDoSalario.class);
        startActivity(it);
    }
}