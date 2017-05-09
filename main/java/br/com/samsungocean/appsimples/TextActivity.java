package br.com.samsungocean.appsimples;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class TextActivity extends AppCompatActivity {

    public static String EXTRA_NOME = "EXTRA_NOME";
    public static String EXTRA_NOME_APP = "EXTRA_NOME_APP";
    public static String EXTRA_ESTILO = "EXTRA+ESTILO";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);
    }
}
