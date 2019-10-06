package com.example.ejercicio2_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private ConstraintLayout contenedor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void encender(View view) {
        contenedor = findViewById(R.id.padre);
        contenedor.setBackgroundColor(Color.BLUE);
    }

    public void apagar(View view) {
        contenedor = findViewById(R.id.padre);
        contenedor.setBackgroundColor(Color.BLACK);
    }
}
