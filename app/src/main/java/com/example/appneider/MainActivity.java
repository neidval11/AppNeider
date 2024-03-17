package com.example.appneider;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class    MainActivity extends AppCompatActivity {

    EditText edicorreo, idontraseña;
    Button bregistro, bingresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edicorreo = findViewById(R.id.edicorreo);
        idontraseña = findViewById(R.id.idcontraseña);
        bingresar= findViewById(R.id.bingresar);
        bregistro = findViewById(R.id.bregistro);

    }
    public void clickRegistro(View view) {

        Intent intent = new Intent(MainActivity.this, Registro.class);
        startActivity(intent);

    }
    public void clickIngresar(View v){
        Intent i = new Intent(MainActivity.this, Home.class);
        startActivity(i);

    }
}