package com.example.myappli;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button verdadero_btn;
    Button falso_btn;
    Button btn_siguiente;
    TextView textPregunta;

    Pregunta[] preguntas = new Pregunta[]{

            new Pregunta(R.string.pregunta1, true),
            new Pregunta(R.string.pregunta2, false),
            new Pregunta(R.string.pregunta3, true),
            new Pregunta(R.string.pregunta4,true),
            new Pregunta(R.string.pregunta5, false),


    }

    int preguntaActual = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        verdadero_btn = findViewById(R.id.verdadero_btn);
        falso_btn = findViewById(R.id.falso_btn);
        btn_siguiente = findViewById(R.id.btn_siguiente);
        textPregunta = findViewById(R.id.text_pregunta);

        Pregunta pregunta = preguntas[preguntaActual];
        textPregunta.setText(pregunta.getId());

        verdadero_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d( "MainActivity", "Click en verdadero_btn");
                Toast.makeText(MainActivity.this, R.string.correcto, Toast.LENGTH_SHORT).show();

            }
        });

        falso_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("MainActivity" ,"click en faslo_btm");
                Toast.makeText(MainActivity.this, R.string.incorrecto, Toast.LENGTH_SHORT).show();

            }
        });

        btn_siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preguntaActual++;
                Pregunta pregunta = preguntas[preguntaActual];
                textPregunta.setText(pregunta.getId());


            }
        });
    }
}