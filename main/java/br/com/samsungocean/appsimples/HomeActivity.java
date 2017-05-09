package br.com.samsungocean.appsimples;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class HomeActivity extends AppCompatActivity {

    EditText editNome;
    EditText editSenha;
    Spinner spinnerTarefas;
    Spinner spinnerDiasDaSemana;
    Button btnRegistrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        editNome = (EditText) findViewById(R.id.editNome);
        editSenha = (EditText) findViewById(R.id.edit_nome_app);
        spinnerTarefas = findViewById(R.id.spinner_tarefas);
        spinnerDiasDaSemana = findViewById(R.id.spiner_dias_da_semana);
        btnRegistrar = (Button) findViewById(R.id.btn_registrar);

        btnRegistrar.setOnClickListener((v) {registrar();} );
    }

    private void registrar() {
        String nome = editNome.getText().toString();
        String app = editSenha.getText().toString();
        Spinner tarefas = (Spinner) spinnerTarefas.getSelectedItem();
        Spinner dias_da_semana = (Spinner) spinnerTarefas.getSelectedItem();

        Intent intent = new Intent(this, TextActivity.class);
        startActivity(intent);
    }
}

