package com.example.proyectovotacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

public class votacion extends AppCompatActivity {
    RadioGroup radioGroup;
    Button botonvotar;
    public static int candidato1, candidato2, candidato3, candidato4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_votacion);
        radioGroup = findViewById(R.id.radiogroup);
        botonvotar = findViewById(R.id.btnvotar);

        botonvotar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int checkedId = radioGroup.getCheckedRadioButtonId();
                if (checkedId == -1) {
                    Toast.makeText(votacion.this, "No hay seleccion.", Toast.LENGTH_SHORT).show();
                } else {
                    findRadioButton(checkedId);
                    Intent intent = new Intent(getApplicationContext(), resultados.class);
                    intent.putExtra("voto1", candidato1);
                    intent.putExtra("voto2", candidato2);
                    intent.putExtra("voto3", candidato3);
                    intent.putExtra("voto4", candidato4);
                    startActivity(intent);
                }
            }

        });
    }

    private void findRadioButton(int checkedId){
        switch (checkedId){
            case R.id.rb1:
                candidato1++;
                break;
            case R.id.rb2:
                candidato2++;
                break;
            case R.id.rb3:
                candidato3++;
                break;
            case R.id.rb4:
                candidato4++;
                break;
        }
    }
    }