package com.example.ejercicios_1_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;

import com.example.ejercicios_1_2.R;

public class Datos extends AppCompatActivity {

    private TextView Txtviewnombre;
    private TextView Txtviewapellidos;
    private TextView Txtviewedad;
    private TextView Txtviewcorreo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos);

        Txtviewnombre = (TextView) findViewById(R.id.TxtViewNombre);
        Txtviewapellidos = (TextView) findViewById(R.id.TxtViewApellidos);
        Txtviewedad = (TextView) findViewById(R.id.TxtViewEdad);
        Txtviewcorreo = (TextView) findViewById(R.id.TxtViewCorreo);

        String dato1 = getIntent().getStringExtra("dato1");
        Txtviewnombre.setText(dato1);

        String dato2 = getIntent().getStringExtra("dato2");
        Txtviewapellidos.setText(dato2);

        String dato3 = getIntent().getStringExtra("dato3");
        Txtviewedad.setText(dato3);

        String dato4 = getIntent().getStringExtra("dato4");
        Txtviewcorreo.setText(dato4);
    }
        public void Regresar(View view)
        {
            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);
        }

}