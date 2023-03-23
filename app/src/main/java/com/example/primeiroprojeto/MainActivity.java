package com.example.primeiroprojeto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText edt_num1, edt_num2, edt_result;
    private Button btn_somar, btn_dividir, btn_subtrair, btn_multiplicar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt_num1 = findViewById(R.id.edt_num1);
        edt_num2 = findViewById(R.id.edt_num2);
        edt_result = findViewById(R.id.edt_result);
        btn_somar = findViewById(R.id.btn_somar);
        btn_dividir = findViewById(R.id.btn_dividir);
        btn_subtrair = findViewById(R.id.btn_subtrair);
        btn_multiplicar = findViewById(R.id.btn_multiplicar);
    }

    public void somar(View view){
        int valor1 = Integer.parseInt(edt_num1.getText().toString());
        int valor2 = Integer.parseInt(edt_num2.getText().toString()) ;
        int soma = valor1 + valor2;
        // String.valueOf -> converte número para String
        edt_result.setText(String.valueOf(soma));
    }

    public void dividir(View view){
        float valor1 = Float.parseFloat(edt_num1.getText().toString());
        float valor2 = Float.parseFloat(edt_num2.getText().toString()) ;
        float divisao = valor1 / valor2;
        // String.valueOf -> converte número para String
        edt_result.setText(String.valueOf(divisao));
    }

    public void subtrair(View view){
        int valor1 = Integer.parseInt(edt_num1.getText().toString());
        int valor2 = Integer.parseInt(edt_num2.getText().toString()) ;
        int subtracao = valor1 - valor2;
        // String.valueOf -> converte número para String
        edt_result.setText(String.valueOf(subtracao));
    }

    public void multiplicar(View view){
        int valor1 = Integer.parseInt(edt_num1.getText().toString());
        int valor2 = Integer.parseInt(edt_num2.getText().toString()) ;
        int multiplicacao = valor1 * valor2;
        // String.valueOf -> converte número para String
        edt_result.setText(String.valueOf(multiplicacao));
    }

    public void telaQuestao2(View view) {
        Intent it = new Intent(this, Questao2.class);
        startActivity(it);
    }

}