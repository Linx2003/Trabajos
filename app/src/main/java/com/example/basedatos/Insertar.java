package com.example.basedatos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.basedatos.Bd.DbContactos;

public class Insertar extends AppCompatActivity {

    EditText Nombre, Cantidad;
    Button crear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insertar);
        Nombre = findViewById(R.id.nom_text);
        Cantidad = findViewById(R.id.cant_text);
        crear = findViewById(R.id.button);

        crear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DbContactos dbContactos = new DbContactos(Insertar.this);
                long id = dbContactos.InsertarContactos(Nombre.getText().toString(), Cantidad.getText().toString());

                if(id>0){
                    Toast.makeText(Insertar.this, "Registro guardado", Toast.LENGTH_SHORT).show();
                    limpiar();
                }else{
                    Toast.makeText(Insertar.this, "Error al guardar", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void limpiar(){
        Nombre.setText("");
        Cantidad.setText("");
    }
}