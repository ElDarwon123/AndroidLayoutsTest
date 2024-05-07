package com.example.organizaciondevistas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
public class MainActivity extends AppCompatActivity {
    // Declaración de variables tipo Button
    Button toTable, toRel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_linear);

        toTable = findViewById(R.id.btnTable);
        toRel = findViewById(R.id.btnRel);

        // Enlace a la vista con tablas
        toTable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, TableActivity.class);
                startActivity(i);
            }
        });

        // Enlace a la vista con Relative
        toRel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, RelativeActivity.class);
                startActivity(i);
            }
        });
    }
}