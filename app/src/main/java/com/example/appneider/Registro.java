package com.example.appneider;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

import java.util.Calendar;import android.app.AlertDialog;
import android.content.DialogInterface;
import android.widget.Toast;

public class Registro extends AppCompatActivity {
    EditText idfcumple;
    Button benviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        idfcumple = findViewById(R.id.idfcumple);
        benviar = findViewById(R.id.benviar);

        idfcumple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDatePickerDialog();
            }
        });
    }



    private void showDatePickerDialog() {


            Calendar calendar = Calendar.getInstance();
            int year = calendar.get(calendar.YEAR);
            int month = calendar.get(calendar.MONTH);
            int dayofmonth = calendar.get(calendar.DAY_OF_MONTH);

        DatePickerDialog dialog = new DatePickerDialog(Registro.this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int dayOfMonth) {
                idfcumple.setText(year+"-"+(month+1)+"-"+dayOfMonth);
            }
        },year,month,dayofmonth);
        dialog.show();



        benviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder confirmacion = new AlertDialog.Builder(Registro.this);
                confirmacion.setMessage("Seguro que sus datos son correctos?")
                        .setCancelable(false)
                        .setPositiveButton("Si", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                {

                                   Intent intent = new Intent(Registro.this, Home.class);
                                    startActivity(intent);
                                }


                                finish();
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which){
                                Toast.makeText(Registro.this,"Cancelado",Toast.LENGTH_SHORT).show();

                                dialog.cancel();
                            }
                        });
                AlertDialog titulo = confirmacion.create();
                titulo.setTitle("Confirmacion");
                titulo.show();

            }



        });
    }
}