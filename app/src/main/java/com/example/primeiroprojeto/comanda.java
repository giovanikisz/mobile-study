package com.example.primeiroprojeto;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class comanda extends AppCompatActivity {

    private EditText edt_consumo, edt_couvert, edt_dividir, edt_taxa, edt_conta_total, edt_valor_pessoa;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comanda);
        edt_consumo =findViewById(R.id.edt_consumo);
        edt_couvert =findViewById(R.id.edt_couvert);
        edt_dividir =findViewById(R.id.edt_dividir);
        edt_taxa =findViewById(R.id.edt_taxa);
        edt_conta_total =findViewById(R.id.edt_conta_total);
        edt_valor_pessoa =findViewById(R.id.edt_valor_pessoa);

    }

    public void calcularConta(View view) {
        double consumo = Double.parseDouble(edt_consumo.getText().toString());
        double couvert = Double.parseDouble(edt_couvert.getText().toString());
        double dividir = Double.parseDouble(edt_dividir.getText().toString());

        double servico = consumo * 0.1;
        double total = consumo + couvert + servico;
        double porPessoa = total / dividir;

        edt_taxa.setText(String.valueOf(servico));
        edt_conta_total.setText(String.valueOf(total));
        edt_valor_pessoa.setText(String.valueOf(porPessoa));
    }
}