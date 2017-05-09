package br.com.samsungocean.appsimples;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TextActivity extends AppCompatActivity {

    public static String EXTRA_NOME = "EXTRA_NOME";
    public static String EXTRA_NOME_APP = "EXTRA_NOME_APP";
    public static String EXTRA_ESTILO = "EXTRA_ESTILO";
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);

        textView = (TextView) findViewById(R.id.text_frase);

        if(savedInstanceState != null) {
            textView.setText(savedInstanceState.getString(EXTRA_NOME);
        }

        Intent intent = getIntent();
        String nome = intent.getStringExtra(EXTRA_NOME);
        String app = intent.getStringExtra(EXTRA_NOME_APP);
        String estilo = intent.getStringExtra(EXTRA_ESTILO);

        textView.setText(nome);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString(EXTRA_NOME, textView.getText().toString());
    }
}
