package com.ramirez.tarealabo7.Activitys;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.ramirez.tarealabo7.R;

public class MainActivity extends AppCompatActivity {

    Button agregar, notas, ver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        agregar = findViewById(R.id.add);
        notas = findViewById(R.id.notes);
        ver = findViewById(R.id.Vnotes);

        agregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), AgregarPersonaActivity.class);
                startActivity(intent);
            }
        });

        notas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), NotasActivity.class);
                startActivity(intent);
            }
        });

        ver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), VerNotasActivity.class);
                startActivity(intent);
            }
        });

    }
}
