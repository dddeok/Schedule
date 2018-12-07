package com.example.dddeok.timeschedule;

import android.content.Context;
import android.database.Cursor;
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

    public String PrintData (){
        SQLiteDatabase db = getReadableDatabase();
        String str = "";

        Cursor cursor = db.rawQuery("select * from timetable", null);
        while(cursor.moveToNext()){
            str +=  " 강의날짜 :  "
                    + cursor.getString(1) +"\n"
                    + " 시작시간 : "
                    + cursor.getString(2) +"\n"
                    + " 종료시간 : "
                    + cursor.getString(3) +"\n"
                    + " 과목명 : "
                    + cursor.getString(4) +"\n"
                    + " 교수명 :  "
                    + cursor.getString(5) +"\n"
                    + " 장소 : "
                    + cursor.getString(6) +"\n";
        }
        return str;
    }
}
