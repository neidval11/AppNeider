package com.example.appneider;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import org.jetbrains.annotations.NotNull;

public class Home extends AppCompatActivity {

    ImageView imgUrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        imgUrl = findViewById(R.id.imgUrl);



        Picasso.get().load("https://firebasestorage.googleapis.com/v0/b/primer-proyecto-b27bf." +
                        "appspot.com/o/descarga.png?alt=media&token=25c46eb9-55a2-4c48-a31e-31198e8874d2")

                .into(imgUrl);
    }

    public boolean onCreateOptinosMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }
public boolean onOptionsItemSelected(@NonNull MenuItem item){
        int idItem = item.getItemId();
    if (idItem == R.id.itemCerarSesion){
        clcikCerrarSesion();
    } else if (idItem == R.id.itemNosotros){
        clickNosotros();
    }
    return super.onOptionsItemSelected(item);
}
    private void clcikCerrarSesion(){
        mensajeToast("Click en Cerrar Sesion");

    }

    private void clickNosotros(){
        Intent intent = new Intent(Home.this, Nosotros.class);
        startActivity(intent);;

    }

    private void mensajeToast(String mensaje){
        Toast.makeText(this,mensaje,Toast.LENGTH_SHORT).show();
    }
}
