package br.com.samsungocean.appsimples;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button buttonNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonNext = (Button)findViewById(R.id.button_next);
        buttonNext.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        ActivityCompat.requestPermissions();
        

        Intent intent = new Intent(this, NextActivity.class);
        startActivity(intent);
    }
}


