package com.example.basedatos.Bd;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import androidx.annotation.Nullable;

public class DbContactos extends DbHelper{

    Context context;

    public DbContactos(@Nullable Context context) {
        super(context);
        this.context = context;
    }

    public long InsertarContactos(String name, String Cantidad){

        long id = 0;
        try {
            DbHelper dbHelper = new DbHelper(context);
            SQLiteDatabase db = dbHelper.getWritableDatabase();

            ContentValues values = new ContentValues();
            values.put("Nombre", name);
            values.put("Cantidad", Cantidad);

            id = db.insert(Database_Table, null, values);
        }catch (Exception ex) {
            ex.toString();
        }

        return id;
    }
}
