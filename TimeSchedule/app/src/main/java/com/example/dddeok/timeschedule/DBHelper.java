package com.example.dddeok.timeschedule;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {
    public DBHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String timetable = "CREATE TABLE timetable (" +
                "_id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "day TEXT, " +
                "_start TEXT, " +
                "_end TEXT, " +
                "subject TEXT, " +
                "professor TEXT, " +
                "place TEXT, " +
                "color TEXT) ";

        db.execSQL(timetable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public void insert (String _query){
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL(_query);
        db.close();
    }

    public void update (String _query){
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL(_query);
        db.close();
    }

    public void delete (String _query){
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL(_query);
        db.close();
    }
}
