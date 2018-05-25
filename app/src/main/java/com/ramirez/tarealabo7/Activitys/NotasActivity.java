package com.ramirez.tarealabo7.Activitys;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.ramirez.tarealabo7.Activitys.ModificarActivity;
import com.ramirez.tarealabo7.R;

public class NotasActivity extends AppCompatActivity {

    Button buscar, modificar, eliminar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notas);

        buscar = findViewById(R.id.BuscarB);
        modificar = findViewById(R.id.modificarB);
        eliminar = findViewById(R.id.eliminarB);

        modificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ModificarActivity.class);
                startActivity(intent);
            }
        });

    }
}
