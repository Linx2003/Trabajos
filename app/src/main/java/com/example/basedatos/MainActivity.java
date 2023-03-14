package com.example.basedatos;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.basedatos.Bd.DbHelper;

public class MainActivity extends AppCompatActivity {

    Button crear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        crear = findViewById(R.id.crear);

        crear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DbHelper pruebita = new DbHelper(MainActivity.this);
                SQLiteDatabase db = pruebita.getWritableDatabase();
                if (db != null){
                    Toast.makeText(MainActivity.this, "Base de datos creada", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "Error en crear la base de datos", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}