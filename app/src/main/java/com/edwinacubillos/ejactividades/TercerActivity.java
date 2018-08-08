package com.edwinacubillos.ejactividades;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TercerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tercer);
    }

    public void abrirActivity(View view) {
        Intent intent = new Intent(TercerActivity.this, RecepcionActivity.class);
        startActivity(intent);
    }
}
