package com.example.basedatos.Bd;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DbHelper extends SQLiteOpenHelper {

    public static final String Database_Table = "T_contactos";
    private static final int Database_Version = 1;
    private static final String DATABASE_NAME = "agenda.db";

    public DbHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, Database_Version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("CREATE TABLE " + Database_Table + "(" +
                "id Integer Primary Key Autoincrement," +
                "name Text," +
                "Cantidad Integer)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE " +
                Database_Table);
        onCreate(sqLiteDatabase);
    }
}
