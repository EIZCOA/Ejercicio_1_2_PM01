package com.example.ejercicios_1_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.ejercicios_1_2.R;

public class MainActivity extends AppCompatActivity {

    private EditText txnombre;
    private EditText txtapellidos;
    private EditText intedad;
    private EditText txtcorreo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txnombre =(EditText)findViewById(R.id.TxtNombre);
        txtapellidos =(EditText)findViewById(R.id.TxtApellido);
        intedad = (EditText) findViewById(R.id.IntEdad);
        txtcorreo = (EditText) findViewById(R.id.TxtCorreo);


    }

    public void enviarinformacion(View view) {

        if (txnombre.getText().toString().isEmpty() | txtapellidos.getText().toString().isEmpty() | intedad.getText().toString().isEmpty() | txtcorreo.getText().toString().isEmpty()) {
            Toast.makeText(getApplicationContext(), "Favor no dejar campos vacios", Toast.LENGTH_LONG).show();
        } else {


            Intent i = new Intent(this, Datos.class);
            i.putExtra("dato1", txnombre.getText().toString());
            i.putExtra("dato2", txtapellidos.getText().toString());
            i.putExtra("dato3", intedad.getText().toString());
            i.putExtra("dato4", txtcorreo.getText().toString());
            startActivity(i);

        }
    }
}