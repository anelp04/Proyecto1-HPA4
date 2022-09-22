package com.example.proyectovotacion;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.widget.Button;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class resultados extends AppCompatActivity {
    TextView tv1, tv2, tv3;
    Button btn1;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultados);
        Intent intent = getIntent();
        int voto1 = intent.getIntExtra("voto1", 0);
        int voto2 = intent.getIntExtra("voto2", 0);
        int voto3 = intent.getIntExtra("voto3", 0);

        tv1 = findViewById(R.id.tvoto1);
        tv2 = findViewById(R.id.tvoto2);
        tv3 = findViewById(R.id.tvoto3);

        tv1.setText("Votos: " + voto1);
        tv2.setText("Votos: " + voto2);
        tv3.setText("Votos: " + voto3);

        btn1 = findViewById(R.id.btnregresar);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }
}