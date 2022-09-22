package com.example.proyectovotacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText cedula;
    Button btn1;

    public static String cedulas []= {"8-944-327", "3-740-1394", "20-53-4282", "8-943-1867", "8-937-503", "8-952-2444", "8-943-12", "8-986-549","8-957-1827", "8-940-1311", "8-863-1620", "8-964-691", "8-954-1126", "8-1039-1537", "8-925-1168", "8-940-1505", "8-938-925", "3-743-2493","E-8-169755", "8-971-1811", "8-940-408", "8-937-1640", "8-939-1578", "8-942-1406", "6-722-724", "8-941-1215", "8-962-1218", "8-941-924","8-980-2414", "3-742-2055", "8-942-1192", "8-904-1189", "8-959-857", "8-964-1554", "8-1066-1018", "8-1055-701", "8-970-242", "3-752-1461","3-745-950"};
    public static String nombres []= {"Edwin Arrocha", "Michelle Brenes", "Eddy Bustamante", "Alejandra Caballero", "Gabriel Chiari", "Kevin Coronado", "Luis    Delgado", "Marc Dudley", "Diego Fernandez", "María Flores", "Donaldo Frazer", "Miguel Gascón", "Andrew Gonzalez", "Valerie Hernández", "Tommy Ho", "Jean Jiménez", "Felipe Loo", "Lisseth Mcdonald", "Jesus Monagas", "Diana Moreno", "Gerardo Moreno", "Juan Navarro", "Julio Navas", "Anel Pinzón", "Janiel Pinzón", "Antonio Qiu", "Carlos Ricord", "David Rios", "Sergio Rodriguez", "Zulixa Salas", "Luis Samaniego", "Ary Sánchez", "Dionisio Santos", "Bryan Thomas", "Carlos Tuñón", "Genesis Vitale", "Fernando Zeng", "Carlos Zhong", "Eimy Guerra"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cedula=findViewById(R.id.et1);
        btn1=findViewById(R.id.btn1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int i;
                boolean check = false;
                int x = 40;
                for ( i = 0; i < 39; i++) {
                    if (cedula.getText().toString().equals(cedulas[i])  && nombres[i]=="zxcvbnm")
                    {
                        Toast.makeText(MainActivity.this, " Su voto ya ha sido ingresado", Toast.LENGTH_SHORT).show();
                        break;
                    }
                    if (cedula.getText().toString().equals(cedulas[i]))
                    {
                        check = true;
                        x = i;
                    }
                    if(check == true)
                    {
                        Toast.makeText(MainActivity.this, "Bienvenido " + nombres[i], Toast.LENGTH_SHORT).show();
                        nombres[i]="zxcvbnm";
                        Intent intent = new Intent(getApplicationContext(), votacion.class);
                        startActivity(intent);
                        break;
                    }
                }
                if (x == 40)
                {
                    Toast.makeText(MainActivity.this, "Cedula incorrecta", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

}